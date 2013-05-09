package com.practicalunittesting.chp10.proc_vs_oo.proc;

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
public class ClientProcMockitoTest {

	private int NB_OF_UNITS_AX = 5;
	private int NB_OF_UNITS_AY = 1;
	private int NB_OF_UNITS_BX = 4;
	private int NB_OF_UNITS_BY = 1;
	private BigDecimal FUND_A_VALUE = new BigDecimal(3);
	private BigDecimal FUND_B_VALUE = new BigDecimal(2);

	@Test
	public void totalValueShouldBeEqualToSumOfAllFundsValues() {
		Client client = new Client();
		IFund fundA = mock(IFund.class);
		IFund fundB = mock(IFund.class);
		IRegister regAX = mock(IRegister.class);
		IRegister regAY = mock(IRegister.class);
		IRegister regBX = mock(IRegister.class);
		IRegister regBY = mock(IRegister.class);
		ICurrentValue currentValueA = mock(ICurrentValue.class);
		ICurrentValue currentValueB = mock(ICurrentValue.class);
		when(fundA.getRegisterX()).thenReturn(regAX);
		when(fundA.getRegisterY()).thenReturn(regAY);
		when(fundB.getRegisterX()).thenReturn(regBX);
		when(fundB.getRegisterY()).thenReturn(regBY);
		when(regAX.getNbOfUnits()).thenReturn(NB_OF_UNITS_AX);
		when(regAY.getNbOfUnits()).thenReturn(NB_OF_UNITS_AY);
		when(regBX.getNbOfUnits()).thenReturn(NB_OF_UNITS_BX);
		when(regBY.getNbOfUnits()).thenReturn(NB_OF_UNITS_BY);
		when(fundA.getCurrentValue()).thenReturn(currentValueA);
		when(fundB.getCurrentValue()).thenReturn(currentValueB);
		when(currentValueA.getValue()).thenReturn(FUND_A_VALUE);
		when(currentValueB.getValue()).thenReturn(FUND_B_VALUE);
		client.addFund(fundA);
		client.addFund(fundB);
		assertEquals(BigDecimal.valueOf((5 + 1) * 3 + (4 + 1) * 2), client.getValueOfAllFunds());
	}

}
