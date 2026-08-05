package com.innerclass;

public class Demo<T> {
	private T value;

	public Demo(T value) {
		this.value = value;
	}

	public void setValue(T value) {
		this.value = value;
	}

	public T getValue() {
		return this.value;
	}
}
