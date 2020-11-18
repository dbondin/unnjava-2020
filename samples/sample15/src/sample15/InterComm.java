package sample15;

public class InterComm {
	
	private String value = null;
	private boolean valueSet = false;
	
	public void setValue(String value) {
		// if(valueSet)  { wait until value is unset }
		synchronized (this) {
			while (valueSet) {
				try {
					wait();
				} catch (InterruptedException ex) {
					// Ignore
				}
			}
			this.value = value;
			valueSet = true;
			notifyAll();
		}
	}
	
	public String getValue() {
		// if(value not set) wait until it set
		String result;
		synchronized (this) {
			while (!valueSet) {
				try {
					wait();
				} catch (InterruptedException ex) {
					// Ignore
				}
			}
			valueSet = false;
			result = value;
			notifyAll();
		}
		
		return result;
	}
}
