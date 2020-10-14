public class Sample5 {
	public static void main(String[] args) {
		// public private protected *default*
		// public private - today only these guys
		
		System.out.println("Before any cats");
		Cat c = new Cat("Thomas", Cat.DEFAULT_AGE, 'm');
		System.out.println(c.getName() + " " + c.getAge());
		
		c.setAge(5);
		c.setName("Missy");
		System.out.println(c.getName() + " " + c.getAge());
		
		Cat.printCat(c); // C++ Cat::printCat(c)
		
		final Cat c2 = new Cat("Pretty", 5, 'f');
		Cat.printCat(c); // C++ Cat::printCat(c)
		Cat.printCat(c2); // C++ Cat::printCat(c)
		
		// ERROR because of 'final'
		//c2 = new Cat("", 0, 'm');
		
		// 'static' keyword - pretty the same as in C++
	}
}
