package com.practicalunittesting.chp05.mockornot.mockito;

import com.practicalunittesting.chp05.mockornot.Client2;
import com.practicalunittesting.chp05.mockornot.Phone2;
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
public class MockingPhone2Test {
	private final static Phone2 MOBILE_PHONE = mock(Phone2.class);
	private final static Phone2 STATIONARY_PHONE = mock(Phone2.class);

	private Client2 client = new Client2();

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
