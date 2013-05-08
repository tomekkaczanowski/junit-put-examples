package com.practicalunittesting.chp06.threadsafe;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class JVMUniqueIdGeneratorTest {

	private IdGenerator idGen = new JVMUniqueIdGenerator();

	// will pass
	@Test
	public void idsShouldBeUnique() {
		Long idA = idGen.nextId();
		Long idB = idGen.nextId();
		assertNotEquals(idA, idB);
	}
}
