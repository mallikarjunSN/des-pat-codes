package PaymentProcessing;

public interface PaymentProcess {
	void makePayment(double dAmt) throws InvalidAmountException;
}
