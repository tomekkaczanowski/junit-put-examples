package com.practicalunittesting.chp10.proc_vs_oo.proc.easymock;

import com.practicalunittesting.chp10.proc_vs_oo.proc.Client;
import com.practicalunittesting.chp10.proc_vs_oo.proc.ICurrentValue;
import com.practicalunittesting.chp10.proc_vs_oo.proc.IFund;
import com.practicalunittesting.chp10.proc_vs_oo.proc.IRegister;
import org.junit.Before;
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
public class ClientProcTest {

	private Client client;

	private IFund fundA, fundB;
	private IRegister regAX, regAY, regBX, regBY;
	private ICurrentValue currentValueA, currentValueB;
	private int NB_OF_UNITS_AX = 5;
	private int NB_OF_UNITS_AY = 1;
	private int NB_OF_UNITS_BX = 4;
	private int NB_OF_UNITS_BY = 1;
	private BigDecimal FUND_A_VALUE = new BigDecimal(3);
	private BigDecimal FUND_B_VALUE = new BigDecimal(2);

	@Before
	protected void setUp() throws Exception {
		client = new Client();
		fundA = createNiceMock(IFund.class);
		fundB = createNiceMock(IFund.class);
		regAX = createNiceMock(IRegister.class);
		regAY = createNiceMock(IRegister.class);
		regBX = createNiceMock(IRegister.class);
		regBY = createNiceMock(IRegister.class);
		currentValueA = createNiceMock(ICurrentValue.class);
		currentValueB = createNiceMock(ICurrentValue.class);
	}

	@Test
	public void totalValueShouldBeEqualToSumOfAllFundsValues() {
		expect(fundA.getRegisterX()).andStubReturn(regAX);
		expect(fundA.getRegisterY()).andStubReturn(regAY);
		expect(fundB.getRegisterX()).andStubReturn(regBX);
		expect(fundB.getRegisterY()).andStubReturn(regBY);
		expect(regAX.getNbOfUnits()).andStubReturn(NB_OF_UNITS_AX);
		expect(regAY.getNbOfUnits()).andStubReturn(NB_OF_UNITS_AY);
		expect(regBX.getNbOfUnits()).andStubReturn(NB_OF_UNITS_BX);
		expect(regBY.getNbOfUnits()).andStubReturn(NB_OF_UNITS_BY);
		expect(fundA.getCurrentValue()).andStubReturn(currentValueA);
		expect(fundB.getCurrentValue()).andStubReturn(currentValueB);
		expect(currentValueA.getValue()).andStubReturn(FUND_A_VALUE);
		expect(currentValueB.getValue()).andStubReturn(FUND_B_VALUE);
		client.addFund(fundA);
		client.addFund(fundB);
		replay(fundA, fundB, regAX, regAY, regBX, regBY, currentValueA, currentValueB);
		assertEquals(BigDecimal.valueOf((5 + 1) * 3 + (4 + 1) * 2), client.getValueOfAllFunds());
	}

}
