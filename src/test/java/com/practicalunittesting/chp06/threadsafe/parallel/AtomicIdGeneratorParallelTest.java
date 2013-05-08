package com.practicalunittesting.chp06.threadsafe.parallel;

import com.google.code.tempusfugit.concurrency.ConcurrentRule;
import com.google.code.tempusfugit.concurrency.RepeatingRule;
import com.google.code.tempusfugit.concurrency.annotations.Concurrent;
import com.google.code.tempusfugit.concurrency.annotations.Repeating;
import com.practicalunittesting.chp06.threadsafe.AtomicIdGenerator;
import com.practicalunittesting.chp06.threadsafe.IdGenerator;
import org.junit.Rule;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class AtomicIdGeneratorParallelTest {

	@Rule public ConcurrentRule concurrently = new ConcurrentRule();
	@Rule public RepeatingRule repeatedly = new RepeatingRule();

	private IdGenerator idGen = new AtomicIdGenerator();
	private Set<Long> ids = new HashSet<Long>(100);

	// sometimes will pass, sometimes will fail
	@Test
	@Concurrent(count = 7)
	@Repeating(repetition = 100)
	public void idsShouldBeUnique() {
		assertTrue(ids.add(idGen.nextId()));
	}
}
