package com.SpringBoot.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("debit")
public class DebitCardPayment implements IPayment {

	@Override
	public void payBill(double amt) {
		System.out.println("Bill paid through debit card...!!");
	}

}
