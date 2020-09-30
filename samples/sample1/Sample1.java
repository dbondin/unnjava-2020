/**
 * This is a very first sample class.
 *
 * @author Dmitry B
 */
public class Sample1 {

    // This is single line comment
    public static final int MY_INT_CONSTANT = 123;

    /*
      Multy
      Line
      Comment
     */
    public static void main(String [] args)
    {
	byte bv; // 1 byte [-128,+127]
	short sv; // 2 bytes (16 bits) [-32k..+32k]
	int someVar = 123; // 4 bytes (32 bits) [2^31..2^31-1]
	int someLongNamedVariableHoHoHo;
	int some_other_variable;
	long lv; // 8 bytes (64 bits) [2^63..2^63-1]

	float f; // 4 bytes FPSP // IEEE-754
	double d; // 8 bytes FPDP

	boolean b1 = false;
	//boolean b2 = 0;
	//int iii = true;
	
	d = 1.0 / 3.0;
	
	bv = 1;
	//! bv = 1000;
	
	System.out.println("Hello, Java");
	System.out.println("bv=" + bv);
	System.out.println("test=" + d * 3);
	System.out.println("b1=" + b1);
	System.out.println("int test=" + 0b10101010); //128+32+8+2 == 170

	int x=0;
	if(x==0) {
	    System.out.println("Hello");
	}else {
	    System.out.println("Byte");
	}

	char c1 = 'a'; // 2 bytes [0..65535] Unicode
	//int c1;
	char c2 = '\043'; // #
	char c3 = '\u20ac';

	System.out.println("c1="+ c1);
	System.out.println("c2="+ c2);
	System.out.println("c3="+ c3);

	System.out.println("one\t\ttwo");
	//! System.out.println("string one" "string two");
	System.out.println("string one" + " " + "string two");

	int z1,z2,z3;

	int v1=10;
	long v2 = v1;
	// int v3 = v2;
	int v3 = (int) v2;

	var v4 = 100; // Kind of 'auto' in C++
	var v5 = 3.14;
	var v6 = 1000000000000000L;

	int arr[];
	arr = new int[10];
	int arr2[] = new int[10];
	x = 100;
	int arr3[] = new int[x*3+5];
	int arr4[] = { 100, 456, 777, 999 };
	System.out.println("arr test = " + arr[0]);

	arr4[1] = 0;
	
	for(int i=0; i<arr4.length; ++i) {
	//! for(int i=0; i<10; ++i) {
	    System.out.println("arr4[" + i + "] = " + arr4[i]);
	}

	//double mda[][] = new double[2][2];
	double mda[][] = new double[2][];
	mda[0] = new double[3];
	mda[1] = new double[5];
	mda[0][0] = 3.14;
	mda[1][1] = 2.27;
	for(int row=0; row<mda.length; ++row) {
	    for(int col=0; col<mda[row].length; ++col) {
		System.out.print(" " + mda[row][col]);
	    }
	    System.out.println();
	}

	int arr5[] = new int [6];
	int [] arr6 = new int [7];
	int [] arr7, arr8, arr9;

	var arr10 = new char[100];	
    }

    void someSampleMethod()
    {
    }
}
