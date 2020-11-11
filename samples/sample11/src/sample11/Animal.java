package sample11;

public interface Animal {
	
	// public, final
	int LIVES_IN_WATER = 1; // 0001
	int LIVES_IN_AIR = 2;   // 0010
	int LIVES_IN_GROUD = 4; // 0100
	
	String getName();
	String getFavoriteFod();
	void saySomething();
	
	/* Please return one of LIVES_* here as a bitmask */
	int whereIsItLives();
	
	default boolean canClimbTrees() {
		return false;
	}
	
	default void test() {
		thisIsAPrivateMethod();
		System.out.println("testing animal");
	}
	
	static void staticTest() {
		System.out.println("This is a static method test");
	}
	
	private void thisIsAPrivateMethod() {
		//
	}
}
