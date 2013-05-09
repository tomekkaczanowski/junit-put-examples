package com.practicalunittesting.chp09.boilerplate;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
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
public class InjectMocksTest {

	@Mock
	private Collaborator collaborator;

	@InjectMocks
	private SUT sut = new SUT();

	@Test
	public void shouldReturnABC() {
		when(collaborator.doSth()).thenReturn("abc");
		assertEquals("abc", sut.useCollaborator());
	}
}
