package com.practicalunittesting.chp06.threadsafe;


import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class SystemIdGeneratorTest {

	private IdGenerator idGen = new SystemIdGenerator();

	// will usually fail
	@Test
	public void idsShouldBeUnique() {
		Long idA = idGen.nextId();
		Long idB = idGen.nextId();
		assertNotEquals("idA " + idA + " idB " + idB, idA, idB);
	}
}
