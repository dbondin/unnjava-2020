package sample13;

public class MyOtherRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Starting runnable");
		for(int i=0; i<10; ++i) {
			System.out.println("MyOtherRunnable " + Thread.currentThread().getName() + " " + i );
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
