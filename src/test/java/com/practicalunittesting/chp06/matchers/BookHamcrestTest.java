package com.practicalunittesting.chp06.matchers;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class BookHamcrestTest {

	private static final String TITLE = "My book";

	private Book book;

	@Test
	public void constructorShouldSetTitle() {
		book = new Book(TITLE);
		assertThat(book.getTitle(), notNullValue());
		// empty?
		assertThat(book.getTitle(), equalTo(TITLE));
	}

	@Test
	public void constructorShouldSetTitle_hasProperty() {
		book = new Book(TITLE);
		assertThat(book, hasProperty("title", equalTo(TITLE)));
	}


	@Test
	public void booksWithSameTitlesShouldBeEqual() {
		book = new Book(TITLE);
		Book otherBook = new Book(TITLE);
		assertThat(book, equalTo(otherBook));
	}
}
