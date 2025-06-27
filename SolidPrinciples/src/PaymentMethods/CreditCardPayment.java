package PaymentMethods;

import Library.EnumPaymentMode.PaymentMode;

public class CreditCardPayment extends PaymentMethod {

	public CreditCardPayment() {
		super(PaymentMode.CREDIT_CARD);
	}

	@Override
	public boolean makePayment(double dAmt) {
		printMessage();
		if(dAmt>0)
			return true;
		else
			return false;
	}

}
