package com.qsp.generics2;

public class X implements I1<String> {
	@Override
	public String m1() {
		return "jkjsdf";
	}

	@Override
	public void m2(String data) {
		System.out.println(data.getClass().getName());
	}
}
