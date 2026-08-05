package com.qsp.string;

public class Panagrams {
	public static void main(String[] args) {
		String s = "the quick brown fox jumps over a lazy dog";
		System.out.println(isPanagram(s));
	}

	static boolean isPanagram(String s) {
		// Panagram - a sentence containing every letter of the alphabet.
		boolean[] b = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				continue;
			}
			int idx = s.charAt(i) - 'a';
			b[idx] = true;
		}

		// System.out.println(Arrays.toString(b));
		for (int ch = 'a'; ch <= 'z'; ch++) {
			int idx = ch - 'a';
			if (b[idx] == false) {
				return false;
			}
		}
		return true;
	}
}
