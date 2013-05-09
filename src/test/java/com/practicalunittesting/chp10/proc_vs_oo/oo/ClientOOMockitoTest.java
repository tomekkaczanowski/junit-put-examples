package com.practicalunittesting.chp10.proc_vs_oo.oo;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class ClientOOMockitoTest {

	private final static BigDecimal VALUE_A = new BigDecimal(9);
	private final static BigDecimal VALUE_B = new BigDecimal(2);

	@Test
	public void totalValueShouldBeEqualToSumOfAllFundsValues() {
		Client client = new Client();
		IFund fundA = mock(IFund.class);
		IFund fundB = mock(IFund.class);
		when(fundA.getValue()).thenReturn(VALUE_A);
		when(fundB.getValue()).thenReturn(VALUE_B);

		client.addFund(fundA);
		client.addFund(fundB);

		assertEquals(VALUE_A.add(VALUE_B), client.getValueOfAllFunds());
	}
}
