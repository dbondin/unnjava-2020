public class Sample9 {
	
	static void fn1(A x) {
		System.out.println("XXX=" + x.x + " " + x.getStrReverted());
	}
	
	static void sayHello(AbstractAnimal aa) {
		System.out.print("Hello " + aa.getName() + ", ");
		aa.saySomething();
	}
	
	public static void main(String[] args) {

		A a = new A(10);
		B b = new B();
		b.x = 20;

		System.out.println(a.x);
		System.out.println(b.x);
		
		a.setStr("Hello world");
		a.printStrUpperCase();
		
		// a.str = "qwerry"; // ??? Why is this works ???
		
		b.setStr("QwErTy");
		b.printStrLowerCase();
		b.printStrUpperCase();
		
		A c = b;
		c.printStrUpperCase();
		
		// B d = a; NOT WORK
		
		fn1(a);
		fn1(b);
		fn1(c);
		
		System.out.println(a.getStrReverted());
		System.out.println(b.getStrReverted());
		
		C e = new C();
		
		// Comparing to C++ - Java methods are like always 'virtual'
		
		// AbstractAnimal aa = new AbstractAnimal(); Can not instance abstract class
		Cat a1 = new Cat("Thomas");
		
		a1.saySomething();
		
		sayHello(a1);
		
		Mouse a2 = new Mouse("Jerry");
		
		sayHello(a2);
		
		Cat a3 = new Cat("Ginger");
		sayHello(a3);
		
		WildCat a4 = new WildCat("Puma");
		sayHello(a4);
		
		System.out.println(a.multiplyX(123));
		System.out.println(b.multiplyX(123));
		
		
		A z1 = new A(10);
		z1.setStr("java");
		
		A z2 = new A(10);
		z2.setStr("java");
		
		System.out.println("z1 == z2 : " + (z1 == z2));
		System.out.println("z1.equals(z2) : " + (z1.equals(z2)));
		
		B z3 = new B();
		z3.x = 10;
		z3.setStr("java");
		
		System.out.println("z1 == z3 : " + (z1 == z3));
		System.out.println("z1.equals(z3) : " + (z1.equals(z3)));
		
		System.out.println(z1);
		System.out.println(z3);
		
	}
}
