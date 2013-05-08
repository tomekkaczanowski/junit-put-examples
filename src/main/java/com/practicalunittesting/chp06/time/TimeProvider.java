package com.practicalunittesting.chp06.time;

import java.util.Calendar;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface TimeProvider {

	/**
	 * Allows for taking control over time in unit tests.
	 * A default implementation should return system calendar (Calendar.getInstance());
	 */
	Calendar getTime();
}
