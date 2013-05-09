package com.practicalunittesting.chp07.capturingarguments;

import java.util.Date;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Meeting implements Event {

	private final Date startDate;
	private final Date endDate;

	public Meeting(Date startDate, Date endDate) {
		this.startDate = new Date(startDate.getTime());
		this.endDate = new Date(endDate.getTime());
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Meeting meeting = (Meeting) o;

		if (endDate != null ? !endDate.equals(meeting.endDate) : meeting.endDate != null) return false;
		if (startDate != null ? !startDate.equals(meeting.startDate) : meeting.startDate != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = startDate != null ? startDate.hashCode() : 0;
		result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
		return result;
	}
}
