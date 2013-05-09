package com.practicalunittesting.chp07.random;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class UserToPersonConverter {

	public static Person convert(User user) {
		return new Person(user.getName() + " " + user.getSurname());
	}
}
