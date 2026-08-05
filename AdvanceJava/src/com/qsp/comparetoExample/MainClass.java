package com.qsp.comparetoExample;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MainClass {
	public static void main(String[] args) {
		Consumer<Integer> c1 = i1 -> System.out.println("Square of " + i1 + " = " + (i1 * i1));
		;
		BiConsumer<Integer, String> c2 = (i1, i2) -> System.out.println(i1.getClass() + "\n" + i2.getClass());
		c1.accept(5); // Square of 5 = 25
		c2.accept(23, "Max");
		// ----output----
		// class java.lang.Integer
		// class java.lang.String
	}
}
