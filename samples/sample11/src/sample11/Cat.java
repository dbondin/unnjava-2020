package sample11;

public class Cat implements Animal, SomethingWithAgeAndGender {
	
	private int age;
	private int gender;
	
	public Cat(int age, int gender) {
		this.age = age;
		this.gender = gender;
	}
	
	public String getName() {
		return "Cat";
	}
	public String getFavoriteFod() {
		return "Fish";
	}
	public void saySomething() {
		System.out.println("Meow");
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public int whereIsItLives() {
		return LIVES_IN_GROUD;
	}
	
	@Override
	public int getGender() {
		return gender;
	}
	
	public boolean canClimbTrees() {
		return true;
	}
	
	public void test() {
		//Animal.super.test();
		//SomethingWithAgeAndGender.super.test();
		/* do nothing for exemple */
	}
}
