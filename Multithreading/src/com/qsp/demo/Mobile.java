package com.qsp.demo;

import java.io.Serializable;

public class Mobile implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String company;

	String model;
	transient Double price;
	String ram;
	String rom;

	public Mobile(String company, String model, Double price, String ram, String rom) {
		super();
		this.company = company;
		this.model = model;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
	}

	@Override
	public String toString() {
		return "Mobile [company=" + company + ", model=" + model + ", ram=" + ram + ", rom=" + rom + "]";
	}
}
// serializable - marker interface
