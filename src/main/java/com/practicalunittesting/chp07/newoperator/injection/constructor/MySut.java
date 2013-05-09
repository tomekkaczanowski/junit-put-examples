package com.practicalunittesting.chp07.newoperator.injection.constructor;

import com.practicalunittesting.chp07.newoperator.MyCollaborator;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MySut {

	private final MyCollaborator collab;

	public MySut(MyCollaborator collab) {
		this.collab = collab;
	}

	public void myMethod() {
		// some behaviour worth testing here which uses collaborator
	}
}
