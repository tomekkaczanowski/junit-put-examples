package com.practicalunittesting.chp06.matchers;


import org.junit.Test;

import java.util.Collection;

import static com.practicalunittesting.chp06.matchers.BookAssert.assertThat;
import static org.fest.assertions.Assertions.assertThat;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class BookFestTest {

	private static final String TITLE = "My book";

	private Book book;
	private Collection<Book> scienceFictionBooks;
	private static final String ENGLISH = "english";

	@Test
	public void constructorShouldSetTitle() {
		book = new Book(TITLE);
		assertThat(book.getTitle()).isNotNull();
		assertThat(book.getTitle()).isNotEmpty();
		assertThat(book.getTitle()).isEqualTo(TITLE);
	}

	@Test
	public void constructorShouldSetTitleUsingCustomAssert() {
		book = new Book(TITLE);
		assertThat(book).hasTitle(TITLE);
	}

	@Test
	public void combinedMatchersExample() {
		book = new Book(TITLE);
		assertThat(book)
				.hasTitle(TITLE)
				.isNotIn(scienceFictionBooks)
				.isWrittenIn(ENGLISH);
	}

	@Test
	public void booksWithSameTitlesShouldBeEqual() {
		book = new Book(TITLE);
		Book otherBook = new Book(TITLE);
		assertThat(book).isEqualTo(otherBook);
	}
}
