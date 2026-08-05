package com.qsp.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Product implements Comparable<Product> {
	int id;
	String name;

	public Product(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Product other) {
		// TODO Auto-generated method stub
		return this.id - other.id;
	}

	@Override
	public String toString() {
		return id + ":" + name;
	}

	public static void main(String[] args) {
		List<Product> store = new ArrayList<>();
		store.add(new Product(3, "cat"));
		store.add(new Product(2, "Ball"));
		store.add(new Product(1, "Apple"));
		Collections.sort(store);

		System.out.println(store);
	}

}
