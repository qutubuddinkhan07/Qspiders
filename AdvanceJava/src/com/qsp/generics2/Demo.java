package com.qsp.generics2;

public class Demo {
	void m1() {
		System.out.println(this);
	}

	void m2(Demo d2) {
		System.out.println(d2);
		System.out.println(this);
	}
}
