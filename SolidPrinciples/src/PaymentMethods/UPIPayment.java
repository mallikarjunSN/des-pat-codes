package PaymentMethods;

import Library.EnumPaymentMode.PaymentMode;
import PaymentProcessing.InvalidAmountException;

public class UPIPayment extends PaymentMethod {

	public UPIPayment() {
		super(PaymentMode.UPI);
	}

	@Override
	public void makePayment(double dAmt) throws InvalidAmountException {
		printSuccessMessage();
	}

}
