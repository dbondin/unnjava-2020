package sample11;

public class Wolf extends WildAnimal {
	
	public Wolf() {
		super(new Predator());
	}
	
	public String getFavoriteFod() {
		return "Anything I can catch";
	}
	
	public String getName() {
		return "Wolf";
	}

	
	@Override
	public int whereIsItLives() {
		return LIVES_IN_GROUD;
	}
}
