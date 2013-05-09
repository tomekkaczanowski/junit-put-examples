package com.practicalunittesting.chp09.bdd;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;

public class BddMockitoTest {

	private static final int ID_USER = 329847;

	@Test
	public void shouldReturnClient() {
		// given
		User USER = new User();
		UserDAO dao = mock(UserDAO.class);
		UserService service = new UserService(dao);
		given(dao.getUser(ID_USER)).willReturn(USER);

		// when
		User user = service.loadUser(ID_USER);

		// then
		assertEquals(USER, user);
	}
}
