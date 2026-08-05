package com.qsp.array;

public class StackArray {
	private int a[] = new int[10];
	private int size = 0;

	public void push(int element) {
		if (size == a.length) {
			grow();
		}
		a[size] = element;
		size++;
	}

	private void grow() {
		int temp[] = new int[(a.length * 2) / 3];
		System.arraycopy(a, 0, temp, 0, a.length);
		a = temp;
	}

	@Override
	public String toString() {
		String res = "";
		for (int i = 0; i < size; i++) {
			res = res + a[i] + " ";
		}
		return res;
	}

	public int pop() {
		int temp = a[size - 1];
		size--;
		return temp;
	}

	public int peek() {
		int temp = a[size - 1];
		return temp;
	}

	public boolean isEmpty() {
		return size == 0;
	}
}
