package com.practicalunittesting.chp09.creation;

import java.util.Calendar;
import java.util.Date;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class ObjectMotherEmployee {

	private static Phone MOBILE_PHONE = new Phone("123-456-789");
	private static Phone STATIONARY_PHONE = new Phone("123-456-789");

	public static Employee ceoEmployee() {
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 3, 1);
		Date startCeo = cal.getTime();
		cal.add(Calendar.DATE, 1);
		Date endCeo = cal.getTime();
		Position ceo = new Position("ceo", startCeo, endCeo);
		Address homeAddress = new Address("Street A");
		Employee ceoEmpl = new Employee("ceoName", "ceoSurname", ceo, homeAddress, MOBILE_PHONE, STATIONARY_PHONE);
		return ceoEmpl;
	}

	public static Employee pmEmployee() {
		Calendar cal = Calendar.getInstance();
		cal.set(2008, 7, 12);
		Date startPm = cal.getTime();
		cal.add(Calendar.YEAR, 3);
		Date endPm = cal.getTime();
		Position ceo = new Position("pm", startPm, endPm);
		Address homeAddress = new Address("Street A");
		Employee pmEmpl = new Employee("pmName", "pmSurname", ceo, homeAddress, MOBILE_PHONE, STATIONARY_PHONE);
		return pmEmpl;
	}
}
