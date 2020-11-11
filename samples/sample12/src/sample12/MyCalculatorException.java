package sample12;

public class MyCalculatorException extends Exception {

	public MyCalculatorException() {
		super();
	}
	
	public MyCalculatorException(String message) {
        super(message);
    }
	
    public MyCalculatorException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public MyCalculatorException(Throwable cause) {
        super(cause);
    }
}
