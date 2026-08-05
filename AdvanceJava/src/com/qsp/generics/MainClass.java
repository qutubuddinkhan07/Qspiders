package com.qsp.generics;

public class MainClass {
	public static void main(String[] args) {
		I1 sum = (a, b) -> a + b;
		System.out.println(sum.task(111, 7)); // 118

		I1 mul = (a, b) -> a * b;
		System.out.println(mul.task(7, 7)); // 49
	}
}
