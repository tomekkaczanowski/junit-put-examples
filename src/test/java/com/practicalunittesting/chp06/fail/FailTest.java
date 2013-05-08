package com.practicalunittesting.chp06.fail;

import org.junit.Test;

import static org.junit.Assert.fail;
import static org.junit.Assume.assumeTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class FailTest {

	@Test
	public void shouldFail() {
		fail("epic failure...");
	}
}
