package sample11;

public class Main {

	private static void test3(SomethingWithAgeAndGender swaag) {
		System.out.println(">> Age = " + swaag.getAge() + " Gender = "
				+ ((swaag.getGender() == SomethingWithAgeAndGender.GENDER_FEMALE) ? "f" : "m"));
	}
	
	private static void test2(SomethingWithAge swa) {
		System.out.println(">> Age = " + swa.getAge());
	}
	
	private static void test(Animal a) {
		System.out.println("Here is " + a.getName() + ", it's favorite food is " + a.getFavoriteFod());
		a.saySomething();
		int wil = a.whereIsItLives();
		System.out.println("Lives in: ");
		if((wil & Animal.LIVES_IN_AIR) != 0) {
			System.out.println("air");
		}
		if((wil & Animal.LIVES_IN_WATER) != 0) {
			System.out.println("water");
		}
		if((wil & Animal.LIVES_IN_GROUD) != 0) {
			System.out.println("groud");
		}
		System.out.println("Can climb trees: " + a.canClimbTrees());
	}
	
	public static void main(String[] args) {
		Cat c = new Cat(10, SomethingWithAgeAndGender.GENDER_MALE);
		
		test(c);
		test2(c);
		test3(c);
		
		Lizard l = new Lizard();
		
		test(l);
		//! bad test2(l);
		
		Wolf w = new Wolf();
		
		test(w);
		
		Animal.staticTest();
	}
}
