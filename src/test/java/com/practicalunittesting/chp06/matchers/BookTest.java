package com.practicalunittesting.chp06.matchers;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class BookTest {

	private static final String TITLE = "My book";

	@Test
	public void testConstructor() {
		Book book = new Book(TITLE);
		assertNotNull(book.getTitle());
		assertTrue(book.getTitle() != "");
		assertEquals(TITLE, book.getTitle());
	}

	@Test
	public void booksWithSameTitlesShouldBeEqual() {
		Book book = new Book(TITLE);
		Book otherBook = new Book(TITLE);
		assertEquals(book, otherBook);
	}
}
