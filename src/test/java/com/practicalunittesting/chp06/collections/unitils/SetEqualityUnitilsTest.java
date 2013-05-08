package com.practicalunittesting.chp06.collections.unitils;

import org.junit.Before;
import org.junit.Test;
import org.unitils.reflectionassert.ReflectionComparatorMode;

import java.util.LinkedHashSet;
import java.util.Set;

import static org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class SetEqualityUnitilsTest {

	private Set<String> setA, setB;

	@Before
	private void setUp() {
		setA = new LinkedHashSet<String>();
		setB = new LinkedHashSet<String>();

		String s1 = "s1";
		String s2 = "s2";

		setA.add(s1);
		setA.add(s2);

		setB.add(s2);
		setB.add(s1);
	}

	@Test
	public void twoSetsAreEqualsIfTheyHaveSameContentAndSameOrder() {
		assertReflectionEquals(setA, setB);
	}

	@Test
	public void twoSetsAreEqualsIfTheyHaveSameContentAndAnyOrder() {
		assertReflectionEquals(setA, setB,
				ReflectionComparatorMode.LENIENT_ORDER);
	}
}