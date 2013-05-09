package com.practicalunittesting.chp09.boilerplate;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class BoilerplateCodeTest {

	private Collaborator collaborator;
	private SUT sut;

	@Before
	public void setUp() {
		sut = new SUT();
		collaborator = Mockito.mock(Collaborator.class);
		sut.setCollaborator(collaborator);
		when(collaborator.doSth()).thenReturn("abc");
	}

	@Test
	public void shouldReturnABC() {
		assertEquals("abc", sut.useCollaborator());
	}
}
