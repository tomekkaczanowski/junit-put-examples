package com.practicalunittesting.chp07.capturingarguments;

import org.junit.Test;

import java.util.Date;

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
		Meeting expectedMeeting = new Meeting(START_DATE, END_DATE);

		pim.addMeeting(START_DATE, ONE_HOUR);

		verify(calendar).addEvent(expectedMeeting);
	}
}

//    @Test(expectedExceptions = IllegalArgumentException.class)
//    public void shouldRejectOneHourMeetings() {
//        Meeting expectedMeeting = new Meeting(START_DATE, END_DATE);
//        doThrow(IllegalArgumentException.class).when(calendar).addEvent(expectedMeeting);
//        pim.addMeeting(START_DATE, ONE_HOUR);
//    }
