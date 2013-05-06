package com.practicalunittesting.chp05.mockornot;

import java.util.ArrayList;
import java.util.List;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Client2 {
	private final List<Phone2> phones = new ArrayList<Phone2>();

	public void addPhone(Phone2 phone) {
		phones.add(phone);
	}

	public boolean hasMobile() {
		for (Phone2 phone : phones) {
			if (phone.isMobile()) {
				return true;
			}
		}
		return false;
	}
}
