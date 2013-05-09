package com.practicalunittesting.chp07.setup;

import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class EachMethodTest {

	@Test
	public void testA() {
		Collaborator collaborator = mock(Collaborator.class);
		OtherCollaborator otherCollaborator = mock(OtherCollaborator.class);
		SUT sut = new SUT(collaborator, otherCollaborator);

		sut.someMethod();

		// assertions
	}

	@Test
	public void testB() {
		Collaborator collaborator = mock(Collaborator.class);
		OtherCollaborator otherCollaborator = mock(OtherCollaborator.class);
		SUT sut = new SUT(collaborator, otherCollaborator);

		sut.otherMethod();

		// assertions
	}
}
