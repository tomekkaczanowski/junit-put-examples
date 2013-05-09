package com.practicalunittesting.chp10.proc_vs_oo.oo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Client {

	private final List<IFund> funds;

	public Client() {
		this.funds = new ArrayList<IFund>();
	}

	public void addFund(IFund fund) {
		funds.add(fund);
	}

	public BigDecimal getValueOfAllFunds() {
		BigDecimal value = BigDecimal.ZERO;
		for (IFund f : funds) {
			value = value.add(f.getValue());
		}
		return value;
	}

}