package com.qsp.cloning;

public class Student implements Cloneable {
	int id;
	String name;
	Address add;

	public Student(int id, String name, Address add) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", add=" + add + "]";
	}

	@Override
	public Student clone() throws CloneNotSupportedException {
		Address tempAdd = this.add.clone();
		Student temp = new Student(this.id, this.name, tempAdd);
		return temp;
	}
}
