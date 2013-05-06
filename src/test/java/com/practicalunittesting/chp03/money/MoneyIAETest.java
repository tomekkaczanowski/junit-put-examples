package com.practicalunittesting.chp03.money;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
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
public class MoneyIAETest {

	private final static int VALID_AMOUNT = 5;
	private final static String VALID_CURRENCY = "USD";

	private static final Object[] getInvalidAmount() {
		return $(-12387, -5, -1);
	}

	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidAmount")
	public void constructorShouldThrowIAEForInvalidAmount(int invalidAmount) {
		new Money(invalidAmount, VALID_CURRENCY);
	}

	private static final Object[] getInvalidCurrency() {
		return new String[][]{{null}, {""}};
		// does not work with $(null, ""); - maybe fixed in newer JUnitParams
	}

	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidCurrency")
	public void constructorShouldThrowIAEForInvalidCurrency(String invalidCurrency) {
		new Money(VALID_AMOUNT, invalidCurrency);
	}
}
