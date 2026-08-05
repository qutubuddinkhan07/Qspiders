package com.qsp.paymentsystem;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {
	@Autowired
	private Map<String, Payment> options;

	public void doPayment(int amount, String method) {
		Payment paymentOption = options.get(method);
		if (paymentOption == null) {
			throw new RuntimeException("Invalid payment method");
		}
		paymentOption.payment(amount);
	}
}
