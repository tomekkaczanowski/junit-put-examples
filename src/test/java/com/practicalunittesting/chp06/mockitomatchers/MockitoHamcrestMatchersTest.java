package com.practicalunittesting.chp06.mockitomatchers;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.hasEntry;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.argThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MockitoHamcrestMatchersTest {

	@Test
    public void useOfHamcrestMatchers() {
        User user = new User();
        UserDAO userDAO = mock(UserDAO.class);

        when(userDAO.getUserByProperties((Map<String, String>)
				argThat(hasEntry("id", "2")))).thenReturn(user);

        assertNull(userDAO.getUserByProperties(new HashMap<String, String>()));

        Map<String, String> properties = new HashMap<String, String>();
        properties.put("id", "2");

        assertEquals(user, userDAO.getUserByProperties(properties));
    }
}
