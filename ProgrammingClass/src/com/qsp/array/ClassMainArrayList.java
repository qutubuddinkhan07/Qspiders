package com.qsp.array;

public class ClassMainArrayList {
	public static void main(String[] args) {
		ArrayListImplement arr = new ArrayListImplement();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		System.out.println(arr); // 10 20 30 40 50

		arr.add(2, 77);
		System.out.println(arr); // 10 20 77 30 40 50

		System.out.println("removed: " + arr.remove());
		System.out.println(arr); // 20 77 30 40 50

		System.out.println("Removed: " + arr.remove(3));
		System.out.println(arr); // 20 77 30 50

		System.out.println("Get: " + arr.get(3)); // Get: 50
		System.out.println("Size: " + arr.size()); // 4

		System.out.println(arr.isEmpty()); // false

		arr.clear();
		System.out.println(arr); // 0 0 0 0
	}
}
