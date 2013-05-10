package com.practicalunittesting.chp11.refactoring;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
@RunWith(JUnitParamsRunner.class)
public class PermissionServiceTest {

	private PermissionService sut;

	public static Object[] userHasPermissions() {
		return $(
				$("user_1", Permission.READ),
				$("user_1", Permission.WRITE),
				$("user_1", Permission.REMOVE),
				$("user_2", Permission.WRITE),
				$("user_2", Permission.READ),
				$("user_3", Permission.READ)
		);
	}

	@Parameters(method = "userHasPermissions")
	@Test
	public void shouldReturnTrueIfUserHasPermission(String username, Permission permission) {
		assertTrue(sut.hasPermission(username, permission));
	}
}
