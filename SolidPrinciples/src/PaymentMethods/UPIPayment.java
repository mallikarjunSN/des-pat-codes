package PaymentMethods;

import Library.EnumPaymentMode.PaymentMode;

public class UPIPayment extends PaymentMethod {

	public UPIPayment() {
		super(PaymentMode.UPI);
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
