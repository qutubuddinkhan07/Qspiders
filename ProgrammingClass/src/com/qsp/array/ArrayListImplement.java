package com.qsp.array;

public class ArrayListImplement {
	private int[] a = new int[10];
	int size = 0;

	private void grow() {
		int b[] = new int[(a.length * 3) / 2];
		System.arraycopy(a, 0, b, 0, a.length);
		a = b;
	}

	public void add(int element) {
		if (size == a.length) {
			grow();
		}
		a[size] = element;
		size++;
	}

	public void add(int index, int element) {
		if (index < 0 || index > size) {
			throw new RuntimeException("Invalid index");
		}
		if (size == a.length) {
			grow();
		}
		int i = size;
		while (i >= index) {
			a[i + 1] = a[i];
			i--;
		}
		a[i + 1] = element;
		size++;
	}

	public int remove() {
		if (size == 0) {
			throw new RuntimeException("Empty arraylist");
		}
		int deleted = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			a[i] = a[i + 1];
		}
		size--;
		return deleted;
	}

	public int remove(int index) {
		if (index < 0 || index >= size) {
			throw new RuntimeException("invalid index");
		}
		if (index == size - 1) {
			size--;
			return a[size];
		}
		int temp = a[index];
		for (int i = index; i < size - 1; i++) {
			a[i] = a[i + 1];
		}
		size--;
		return temp;
	}

	public int get(int index) {
		if (index < 0 || index >= size) {
			throw new RuntimeException("Invalid index");
		}
		return a[index];
	}

	public int set(int index, int newValue) {
		if (index < 0 || index >= size) {
			throw new RuntimeException("invalid index");
		}
		int temp = a[index];
		a[index] = newValue;
		return temp;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void clear() {
		a = new int[10];
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < size; i++) {
			sb.append(a[i] + "");
			sb.append(" ");
		}
		return sb.toString();
	}
}
