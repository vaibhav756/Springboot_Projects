package com.SpringBoot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.SpringBoot.dao.IPayment;

@Service()
public class PaymentContext {

	@Autowired
	private IPayment payment;
	
	public void pay(double amt)
	{
		payment.payBill(amt);
	}
	
}
