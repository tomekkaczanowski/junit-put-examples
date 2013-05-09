package com.practicalunittesting.chp07.newoperator.injection.method;

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

		sut.myMethod(collaborator);

		// normal Mockito stubbing/test spying test
	}
}
