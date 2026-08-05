package com.qsp.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Ekart {
	public void delivery() {
		System.out.println("COD available by " + getClass().getSimpleName());
	}
}
