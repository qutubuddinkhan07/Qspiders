package com.qsp.array;

public class StackArrayClassMain {
	public static void main(String[] args) {
		StackArray stack = new StackArray();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		System.out.println(stack); // 10 20 30 40

		System.out.println("Popped ele: " + stack.pop()); // Popped ele: 40
		System.out.println("After popping: " + stack); // After popping: 10 20 30

		System.out.println("Now stack peek: " + stack.peek()); // Now stack peek: 30
		System.out.println("Is stack empty? " + stack.isEmpty()); // Is stack empty? false
	}
}
