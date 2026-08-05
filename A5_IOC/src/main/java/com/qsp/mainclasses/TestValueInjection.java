package com.qsp.mainclasses;

import java.util.Random;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.qsp.IOCConfig;
import com.qsp.valueinjection.Demo;
import com.qsp.valueinjection.Hello;
import com.qsp.valueinjection.Test;

public class TestValueInjection {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IOCConfig.class);
		Demo demo = context.getBean(Demo.class);
		System.out.println(demo);
		/*-
		com.qsp.beanclasses.DemoBeanClass1 object created
		com.qsp.beanclasses.DemoBeanClass2 object created
		java.util.Random object created
		Demo(i=10)
		 */

		Test test = context.getBean(Test.class);
		System.out.println(test);
		// Test(j=20)

		Hello hello = context.getBean(Hello.class);
		System.out.println(hello);
		// Hello(k=30, l=40)

		context.getBean(Random.class);
		// java.util.Random object created

		context.close();
	}
}