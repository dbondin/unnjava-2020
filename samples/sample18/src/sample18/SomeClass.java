package sample18;

public class SomeClass {
	
	/**
	 * This methods is deprecated, use {@link SomeClass#saySomething(String)} instead
	 */
	@Deprecated
	public void saySomething() {
		System.out.println("Something");
	}
	
	@MySingleArgAnnotation(MySingleEnum.One)
	@MyMarkerAnnotation
	@MySuperAnnotation(name = "xxx", count = 4)
	public void saySomething(final String param) {
		System.out.println("Something " + param);
	}
	
	@Override
	public String toString() {
		return "ha-ha-ha";
	}
}	
