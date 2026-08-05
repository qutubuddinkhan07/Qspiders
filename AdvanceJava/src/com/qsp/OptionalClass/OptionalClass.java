package com.qsp.OptionalClass;

import java.util.List;
import java.util.Optional;

public class OptionalClass {
	public static void main(String[] args) {
		List<Integer> l1 = List.of();
		Optional<Integer> op = l1.stream().distinct().sorted((i, j) -> j - i).findFirst();
		System.out.println(op.orElse(Integer.MAX_VALUE)); // 2147483647
		// System.out.println(op.orElseThrow()); // java.util.NoSuchElementException: No
		// value present
		System.out.println(op.orElseThrow(() -> new RuntimeException())); // java.lang.RuntimeException
	}
}
