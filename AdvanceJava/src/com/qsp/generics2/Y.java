package com.qsp.generics2;

public class Y implements I2<Integer, String> {
	@Override
	public String m3(Integer val) {
		return "Square of " + val + " = " + (val * val);
	}
}
