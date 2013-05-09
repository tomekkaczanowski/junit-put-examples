package com.practicalunittesting.chp07.newoperator.partial;

import com.practicalunittesting.chp07.newoperator.MyCollaborator;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MyPartialSut {

	public boolean myMethod() {
		MyCollaborator collaborator = createCollaborator();
		if (collaborator.someMethod()) {
			return true;
		} else {
			return false;
		}
		// some behaviour worth testing here which uses collaborator
	}

	// method extracted to facilitate testing
	MyCollaborator createCollaborator() {
		return new MyCollaborator();
	}
}
