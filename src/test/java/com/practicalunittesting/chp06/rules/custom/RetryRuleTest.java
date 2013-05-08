package com.practicalunittesting.chp06.rules.custom;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class RetryRuleTest {

	@Rule
	public RetryTestRule retryTestRule = new RetryTestRule();

	static int executionNumber = 0;

	@Test
	public void shouldBeRerun() {
		executionNumber++;
		System.out.println("execution: " + executionNumber);
		Assert.fail("failing: " + executionNumber);
	}

//	@Test
//	public void shouldFailOnSecondAttempt() {
//		executionNumber++;
//		System.out.println("execution: " + executionNumber);
//		try {
//			Assert.fail("failing " + executionNumber);
//		}
//		catch (AssertionError ae) {
//			assertEquals(2, executionNumber);
//		}
//	}
}