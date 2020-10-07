class BoxApp {

    static void fn(Box theBox, double mult) {
	theBox.width *= mult;
	theBox.height *= mult;
	theBox.length *= mult;

	mult *= mult;
	
	System.out.println("FN: theBox.width = " + theBox.width + "; theBox.height = " + theBox.height +
			   "; theBox.length = " + theBox.length);
	System.out.println("FN: mult = " + mult);
    }
    
    public static void main(String [] args) {
	int i = 0;
	int j = i;
	System.out.println(i);
	Box b = new Box();
	System.out.println("b = " + b);
	b.width = 2.0;
	b.height = 3.0;
	b.length = 4.0;
	System.out.println("Value of b = " + b.width * b.height * b.length);

	Box b2 = b; // REFERENCES, NOT copies
	System.out.println("b2 = " + b2);
	System.out.println("Value of b2 = " + b2.width * b2.height * b2.length);

	System.out.println("b.width = " + b.width + "; b2.width = " + b2.width);
	b.width = 5.0;
	System.out.println("b.width = " + b.width + "; b2.width = " + b2.width);
	b2.width = 6.0;
	System.out.println("b.width = " + b.width + "; b2.width = " + b2.width);

	// !!! primitive types (int, long, double...) are do copies
	// !!! classes (objects) are do references to existing ones, not copies

	Box b3 = new Box();
	b3.width = 10;
	b3.height = 3.14;
	b3.length = 0.1;

	System.out.println("b3.width = " + b3.width + "; b3.height = " + b3.height +
			   "; b3.length = " + b3.length);

	double mult = 3.0;
	fn(b3, mult);
	
	System.out.println("b3.width = " + b3.width + "; b3.height = " + b3.height +
			   "; b3.length = " + b3.length);
	System.out.println("mult = " + mult);
    }
}
