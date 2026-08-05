package com.qsp.pattern2;

public class Pattern1 {
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
		System.out.println("==================");
		pattern6(n);
		System.out.println("==================");
		pattern7(n);
	}

	static void pattern1(int n) {
		int sp = 0;
		int st = n * 2 - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print("*");
			}
			sp++;
			st -= 2;
			System.out.println();
		}
	}

	static void pattern2(int n) {
		int sp = 0;
		int st = n * 2 - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print(i);
			}
			sp++;
			st -= 2;
			System.out.println();
		}
	}

	static void pattern3(int n) {
		int sp = 0;
		int st = n * 2 - 1;
		for (int i = 1; i <= n; i++) {
			int val = n - i + 1;
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				System.out.print(val);
			}
			sp++;
			st -= 2;
			System.out.println();
		}
	}

	static void pattern4(int n) {
		int sp = 0;
		int st = n * 2 - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				if (k == 1 || i == 1 || k == st) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			sp++;
			st -= 2;
			System.out.println();
		}
	}

	static void pattern5(int n) {
		int sp = 0;
		int st = n * 2 - 1;
		for (int i = 1; i <= n; i++) {
			int val = n - i + 1;
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				if (k <= st / 2) {
					System.out.print(val);
					val--;
				} else {
					System.out.print(val);
					val++;
				}
			}
			sp++;
			st -= 2;
			System.out.println();

		}
	}

	static void pattern6(int n) {
		int sp = 0;
		int st = n * 2 - 1;
		for (int i = 1; i <= n; i++) {
			int val = 1;
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				if (k <= st / 2) {
					System.out.print(val);
					val++;
				} else {
					System.out.print(val);
					val--;
				}
			}
			sp++;
			st -= 2;
			System.out.println();
		}
	}

	static void pattern7(int n) {
		int sp = 0;
		int st = n * 2 - 1;
		for (int i = 1; i <= n; i++) {
			int val = n;
			for (int j = 1; j <= sp; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= st; k++) {
				if (k <= st / 2) {
					System.out.print(val);
					val--;
				} else {
					System.out.print(val);
					val++;
				}
			}
			sp++;
			st -= 2;
			System.out.println();
		}
	}
}
