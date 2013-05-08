package com.practicalunittesting.chp06.collections.fest;

import com.practicalunittesting.chp06.collections.Book;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.fest.assertions.Assertions.assertThat;
import static org.fest.assertions.MapAssert.entry;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class FestTest {

	private static Set<String> setA, setB;
	private final static String s1 = "s1";
	private final static String s2 = "s2";

	@Before
	private void setUp() {
		setA = new LinkedHashSet<String>();
		setB = new LinkedHashSet<String>();

		setA.add(s1);
		setA.add(s2);

		setB.add(s2);
		setB.add(s1);
	}

	@Test
	public void collectionsUtilityMethods() {
		assertThat(setA).isNotEmpty().hasSize(2).doesNotHaveDuplicates();
		assertThat(setA).containsOnly(s1, s2);
	}

	@Test
	public void mapUtilityMethods() {
		HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("a", 2);
		map.put("b", 3);
		assertThat(map).isNotNull().isNotEmpty()
				.includes(entry("a", 2), entry("b", 3))
				.excludes(entry("c", 1));
	}

	@Test
	public void lookingIntoProperties() {
		Collection<Book> books = new HashSet<Book>();
		books.add(new Book("Homer", "Odyssey"));
		books.add(new Book("J.R.R. Tolkien", "Hobbit"));
		assertThat(books).onProperty("title").contains("Hobbit");
		assertThat(books).onProperty("author").contains("J.R.R. Tolkien");
		assertThat(books).onProperty("author").contains("J.K. Rownling");
	}
}