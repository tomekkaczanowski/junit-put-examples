package com.practicalunittesting.chp07.capturingarguments.captor;

import com.practicalunittesting.chp07.capturingarguments.Calendar;
import com.practicalunittesting.chp07.capturingarguments.Meeting;
import com.practicalunittesting.chp07.capturingarguments.PIM;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class PIMTest {

	private static final int ONE_HOUR = 60;
	private static final Date START_DATE = new Date();
	private static final int MILLIS_IN_MINUTE = 1000 * 60;
	private static final Date END_DATE = new Date(START_DATE.getTime() + ONE_HOUR * MILLIS_IN_MINUTE);

	@Test
	public void shouldAddNewEventToCalendar() {
		Calendar calendar = mock(Calendar.class);
		PIM pim = new PIM(calendar);
		ArgumentCaptor<Meeting> argument = ArgumentCaptor.forClass(Meeting.class);

		pim.addMeeting(START_DATE, ONE_HOUR);

		verify(calendar).addEvent(argument.capture());
		Meeting meeting = argument.getValue();
		assertEquals(START_DATE, meeting.getStartDate());
		assertEquals(END_DATE, meeting.getEndDate());
	}
}
