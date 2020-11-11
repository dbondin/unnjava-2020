package sample11;

public interface SomethingWithAge {
	int getAge();
	
	default void test() {
		System.out.println("testing something with age");
	}
}
