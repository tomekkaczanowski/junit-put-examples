package com.practicalunittesting.chp02;

import java.math.BigDecimal;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface ClientDAO {
	Short getClientType(long clientId);

	void saveBonusHistory(long clientId, BigDecimal bonus);
}
