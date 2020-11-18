package sample13;

public class PriorityTestRunnable implements Runnable {
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for(int i=0; i<10000; ++i) {
			System.out.println(name + " " + i);
		}
		System.out.println("********************* " + name);
	}
}
