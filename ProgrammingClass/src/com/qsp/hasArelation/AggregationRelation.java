package com.qsp.hasArelation;

class Author {
	String name;

	public Author(String name) {
		this.name = name;
	}
}

class Book {
	String title;
	Author author; // Book "has-a" Author(aggregation)

	Book(String title, Author author) {
		this.title = title;
		this.author = author;
	}
}

public class AggregationRelation {
	public static void main(String[] args) {
		Author author = new Author("Geoge Owel");
		Book book = new Book("1994", author);

		System.out.println(book.title + " by " + book.author.name);

		// Author still exists even if book is destroyed
		book = null;
		System.out.println(author.name + "still exists");
	}
}
