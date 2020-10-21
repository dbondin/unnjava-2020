
// Object (java.lang.Object)

public class A { // exteds Object by default

	public A(int x) {
		System.out.println("+++ constructor for A is called");
		this.x = x;
	}

	public int x;
	// private String str;
	protected String str;

	public void setStr(String str) {
		this.str = str;
	}

	public void printStrUpperCase() {
		System.out.println(str.toUpperCase());
	}

	public String getStrReverted() {
		char arr[] = str.toCharArray();
		for (int i = 0; i < arr.length / 2; ++i) {
			char tmp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = tmp;
		}
		return new String(arr);
	}

	public final int multiplyX(int y) {
		return this.x * y;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		A other = (A) obj;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		if (x != other.x)
			return false;
		return true;
	}

	public String toString() {
		return "[A x=" + x + ", str=" + str + "]";
	}
}