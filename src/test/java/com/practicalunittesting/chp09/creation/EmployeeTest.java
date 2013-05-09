package com.practicalunittesting.chp09.creation;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class EmployeeTest {

	private static Phone MOBILE_PHONE = new Phone("123-456-789");
	private static Phone STATIONARY_PHONE = new Phone("123-456-789");
	private static Address HOME_ADDRESS = new Address("any street");

	@Test
	public void ceoCanDoEverything() {
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 3, 1);
		Date startCeo = cal.getTime();
		cal.add(Calendar.DATE, 1);
		Date endCeo = cal.getTime();
		Position ceo = new Position("ceo", startCeo, endCeo);
		Employee ceoEmpl = createEmployee("ceoName", "ceoSurname", ceo);
		// some methods execution and assertions here
	}

	@Test
	public void pmCanDoALot() {
		Calendar cal = Calendar.getInstance();
		cal.set(2008, 7, 12);
		Date startPm = cal.getTime();
		cal.add(Calendar.YEAR, 3);
		Date endPm = cal.getTime();
		Position ceo = new Position("pm", startPm, endPm);
		Employee pmEmpl = createEmployee("pmName", "pmSurname", ceo);
		// some methods execution and assertions here
	}

	private Employee createEmployee(String name, String surname, Position ceo) {
		return new Employee(name, surname, ceo, HOME_ADDRESS, MOBILE_PHONE, STATIONARY_PHONE);
	}
}
