package com.practicalunittesting.chp06.rules.custom;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RetryTest {

	int retryNb();
}
