package com.practicalunittesting.chp09.creation;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Address {
	private String street;

	public Address(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address{" +
				"street='" + street + '\'' +
				'}';
	}
}
