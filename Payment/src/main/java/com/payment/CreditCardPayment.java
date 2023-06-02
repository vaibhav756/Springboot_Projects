package com.payment;

public class CreditCardPayment implements IPayment {

	public CreditCardPayment()
	{
	   System.out.println("Inside CreditCardPayment");	
	}
	public void payBill(double amt) {
	       System.out.println("Bill paid by Credit card amt :"+amt);
	}

}
