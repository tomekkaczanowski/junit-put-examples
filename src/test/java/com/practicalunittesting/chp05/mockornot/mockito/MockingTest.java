package com.practicalunittesting.chp05.mockornot.mockito;

import com.practicalunittesting.chp05.mockornot.Client;
import com.practicalunittesting.chp05.mockornot.Phone;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MockingTest {
	private final static Phone MOBILE_PHONE = mock(Phone.class);
	private final static Phone STATIONARY_PHONE = mock(Phone.class);

	private Client client = new Client();

	@Test
	public void shouldReturnTrueIfClientHasMobile() {
		when(MOBILE_PHONE.isMobile()).thenReturn(true);

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
