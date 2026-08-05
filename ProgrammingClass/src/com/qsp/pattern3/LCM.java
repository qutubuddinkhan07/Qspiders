package com.qsp.pattern3;

public class LCM {
	public static void main(String[] args) {
		System.out.println(lcm(3, 17)); // 51
		System.out.println(lcmcall(2, 17)); // 34
		System.out.println(lcmcall(4, 15)); // 60
		System.out.println(lcm(2, 17, 17, 17)); // 34
	}

	static int lcm(int x, int y) {
		int max = (x > y) ? x : y;
		int res = max;
		while (true) {
			if ((res % x == 0) && res % y == 0) {
				return res;
			}
			res = res + max;
		}
	}

	static int lcmcall(int x, int y) {
		return lcm(x, y, x > y ? x : y, x > y ? x : y);
	}

	static int lcm(int x, int y, int max, int res) {
		if ((res % x == 0) && (res % y == 0)) {
			return res;
		}
		return lcm(x, y, max, res + max);
	}
}
