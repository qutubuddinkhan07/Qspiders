package com.qsp.mainclasses;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qsp.IOCConfig;
import com.qsp.beanclasses.TimeInfomation;

public class TestScope {
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IOCConfig.class);

		TimeInfomation info = context.getBean(TimeInfomation.class);
		info.dateAndTimeInformation();
		context.close();

		/*-
		 2026-02-27T13:45:24.817920100
		 2026-02-27T13:45:39.823887500
		 */
	}
}
