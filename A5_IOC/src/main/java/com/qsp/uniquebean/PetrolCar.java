package com.qsp.uniquebean;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolCar implements Car {
	@Override
	public void run() {
		System.out.println(getClass().getSimpleName() + " running");
	}
}
