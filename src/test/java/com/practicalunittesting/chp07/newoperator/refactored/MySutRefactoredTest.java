package com.practicalunittesting.chp07.newoperator.refactored;

import com.practicalunittesting.chp07.newoperator.MyCollaborator;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MySutRefactoredTest {

	private MyCollaborator collaborator;

	class MyRefactoredSutSubclassed extends MyRefactoredSut {
		@Override
		protected MyCollaborator createCollaborator() {
			return collaborator;
		}
	}

	@Test
	public void testMyMethod() {
		MyRefactoredSut sut = new MyRefactoredSutSubclassed();
		collaborator = mock(MyCollaborator.class);

		when(collaborator.someMethod()).thenReturn(true);
		assertTrue(sut.myMethod());
	}
}
