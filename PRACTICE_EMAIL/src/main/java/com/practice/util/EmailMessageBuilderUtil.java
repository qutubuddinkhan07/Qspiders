package com.practice.util;

import org.springframework.stereotype.Component;

@Component
public class EmailMessageBuilderUtil {
	public String otpMessageBuilder(String name, String otp) {
		StringBuilder message = new StringBuilder();
		message.append("Dear " + name + ",\n");
		message.append("Thank you for your interest in Pinda DELIVERY service.\n");
		message.append("For you new account registration the 6 digit OTP is here: " + otp);
		message.append("\nNote: OTP valid only for 5 minute");
		return message.toString();
	}

	public String userRegisteredMessageBuilder(String name) {
		StringBuilder message = new StringBuilder();
		message.append("Dear " + name + ",\n");
		message.append("Thank you for your interest in Pinda DELIVERY service.\n");
		message.append("Now you are a registered user.\n");
		message.append("Note: This is a system generated mail DO NOT REPLY");
		return message.toString();
	}
}
