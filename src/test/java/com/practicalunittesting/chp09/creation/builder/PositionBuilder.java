package com.practicalunittesting.chp09.creation.builder;

import com.practicalunittesting.chp09.creation.Position;

import java.util.Calendar;
import java.util.Date;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class PositionBuilder {

	private String title;
	private Date from;
	private Date to;

	public PositionBuilder withTitle(String title) {
		this.title = title;
		return this;
	}

	public PositionBuilder start(Date start) {
		this.from = start;
		return this;
	}

	public PositionBuilder end(Date end) {
		this.to = end;
		return this;
	}

	public PositionBuilder start(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day);
		this.from = cal.getTime();
		return this;
	}

	public PositionBuilder end(int year, int month, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month, day);
		this.to = cal.getTime();
		return this;
	}

	public Position build() {
		return new Position(title, from, to);
	}
}
