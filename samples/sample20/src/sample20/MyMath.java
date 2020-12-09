package sample20;

public class MyMath <T extends Number> {

	private T result;
	
	public T sum(T ... numbers)
	{
		result = (T) Double.valueOf(0);
		for(T t : numbers) {
			result = (T) Double.valueOf((result.doubleValue() + t.doubleValue()));
		}
		
		return result;
	}
}
