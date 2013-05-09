package com.practicalunittesting.chp09.bdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class BankAccountBDDTest {

	@Test
	public void shouldBeEmptyAfterCreation() {
		// given
		BankAccount account = new BankAccount();

		// when
		int balance = account.getBalance();

		// then
		assertEquals(0, balance);
	}

	@Test
	public void shouldAllowToCreditAccount() {
		// given
		BankAccount account = new BankAccount();

		// when
		account.deposit(100);

		// then
		int balance = account.getBalance();
		assertEquals(100, balance);
	}

	@Test
	public void shouldAllowToDebitAccount() {
		// given
		BankAccount account = new BankAccount();

		// when
		account.deposit(100);
		account.withdraw(40);

		// then
		int balance = account.getBalance();
		assertEquals(60, balance);
	}
}