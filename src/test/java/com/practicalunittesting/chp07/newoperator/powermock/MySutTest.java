package com.practicalunittesting.chp07.newoperator.powermock;

import com.practicalunittesting.chp07.newoperator.MyCollaborator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@PrepareForTest(MySut.class)
@RunWith(PowerMockRunner.class)
public class MySutTest {

	@Test
	public void testMyMethod() throws Exception {
		MySut sut = new MySut();
		MyCollaborator collaborator = mock(MyCollaborator.class);

		PowerMockito.whenNew(MyCollaborator.class).withNoArguments().thenReturn(collaborator);
		when(collaborator.someMethod()).thenReturn(true);

		assertTrue(sut.myMethod());
	}
}
