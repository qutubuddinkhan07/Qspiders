package com.qsp.string;

import java.util.ArrayList;
import java.util.List;

public class SubSequence {
	public static void main(String[] args) {
		printAllSubsequence("bbbab");
//		printAllSubsequenceBitwise("abc");
		// sequence("abc", 0, "@"); // recursive approach
	}

	// iterative approach
	private static void printAllSubsequence(String s) {
		List<String> result = new ArrayList<>();

		// start with an empty subsequence
		result.add("");

		// process each character of the string one by one
		for (int i = 0; i < s.length(); i++) {
			char currChar = s.charAt(i);
			int currSize = result.size();

			// take all the existing subsequence and create new ones by adding current char
			for (int j = 0; j < currSize; j++) {
				String existingSub = result.get(j);
				result.add(existingSub + currChar);
			}

		}
		// print all the generated subsequences
		for (String subStr : result) {
			System.out.println("\"" + subStr + "\"");
		}
		/*-
		""
		"a"
		"b"
		"ab"
		"c"
		"ac"
		"bc"
		"abc"
		 */
	}

	// bitwise approach
	private static void printAllSubsequenceBitwise(String s) {
		int n = s.length();
		int totalSubsequences = 1 << n; // 2^n

		for (int i = 0; i < totalSubsequences; i++) {
			StringBuilder currentSub = new StringBuilder();
			for (int j = 0; j < n; j++) {
				// Check if the j-th bit in 'i' is set
				if (((i >> j) & 1) == 1) {
					currentSub.append(s.charAt(j));
				}
			}
			System.out.println("\"" + currentSub.toString() + "\"");
		}
		/*-
		""
		"a"
		"b"
		"ab"
		"c"
		"ac"
		"bc"
		"abc"
		""
		"a"
		"b"
		"ab"
		"c"
		"ac"
		"bc"
		"abc"
		 */
	}

	// recursive approach
	static void sequence(String s, int index, String op) {
		if (index == s.length()) {
			System.out.println(op);
			return;
		}
		sequence(s, index + 1, op + s.charAt(index));
		sequence(s, index + 1, op);
		/// <pre>
		/// ("abc", 0, "")
		/// abc
		/// ab
		/// ac
		/// a
		/// bc
		/// b
		/// c
		/// ====================
		/// ("abc", 0, "@")
		/// @abc
		/// @ab
		/// @ac
		/// @a
		/// @bc
		/// @b
		/// @c
		/// @
		/// </pre>
	}
}
