package com.practicalunittesting.chp06.expectedexceptions.bdd;

import org.junit.Test;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class BDD {

	SUT sut = new SUT();

	@Test
	public void shouldThrowExceptions() throws MyException {
		catchException(sut).methodWhichShouldThrowMyException();

		Exception e = caughtException();

		assertTrue("Should have thrown exception of MyException class",
				caughtException() instanceof MyException);

	}

}
