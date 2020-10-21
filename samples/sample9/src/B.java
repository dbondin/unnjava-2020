// public class B extends A, OtherA {    !!! NO WAY TO DO THIS IN JAVA
public class B extends A {
	
	public B() {
		super(0);
		System.out.println("+++ constructor for B is called");
	}
	
	public void printStrLowerCase() {
		System.out.println(str.toLowerCase());
	}
	
	public String getStrReverted() {
		String s = super.getStrReverted(); // C++ A::getStrReversed()
		return s.toUpperCase();
	}

// We can NOT overrode 'final' methods
//	public int multiplyX(int y) {
//		return this.x * y * y;
//	}
	
	@Override
	public String toString() {
		return "[B str=" + str + ", x=" + x + "]";
	}
}
