package com.practicalunittesting.chp11.code_coverage;

import com.practicalunittesting.chp11.code_coverage.first.Account;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class AccountTest {

	private static final String EMPTY_CURRENCY = "";

	@Test
	public void constructorShouldSetAmountAndCurrency() {
		Account money = new Account(10, "USD");
		assertEquals(10, money.getAmount());
	}

	@Test(expected = IllegalArgumentException.class)
	public void shouldRejectEmptyCurrency() {
		new Account(10, EMPTY_CURRENCY);
	}

}
