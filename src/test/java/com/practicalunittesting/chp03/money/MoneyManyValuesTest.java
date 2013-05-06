package com.practicalunittesting.chp03.money;

import org.junit.Assert;
import org.junit.Test;


/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MoneyManyValuesTest {

	@Test
	public void testConstructor() {
		Money money = new Money(10, "USD");
		Assert.assertEquals(10, money.getAmount());
		Assert.assertEquals("USD", money.getCurrency());
		money = new Money(20, "EUR");
		Assert.assertEquals(20, money.getAmount());
		Assert.assertEquals("EUR", money.getCurrency());
	}

}
