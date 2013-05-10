package com.practicalunittesting.chp11.mutation;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class TwoIfs {

	public int twoIfs(int a, int b) {
		if (a > 0) {
			return 1;
		} else {
			System.out.println();
		}
		if (b > 0) {
			return 3;
		} else {
			return 4;
		}
	}
}
