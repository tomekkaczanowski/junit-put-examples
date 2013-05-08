package com.practicalunittesting.chp06.expectedexceptions;

import org.junit.Test;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class ExpectedExceptionMessageBDDTest {

	Phone phone = new Phone();

	@Test
	public void shouldThrowIAEForEmptyNumber() {
		catchException(phone).setNumber(null);

		assertTrue(caughtException() instanceof IllegalArgumentException);
		assertEquals("number can not be null or empty",
				caughtException().getMessage());
	}

	@Test
	public void shouldThrowIAEForPlusPrefixedNumber() {
		catchException(phone).setNumber("+123");

		assertTrue(caughtException() instanceof IllegalArgumentException);
		assertEquals("plus sign prefix not allowed, " +
				"number: [+123]", caughtException().getMessage());
	}
}
