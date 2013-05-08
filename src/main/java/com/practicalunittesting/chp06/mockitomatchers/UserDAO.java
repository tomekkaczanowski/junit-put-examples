package com.practicalunittesting.chp06.mockitomatchers;

import java.util.Map;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface UserDAO {
    User getUser(long id);

    User getUserByProperties(Map<String, String> properties);
}
