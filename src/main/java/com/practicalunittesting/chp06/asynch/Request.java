package com.practicalunittesting.chp06.asynch;

import java.util.Collection;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface Request {
	Collection<Task> getTasks();
}
