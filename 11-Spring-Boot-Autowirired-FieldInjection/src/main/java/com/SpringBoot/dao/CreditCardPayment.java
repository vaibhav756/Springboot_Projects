package com.SpringBoot.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("payment")
public class CreditCardPayment implements IPayment {

	@Override
	public void payBill(double amt) {
		
        System.out.println("Bill paid through credit card...!!");
	}

}
