package com.qsp.uniquebean;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselCar implements Car {
	@Override
	public void run() {
		System.out.println(getClass().getSimpleName() + " running");
	}
}
