package com.practicalunittesting.chp11.refactoring;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class PersonTest {

	private static final String ANY_NAME = "ANY_NAME";
	private static final String ANY_SURNAME = "ANY_SURNAME";

	@Test
	public void kidsNotAllowed() {
		//Person kid = new Person("Diego", "Maradona");
		Person kid = new Person(ANY_NAME, ANY_SURNAME);
		kid.setAge(12);
		assertFalse(kid + " is a kid!", kid.isAdult());
	}

	class Person {
		private int age;
		private String firstname;
		private String lastname;

		public Person(String firstname, String lastname) {
			this.firstname = firstname;
			this.lastname = lastname;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public boolean isAdult() {
			return age > 18;
		}

		@Override
		public String toString() {
			return "Person{" +
					"firstname='" + firstname + '\'' +
					", lastname='" + lastname + '\'' +
					", age=" + age +
					'}';
		}
	}
}
