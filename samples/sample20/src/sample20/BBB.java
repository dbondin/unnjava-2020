package sample20;

public class BBB {
	public static <T> void method(T arg) {
		if(arg == null) {
			System.out.println("<null>");
		}
		else if(arg instanceof String) {
			System.out.println("String is " + arg);
		}
		else {
			System.out.println("It is NOT a string");
		}
	}
}
