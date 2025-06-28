package PaymentMethods;

import Library.EnumPaymentMode.PaymentMode;
import PaymentProcessing.InvalidAmountException;
import PaymentProcessing.PaymentProcess;


/**
 * This is an abstract class which can be extended whenever introducing any new Payment Method.
 */
public abstract class PaymentMethod implements PaymentProcess {
	PaymentMode pm;
	
	public PaymentMethod(PaymentMode pm) {
		this.pm = pm;
	}

	@Override
	public void makePayment(double dAmt) throws InvalidAmountException{
		if(validateAmount(dAmt)) {
			printSuccessMessage();
		}else {
			throw new InvalidAmountException("Amount cannot be negative or zero!!");
		}
	}
	
	boolean validateAmount(double dAmt) {
		return (dAmt>0);
	}
	
	void printSuccessMessage() {
		System.out.println("Making Payment Via - " + pm.toString());
	}
	
}
