package com.qsp.mainclasses;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qsp.IOCConfig;
import com.qsp.dependencyinjection.AmazonConstructor;

public class TestDependencyInjection {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IOCConfig.class);
		AmazonConstructor amazon = context.getBean(AmazonConstructor.class);
		amazon.order();
		context.close();
	}
	/*-
	Order by AmazonConstructor
	COD available by Ekart
	OR
	prepaid available by Dhcl
	 */
}
