//for input
import java.util.Scanner;

public class Sample4 {

	//return-type name(args ) {body};
	
	static void fn(Box b, int x) {
		b.setDimensions(100, 100, 200);
		x = 10;
	}
	
	static void test() {
		Box b = new Box(5, 3, 2);
		//b.setDimensions(5, 3, 2);
		Box b2 = new Box(3, 4, 5);
		b2.setDimensions(5);
		b2.setDimensions(3.14, 1.1, 0.55);
		//b2.setDimensions(3, 4, 5);
		Box b3 = new Box();
		
		
		double v = b.value();
		System.out.println("b.value()=" + v);
		System.out.println("b2.value()=" + b2.value());
	}
	
	public static void main(String[] args) {
		
//		test();
		
		int x = 123;
		Box b = new Box(1, 2, 3);
		System.out.println("-- b.value=" + b.value() + "; x=" + x);
		fn(b, x);
		System.out.println("-- b.value=" + b.value() + "; x=" + x);
		
		Box b2 = b.createCopy();
		System.out.println("-- b2.value=" + b2.value() + "; x=" + x);
		
		b2.setDimensions(10, 20, 30);
		System.out.println("-- b.value=" + b.value() + "; x=" + x);
		System.out.println("-- b2.value=" + b2.value() + "; x=" + x);
		
		// Java uses garbage collection (GC) to cleanup unused objects
		// Diff from C++: new/delete (contructor/destructors)
		//           Java: new, but NO delete, GC is responsible to destroy the objects
		
		Mathem m = new Mathem();
		
		System.out.println("5!=" + m.factorial(5));
		
		//Stat from here
		Mathem m1=new Mathem();
		//user input the nb
		Scanner u_input=new Scanner(System.in);
		System.out.println("Eneter a number");
		int nb=u_input.nextInt();
		
		System.out.println("Using fibRe func :");
		for(int i=0;i<=nb;i++) {
			System.out.print(m1.fibRe(i)+" ");
		}System.out.println();
		
		
		System.out.print("Using fibDy func :");
		System.out.print(m1.fibDy(9)+" ");
		
		
		
	}
	
}
