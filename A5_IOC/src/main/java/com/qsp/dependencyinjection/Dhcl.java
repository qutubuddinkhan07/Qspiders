package com.qsp.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Dhcl {
	public void delivery() {
		System.out.println("prepaid available by " + getClass().getSimpleName());
	}
}
