package com.practicalunittesting.chp06.collections;

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
public class SetEqualityTest {

	@Test
	public void twoSetsAreEqualsIfTheyHaveSameContent() {
		Set<String> setA = new LinkedHashSet<String>();
		Set<String> setB = new LinkedHashSet<String>();

		String s1 = "s1";
		String s2 = "s2";

		setA.add(s1);
		setA.add(s2);

		setB.add(s2);
		setB.add(s1);

		assertEquals(setB, setA);
	}
}