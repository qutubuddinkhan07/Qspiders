package com.qsp.functionalInterfaceExample;

public class MainClass {
	public static void main(String[] args) {
		int n = 42961;
		int sum1 = 0;
		int sum2 = 0;
		while (n > 0) {
			int rem = n % 10;
			if (rem % 2 == 0) {
				sum1 += rem;
			} else {
				sum2 += rem;
			}
			n = n / 10;
		}

		System.out.println("sum1: " + sum1 + " - sum2:  " + sum2 + " = " + (sum1 - sum2));
	}
}
