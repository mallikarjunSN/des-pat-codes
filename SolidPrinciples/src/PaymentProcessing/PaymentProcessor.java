package PaymentProcessing;

import java.io.IOException;
import java.util.Scanner;

import PaymentMethods.*;

public class PaymentProcessor {
	public PaymentProcessor() {
		System.out.println();
	}
	
	public static void main(String[] args) throws IOException{
		CashPayment cp = new CashPayment();
		UPIPayment up = new UPIPayment();
		CreditCardPayment ccp = new CreditCardPayment();
		
		try (Scanner sc = new Scanner(System.in)) {
			double dAmount = 0.0;
			
			
			System.out.println("Enter amount for cash payment : ");
			dAmount = sc.nextDouble();
			if(cp.makePayment(dAmount)) {
				System.out.print("Payment Successful!!");
			}else {
				System.out.print("Payment Failed!!\n Invalid Amount");
			}
			
			
			System.out.println("Enter amount for Credit Card payment : ");
			dAmount = sc.nextDouble();
			if(ccp.makePayment(dAmount)) {
				System.out.print("Payment Successful!!");
			}else {
				System.out.print("Payment Failed!!\n Invalid Amount");
			}
			
			System.out.println("Enter amount for UPI payment : ");
			dAmount = sc.nextDouble();
			if(up.makePayment(dAmount)) {
				System.out.print("Payment Successful!!");
			}else {
				System.out.print("Payment Failed!!\n Invalid Amount");
			}
			
		}
	}
}
