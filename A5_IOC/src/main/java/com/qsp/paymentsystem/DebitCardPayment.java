package com.qsp.paymentsystem;

import org.springframework.stereotype.Component;

@Component("debit")
public class DebitCardPayment implements Payment {
	@Override
	public void payment(int amount) {
		System.out.println(amount + " payment done by " + getClass().getSimpleName());
	}
}
