package com.qsp.linkedlist;

public class QueueLL {
	private Node head;
	private int size;

	public void add(int element) {
		if (head == null) {
			head = new Node(element);
			size++;
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(element);
		size++;
	}

	public void offer(int element) {
		add(element);
	}

	@Override
	public String toString() {
		String res = "";
		Node curr = head;
		while (curr != null) {
			res = res + curr.val + " ";
			curr = curr.next;
		}
		return res;
	}

	int remove() {
		if (head == null) {
			throw new RuntimeException("Queue underflow");
		}
		int temp = head.val;
		head = head.next;
		size--;
		return temp;
	}

	int poll() {
		return remove();
	}

	int peek() {
		if (head == null) {
			throw new RuntimeException("Empty queue");
		}
		return head.val;
	}

	int element() {
		return peek();
	}
}
