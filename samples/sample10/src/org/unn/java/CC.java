package org.unn.java;

public class CC extends C {
	void x() {
		C c = new C();
		//!bad c.pri = 10;
		c.def = 10; // good
	}
}
