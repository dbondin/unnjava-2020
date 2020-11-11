package sample12;

public class Main {
	
	public static int __LINE__() {
		try {
			throw new Exception();
		}
		catch(Exception ex) {
			return ex.getStackTrace()[1].getLineNumber();
		}
		//return -1;
	}
	
	public static void printExceptionStackTrace(final Throwable t) {
		String n = Thread.currentThread().getName();
		String c = t.getClass().getName();
		String m = t.getMessage();
		System.err.println("Exceptino in thread '" + n + "' " + c + " : " + m);
		StackTraceElement ste [] =  t.getStackTrace();
		for(StackTraceElement e : ste) {
			System.err.println("\t" + e.getClassName() + "." + e.getMethodName() + ":" + e.getLineNumber());
		}
		Throwable cause= t.getCause();
		if(cause != null) {
			printExceptionStackTrace(cause);
		}
	}
	
	public static int divide(final int x, final int y) throws Exception {
		if(y < 0) {
			throw new Exception("Do not want to divide by negatives");
		}
		return x/y;
	}
	
	public static int test(int x) {
		return 10/x;
	}
	
	public static void test2(int x) {
		try {
			int z = 100 * test(x);
			System.out.println(z);
		}
		catch(ArithmeticException ex) {
			throw new IllegalArgumentException("Argument x=" + x + " causes arithmetic error", ex);
		}
		
	}
	
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int v[] = { 0, 5, 7 };
		for (int i = 0; i < 10; ++i) {
			try {
				System.out.println("before i=" + i);
				int index = (int) (5.0 * Math.random()); // random of 0 1 2 3 4
				System.out.println("index=" + index);
				System.out.println(v[index] / v[2 - index]);
				System.out.println("after");
//			} catch (ArithmeticException e) {
//				System.out.println("We have an arithmetic exception here, and we have handled it");
//			} catch (ArrayIndexOutOfBoundsException e) {
//				System.out.println("We have an out-of-bounds exception here");
//			}
			} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
				System.out.println("We have an some exception here");
			}
		}
		
		System.out.println("-----------------");
		
		a=2;
		b=0;
		try {
			try {
				System.out.println(v[a]/b);
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("e1");
			}
		}
		catch (ArithmeticException e) {
			System.out.println("e2");
			//throw e;
		}
		
		System.out.println("-----------------");

		//throw new RuntimeException();
		
		//RuntimeException re = new RuntimeException();
		//throw re;
		
		System.out.println("before sleep 1 second");
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {
			System.out.println("I was interrupted");
		}
		// Thread.sleep(1000);
		System.out.println("after sleep 1 second");
		
		try {
			System.out.println(divide(10, -2));
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("This code will be executed anyway, regardles exception was thrown or not");
		}
		
//		try {
//			System.out.println(1/0);
//		}
//		finally {
//			System.out.println("This code will be executed anyway, regardles exception was thrown or not");
//		}
		
//		String s = "123";
//		Object o = s;
//		((Main) o).toString();
		
		String s = "djfhdsjhjkdfbvkjsdbfjhdsbcjkdsbv";
		System.out.println(s.substring(10));
// NullPointerException - NPE
//		s = null;
//		System.out.println(s.substring(10));
		
		MyCalculator mc = new MyCalculator();
		
		try {
			mc.divide(10, 0);
		}
		catch(MyCalculatorException ex) {
			System.out.println(ex);
		}
		
		test2(10);
		//test2(0);
		
		try {
			test2(0);
		}
		catch(Throwable t) {
			printExceptionStackTrace(t);
		}
		
		// Bad practice here
		System.out.println(__LINE__()); // C.C++ __LINE__ macro
	}
}
