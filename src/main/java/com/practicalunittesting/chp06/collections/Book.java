package com.practicalunittesting.chp06.collections;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Book {

	private final String author;
	private final String title;

	public Book(String author, String title) {
		this.author = author;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}
}
