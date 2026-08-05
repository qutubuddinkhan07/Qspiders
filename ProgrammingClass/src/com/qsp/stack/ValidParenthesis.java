package com.qsp.stack;

import java.util.Stack;

public class ValidParenthesis {
	public static void main(String[] args) {
//		String s1 = "(){}[]";
		String s2 = "(])";
//		System.out.println(validParen(s1)); // true
		System.out.println(validParen(s2)); // false
	}

	static boolean validParen(String s) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(s.charAt(i));
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				char top = stack.peek();
				if ((top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']')) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}
}
