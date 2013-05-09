package com.practicalunittesting.chp07.random;

import org.apache.commons.lang.RandomStringUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class UserToPersonConverterTest {

	@Test
	public void shouldConvertUserNamesIntoPersonNick() {
		String name = RandomStringUtils.randomAlphabetic(8);
		String surname = RandomStringUtils.randomAlphabetic(12);
		User user = new User(name, surname);

		Person person = UserToPersonConverter.convert(user);

		assertEquals(name + " " + surname, person.getNick());
	}
}
