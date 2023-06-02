package com.payment;

public class PayBill {
	
	public IPayment payment;
//	public void setPayment(IPayment payment)
//	{
//		this.payment=payment;
//	}
	public PayBill()
	{
		System.out.println("Inside PayBill Class");
	}
	public PayBill(IPayment payment)
	{
	    this.payment=payment;	
	}
	public void pay(double amt)
	{
		payment.payBill(amt);
	}

}
