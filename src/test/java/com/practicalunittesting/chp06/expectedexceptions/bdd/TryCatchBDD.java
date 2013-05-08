package com.practicalunittesting.chp06.expectedexceptions.bdd;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class TryCatchBDD {

	SUT sut = new SUT();

	@Test
	public void shouldThrowExceptions() {
		// given
		Exception exception = null;
		// some code here

		// when
		try {
			sut.methodWhichShouldThrowMyException();
		} catch (Exception e) {
			exception = e;
		}

		// then
		assertTrue("Should have thrown exception of MyException class",
				exception instanceof MyException);
	}
}
