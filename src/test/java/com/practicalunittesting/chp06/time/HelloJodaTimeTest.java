package com.practicalunittesting.chp06.time;

import org.joda.time.DateTimeUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class HelloJodaTimeTest {

	private Hello hello;

	@Before
	public void setUp() {
		hello = new Hello();
	}

	@Test
	public void shouldSayGoodMorningInTheMorning() {
		Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR_OF_DAY, 9);
		DateTimeUtils.setCurrentMillisFixed(now.getTimeInMillis());
		assertEquals("Good Morning!", hello.sayHello());
	}

	public void shouldSayGoodAfternoonInTheAfternoon() {
		Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR_OF_DAY, 18);
		DateTimeUtils.setCurrentMillisFixed(now.getTimeInMillis());
		assertEquals("Good Afternoon!", hello.sayHello());
	}

}
