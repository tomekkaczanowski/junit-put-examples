package com.practicalunittesting.chp05.mockornot.easymock;

import com.practicalunittesting.chp05.mockornot.Client;
import com.practicalunittesting.chp05.mockornot.Phone;
import org.junit.Test;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MockingTest {
	private final static Phone MOBILE_PHONE = createNiceMock(Phone.class);
	private final static Phone STATIONARY_PHONE = createNiceMock(Phone.class);

	private Client client = new Client();

	@Test
	public void shouldReturnTrueIfClientHasMobile() {
		expect(MOBILE_PHONE.isMobile()).andStubReturn(true);
		replay(MOBILE_PHONE);
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
