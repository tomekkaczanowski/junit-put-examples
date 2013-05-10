package com.practicalunittesting.chp11.code_coverage.coveragetypes;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MyClass {

	public boolean bar(boolean a, boolean b) {
		boolean result = false;
		if (a && b) {
			result = true;
		}
		return result;
	}
}
