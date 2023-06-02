package com.payment;

public class DebitCardPayment implements IPayment {
	
	public DebitCardPayment()
	{
	   System.out.println("Inside DebitCardPayment");	
	}
	public void payBill(double amt) {
	       System.out.println("Bill paid by Debit card amt :"+amt);
	}

}
