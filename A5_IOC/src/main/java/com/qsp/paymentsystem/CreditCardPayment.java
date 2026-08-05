package com.qsp.paymentsystem;

import org.springframework.stereotype.Component;

@Component("credit")
public class CreditCardPayment implements Payment {
	@Override
	public void payment(int amount) {
		System.out.println(amount + " payment done by " + getClass().getSimpleName());
	}
}
