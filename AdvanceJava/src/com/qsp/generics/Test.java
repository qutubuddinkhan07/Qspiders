package com.qsp.generics;

public class Test<T, V> {
	private T value1;
	private V value2;

	public Test(T value1, V value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	@Override
	public String toString() {
		return "value1 = " + value1.toString() + " value2 = " + value2.toString();
	}
}
