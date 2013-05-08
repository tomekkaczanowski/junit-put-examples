package com.practicalunittesting.chp06.threadsafe;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class JVMUniqueIdGenerator implements IdGenerator {

	private static final AtomicLong nextId = new AtomicLong(System
			.currentTimeMillis());

	public Long nextId() {
		return nextId.getAndIncrement();
	}
}
