package com.practicalunittesting.chp07.newoperator.partial;

import com.practicalunittesting.chp07.newoperator.MyCollaborator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MySutPartialTest {

	@Test
	public void testMyMethod() {
		MyPartialSut sut = spy(new MyPartialSut());
		MyCollaborator collaborator = mock(MyCollaborator.class);

		doReturn(collaborator).when(sut).createCollaborator();
		//when(sut.createCollaborator()).thenReturn(collaborator);
		// normal Mockito stubbing/test spying test
		when(collaborator.someMethod()).thenReturn(true);

		assertTrue(sut.myMethod());
	}
}
