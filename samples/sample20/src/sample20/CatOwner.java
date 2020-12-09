package sample20;

import lombok.Setter;

public class CatOwner <T extends Cat> implements PetOwner<T> {
	
	@Setter
	private T pet;
	
	@Override
	public T getPet() {
		return pet;
	}
}
