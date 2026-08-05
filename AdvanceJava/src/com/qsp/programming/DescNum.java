package com.qsp.programming;

public class DescNum {
	public static void main(String[] args) {
		print(15);
		System.out.println();
		print2(15);
	}

	static void print(int n) {
		if (n == 0) {
			return;
		}
		System.out.print(n + " ");
		print(n - 1);
	}

	static void print2(int n) {
		if (n == 0) {
			return;
		}
		print2(n - 1);
		System.out.print(n + " ");
	}
}
//15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 