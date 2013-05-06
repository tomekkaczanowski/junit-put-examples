package com.practicalunittesting.chp05.types;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface MailServer {
	void send(String email, String msgContent);
}
