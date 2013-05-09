package com.practicalunittesting.chp08.asserts;

import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class AssertTest {

	@Test
	public void usingAssertTrue() {
		assertTrue(2 * 2 == 5);
	}

	@Test
	public void usingAssertEquals() {
		assertEquals(5, 2 * 2);
	}

	@Test
	public void usingAssertThat() {
		assertThat(2 * 2, equalTo(5));
	}
}
