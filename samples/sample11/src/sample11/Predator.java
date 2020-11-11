package sample11;

import sample11.WildAnimal.FoodTypeProvider;

public class Predator implements FoodTypeProvider {
	@Override
	public int getFoodType() {
		return PREDATOR;
	}
}
