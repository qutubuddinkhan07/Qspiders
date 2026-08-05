package com.qsp.beanclasses;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("bean2")
@Lazy(true)
public class DemoBeanClass2 {
	public DemoBeanClass2() {
		System.out.println(getClass().getName() + " object created");
	}
}
