package com.practicalunittesting.chp05.car;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class FirstMockitoTest {

	private Car myFerrari = mock(Car.class);

	@Test
	public void testIfCarIsACar() {
		assertTrue(myFerrari instanceof Car);
	}
}
