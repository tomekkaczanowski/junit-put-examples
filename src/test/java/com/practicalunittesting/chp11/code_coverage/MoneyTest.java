package com.practicalunittesting.chp11.code_coverage;

import com.practicalunittesting.chp11.code_coverage.first.Money;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MoneyTest {

	@Test
	public void constructorShouldSetAmountAndCurrency() {
		Money money = new Money(10, "USD");
		assertEquals(10, money.getAmount());
		assertEquals("USD", money.getCurrency());
	}

	@Test
	public void shouldBeAbleToAddMoney() {
		assertEquals(new Money(7, "USD"), new Money(3, "USD").add(new Money(4, "USD")));
	}

	@Test
	// 13/15 4/8
	public void differentMoneyShouldNotBeEqual() {
		assertFalse(new Money(7, "CHF").equals(new Money(7, "USD")));
		assertFalse(new Money(8, "USD").equals(new Money(7, "USD")));
	}
	// 13/15 6/8
}
