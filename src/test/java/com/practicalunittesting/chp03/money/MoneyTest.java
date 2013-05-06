package com.practicalunittesting.chp03.money;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@RunWith(JUnitParamsRunner.class)
public class MoneyTest {

	@Test
	public void constructorShouldSetAmountAndCurrency() {
		Money money = new Money(10, "USD");
		//Assert.assertEquals(10, money.getAmount());
		//assertEquals(15, money.getAmount());
		Assert.assertEquals("wrong amount of money", 10, money.getAmount());
		Assert.assertEquals("USD", money.getCurrency());
	}

	private Object[] getMoney() {
		return $(
				$(new Money(4, "USD"), new Money(3, "USD"), 7),
				$(new Money(1, "EUR"), new Money(4, "EUR"), 5),
				$(new Money(1234, "CHF"), new Money(234, "CHF"), 1468)
		);
	}

	@Test
	@Parameters(method = "getMoney")
	public void shouldAddSameCurrencies(Money a, Money b,
										int expectedResult) {
		Money result = a.add(b);
		Assert.assertEquals(expectedResult, result.getAmount());
	}

}
