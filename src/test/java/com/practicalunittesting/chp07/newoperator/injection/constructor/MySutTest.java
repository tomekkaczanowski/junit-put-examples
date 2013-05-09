package com.practicalunittesting.chp07.newoperator.injection.constructor;

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
		MyCollaborator collaborator = mock(MyCollaborator.class);
		MySut sut = new MySut(collaborator);

		// normal Mockito stubbing/test spying test
	}
}
