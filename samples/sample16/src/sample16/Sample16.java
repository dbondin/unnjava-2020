package sample16;

public class Sample16 {
	public static void main(String[] args) {
		Beatle b = Beatle.Paul;
		System.out.println("My beatle is : " + b);
		System.out.println("My beatle is : " + b.ordinal());
		
		for(Beatle b1 : Beatle.values()) {
			System.out.println("> " + b1 + " : " + b1.ordinal() + "; lastname = " + b1.getLastName());
		}
		
		Beatle b2 = Beatle.valueOf("Ringo");
		System.out.println("From string : " + b2 + " : " + b2.ordinal());
		
		int myEnumInt = 2;
		Beatle b3 = Beatle.values()[myEnumInt];
		System.out.println("From int : " + b3.toString() + " : " + b3.ordinal());
		
// !!! Errors
//		Beatle b5 = Beatle.values()[5];
//		Beatle b5 = Beatle.valueOf("Dmitry");
		
		System.out.println("John compareto Ringo = " + Beatle.John.compareTo(Beatle.Ringo));
		System.out.println("John compareto Ringo = " + (Beatle.John.ordinal() - Beatle.Ringo.ordinal()));
		
		b3 = Beatle.values()[0];
		switch(b3)
		{
		case John:
			System.out.println("The first one");
			break;	
		default:
			System.out.println("One of the others");
			break;
		}
		
		//if(b3.equals(Beatle.Paul))
		if(b3 == Beatle.Paul) {
			///
		}
	}
}
