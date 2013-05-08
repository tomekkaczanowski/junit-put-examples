package com.practicalunittesting.chp06.expectedexceptions.bdd;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class SUT {
	public void methodWhichShouldThrowMyException() throws MyException {
		throw new MyException();
	}
}
