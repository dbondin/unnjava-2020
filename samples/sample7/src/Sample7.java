

public class Sample7 {
	// int short long float double char boolean - primitive types
	// String - object type. Contain set of chars -- Unicode
	// String are immutable !!! diffrence from C++
	
	public static void main(String[] args) {
		
		System.out.println("Program have " + args.length + " arguments");
		for(String arg : args) {
			System.out.println("> '" + arg + "'");
		}
		
		if(args.length > 0 && args[0].equals("hello")) { //  ! NOT str1 == str2 BUT str1.equals(str2)
			System.out.println("I see HELLO !!!");
		}
		else {
			System.out.println(":(");
		}
		
		String a = "Hello Java";
		System.out.println(a);
		System.out.println(a.length());
		System.out.println(a.substring(5));
		System.out.println(a.substring(1, 5));
		if(a.startsWith("He")) {
			System.out.println("Yes");
		}
		String arr[] = a.split(" ");
		for(int i=0; i<arr.length; ++i) {
			System.out.println("" + i + " -> " + arr[i]);
		}
		
		String b = a.concat(" Something");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		char ac [] = new char[10];
		String abc = "abcdefghijklmnopgqrtuvwxyz";
		for(int i=0; i<10; ++i)
		{
			ac[i] = abc.charAt((int)(Math.random() * abc.length()));
		}
		for(char c : ac) {
			System.out.println("> " + c);
		}
		String c = new String(ac);
		System.out.println(c);
		
		// StringBuilder / StringBuffer
		StringBuilder sb = new StringBuilder();
		sb.append(123);
		sb.append(" hello ");
		sb.setCharAt(4, 'H');
		String d = sb.toString();
		System.out.println(d);
	}
}
