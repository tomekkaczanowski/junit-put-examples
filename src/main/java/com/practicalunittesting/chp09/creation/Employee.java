package com.practicalunittesting.chp09.creation;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Employee {

	private Position position;

	private Address address;
	private Phone mobile;
	private Phone stationary;
	private String firstname;
	private String lastname;

	public Employee(String firstname, String lastname, Position position, Address address, Phone mobile, Phone stationary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.position = position;
		this.address = address;
		this.mobile = mobile;
		this.stationary = stationary;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"position=" + position +
				", address=" + address +
				", mobile=" + mobile +
				", stationary=" + stationary +
				", firstname='" + firstname + '\'' +
				", lastname='" + lastname + '\'' +
				'}';
	}
}
