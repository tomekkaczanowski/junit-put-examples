package com.practicalunittesting.chp09.boilerplate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class OneLinerStubbingTest {

	//Eclipse does not like this for whatever reason
	private Collaborator collaborator =
			when(mock(Collaborator.class).doSth())
					.thenReturn("abc").getMock();
	private SUT sut;

	@Before
	public void setup() {
		sut = new SUT();
		sut.setCollaborator(collaborator);
	}

	@Test
	public void shouldReturnABC() {
		assertEquals("abc", sut.useCollaborator());
	}
}
