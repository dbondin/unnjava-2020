package sample15;

public class ProducerRunnable implements Runnable {
	
	private InterComm ic;
	
	public ProducerRunnable(InterComm ic) {
		this.ic = ic;
	}
	
	@Override
	public void run() {
		while(true) {
			String v = "value-" + (Math.random() * 10000.0);
			ic.setValue(v);
		}
	}
}
