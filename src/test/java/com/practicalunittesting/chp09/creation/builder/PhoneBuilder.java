package com.practicalunittesting.chp09.creation.builder;

import com.practicalunittesting.chp09.creation.Phone;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class PhoneBuilder {

	private String number;


	public PhoneBuilder withNumber(String number) {
		this.number = number;
		return this;
	}

	public Phone build() {
		return new Phone(number);
	}
}
