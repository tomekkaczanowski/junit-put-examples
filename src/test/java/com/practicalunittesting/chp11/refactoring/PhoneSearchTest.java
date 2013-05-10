package com.practicalunittesting.chp11.refactoring;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@RunWith(JUnitParamsRunner.class)
public class PhoneSearchTest {

	public Object[] data() {
		return $($("48", true), $("+48", true), $("++48", true), $("+48503", true),
				$("+4", false), $("++4", false), $("", false), $(null, false), $("  ", false)
		);
	}

	@Parameters(method = "data")
	@Test
	public void testPrefixVerification(String prefix, boolean expected) {
		PhoneSearch ps = new PhoneSearch(prefix);
		assertEquals(expected, ps.isValid());
	}
}
