package PaymentProcessing;

public class InvalidAmountException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidAmountException(String msg){
		super(msg);
	}

}
