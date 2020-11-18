package sample14;

public class Main {
	public static void main(String[] args) {
		ValueHolder valueHolder = new ValueHolder();
		
		Thread t1 = new Thread(new ValueHolderModifierRunnable(valueHolder), "t1");
		Thread t2 = new Thread(new ValueHolderModifierRunnable(valueHolder), "t2");
		
		t1.start();
		t2.start();
		 
		while(true) {
			double d;
			int i;
			
//			synchronized (valueHolder) {
//				d = valueHolder.getD();
//				i = valueHolder.getI();
//			}

			double [] di = valueHolder.getDI();
			d = di[0];
			i = (int) di[1];
			
			if(i != ((int) d)) {
				System.out.println("error: i=" + i + " d=" + d);
			}
		}
	}
}
