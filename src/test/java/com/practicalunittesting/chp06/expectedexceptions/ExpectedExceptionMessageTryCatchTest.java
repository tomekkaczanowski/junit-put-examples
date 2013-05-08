package com.practicalunittesting.chp06.expectedexceptions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class ExpectedExceptionMessageTryCatchTest {

	Phone phone = new Phone();

	@Test
	public void shouldThrowIAEForEmptyNumber() {
		try {
			phone.setNumber(null);
			fail("Should have thrown IllegalArgumentException");
		} catch (IllegalArgumentException iae) {
			assertEquals("number can not be null or empty", iae.getMessage());
		}
	}

	@Test
	public void shouldThrowIAEForPlusPrefixedNumber() {
		try {
			phone.setNumber("+123");
			fail("Should have thrown IllegalArgumentException");
		} catch (IllegalArgumentException iae) {
			assertEquals("plus sign prefix not allowed, " +
					"number: [+123]", iae.getMessage());
		}
	}
}