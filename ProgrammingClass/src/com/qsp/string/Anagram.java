package com.qsp.string;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		// System.out.println(isAnagram("abacdbf", "aacbdbf")); //true
		System.out.println(isAnagram2("abacdbf", "aacbdbf")); // true
	}

	static boolean isAnagram(String s1, String s2) {
		/// ("abacdbf", "aacbdbf")
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] a = new int[26];
		int[] b = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			a[s1.charAt(i) - 'a']++;
			b[s2.charAt(i) - 'a']++;
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));

		for (int i = 0; i < 26; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
		/// <pre>
		/// [2, 2, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		/// 0]
		/// [2, 2, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		/// 0]
		/// true

		/// </pre>
	}

	static boolean isAnagram2(String s1, String s2) {
		/// ("abacdbf", "aacbdbf")
		if (s1.length() != s2.length()) {
			return false;
		}
		int[] a = new int[26];
		for (int i = 0; i < s1.length(); i++) {
			a[s1.charAt(i) - 'a']++;
			a[s2.charAt(i) - 'a']--;
		}
		System.out.println(Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				return false;
			}
		}
		return true;
		/// [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		/// 0]
		/// true
	}
}
