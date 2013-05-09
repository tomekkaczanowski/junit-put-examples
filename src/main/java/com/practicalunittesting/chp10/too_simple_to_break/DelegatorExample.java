package com.practicalunittesting.chp10.too_simple_to_break;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class DelegatorExample {

	private Collaborator collaborator;

	public void delegate() {
		collaborator.doSomething();
	}
}
