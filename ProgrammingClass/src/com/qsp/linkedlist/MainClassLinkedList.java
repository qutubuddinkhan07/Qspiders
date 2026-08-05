package com.qsp.linkedlist;

public class MainClassLinkedList {
	public static void main(String[] args) {
		LinkedListImp l1 = new LinkedListImp();
		l1.add(20);
		l1.add(30);
		l1.add(50);
		l1.add(1, 7);
		l1.add(66);
		System.out.println(l1.toString()); // 20 7 30 50 66
		l1.addFirst(777);
		System.out.println(l1.toString()); // 20 7 30 50 66
		l1.addLast(999);
		System.out.println(l1.toString()); // 20 7 30 50 66
		System.out.println(l1.removeFirst());
		System.out.println(l1.remove(3));
		System.out.println(l1);
		System.out.println(l1.removeLast());
		System.out.println(l1);
		l1.set(1, 111);
		System.out.println(l1);
		l1.setFirst(121);
		l1.setLast(9999);
		System.out.println(l1); // 121 111 30 9999
	}
}
