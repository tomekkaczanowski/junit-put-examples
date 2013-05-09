package com.practicalunittesting.chp07.howmanyasserts;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class AddressParsingManyAssertsTest {

	@Test
	public void testAddressParsing() {
		Address anAddress = new Address("ADDR1$CITY IL 60563$COUNTRY");
		assertEquals("ADDR1", anAddress.getAddr1());
		assertEquals("CITY IL 60563", anAddress.getCsp());
		assertEquals("COUNTRY", anAddress.getCountry());
	}
}
