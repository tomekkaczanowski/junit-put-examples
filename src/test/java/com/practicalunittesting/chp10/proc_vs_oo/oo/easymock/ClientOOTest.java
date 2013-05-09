package com.practicalunittesting.chp10.proc_vs_oo.oo.easymock;

import com.practicalunittesting.chp10.proc_vs_oo.oo.Client;
import com.practicalunittesting.chp10.proc_vs_oo.oo.IFund;
import org.junit.Test;

import java.math.BigDecimal;

import static org.easymock.EasyMock.*;
import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class ClientOOTest {

	private final static BigDecimal VALUE_A = new BigDecimal(9);
	private final static BigDecimal VALUE_B = new BigDecimal(2);

	@Test
	public void totalValueShouldBeEqualToSumOfAllFundsValues() {
		Client client = new Client();
		IFund fundA = createNiceMock(IFund.class);
		IFund fundB = createNiceMock(IFund.class);
		expect(fundA.getValue()).andStubReturn(VALUE_A);
		expect(fundB.getValue()).andStubReturn(VALUE_B);

		client.addFund(fundA);
		client.addFund(fundB);
		replay(fundA, fundB);

		assertEquals(VALUE_A.add(VALUE_B), client.getValueOfAllFunds());
	}

}
