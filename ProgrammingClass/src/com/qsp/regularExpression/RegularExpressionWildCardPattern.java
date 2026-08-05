package com.qsp.regularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionWildCardPattern {
	public static void main(String[] args) {
		String pattern = "[a-z][0-9]";
		String matcher = "ab2cd.e4fg.h@a9A";
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(matcher);
		int count = 0;
		while (m.find()) {
			System.out.println(m.group());
			count++;
		}
		System.out.println(count);
		/// <pre>
		/// b2
		/// e4
		/// a9
		/// 3
		/// </pre>
	}
}
