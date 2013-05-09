package com.practicalunittesting.chp08.listener;

import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

import java.util.HashMap;
import java.util.Map;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class TimeTestListener extends TestWatcher {

	private Map<String, Long> startTimes = new HashMap<String, Long>();

	@Override
	protected void starting(Description description) {
		startTimes.put(description.getMethodName(),
				System.currentTimeMillis());
	}

	@Override
	protected void finished(Description description) {
		long executionTime = System.currentTimeMillis()
				- startTimes.get(description.getMethodName());
		System.out.println(description.getMethodName()
				+ ": " + executionTime);
	}
}
