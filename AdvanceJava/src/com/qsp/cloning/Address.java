package com.qsp.cloning;

public class Address implements Cloneable {
	int pincode;
	String location;

	public Address(int pincode, String location) {
		this.pincode = pincode;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", location=" + location + "]";
	}

	@Override
	public Address clone() throws CloneNotSupportedException {
		return (Address) super.clone();
	}
}
