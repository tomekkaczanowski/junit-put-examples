package com.practicalunittesting.chp06.expectedexceptions;

import junitparams.JUnitParamsRunner;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@RunWith(JUnitParamsRunner.class)
public class ExpectedExceptionMessageRuleTest {

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	Phone phone = new Phone();

	@Test
	public void shouldThrowIAEForEmptyNumber() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("number can not be null or empty");
		phone.setNumber(null);
	}

	@Test
	public void shouldThrowIAEForPlusPrefixedNumber() {
		thrown.expect(IllegalArgumentException.class);
		thrown.expectMessage("plus sign prefix not allowed, number: [+123]");
		phone.setNumber("+123");
	}
}
