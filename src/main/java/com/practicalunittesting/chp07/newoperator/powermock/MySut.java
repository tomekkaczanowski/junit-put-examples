package com.practicalunittesting.chp07.newoperator.powermock;

import com.practicalunittesting.chp07.newoperator.MyCollaborator;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MySut {

	public boolean myMethod() {
		MyCollaborator collaborator = new MyCollaborator();
		if (collaborator.someMethod()) {
			return true;
		} else {
			return false;
		}
		// some behaviour worth testing here which uses collaborator
	}
}
