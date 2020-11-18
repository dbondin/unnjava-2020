package sample15;

public class ConsumerRunnable implements Runnable {
	
	private InterComm ic;
	private String prev = null;
	
	public ConsumerRunnable(InterComm ic) {
		this.ic = ic;
	}
	
	@Override
	public void run() {
		while(true) {
			String v = ic.getValue();
			System.out.println(v);
			if(v.equals(prev)) {
				System.out.println("******************************* error ********");
			}
			prev = v;
		}
	}
}
