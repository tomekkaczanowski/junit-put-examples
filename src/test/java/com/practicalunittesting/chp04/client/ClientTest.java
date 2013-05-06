package com.practicalunittesting.chp04.client;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class ClientTest {

	@Test
	public void getterSetterTest() {
		Client client = new Client();
		client.setAge(20);
		assertEquals(20, client.getAge());
	}
}
