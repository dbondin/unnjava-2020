package sample20;

import lombok.ToString;

@ToString

//public class CCC {
//	private Integer t;
//	private String v;
//
//	public void set(Integer t) {
//		this.t = t;
//	}
//
//	public void set(String v) {
//		this.v = v;
//	}
//}

public class CCC <T, V> {
	private T t;
	private V v;
	
	public T createNewT() {
		//return new T();
		T result = null;
		try {
			result = (T) t.getClass().getConstructor().newInstance();
		}
		catch(Exception ex) {}
		return result;
	}
	
	public void setT(T t) {
		this.t = t;
	}
	
	public void setV(V v) {
		this.v = v;
	}
}
