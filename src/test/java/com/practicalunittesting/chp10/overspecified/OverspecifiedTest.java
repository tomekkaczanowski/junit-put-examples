package com.practicalunittesting.chp10.overspecified;

import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class OverspecifiedTest {

	private static final String ITEM_NAME = "a";

	private Shop shop;

	private store store;

	@Before
	public void setUp() {
		store = mock(store.class);
		shop = new Shop(store);
	}

	@Test
	public void itemsAvailableIfTheyAreInStore() {
		when(store.itemsLeft(ITEM_NAME)).thenReturn(2);
		assertTrue(shop.isAvailable(ITEM_NAME));
		verify(store).itemsLeft(ITEM_NAME);
	}

	@Test
	public void itemsAvailableIfTheyAreInStore2() {
		when(store.itemsLeft(ITEM_NAME)).thenReturn(2);
		assertTrue(shop.isAvailable(ITEM_NAME));
	}

	@Test
	public void shouldCheckStoreForItems() {
		shop.isAvailable(ITEM_NAME);
		verify(store).itemsLeft(ITEM_NAME);
	}

	private class Shop {

		private store store;
		private Collection<String> alwaysAvailableItems;

		public Shop(store store) {
			this.store = store;
			this.alwaysAvailableItems = new HashSet<String>();
			alwaysAvailableItems.add("a");
			alwaysAvailableItems.add("b");
			alwaysAvailableItems.add("c");

		}

		public boolean isAvailable(String something) {
			return alwaysAvailableItems.contains(something) || store.itemsLeft(something) > 0;
		}
	}

	private class store {
		public int itemsLeft(String item) {
			return 0;
		}
	}
}
