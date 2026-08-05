package com.qsp.starter;

public class MainClass {
	public static void main(String[] args) {
		Test3 t2 = Test3.builder().id(20).name("Hinata").interestRate(3.4).build();
		System.out.println(t2); // Test3(id=20, name=Hinata, interestRate=3.4)

		// if not giving any value then it will assign default values
		// method chaining
		Test3 t3 = Test3.builder().id(20).interestRate(3.4).build();
		System.out.println(t3); // Test3(id=20, name=null, interestRate=3.4)
	}
}
