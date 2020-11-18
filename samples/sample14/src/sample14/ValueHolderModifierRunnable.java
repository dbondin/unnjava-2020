package sample14;

public class ValueHolderModifierRunnable implements Runnable {
	
	private ValueHolder valueHolder;
	
	public ValueHolderModifierRunnable(ValueHolder valueHolder) {
		this.valueHolder = valueHolder;
	}
	
	@Override
	public void run() {
		while(true) {
			double rnd = 1000.0 * Math.random();
//			synchronized (valueHolder) {
//				valueHolder.setD(rnd);
//				valueHolder.setI((int)rnd);
//			}
			valueHolder.setDI(rnd, (int)rnd);
		}
	}
}
