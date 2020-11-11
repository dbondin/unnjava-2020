package org.unn.java;

public class D {
	
	void x() {
		C c =  new C();
		//!bad c.pri = 10;
		c.pro = 10; // good
	}
}
