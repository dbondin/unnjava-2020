
public class WildCat extends Cat {
	public WildCat(String name) {
		super(name);
	}
	
	@Override
	public void saySomething() {
		System.out.print("RRRR ");
		super.saySomething();
	}
}
