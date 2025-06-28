package PaymentMethods;

import Library.EnumPaymentMode.PaymentMode;
import PaymentProcessing.InvalidAmountException;

public class CreditCardPayment extends PaymentMethod {

	public CreditCardPayment() {
		super(PaymentMode.CREDIT_CARD);
	}

	@Override
	public void makePayment(double dAmt) throws InvalidAmountException {
		printSuccessMessage();
	}

}
