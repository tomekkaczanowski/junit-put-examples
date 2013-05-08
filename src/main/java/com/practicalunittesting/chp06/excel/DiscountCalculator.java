package com.practicalunittesting.chp06.excel;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class DiscountCalculator {

	private final static double THREE_PERCENT = 0.03d;
	private final static double TWO_PERCENT = 0.02d;
	private final static double ONE_PERCENT = 0.01d;
	private final static double NO_DISCOUNT = 0.0d;

	public static double calculateDiscount(double value) {
		if (value >= 5000) {
			return THREE_PERCENT;
		}
		if (value >= 2000) {
			return TWO_PERCENT;
		}
		if (value >= 1000) {
			return ONE_PERCENT;
		}
		return NO_DISCOUNT;
	}
}
