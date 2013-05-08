package com.practicalunittesting.chp06.collections.hamcrest;

import org.junit.Before;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsMapContaining.hasEntry;
import static org.hamcrest.collection.IsMapContaining.hasKey;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsCollectionContaining.hasItems;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class HamcrestTest {

	private Set<String> setA, setB;
	private final static String s1 = "s1";
	private final static String s2 = "s2";

	private Map<String, Object> map;

	@Before
	private void setUp() {
		setA = new LinkedHashSet<String>();
		setB = new LinkedHashSet<String>();

		setA.add(s1);
		setA.add(s2);

		setB.add(s2);
		setB.add(s1);

		map = new LinkedHashMap<String, Object>();
		map.put(s1, 2);
		map.put("a", 2);
	}

	@Test
	public void collectionsUtilityMethods() {
		assertThat(setA, hasItem(s1));
		assertThat(setA, hasItem(s2));
		assertThat(setA, hasItem("xyz"));
		assertThat(setA, hasItems(s1, s2, "xyz"));
	}

	@Test
	public void mapsUtilityMethods() {
		assertThat(map, hasEntry("a", (Object) 2));
		assertThat(map, hasKey("b"));
	}
}