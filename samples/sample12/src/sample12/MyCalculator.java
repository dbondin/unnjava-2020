package sample12;

public class MyCalculator {
	public int divide(final int x, final int y) throws MyCalculatorException {
		if(y == 0) {
			throw new MyCalculatorException("division by zero if prohibited");
		}
		return x / y;
	}
}
