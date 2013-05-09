package com.practicalunittesting.chp09.creation;

import com.practicalunittesting.chp09.creation.builder.AddressBuilder;
import com.practicalunittesting.chp09.creation.builder.EmployeeBuilder;
import com.practicalunittesting.chp09.creation.builder.PhoneBuilder;
import com.practicalunittesting.chp09.creation.builder.PositionBuilder;
import org.junit.Test;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class EmployeeNicerTestDataBuilderTest {

	private EmployeeBuilder anEmployee() {
		return new EmployeeBuilder()
				.withFirstname("John").withLastname("Doe")
				.withMobile(
						new PhoneBuilder().withNumber("123-456-789").build())
				.withStationary(
						new PhoneBuilder().withNumber("456-789-012").build())
				.withAddress(
						new AddressBuilder().withStreet("Some Street").build());
	}

	@Test
	public void pmCanDoALot() {
		Employee pmEmpl =
				anEmployee()
						.withPosition(
								new PositionBuilder().withTitle("PM")
										.start(2010, 1, 1).end(2011, 7, 3).build())
						.build();
		// some methods execution and assertions here
		System.out.println(pmEmpl);
	}

	@Test
	public void ceoCanDoEverything() {
		Employee ceoEmpl =
				anEmployee()
						.withPosition(
								new PositionBuilder().withTitle("CEO")
										.start(2011, 1, 1).end(2011, 5, 5).build())
						.build();
		// some methods execution and assertions here
		System.out.println(ceoEmpl);
	}
}
