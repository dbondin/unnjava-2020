public class Cat extends AbstractAnimal {
	
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public void saySomething() {
		System.out.println("Meow");
	}
}
