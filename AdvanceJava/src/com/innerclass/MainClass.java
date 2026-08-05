package com.innerclass;

public class MainClass {
	public static void main(String[] args) {
		Demo<Integer> d = new Demo<Integer>(20);
		d.setValue(123);
		System.out.println(d.getValue()); // 123

		Demo<String> d2 = new Demo<String>("Hello");
		System.out.println(d2.getValue()); // Hello
	}
}
