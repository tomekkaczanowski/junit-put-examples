package com.practicalunittesting.chp09.boilerplate;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@RunWith(MockitoJUnitRunner.class)
public class AnnotationsTest {

	@Mock
	private Collaborator collaborator;
	private SUT sut;

	@Before
	public void setup() {
		sut = new SUT();
		sut.setCollaborator(collaborator);
	}

	@Test
	public void shouldReturnABC() {
		when(collaborator.doSth()).thenReturn("abc");
		assertEquals("abc", sut.useCollaborator());
	}
}