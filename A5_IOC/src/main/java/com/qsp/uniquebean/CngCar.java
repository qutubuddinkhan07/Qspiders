package com.qsp.uniquebean;

import org.springframework.stereotype.Component;

@Component("cng")
public class CngCar implements Car {
	@Override
	public void run() {
		System.out.println(getClass().getSimpleName() + " running");
	}
}
