package com.practicalunittesting.chp05.car;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.mock;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MockitoDefaultValuesTest {

	private Car myFerrari = mock(Car.class);

	@Test
	public void testDefaultBehaviourOfTestDouble() {
		assertFalse("new test double should return false as boolean",
				myFerrari.needsFuel());
		assertEquals("new test double should return 0.0 as double",
				0.0, myFerrari.getEngineTemperature());
	}
}
