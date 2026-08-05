package com.qsp.programming;

public class Pattern4 {
	public static void main(String[] args) {
		int n = 5;
		pattern1(n);
		System.out.println("============\n");
		pattern2(n);
		System.out.println("============\n");
		pattern3(n);
		System.out.println("============\n");
		pattern4(n);
		System.out.println("============\n");
		pattern5(n);
		System.out.println("============\n");
		pattern6(n);
		System.out.println("============\n");
		pattern7(n);
		System.out.println("============\n");
		pattern8(n);
		System.out.println("============\n");
		pattern9(n);
		System.out.println("============\n");
		pattern10(n);
	}

	static void pattern1(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j >= n + 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void pattern2(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i + j >= n + 1) {
					System.out.print(i);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void pattern3(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				if (i + j <= n + 1) {
					System.out.print(j);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void pattern4(int n) {
		int k = 1;
		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= 1; j--) {
				if (i + j >= n + 1) {
					System.out.print("  ");
				} else {
					System.out.print(k++ + " ");
				}
			}
			System.out.println();
		}
	}

	static void pattern5(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
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
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (k == 1 || k == i || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void pattern7(int n) {
		int l = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				if (k == 1 || k == i || i == n) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void pattern8(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k >= 1; k--) {
				if (k <= i) {
					System.out.print(k);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void pattern9(int n) {
		int l = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("\t");
			}
			for (int k = i; k >= 1; k--) {
				if (k <= i) {
					System.out.print(l++ + "\t");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	static void pattern10(int n) {
		int l = (n * (n + 1)) / 2;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print("\t");
			}
			for (int k = i; k >= 1; k--) {
				if (k <= i) {
					System.out.print(l++ + "\t");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
