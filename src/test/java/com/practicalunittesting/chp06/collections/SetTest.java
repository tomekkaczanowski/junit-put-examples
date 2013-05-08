package com.practicalunittesting.chp06.collections;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class SetTest {

	private Set<String> setA, setB;

	@Before
	public void setUp() {
		setA = new LinkedHashSet<String>();
		setB = new LinkedHashSet<String>();
	}

	@Test
	public void sameSets() {
		String s1 = "s1";
		String s2 = "s2";

		setA.add(s1);
		setA.add(s2);

		setB.add(s2);
		setB.add(s1);

		assertEquals(setA, setB);
	}

}
