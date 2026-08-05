package com.qsp.pattern3;

public class Pattern1 {
	public static void main(String[] args) {
		int n = 9;
		diamond1(n);
		System.out.println("==============");
		diamond2(n);
	}

	static void diamond1(int n) {
		if (n % 2 == 0) {
			n = n + 1;
		}
		int sp = n / 2;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (i <= n / 2) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}
		}
	}

	static void diamond2(int n) {
		int sp = n / 2;
		int st = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				if (k == 1 || k == st) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
			if (i <= n / 2) {
				sp--;
				st += 2;
			} else {
				sp++;
				st -= 2;
			}
		}
	}
}
