package com.practicalunittesting.chp07.privatemethods;

import org.junit.Test;
import org.powermock.reflect.Whitebox;

import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class PrivateMethodPowermockTest {

	@Test
	public void testingPrivateMethodWithReflection()
			throws Exception {
		SomeClass sut = new SomeClass();

		Boolean result = Whitebox
				.invokeMethod(sut, "privateMethod", 302483L);

		assertTrue(result);
	}
}
