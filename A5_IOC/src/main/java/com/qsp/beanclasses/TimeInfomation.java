package com.qsp.beanclasses;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public class TimeInfomation {
	public void dateAndTimeInformation() throws InterruptedException {
		LocalDateTime dateTime = getDateTimeObject();
		System.out.println(dateTime);
		Thread.sleep(15000);

		dateTime = getDateTimeObject();
		System.out.println(dateTime);
	}

	@Lookup // proxy method injection
	public LocalDateTime getDateTimeObject() {
		return null;
	}
}
