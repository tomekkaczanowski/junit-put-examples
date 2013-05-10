package com.practicalunittesting.chp11.refactoring;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@RunWith(JUnitParamsRunner.class)
public class PhoneSearchBetterTest {

	public Object[] validPrefixes() {
		return $("48", "48123", "+48", "++48", "+48503");
	}

	@Parameters(method = "validPrefixes")
	@Test
	public void shouldRecognizeValidPrefixes(String validPrefix) {
		PhoneSearch ps = new PhoneSearch(validPrefix);
		assertTrue(ps.isValid());
	}

	public Object[][] invalidPrefixes() {
		return new Object[][]{{"+4"}, {"++4"},
				{""}, {null}, {"  "}};
	}

	@Parameters(method = "invalidPrefixes")
	@Test
	public void shouldRejectInvalidPrefixes(String invalidPrefix) {
		PhoneSearch ps = new PhoneSearch(invalidPrefix);
		assertFalse(ps.isValid());
	}
}
