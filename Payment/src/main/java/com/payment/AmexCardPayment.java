package com.payment;

public class AmexCardPayment implements IPayment {

	public AmexCardPayment()
	{
		System.out.println("Inside AmexCardPayment");
	}
	
	public void payBill(double amt) {
       System.out.println("Bill paid by Amex card amt :"+amt);
	}

}
