package sample13;

import java.util.Date;

public class Main {
	public static void main(String[] args) {
		
		Thread currentThread = Thread.currentThread();
		
		System.out.println(currentThread);
		
		System.out.println("name=    " + currentThread.getName());
		System.out.println("priority=" + currentThread.getPriority());
		System.out.println("state=   " + currentThread.getState());
		System.out.println("tgroup=  " + currentThread.getThreadGroup());
		
		//currentThread.setName("MySuperThread");
		
//		System.out.println(new Date());
//		try {
//			Thread.sleep(1000); //  sleep for 1 second
//		}
//		catch(InterruptedException ex) {
//			System.err.println(ex);
//		}
//		System.out.println(new Date());
		
		// not recommended approach : (
//		MyOtherThread myOtherThread1 = new MyOtherThread();
//		myOtherThread1.start();
		
//		MyOtherRunnable myOtherRunnable = new MyOtherRunnable();
//		Thread myOtherThread2 = new Thread(myOtherRunnable);
//		myOtherThread2.start();
		
		// Better approach : )
//		Thread myOtherThread2 = new Thread(new MyOtherRunnable());
//		myOtherThread2.start();
		
//		while(true) {
//			System.out.println("state of myOtherThread1 = " + myOtherThread1.getState());
//			System.out.println("state of myOtherThread2 = " + myOtherThread2.getState());
//			try {
//				Thread.sleep(250);
//			}
//			catch (InterruptedException ex) {}
//		}
		
		//join
//		while (true) {
//			try {
//				myOtherThread1.join();
//				myOtherThread2.join();
//				break;
//			} catch (InterruptedException ex) {
//				System.out.println(ex);
//			}
//		}
		
		Thread t1 = new Thread(new PriorityTestRunnable(), "test-1");
		Thread t2 = new Thread(new PriorityTestRunnable(), "test-2");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		t2.start();
		
		System.out.println("Exiting main()");
	}
}
