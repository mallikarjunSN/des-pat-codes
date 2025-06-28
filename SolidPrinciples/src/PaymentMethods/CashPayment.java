package PaymentMethods;

import Library.EnumPaymentMode.PaymentMode;
import PaymentProcessing.InvalidAmountException;

public class CashPayment extends PaymentMethod {
	
	
	public CashPayment() {
		super(PaymentMode.CASH);
	}

//	@Override
//	public void makePayment(double dAmt) throws InvalidAmountException {
//		printSuccessMessage();
//	}
	
}
