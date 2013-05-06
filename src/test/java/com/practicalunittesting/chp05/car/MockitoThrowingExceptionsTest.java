package com.practicalunittesting.chp05.car;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MockitoThrowingExceptionsTest {

	private Car myFerrari = mock(Car.class);

	@Test(expected = RuntimeException.class)
	public void throwException() {
		when(myFerrari.needsFuel()).thenThrow(new RuntimeException());
		myFerrari.needsFuel();
	}
}
