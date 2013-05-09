package com.practicalunittesting.chp10.maintainable;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class BankAccount {
	private int balance;

	public void deposit(int amount) {
		balance += amount;
	}

	public int getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		balance -= amount;
	}
}

