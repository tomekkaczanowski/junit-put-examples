package com.practicalunittesting.chp06.excel;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.mappers.CsvWithHeaderMapper;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@RunWith(JUnitParamsRunner.class)
public class ReadCSVJUnitParamsTest {

	@Test
	//@FileParameters(value = "/home/tomek/book/github/put_2/src/test/resources/com/practicalunittesting/chp06/excel/financial_junitparams.csv", mapper= CsvWithHeaderMapper.class)
	@FileParameters(value = "classpath:com/practicalunittesting/chp06/excel/financial_junitparams.csv", mapper= CsvWithHeaderMapper.class)
	public void shouldCalculateDiscount(String value, String discount) {
		assertEquals(Double.parseDouble(discount),
				DiscountCalculator.calculateDiscount(Double.parseDouble(value)), 0.0001);
	}

	@Test
	//@FileParameters(value = "/home/tomek/book/github/put_2/src/test/resources/com/practicalunittesting/chp06/excel/financial_junitparams.csv", mapper= CsvWithHeaderMapper.class)
	@FileParameters(value = "classpath:com/practicalunittesting/chp06/excel/financial_junitparams.csv", mapper= CsvWithHeaderMapper.class)
	public void shouldCalculateDiscountDoubles(double value, double discount) {
		assertEquals(discount,
				DiscountCalculator.calculateDiscount(value), 0.0001);
	}
}
