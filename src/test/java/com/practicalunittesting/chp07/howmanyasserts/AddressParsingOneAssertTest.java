package com.practicalunittesting.chp07.howmanyasserts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class AddressParsingOneAssertTest {

	private Address anAddress = new Address("ADDR1$CITY IL 60563$COUNTRY");

	@Test
	public void testAddr1() {
		assertEquals("ADDR1", anAddress.getAddr1());
	}

	@Test
	public void testCsp() {
		assertEquals("CITY IL 60563", anAddress.getCsp());
	}

	@Test
	public void testCountry() {
		assertEquals("COUNTRY", anAddress.getCountry());
	}
}
