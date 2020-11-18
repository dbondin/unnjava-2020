package sample13;

public class MyOtherThread extends Thread {
	
	@Override
	public void run() {
		// Our logic for the thread
		System.out.println("Starting thread");
		for(int i=0; i<10; ++i) {
//			long a = 1;
//			for(long b=1; b<10000000L; ++b) {
//				a *= b + Math.sin(b);
//			}
			System.out.println("MyOtgherThread " + Thread.currentThread().getName() + " " + i);
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException ex)
			{
				// IGNORE // THIS IS ANTIPATTERN (to ignore exceptions)
			}
		}
	}

}