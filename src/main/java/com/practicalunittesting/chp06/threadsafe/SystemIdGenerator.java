package com.practicalunittesting.chp06.threadsafe;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class SystemIdGenerator implements IdGenerator {

	public Long nextId() {
		return System.currentTimeMillis();
	}
}
