package com.practicalunittesting.chp03.money;

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
		if (amount < 0) {
			throw new IllegalArgumentException("illegal amount: [" + amount + "]");
		}
		if (currency == null || currency.isEmpty()) {
			throw new IllegalArgumentException("illegal currency: [" + currency + "]");
		}
		//this.amount = 15;
		this.amount = amount;
		this.currency = currency;
	}

	public int getAmount() {
		return amount;
	}

	public String getCurrency() {
		return currency;
	}

	public boolean equals(Object anObject) {
		if (anObject instanceof Money) {
			Money money = (Money) anObject;
			return money.getCurrency().equals(getCurrency())
					&& getAmount() == money.getAmount();
		}
		return false;
	}

	public Money add(Money b) {
		// FIXME obviously flawed
		return new Money(this.amount + b.amount, this.currency);
	}

	@Override
	public String toString() {
		return "Money{" +
				"amount=" + amount +
				", currency='" + currency + '\'' +
				'}';
	}
}
