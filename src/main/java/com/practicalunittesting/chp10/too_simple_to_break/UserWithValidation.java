package com.practicalunittesting.chp10.too_simple_to_break;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class UserWithValidation {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null || name.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.name = name;
	}
}
