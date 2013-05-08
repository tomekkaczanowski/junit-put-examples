package com.practicalunittesting.chp06.ignore;

import org.junit.Ignore;
import org.junit.Test;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class IgnoreTest {

	@Test
	public void shouldBeRun() {
		System.out.println("running!");
	}

	@Ignore
	@Test
	public void shouldBeIgnored() {
		System.out.println("huh, not ignored?!");
	}
}
