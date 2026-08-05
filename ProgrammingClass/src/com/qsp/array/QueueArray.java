package com.qsp.array;

public class QueueArray {
	private int a[] = new int[10];
	private int size = 0;

	public void add(int element) {
		if (size == a.length) {
			grow();
		}
		a[size] = element;
		size++;
	}

	public void offer(int element) {
		add(element);
	}

	public int remove() {
		if (size == 0) {
			throw new RuntimeException("Empty queue");
		}
		int temp = a[0];
		for (int i = 0; i < size - 1; i++) {
			a[i] = a[i + 1];
		}
		size--;
		return temp;
	}

	public int poll() {
		return remove();
	}

	public int peek() {
		if (size == 0) {
			throw new RuntimeException("Empty queue");
		}
		return a[0];
	}

	public int element() {
		return peek();
	}

	public boolean isEmpty() {
		return size == 0;
	}

	private void grow() {
		int temp[] = new int[a.length + 10];
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
}
