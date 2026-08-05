package com.qsp.pattern2;

public class LCM {
	public static void main(String[] args) {
		int m = 3;
		int n = 17;
		System.out.println(findlcm(m, n));
	}

	static int findlcm(int x, int y) {
		int max = (x > y) ? x : y;
		int res = max;
		while (true) {
			if ((res % x == 0) && (res % max == 0)) {
				return res;
			}
			res = res + max;
		}
	}
}
