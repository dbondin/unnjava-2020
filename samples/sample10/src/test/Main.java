package test;

// java.lang.* is always imported by default
import org.unn.java.*;
//import org.unn.java.sample10.*;
import org.unn.java.sample10.A;
//!bad import org.unn.java.sample10.Same;

public class Main {
	public static void main(String[] args) {

		B b = new B();
		
		C c = new C();
		D d = new D();
		
		A a = new A();
		org.unn.java.sample10.E e = new org.unn.java.sample10.E();
		
		Same s = new Same();
		s.x();
		
		org.unn.java.sample10.Same another = new org.unn.java.sample10.Same();
		another.m();
		
		System.out.println("Testing");
	}
}
