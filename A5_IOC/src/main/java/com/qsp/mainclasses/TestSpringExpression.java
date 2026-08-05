package com.qsp.mainclasses;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qsp.IOCConfig;
import com.qsp.valueinjection.AppInformation;

public class TestSpringExpression {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IOCConfig.class);
		AppInformation info = context.getBean(AppInformation.class);
		System.out.println(info); // AppInformation(appName=IOC, appVersion=1.5, appteam=A5_SPRING)
		context.close();
	}
	/*-
	 AppInformation created successfully
	 AppInformation(appName=IOC, appVersion=1.5, appteam=A5_SPRING)
	 AppInformation resource deallocated
	 */
}
