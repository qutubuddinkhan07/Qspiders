package com.qsp.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AmazonField {
	@Autowired
	private Ekart ekart;

	public void order() {
		System.out.println("Order by " + getClass().getSimpleName());
		ekart.delivery();
	}
}
