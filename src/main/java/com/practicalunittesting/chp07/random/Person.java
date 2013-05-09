package com.practicalunittesting.chp07.random;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Person {

	private String nick;

	public Person(String nick) {
		this.nick = nick;
	}

	public String getNick() {
		return nick;
	}
}
