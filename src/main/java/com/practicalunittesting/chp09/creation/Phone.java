package com.practicalunittesting.chp09.creation;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Phone {
	private String number;

	public Phone(String number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Phone{" +
				"number='" + number + '\'' +
				'}';
	}
}
