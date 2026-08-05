package com.qsp.methodrefer;

import java.util.List;

public class MainClass {
	public static void main(String[] args) {
		List<Integer> list = List.of(1, 2, 12, 2, 3, 6, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		List<Integer> l2 = list.stream().distinct().toList();
		System.out.println(l2); // [1, 2, 12, 3, 6, 4, 5, 7, 8, 9, 10, 11]
	}
}
