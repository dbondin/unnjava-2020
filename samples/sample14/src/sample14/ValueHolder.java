package sample14;

public /* synchronzed NOT HERE */ class ValueHolder {
	
	private int i;
	private double d;
	
	public double getD() {
		return d;
	}
	
	public int getI() {
		return i;
	}
	
	public void setD(double d) {
		this.d = d;
	}
	
	public void setI(int i) {
		this.i = i;
	}

	public synchronized void setDI(double d, int i) {
		//synchronized (this) {
		this.d = d;
		this.i = i;
		//}
	}
	
	public synchronized double [] getDI() {
		//synchronized (this) {
		return new double[] {this.d, this.i};
		//}
	}
	
	@Override
	public String toString() {
		return "ValueHolder [i=" + i + ", d=" + d + "]";
	}
}
