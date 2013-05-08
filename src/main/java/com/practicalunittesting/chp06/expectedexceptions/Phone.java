package com.practicalunittesting.chp06.expectedexceptions;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Phone {
	private String number;

	public Phone() {
	}

	public void setNumber(String number) {
		if (null == number || number.isEmpty()) {
			throw new IllegalArgumentException("number can not be null or empty");
		}
		if (number.startsWith("+")) {
			throw new IllegalArgumentException(
					"plus sign prefix not allowed, number: [" + number + "]");
		}
		this.number = number;
	}
}
