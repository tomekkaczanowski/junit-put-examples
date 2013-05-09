package com.practicalunittesting.chp10.maintainable;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class GoodBankAccountTest {

	private BankAccount account = new BankAccount();

	@Test
	public void shouldBeEmptyAfterCreation() {
		assertEquals(0, account.getBalance());
	}

	@Test
	public void shouldAllowToCreditAccount() {
		account.deposit(100);
		assertEquals(100, account.getBalance());
		account.deposit(100);
		assertEquals(200, account.getBalance());
	}

	@Test
	public void shouldAllowToDebitAccount() {
		account.deposit(100);
		account.withdraw(30);
		assertEquals(70, account.getBalance());
		account.withdraw(20);
		assertEquals(50, account.getBalance());
	}

	@Test(expected = SomeReasonableExceptionHere.class)
	public void shouldNotAllowToDebitAnEmptyAccount() {
		// implementation
	}

	@Test(expected = SomeReasonableExceptionHere.class)
	public void shouldNotAllowToUseNegativeAmountForCredit() {
		// implementation
	}

	@Test(expected = SomeReasonableExceptionHere.class)
	public void shouldNotAllowToUseNegativeAmountForDebit() {
		// implementation
	}
}
