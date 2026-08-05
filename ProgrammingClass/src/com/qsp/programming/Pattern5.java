package com.qsp.programming;

public class Pattern5 {
	public static void main(String[] args) {
		int n = 5;
		pattern1(n);
		System.out.println("============");
		pattern2(n);
		System.out.println("============");
		pattern3(n);
		System.out.println("============");
		pattern4(n);
		System.out.println("============");
		pattern5(n);
		System.out.println("============");
		pattern6(n);
		System.out.println("============");
		pattern7(n);
		System.out.println("============");
		pattern8(n);
	}

	static void pattern1(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {
		for (int i = n; i >= 1; i--) {
			int l = n;
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(l--);
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
	}

	static void pattern6(int n) {
		int l = 1;
		for (int i = n; i >= 1; i--) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print("\t");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(l++ + "\t");
			}
			System.out.println();
		}
	}

	static void pattern7(int n) {
		int l = (n * (n + 1)) / 2;
		for (int i = n; i >= 1; i--) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print("\t");
			}
			for (int k = i; k >= 1; k--) {
				System.out.print(l-- + "\t");
			}
			System.out.println();
		}
	}

	static void pattern8(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = n - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				if (k == 1 || i == n || k == i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
