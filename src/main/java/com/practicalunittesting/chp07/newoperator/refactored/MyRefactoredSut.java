package com.practicalunittesting.chp07.newoperator.refactored;

import com.practicalunittesting.chp07.newoperator.MyCollaborator;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MyRefactoredSut {

	public boolean myMethod() {
		MyCollaborator collaborator = createCollaborator();
		// some behaviour worth testing here which uses collaborator
		if (collaborator.someMethod()) {
			return true;
		} else {
			return false;
		}
		// some behaviour worth testing here which uses collaborator
	}

	// method extracted to facilitate testing
	protected MyCollaborator createCollaborator() {
		return new MyCollaborator();
	}
}
