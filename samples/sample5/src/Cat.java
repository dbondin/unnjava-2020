public class Cat {
	
	private static int NUMBER_OF_CATS;
	
	public static final int DEFAULT_AGE = 0;
	
	static {
		NUMBER_OF_CATS = 0;
		System.out.println("Cat static initialization is here " + NUMBER_OF_CATS);
	}
	
	static {
		//....
	}
	
	public Cat(final String name, final int age, final char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		//ERROR because of 'final'
		//name = "sss";
		
		NUMBER_OF_CATS++;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public static void printCat(Cat c) {
		System.out.println("name=" + c.name + "; age=" + c.age + "; gender=" + c.gender +"; N=" + NUMBER_OF_CATS);
	}
	
	public char getGender() {
		return gender;
	}

	// NOT WORKING
//	public void setGender(char gender) {
//		this.gender = gender;
//	}
	
	private String name; // Very common idea of having private xxx, public getXxx()/setXxx()
	private int age;
	private final char gender; // 'm' or 'f'
	
	// 'final' in java is like a 'const' in C++ for members/variables
}
