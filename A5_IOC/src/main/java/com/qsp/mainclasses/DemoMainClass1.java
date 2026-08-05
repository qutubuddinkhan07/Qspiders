package com.qsp.mainclasses;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qsp.IOCConfig;
import com.qsp.beanclasses.DemoBeanClass1;
import com.qsp.beanclasses.DemoBeanClass2;

public class DemoMainClass1 {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IOCConfig.class);

		DemoBeanClass1 c1 = (DemoBeanClass1) context.getBean("bean1");
		DemoBeanClass2 c2 = context.getBean(DemoBeanClass2.class);

		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		context.close();
	}
}
