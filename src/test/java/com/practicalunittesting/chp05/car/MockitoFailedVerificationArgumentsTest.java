package com.practicalunittesting.chp05.car;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MockitoFailedVerificationArgumentsTest {

	private Car myFerrari = mock(Car.class);

	@Test
	public void testVerificationFailureArguments() {
		myFerrari.driveTo("Sweet home Alabama");
		verify(myFerrari).driveTo("Sweet home Honolulu");
	}
}
