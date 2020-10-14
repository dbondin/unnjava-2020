public class Sample6 {

	// Static nested class
	static class A {
		private int x;
		private int y;
	}
	
	// Non-static nested class (inner-class)
	class B {
		private int x;
		private int y;
		
		private void fn1() {
			System.out.println("Outer Sample6 value = " + value);
		}
	}

	private void doit() {
		B b = new B();
		b.x = 123;
		b.y = 543;
		System.out.println("b.x=" + b.x + "; b.y=" + b.y + ";");
		b.fn1();
	}
	
	public static void main(String[] args) {
		A a = new A();
		a.x = 10;
		a.y = 20;
		System.out.println("a.x=" + a.x + "; a.y=" + a.y + ";");
		
		Sample6 s6 = new Sample6();
		s6.value = 3.14;
		s6.doit();
		
		Dog d1 = new Dog("Rex", Dog.AFADOR);
		d1.print();
		Dog d2 = new Dog("Beethoven", Dog.JACK_CHI);
		d2.print();
		Dog d3 = new Dog("Puppy", new Dog.Breed("Japanese Shipz"));
		d3.print();
	}
 	
	private double value;
}
