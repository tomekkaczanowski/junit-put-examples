package com.practicalunittesting.chp05.mockornot;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class NotMockingPhone2Test {
	private final static Phone2 MOBILE_PHONE = new Phone2("+123456789");
	private final static Phone2 STATIONARY_PHONE = new Phone2("123123123");

	private Client2 client = new Client2();

	@Test
	public void shouldReturnTrueIfClientHasMobile() {
		client.addPhone(MOBILE_PHONE);
		client.addPhone(STATIONARY_PHONE);

		assertTrue(client.hasMobile());
	}

	@Test
	public void shouldReturnFalseIfClientHasNoMobile() {
		client.addPhone(STATIONARY_PHONE);

		assertFalse(client.hasMobile());
	}
}
