package sample20;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Sample20 {
	public static void main(String[] args) {
		
		X<Integer> x1 = new X<Integer>();
		
		x1.setValue(100);
		
		System.out.println(x1.getValue());
		
		X<String> x2 =  new X<String>();
		
		x2.setValue("hello");
		
		Integer i1 = 100;
		Number n1 = i1; // correct
		
		X<Integer> xi1 = new X<Integer>();
		// X<Number> xn1 = xi1; // not correct
		
		// int j = (Integer) x2.getValue(); - NOT WORKING
		
		System.out.println(x2.getValue());
		
		Y y1 = new Y();
		
		y1.setValue("hello");
		
		// int i = ((Integer) y1.getValue()).intValue();
		//System.out.println(i);

		// C++ std::vector<int> std::vector<std::string>
		
		MyMath<Integer> mm1 =  new MyMath<Integer>();
		
		System.out.println( mm1.sum(1, 2, 3, 4, 5) );
		
		// MyMath<String> s1; // BAD
		
		Z<ComparableCat> zc = new Z<ComparableCat>(new ComparableCat("Tom", 80));
		Z<ComparableCat> zc1 = new Z<ComparableCat>(new ComparableCat("Lynx", 10));
	
		System.out.println(zc.compareCat(zc1));

		Z<AnotherComparableCat> zc2= new Z<AnotherComparableCat>(new AnotherComparableCat("Lynx", 10));

		System.out.println(zc.compareCat(zc2));
		
		AAA<Integer, String, String> aaa = new AAA<Integer, String, String>(100, "hello",
				new String[] {"A", "B", "C"});
		
		BBB.method(null);
		BBB.<String>method(null);
		BBB.method("hello");
		BBB.method(100);
		BBB.method(true);
		
		Object o = "hello";
		BBB.method(o);
	
		CatOwner<Cat> co = new CatOwner<>();
		co.setPet(new Cat("Tom", 80));
		
		X xo = new X();
		X<Object> xo1 = new X<Object>(); // prefer this
		
		CatOwner co2 = new CatOwner();
		CatOwner<Cat> co3 = new CatOwner<Cat>();
		
		X<Cat> xc1 = new X<>(); // Diamond operator will put 'Cat' into <>
		
		AAA<String, Integer, Cat> aaa1 = new AAA<>("hello", 1, null);
		
		var v1 = new AAA<String, Integer, Cat>("hello", 1, null);
		var v2 = new AAA<>("hello", 1, null);
		
		if(xc1 instanceof X) {}
		if(xc1 instanceof X<?>) {}
		// if(xc1 instanceof X<Integer>) {} // BAD
		
		
		List<String> ls = new ArrayList<>();
		ls.add("hello");
		ls.add("100");
		ls.stream().forEach(s -> System.out.println(s));
		
		List<Integer> li = new LinkedList<>();
	}
}
