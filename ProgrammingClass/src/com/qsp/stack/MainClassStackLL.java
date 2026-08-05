package com.qsp.stack;

public class MainClassStackLL {
	public static void main(String[] args) {
		StackLL s = new StackLL();
		s.push(23);
		s.push(11);
		s.push(7);

		System.out.println("Original stack: " + s); // Original stack: 7 11 23
		System.out.println("Stack size is " + s.size()); // Stack size is 3

		System.out.println("Popped element: " + s.pop()); // Popped element: 7
		System.out.println("After popping: " + s); // After popping: 11 23
		System.out.println("After popping stack size is " + s.size()); // After popping stack size is 2

		System.out.println("Peak element: " + s.peek()); // Peak element: 11
		System.out.println("Is stack empty: " + s.isEmpty()); // false
	}
}
