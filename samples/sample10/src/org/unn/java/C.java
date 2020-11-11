package org.unn.java;

public class C {
	public int pub; // fully accesible from anywhere
	private int pri; // not accesible for anyone exept C
	protected int pro; // visible for siblings, for any subclasses
	/* default */ int def; // visible for siblings
}
