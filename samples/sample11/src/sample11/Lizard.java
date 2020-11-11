package sample11;

public class Lizard implements Animal {
	public String getFavoriteFod() {
		return "???";
	}
	public String getName() {
		return "Lizard";
	}
	public void saySomething() {
		System.out.println("Shhhhh");
	}
	
	@Override
	public int whereIsItLives() {
		return LIVES_IN_GROUD | LIVES_IN_WATER;
	}
	
	public boolean canClimbTrees() {
		return true;
	}
}
