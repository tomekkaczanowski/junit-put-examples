package com.practicalunittesting.chp07.setup;

import org.junit.Test;

import java.util.Calendar;

import static org.mockito.Mockito.mock;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class DeclarationTest {

	private Collaborator collaborator = mock(Collaborator.class);
	private OtherCollaborator otherCollaborator = mock(OtherCollaborator.class);
	private SUT sut = new SUT(collaborator, otherCollaborator);

	@Test
	public void testA() {
		sut.someMethod();

		// assertions
	}

	@Test
	public void testB() {
		sut.otherMethod();

		// assertions
	}
}
