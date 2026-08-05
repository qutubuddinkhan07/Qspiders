package com.practice.eventlisteners;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.practice.event.SimpleMessageEvent;
import com.practice.service.MailService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class EmailEventListener {
	private final MailService emailService;

	@EventListener
	@Async
	public void handleSimpleEmailEvent(SimpleMessageEvent event) {
		System.out.println(Thread.currentThread());

		emailService.sentEmail(event.getReceiverEmail(), event.getMessage(), event.getSubject());
	}
}
