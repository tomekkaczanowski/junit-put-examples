package com.practicalunittesting.chp09.creation;

import org.junit.Test;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class EmployeeObjectMotherTest {

	@Test
	public void ceoCanDoEverything() {
		Employee empl = ObjectMotherEmployee.ceoEmployee();
		// some methods execution and assertions here
	}

	@Test
	public void pmCanDoALot() {
		Employee empl = ObjectMotherEmployee.pmEmployee();
		// some methods execution and assertions here
	}
}
