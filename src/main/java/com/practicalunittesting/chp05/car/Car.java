package com.practicalunittesting.chp05.car;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface Car {

	boolean needsFuel();

	double getEngineTemperature();

	void driveTo(String destination);
}