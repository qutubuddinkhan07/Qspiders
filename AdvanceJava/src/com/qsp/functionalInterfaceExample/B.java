package com.qsp.functionalInterfaceExample;

public class B extends A {
	static void m1() { // hiding parent class method
		System.out.println("hi");
	}

	@Override
	void m2() {
		System.out.println("Good evening");
	}
}
