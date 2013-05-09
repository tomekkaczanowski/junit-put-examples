package com.practicalunittesting.chp07.setup;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class SetUpTest {

	private Collaborator collaborator;
	private OtherCollaborator otherCollaborator;
	private SUT sut;

	@Before
	public void setUp() {
		collaborator = mock(Collaborator.class);
		otherCollaborator = mock(OtherCollaborator.class);
		sut = new SUT(collaborator, otherCollaborator);

	}
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
