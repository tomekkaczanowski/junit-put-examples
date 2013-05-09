package com.practicalunittesting.chp08.listener;

import org.junit.Rule;
import org.junit.Test;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class ExampleTimeListenerTest {

	@Rule
	public TimeTestListener timeListener = new TimeTestListener();

	@Test
	public void tenMillis() throws InterruptedException {
		Thread.sleep(10);
	}

	@Test
	public void twentyMillis() throws InterruptedException {
		Thread.sleep(20);
	}

	@Test
	public void thirtyMillis() throws InterruptedException {
		Thread.sleep(30);
	}
}
