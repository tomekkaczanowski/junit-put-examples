package com.practicalunittesting.chp09.creation;

import com.practicalunittesting.chp09.creation.builder.AddressBuilder;
import com.practicalunittesting.chp09.creation.builder.EmployeeBuilder;
import com.practicalunittesting.chp09.creation.builder.PhoneBuilder;
import com.practicalunittesting.chp09.creation.builder.PositionBuilder;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class EmployeeTestDataBuilderTest {

	@Test
	public void ceoCanDoEverythingNoPhones() {
		Calendar cal = Calendar.getInstance();
		cal.set(2010, 3, 1);
		Date startCeo = cal.getTime();
		cal.add(Calendar.DATE, 1);
		Date endCeo = cal.getTime();
		Employee ceoEmpl =
				new EmployeeBuilder()
						.withFirstname("ceoName").withLastname("ceoLastname")
						.withPosition(
								new PositionBuilder().withTitle("CEO")
										.start(startCeo).end(endCeo).build())
						.withAddress(
								new AddressBuilder().withStreet("Wall Street").build())
						.build();
		// some methods execution and assertions here
		System.out.println(ceoEmpl);
	}


	@Test
	public void pmCanDoALotNoPhones() {
		Employee pmEmpl =
				new EmployeeBuilder()
						.withName("pmName", "pmLastname")
						.withPosition(
								new PositionBuilder().withTitle("PM")
										.start(2010, 1, 1).end(2011, 7, 3).build())
						.withAddress(
								new AddressBuilder().withStreet("Sesame Street").build())
						.build();
		// some methods execution and assertions here
		System.out.println(pmEmpl);
	}

	@Test
	public void ceoCanDoEverything() {
		Employee ceoEmpl =
				new EmployeeBuilder()
						.withFirstname("ceoName").withLastname("ceoLastname")
						.withMobile(
								new PhoneBuilder().withNumber("123-456-789").build())
						.withStationary(
								new PhoneBuilder().withNumber("456-789-012").build())
						.withPosition(
								new PositionBuilder().withTitle("CEO")
										.start(2011, 1, 1).end(2011, 5, 5).build())
						.withAddress(
								new AddressBuilder().withStreet("Wall Street").build())
						.build();
		// some methods execution and assertions here
		System.out.println(ceoEmpl);
	}

	@Test
	public void pmCanDoALot() {
		Employee pmEmpl =
				new EmployeeBuilder()
						.withName("pmName", "pmLastname")
						.withMobile(
								new PhoneBuilder().withNumber("123-456-789").build())
						.withStationary(
								new PhoneBuilder().withNumber("456-789-012").build())
						.withPosition(
								new PositionBuilder().withTitle("PM")
										.start(2010, 1, 1).end(2011, 7, 3).build())
						.withAddress(
								new AddressBuilder().withStreet("Sesame Street").build())
						.build();
		// some methods execution and assertions here
		System.out.println(pmEmpl);
	}
}
