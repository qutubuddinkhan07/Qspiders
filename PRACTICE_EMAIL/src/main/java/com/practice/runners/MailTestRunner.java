package com.practice.runners;

import org.springframework.boot.CommandLineRunner;

import com.practice.service.MailService;

import lombok.RequiredArgsConstructor;

//@Component
@RequiredArgsConstructor
public class MailTestRunner implements CommandLineRunner {
	private final MailService mailService;

	@Override
	public void run(String... args) throws Exception {
		mailService.sentEmail("qutubuddink267@gmail.com", "Nice to meet yeah Email testing", "Demo email testing");
	}

}
