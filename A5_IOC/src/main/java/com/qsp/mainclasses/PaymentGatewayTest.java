package com.qsp.mainclasses;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qsp.IOCConfig;
import com.qsp.paymentsystem.PaymentGateway;

public class PaymentGatewayTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IOCConfig.class);
		PaymentGateway paymentOptions = context.getBean(PaymentGateway.class);

		paymentOptions.doPayment(10000, "upi");
		context.close();
	}
}
