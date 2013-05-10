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
public class PermissionServiceBetterTest {

	private static final String ADMIN = "admin";
	private static final String LOGGED = "logged";
	private static final String GUEST = "guest";

	private PermissionService sut;

	public static Object[] usersPermissions() {
		return $(
				$(ADMIN, Permission.READ),
				$(ADMIN, Permission.WRITE),
				$(ADMIN, Permission.REMOVE),
				$(LOGGED, Permission.WRITE),
				$(LOGGED, Permission.READ),
				$(GUEST, Permission.READ)
		);
	}

	@Parameters(method = "usersPermissions")
	@Test
	public void shouldReturnTrueIfUserHasPermission(String username, Permission permission) {
		assertTrue(sut.hasPermission(username, permission));
	}
}
