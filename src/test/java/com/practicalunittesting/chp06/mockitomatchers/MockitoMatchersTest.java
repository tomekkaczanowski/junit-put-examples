package com.practicalunittesting.chp06.mockitomatchers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MockitoMatchersTest {

	@Test
    public void useOfMatchers() {
        UserDAO userDAO = mock(UserDAO.class);
        User user = new User();
        when(userDAO.getUser(anyInt())).thenReturn(user);

        assertEquals(user, userDAO.getUser(1));
        assertEquals(user, userDAO.getUser(2));
        assertEquals(user, userDAO.getUser(3));
        
        verify(userDAO, times(3)).getUser(anyInt());
    }
}
