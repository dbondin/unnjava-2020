package sample19;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class A implements Serializable {
	
	private static final long serialVersionUID = 20201202095200L;

	private volatile int x;
	private double y;
	private String s;
	private transient int z;
	
	public A() {
		this(0, 0.0, "", 0);
	}
	
	public void fn1() {
		System.out.println("A from Java");
	}
	
	public native void fn2(); // JNI
}
