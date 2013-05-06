package com.practicalunittesting.chp03.testfixture;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class ClientNoSetUpTest {

	private Address addressA = new Address("street A");
	private Address addressB = new Address("street B");

	@Test
	public void afterCreationShouldHaveNoAddress() {
		Client client = new Client();

		assertEquals(0, client.getAddresses().size());
	}

	@Test
	public void shouldAllowToAddAddress() {
		Client client = new Client();

		client.addAddress(addressA);

		assertEquals(1, client.getAddresses().size());
		assertTrue(client.getAddresses().contains(addressA));
	}

	@Test
	public void shouldAllowToAddManyAddresses() {
		Client client = new Client();

		client.addAddress(addressA);
		client.addAddress(addressB);

		assertEquals(2, client.getAddresses().size());
		assertTrue(client.getAddresses().contains(addressA));
		assertTrue(client.getAddresses().contains(addressB));
	}
}
