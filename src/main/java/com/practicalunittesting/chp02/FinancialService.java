package com.practicalunittesting.chp02;

import java.math.BigDecimal;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class FinancialService {

	ClientDAO clientDAO;
	Calculator calculator;

	public BigDecimal calculateBonus(long clientId, BigDecimal payment) {
		Short clientType = clientDAO.getClientType(clientId);
		BigDecimal bonus = calculator.calculateBonus(clientType, payment);
		clientDAO.saveBonusHistory(clientId, bonus);
		return bonus;
	}
}
