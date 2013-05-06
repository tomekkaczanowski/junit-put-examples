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
public class NotMockingTest {
	private final static String ANY_NUMBER = "999-888-777";
	private final static Phone MOBILE_PHONE = new Phone(ANY_NUMBER, true);
	private final static Phone STATIONARY_PHONE = new Phone(ANY_NUMBER, false);

	private Client client = new Client();

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
