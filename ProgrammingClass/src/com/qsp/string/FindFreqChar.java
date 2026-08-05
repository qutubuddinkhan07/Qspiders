package com.qsp.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindFreqChar {
	public static void main(String[] args) {
		// find frequency of a character
		String s = "hello";
//		frequency(s);
		freq2(s);
//		freq3("helloworld");
//		freq4("helloworld");
//		freq5(s);
	}

	static void frequency(String s) {
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.get(ch) == null) {
				map.put(ch, 1);
			} else {
				int temp = map.get(ch);
				map.put(ch, temp + 1);
			}
		}
		System.out.println(map); // {e=1, h=1, l=2, o=1}
	}

	static void freq2(String s) {
		int a[] = new int[26];
		for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i) - 'a';
			a[idx]++;
		}
		System.out.println(Arrays.toString(a));
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int idx = ch - 'a';
			if (a[idx] != 0) {
				System.out.println(ch + " " + a[idx]);
			}
		}
		/// <pre>
		/// [0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 2, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
		/// 0]
		/// e 1
		/// h 1
		/// l 2
		/// o 1
		/// </pre>
	}

	static void freq3(String s) {
		while (s.length() > 0) {
			int previous = s.length();
			char ch = s.charAt(0);
			s = s.replace(ch + "", "");
			int current = s.length();
			System.out.println(ch + " " + (previous - current));
			/// <pre>
			/// h 1
			/// e 1
			/// l 3
			/// o 2
			/// w 1
			/// r 1
			/// d 1
			/// </pre>
		}
	}

	static void freq4(String s) {
		char ch[] = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (ch[i] == '\u0000') {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < s.length(); j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\u0000';
				}
			}
			System.out.println(ch[i] + " " + count);
			ch[i] = '\u0000';
		}
		/// <pre>
		/// h 1
		/// e 1
		/// l 3
		/// o 2
		/// w 1
		/// r 1
		/// d 1
		/// </pre>
	}

	static void freq5(String s) {
		boolean[] b = new boolean[26];
		for (int i = 0; i < s.length(); i++) {
			int idx = s.charAt(i) - 'a';
			b[idx] = true;
		}
		System.out.println(Arrays.toString(b));
		for (char ch = 'a'; ch <= 'z'; ch++) {
			int idx = ch - 'a';
			if (b[idx] == false) {
				System.out.println(ch);
			}
		}
	}
}
