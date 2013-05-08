package com.practicalunittesting.chp06.matchers;

import org.fest.assertions.Assertions;
import org.fest.assertions.GenericAssert;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class BookAssert extends GenericAssert<BookAssert, Book> {

	public BookAssert(Book actual) {
		super(BookAssert.class, actual);
	}

	public static BookAssert assertThat(Book actual) {
		return new BookAssert(actual);
	}

	public BookAssert hasTitle(String title) {
		isNotNull();
		String errorMessage = String.format(
				"Expected book's title to be <%s> but was <%s>",
				title, actual.getTitle());
		Assertions.assertThat(actual.getTitle())
				.overridingErrorMessage(errorMessage).isEqualTo(title);
		return this;
	}

	public BookAssert isWrittenIn(String language) {
		isNotNull();
		String errorMessage = String.format(
				"Expected that book was written in <%s> but was <%s>",
				language, actual.getLanguage());
		Assertions.assertThat(actual.getLanguage())
				.overridingErrorMessage(errorMessage).isEqualTo(language);
		return this;
	}
}
