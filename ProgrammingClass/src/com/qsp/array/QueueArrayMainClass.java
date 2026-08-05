package com.qsp.array;

public class QueueArrayMainClass {
	public static void main(String[] args) {
		QueueArray qr = new QueueArray();
		qr.add(12);
		qr.add(14);
		qr.offer(54);
		qr.offer(77);
		System.out.println(qr); // 12 14 54 77

		qr.remove();
		System.out.println(qr); // 14 54 77

		qr.poll();
		System.out.println(qr); // 54 77

		System.out.println(qr.peek()); // 54
		System.out.println(qr.element()); // 54

		System.out.println(qr.isEmpty()); // false
	}
}
