package com.practicalunittesting.chp11.mutation;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class TwoIfsTest {

	@Test
	public void testTwoIfs() {
		TwoIfs twoIfs = new TwoIfs();
		assertEquals(1, twoIfs.twoIfs(1, -1));
		assertEquals(3, twoIfs.twoIfs(-1, 1));
		assertEquals(4, twoIfs.twoIfs(-1, -1));
	}
}
