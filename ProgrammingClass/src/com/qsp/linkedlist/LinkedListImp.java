package com.qsp.linkedlist;

public class LinkedListImp {
	Node head = null;
	int size = 0;

	public void add(int val) {
		if (head == null) {
			head = new Node(val);
			size++;
			return;
		}
		Node curr = head;
		while (curr.next != null) {
			curr = curr.next;
		}
		curr.next = new Node(val);
		size++;
	}

	public void add(int index, int val) {
		if (index < 0 || index > size) {
			throw new RuntimeException("Invalid index");
		}
		if (index == 0) {
			Node temp = new Node(val, head);
			head = temp;
			return;
		}
		Node curr = head;
		for (int i = 1; i < index; i++) {
			curr = curr.next;
		}
		Node temp = new Node(val, curr.next);
		curr.next = temp;
		size++;
	}

	@Override
	public String toString() {
		String res = "";
		Node curr = head;
		while (curr != null) {
			res = res + curr.val;
			res = res + " ";
			curr = curr.next;
		}
		return res;
	}

	public int get(int index) {
		if (index < 0 || index > size) {
			throw new RuntimeException("Invalid index");
		}
		if (index == 0) {
			return head.val;
		}
		Node curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		return curr.val;
	}

	public int getFirst() {
		return get(0);
	}

	public int getLast() {
		return get(size - 1);
	}

	public void addFirst(int element) {
		Node temp = new Node(element, head);
		head = temp;
		size++;
	}

	public void addLast(int element) {
		this.add(element);
	}

	public int removeFirst() {
		if (head == null) {
			throw new RuntimeException("empty list");
		}
		int temp = head.val;
		head = head.next;
		size--;
		return temp;
	}

	public int remove() {
		return removeFirst();
	}

	public int remove(int index) {
		if (index < 0 || index > size) {
			throw new RuntimeException("Invalid index");
		}
		if (index == 0) {
			return removeFirst();
		}
		Node curr = head;
		for (int i = 1; i < index; i++) {
			curr = curr.next;
		}
		int temp = curr.next.val;
		curr.next = curr.next.next;
		size--;
		return temp;
	}

	public int removeLast() {
		return remove(size - 1);
	}

	public void set(int index, int element) {
		if (index < 0 || index > size) {
			throw new RuntimeException("Empty list");
		}
		if (index == 0) {
			head.val = element;
			return;
		}
		Node curr = head;
		for (int i = 0; i < index; i++) {
			curr = curr.next;
		}
		curr.val = element;
	}

	public void setFirst(int element) {
		set(0, element);
	}

	public void setLast(int element) {
		set(size - 1, element);
	}
}
