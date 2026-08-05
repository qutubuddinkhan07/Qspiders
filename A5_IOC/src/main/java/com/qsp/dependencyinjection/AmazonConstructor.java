package com.qsp.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class AmazonConstructor {
	private Ekart ekart;
	private Dhcl dhcl;

	public AmazonConstructor(Ekart ekart, Dhcl dhcl) {
		this.ekart = ekart;
		this.dhcl = dhcl;
	}

	public void order() {
		System.out.println("Order by " + getClass().getSimpleName());
		ekart.delivery();
		System.out.println("OR");
		dhcl.delivery();
	}
}
