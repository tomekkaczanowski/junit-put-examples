package com.practicalunittesting.chp06.time;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class HelloTest {

	@Test
	public void shouldSayGoodMorningInTheMorning() {
		Hello hello = new Hello();
		assertEquals("Good Morning!", hello.sayHello());
	}

	@Test
	public void shouldSayGoodAfternoonInTheAfternoon() {
		Hello hello = new Hello();
		assertEquals("Good Afternoon!", hello.sayHello());
	}
}
