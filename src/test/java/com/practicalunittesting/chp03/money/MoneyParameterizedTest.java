package com.practicalunittesting.chp03.money;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@RunWith(JUnitParamsRunner.class)
public class MoneyParameterizedTest {

	private static final Object[] getMoney() {
		return $(
				$(10, "USD"),
				$(20, "EUR")
		);
	}

	@Test
	@Parameters(method = "getMoney")
	public void constructorShouldSetAmountAndCurrency(
			int amount, String currency) {
		Money money = new Money(amount, currency);
		assertEquals(amount, money.getAmount());
		assertEquals(currency, money.getCurrency());
	}

	private static final Object[] getMoneyWithoutDollarSignMethod() {
		return new Object[]{
				new Object[]{10, "USD"},
				new Object[]{20, "EUR"}
		};
	}
}




































