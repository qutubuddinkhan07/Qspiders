package com.qsp.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AmazonSetter {
	private Dhcl dhcl;

	@Autowired
	public void setDhcl(Dhcl dhcl) {
		this.dhcl = dhcl;
	}

	public void order() {
		System.out.println("Order by " + getClass().getSimpleName());
		dhcl.delivery();
	}
}
