package com.qsp.beanclasses;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bean1")
@Lazy(true) // by default it's false
public class DemoBeanClass1 {
	public DemoBeanClass1() {
		System.out.println(getClass().getName() + " object created");
	}
}
