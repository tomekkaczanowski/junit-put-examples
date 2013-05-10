package com.practicalunittesting.chp11.code_coverage.first;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Money {
	private final int amount;
	private final String currency;

	public Money(int amount, String currency) {
		this.amount = amount;
		this.currency = currency;
	}

	public boolean equals(Object anObject) {
		if (anObject instanceof Money) {
			Money money = (Money) anObject;
			return currency.equals(money.getCurrency()) && amount == money.getAmount();
		}
		return false;
	}

	public Money add(Money m) {
		checkCurrencies(m);
		return new Money(getAmount() + m.getAmount(), getCurrency());
	}

	private void checkCurrencies(Money m) {
		if (!m.getCurrency().equals(currency)) {
			throw new IllegalArgumentException(
					"Currencies do not match: "
							+ currency + ", " + m.getCurrency());
		}
	}

	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}
}