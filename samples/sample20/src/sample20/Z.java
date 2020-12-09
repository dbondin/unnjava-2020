package sample20;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Z <T extends Cat & Comparable<Cat>> {
	
	T cat;
	
	public int compareCat(Z<? extends Comparable<Cat>> other) {
		return cat.compareTo(other.cat);
	}
}
