package com.practicalunittesting.chp06.matchers;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Book {
	private final String title;
	private String language;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Book book = (Book) o;

		if (title != null ? !title.equals(book.title) : book.title != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		return title != null ? title.hashCode() : 0;
	}

	public String getLanguage() {
		return language;
	}
}
