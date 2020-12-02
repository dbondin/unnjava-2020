package sample18;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@MySuperAnnotation(name = "main class", count = 1)
public class Sample18 {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void fn1(Object o) {
		List l = new ArrayList();
		l.add(o);
		Integer i = (Integer) o;
		System.out.println("> " + (10 + i));
	}
	
	public static void main(String[] args) {
		SomeClass sc =  new SomeClass();
		
		sc.saySomething("Hello");
		
		// Accessing annotations in runtime using java-reflection mechanism
		for(Method m : sc.getClass().getMethods()) {
			System.out.println(m.getName());
			for(Annotation a : m.getAnnotations()) {
				System.out.println("  " + a.annotationType());
			}
			if(m.isAnnotationPresent(MySuperAnnotation.class)) {
				MySuperAnnotation msa =  m.getAnnotation(MySuperAnnotation.class);
				System.out.println("     " + msa.name() + " " + msa.count() + " " + msa.test());
			}
		}
		
		Cat c = new Cat("Tom", 80, "Undefined");
		System.out.println(c.getName() + " " + c.getAge());
		System.out.println(c);
	}
}
