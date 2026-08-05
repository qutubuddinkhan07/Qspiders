package com.qsp.mainclasses;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qsp.IOCConfig;
import com.qsp.uniquebean.Travel;

public class InterfaceDICheck {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IOCConfig.class);
		Travel t1 = context.getBean(Travel.class);
		Travel t2 = context.getBean(Travel.class);

		System.out.println(t1.hashCode()); // 1207608476
		System.out.println(t2.hashCode()); // 686989583
		context.close();
	}
}
