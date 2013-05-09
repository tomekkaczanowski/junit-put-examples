package com.practicalunittesting.chp09.creation;

import java.util.Date;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Position {

	private String title;
	private Date from;
	private Date to;

	public Position(String title, Date from, Date to) {
		this.title = title;
		this.from = from;
		this.to = to;
	}

	@Override
	public String toString() {
		return "Position{" +
				"title='" + title + '\'' +
				", from=" + from +
				", to=" + to +
				'}';
	}
}
