package com.practicalunittesting.chp11.refactoring;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class PhoneSearch {

	private final boolean valid;

	public PhoneSearch(String prefix) {
		if (prefix == null || prefix.replaceAll(" ", "").length() < 2 || prefix.replaceAll("\\+", "").length() < 2) {
			valid = false;
		} else {
			valid = true;
		}
	}

	public boolean isValid() {
		return valid;
	}
}
