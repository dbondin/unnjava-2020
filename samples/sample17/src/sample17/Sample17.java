package sample17;

public class Sample17 {
	
	
	static void objectMethod(Object o) {
		System.out.println("Here is my object hashcode = " + o.hashCode());
	}
	
	public static void main(String[] args) {
		
		int i = 10;
		String s = "hello";
		
		objectMethod(s);
		objectMethod(i);
		
		Integer iObj = Integer.valueOf(i);
		objectMethod(iObj);
		
		byte b = 12;
		Byte bObj = Byte.valueOf(b);
		
		objectMethod(bObj);
		
		boolean x = true;
		Boolean xObj = Boolean.valueOf(x);
		objectMethod(xObj);
		System.out.println(xObj);
		
		Object o = new Object();
		System.out.println(o);
		
		// Integer, Long, Short, Byte, Double, Float - inheriter from 
		// java.lang.Number
		
		// f = x + y * z
		// OLD JAVA-1 code:
//		Double xo = Double.valueOf(100);
//		Double yo = Double.valueOf(123.321);
//		Double zo = Double.valueOf(3.14);
//		Double fo = Double.valueOf(xo.doubleValue() + yo.doubleValue() * zo.doubleValue());
		// ALL FRESH Javas:
		Double xo = 100d;
		Double yo = 123.321;
		Double zo = 3.14;
		Double fo = xo + yo * zo;
		fo += 10; // fo = Double.valueOf(fo.doubleValue() + 10) and NOT fo.set(fo + 10)
		
		System.out.println(fo);
		
		
		// Quizz !!!
		Integer i1 = 10;
		Integer i2 = 10;
		Integer i3 = 1000;
		Integer i4 = 1000;
		
		System.out.println("i1 == i2 " + (i1 == i2));
		System.out.println("i3 == i4 " + (i3 == i4)); // ???????
		
		System.out.println("i1 equals i2 " + (i1.equals(i2)));
		System.out.println("i3 equals i4 " + (i3.equals(i4)));
		
		// int in range [-128, 127] -> Integer.valueOf(int) will give you cached value
		
		// Immutable - can not change the value of wrapper class.
		
		
	}
}
