package com.practicalunittesting.chp07.newoperator.original;

import com.practicalunittesting.chp07.newoperator.MyCollaborator;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MySutTest {

	@Test
	public void testMyMethod() {
		MySut sut = new MySut();
		MyCollaborator collaborator = mock(MyCollaborator.class);
		// make sut use collaborator <3>

		// set expectations regarding collaborator's behaviour
		// execute sut's method(s)
		// verify results and/or collaborator's behaviour
	}
}
