package com.practicalunittesting.chp07.newoperator.original;

import com.practicalunittesting.chp07.newoperator.MyCollaborator;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MySut {

	public void myMethod() {
		MyCollaborator collaborator = new MyCollaborator();
		// some behaviour worth testing here which uses collaborator
	}
}
