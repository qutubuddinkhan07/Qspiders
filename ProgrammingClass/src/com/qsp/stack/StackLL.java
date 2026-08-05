package com.qsp.stack;

import com.qsp.linkedlist.Node;

public class StackLL {
	private Node head;
	private int size = 0;

	void push(int element) {
		head = new Node(element, head);
		size++;
	}

	int pop() {
		if (head == null) {
			throw new RuntimeException("Stack underflow");
		}
		int temp = head.val;
		head = head.next;
		size--;
		return temp;
	}

	int peek() {
		if (head == null) {
			throw new RuntimeException("Stack underflow");
		}
		return head.val;
	}

	boolean isEmpty() {
		return head == null;
	}

	int size() {
		return size;
	}

	@Override
	public String toString() {
		Node curr = head;
		String res = "";
		while (curr != null) {
			res = res + curr.val;
			curr = curr.next;
			res += " ";
		}
		return res;
	}
}
