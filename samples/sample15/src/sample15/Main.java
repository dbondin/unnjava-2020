package sample15;

public class Main {
	public static void main(String[] args) {
		
		InterComm ic = new InterComm();
		
		Thread p1 = new Thread(new ProducerRunnable(ic));
		Thread p2 = new Thread(new ProducerRunnable(ic));
		Thread p3 = new Thread(new ProducerRunnable(ic));
		Thread c1 = new Thread(new ConsumerRunnable(ic));
		Thread c2 = new Thread(new ConsumerRunnable(ic));
		
		p1.start();
		p2.start();
		p3.start();
		c1.start();
		c2.start();
		
	}
}
