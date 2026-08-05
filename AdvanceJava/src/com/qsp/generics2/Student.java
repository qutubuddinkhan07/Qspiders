package com.qsp.generics2;

public class Student implements Comparable<Student> {
	Integer id;
	String name;
	Integer marks;

	public Student(Integer id, String name, Integer marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student obj) {
		return this.marks - obj.marks;
	}
	/**
	 * +ve --> this > obj 0 --> this = obj -ve --> this < obj
	 */
}
