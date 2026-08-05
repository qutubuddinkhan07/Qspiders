package com.qsp.pattern;

public class Pattern6 {
	public static void main(String[] args) {
		int n = 5;
		pattern1(n);
		System.out.println("==================");
		pattern2(n);
		System.out.println("==================");
		pattern3(n);
		System.out.println("==================");
		pattern4(n);
		System.out.println("==================");
		pattern5(n);
	}

	static void pattern1(int n) {
		int st = 1;
		int sp = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*");
			}
			sp--;
			st += 2;
			System.out.println();
		}
	}

	static void pattern2(int n) {
		int st = 1;
		int sp = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				if (k == 1 || k == st || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			sp--;
			st += 2;
			System.out.println();
		}
	}

	static void pattern3(int n) {
		int st = 1;
		int sp = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print(i);
			}
			st += 2;
			sp--;
			System.out.println();
		}
	}

	static void pattern4(int n) {
		int st = 1;
		int sp = n - 1;
		for (int i = 1; i <= n; i++) {
			int val = 1;
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print(val);
				if (k <= st / 2) {
					val++;
				} else {
					val--;
				}
			}
			sp--;
			st += 2;
			System.out.println();
		}
	}

	static void pattern5(int n) {
		int st = 1;
		int sp = n - 1;
		for (int i = 1; i <= n; i++) {
			int val = i;
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print(val);
				if (k <= st / 2) {
					val--;
				} else {
					val++;
				}
			}
			sp--;
			st += 2;
			System.out.println();
		}
	}
}
