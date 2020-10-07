public class Sample2 {
    public static void main(String [] args) {
	System.out.println(2+3);
	//System.out.println(123/0);
	int x=17;
	System.out.println(x%7);
	System.out.println(1.0/3);

	int y=10;
	y += x; // y = y + x;

	System.out.println(y);

	y++;
	System.out.println(y);
	y--;
	System.out.println(y);

	// bit

	x=1; //     00000000 00000000 00000000 000000001
	     // ~x  11111111 11111111 11111111 111111110 == -2
	     // x&2 AND 00000000 00000000 00000000 000000001
	     //         00000000 00000000 00000000 000000010
	     // | - OR
	     // ^ - XOR
	System.out.println(~x);
	System.out.println(x&2);
	System.out.println(123&321);
	System.out.println(x|2);
	System.out.println(7^2); // 111 010 -> 101
	System.out.println(1<<5); // 00000001 moving 5 bits to left -> 000100000
	System.out.println(127>>2); // 01111111 moving 2 buts to right -> 000111111
	// 11111111 11111111 11111111 111111110 -> 11111111 11111111 11111111 111111111
	System.out.println(-2>>2);
	// 11111111 11111111 11111111 111111110 -> 00111111 11111111 11111111 111111111
	System.out.println(-2>>>2);

	System.out.println(x > 10);
	System.out.println(x == 1);

	x=3;
	y=0;
	if( (x == 4) && (x/y == 1) ) { // | vs ||
	    System.out.println("Good!!!");
	}

	System.out.println(!true);

	System.out.println((x==3)?"Three":"Some other number");
	System.out.println((x==4)?"Three":"Some other number");

	System.out.println(2+2*2); // 6
	System.out.println((2+2)*2); // 8


	// if(boolean-value) action

	if(x==3) System.out.println("ok");

	if(x==4) System.out.println("ok once again");
	else System.out.println("fail this time");

	if(x==4) {
	    System.out.println("ok once again");
	}
	else {
	    System.out.println("fail this time");
	    x++;
	}

	if(x==1) {
	}
	else if(x==2) {
	}
	else if(x==3) {
	}
	else {
	}

	//if(x) {
	//}

	x = 2;
	switch (x) {
	    case 1:
		System.out.println("One");
		break;
	    case 2:
		System.out.println("Two");
		break;
	    case 3:
		System.out.println("Three");
		break;
	    default:
		System.out.println("Many");
		break;
	}

	String str = "hello";

	switch (str) {
	case "hello":
	    System.out.println("It was Hello !!!");
	    break;
	default:
	    System.out.println(": (((");
	    break;
	}

	// while (boolean value/expr) code

	x=0;
	while(x < 10) {
	    System.out.println("loop: " + x*x);
	    x++;
	}

	// do-while (boolean expr)

	x=0;
	while(x < 0) {
	    System.out.println("loop 2: " + x*x);
	    x++;
	}
	    
	x=0;
	do {
	    System.out.println("loop 3: " + x*x);
	    x++;	    
	} while(x<0);

	// for(init; cond; incr-value)

	for(x=0;x<10;++x) {
	    System.out.println("loop 4: " + x*x);
	}

	for(x=0,y=10; x<y; ++x,--y) {
	    System.out.println("loop5: " + x + " " + y);
	}

	x=0;
	for(; x<10;) {
	    System.out.println("loo6: " + x);
	    ++x;
	}

	// for(;;) == while(true)
	x=0;
	for(;;) {
	    System.out.println("loop7: " + x);
	    ++x;
	    if(x>100) {
		break; // terminate the loop
	    }
	}

	// continue

	for(int i=0; i<100; ++i) {
	    if(i%3 != 0) {
		continue;
	    }
	    System.out.println("loop8: " + i);
	}

	// for loop over collection
	double [] da = {3.14, 2.27, 42.0, 0.0};
	for(int i=0; i<da.length; ++i) {
	    System.out.println("loop9: " + da[i]);
	}
	for(double value: da) {
	    System.out.println("loop10: " + value);
	}

	for(int i=0; i<10; ++i) {
	    l1:
	    for(int j=0; j<10; ++j) {
		System.out.print("#");
		if(j>=i) {
		    break l1; // really kind of GOTO operator, which is anti-pattern
		}
	    }
	    System.out.println();
	}
    }
}
