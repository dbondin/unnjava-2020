package sample11;

public abstract class WildAnimal implements Animal {
	
	public static interface FoodTypeProvider {
		
		int PREDATOR = 1;
		int HERBIVORE = 2;
		
		int getFoodType();
	}
	
	private FoodTypeProvider foodTypeProvider;
	
	public WildAnimal(FoodTypeProvider foodTypeProvider) {
		this.foodTypeProvider = foodTypeProvider;
	}
	
	public void saySomething() {
		System.out.println("Wild animals do not listen to your commands !!!");
	}
	//public abstract String getName();
	//public abstract String getFavoriteFod();

	public FoodTypeProvider getFoodTypeProvider()
	{
		return foodTypeProvider;
	}
}
