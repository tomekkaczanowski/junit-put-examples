package com.practicalunittesting.chp07.privatemethods.accessmodifier;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class PrivateMethodAccessModifierTest {

	@Test
	public void testingPrivateMethodWithReflection() {
		SomeClass sut = new SomeClass();
		assertTrue(sut.privateMethod(9238423L));
	}
}
