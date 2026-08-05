package com.qsp.uniquebean;

import org.springframework.stereotype.Component;

@Component("ev")
public class EvCar implements Car {
	@Override
	public void run() {
		System.out.println(getClass().getSimpleName() + " running");
	}
}
