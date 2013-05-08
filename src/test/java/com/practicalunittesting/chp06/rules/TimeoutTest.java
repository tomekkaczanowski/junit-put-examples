package com.practicalunittesting.chp06.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class TimeoutTest {

	@Rule
	public Timeout globalTimeout = new Timeout(20);

	@Test
	public void willFail() throws InterruptedException {
		Thread.sleep(100);
	}

	@Test
	public void willPass() throws InterruptedException {
		Thread.sleep(10);
	}
}