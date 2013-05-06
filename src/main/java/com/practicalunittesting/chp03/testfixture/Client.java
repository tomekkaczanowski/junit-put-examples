package com.practicalunittesting.chp03.testfixture;

import java.util.ArrayList;
import java.util.List;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Client {
	private List<Address> addresses = new ArrayList<Address>();

	public Client(Address addressA) {

	}

	public Client() {
		//To change body of created methods use File | Settings | File Templates.
	}

	public void addAddress(Address address) {
		addresses.add(address);
	}

	public List<Address> getAddresses() {
		return addresses;
	}
}
