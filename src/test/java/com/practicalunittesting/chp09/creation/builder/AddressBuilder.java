package com.practicalunittesting.chp09.creation.builder;

import com.practicalunittesting.chp09.creation.Address;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class AddressBuilder {

	private String street;

	public AddressBuilder withStreet(String street) {
		this.street = street;
		return this;
	}

	public Address build() {
		return new Address(street);
	}
}
