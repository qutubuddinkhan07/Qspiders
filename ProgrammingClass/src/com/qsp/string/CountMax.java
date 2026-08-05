package com.qsp.string;

public class CountMax {
	public static void main(String[] args) {
		String s = "maximum count";
		maxCount(s);
	}

	static void maxCount(String s) {
		int[] freq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == ' ') {
				continue;
			}
			int idx = c - 'a';
			freq[idx]++;
		}

		int max = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > freq[max]) {
				max = i;
			}
		}
		System.out.println((char) (max + 'a'));
	}
}
