package PaymentMethods;

import Library.EnumPaymentMode.PaymentMode;

public class CashPayment extends PaymentMethod {
	
	
	public CashPayment() {
		super(PaymentMode.CASH);
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
