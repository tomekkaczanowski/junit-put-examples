package com.practicalunittesting.chp11.mutation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class DivideTest {

	@Test
	public void testDivide() {
		Divide divide = new Divide();
		assertEquals(2, divide.divideMethod(4, 2));
	}
}
