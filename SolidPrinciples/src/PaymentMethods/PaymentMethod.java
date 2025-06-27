package PaymentMethods;

import Library.EnumPaymentMode.PaymentMode;
import PaymentProcessing.PaymentProcess;

public abstract class PaymentMethod implements PaymentProcess {
	PaymentMode pm;
	
	public PaymentMethod(PaymentMode pm) {
		this.pm = pm;
	}

	@Override
	abstract public boolean makePayment(double dAmt);
	
	void printMessage() {
		System.out.println("Making Payment Via - " + pm.toString());
	}
	
}
