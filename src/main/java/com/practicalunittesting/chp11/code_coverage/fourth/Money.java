package com.practicalunittesting.chp11.code_coverage.fourth;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Money {
	private final String currency;

	public Money(String currency) {
		if (currency == null || currency.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.currency = currency;
	}

	public String getCurrency() {
		return currency;
	}
}
