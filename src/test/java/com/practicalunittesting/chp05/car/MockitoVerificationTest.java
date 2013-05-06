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
public class MockitoVerificationTest {

	private Car myFerrari = mock(Car.class);

	@Test
	public void testVerification() {
		myFerrari.driveTo("Sweet home Alabama");
		myFerrari.needsFuel();

		verify(myFerrari).driveTo("Sweet home Alabama");
		verify(myFerrari).needsFuel();
	}
}
