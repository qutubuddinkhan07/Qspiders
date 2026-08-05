package com.practice.service;

public interface MailService {
	public boolean sentEmail(String receiverId, String message, String subject);
}
