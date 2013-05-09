package com.practicalunittesting.chp09.creation.builder;

import com.practicalunittesting.chp09.creation.Address;
import com.practicalunittesting.chp09.creation.Employee;
import com.practicalunittesting.chp09.creation.Phone;
import com.practicalunittesting.chp09.creation.Position;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class EmployeeBuilder {

	private Position position;
	private Address address;
	private Phone mobile;
	private Phone stationary;
	private String firstname;
	private String lastname;


	public EmployeeBuilder withName(String firstname, String lastname) {
		return this.withFirstname(firstname).withLastname(lastname);
	}

	public EmployeeBuilder withFirstname(String firstname) {
		this.firstname = firstname;
		return this;
	}

	public EmployeeBuilder withLastname(String lastname) {
		this.lastname = lastname;
		return this;
	}

	public EmployeeBuilder withAddress(Address address) {
		this.address = address;
		return this;
	}

	public EmployeeBuilder withPosition(Position position) {
		this.position = position;
		return this;
	}

	public EmployeeBuilder withMobile(Phone mobile) {
		this.mobile = mobile;
		return this;
	}

	public EmployeeBuilder withStationary(Phone stationary) {
		this.stationary = stationary;
		return this;
	}

	public Employee build() {
		return new Employee(firstname, lastname, position, address, mobile, stationary);
	}
}
