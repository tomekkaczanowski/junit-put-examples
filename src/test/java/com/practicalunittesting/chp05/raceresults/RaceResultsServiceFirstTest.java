package com.practicalunittesting.chp05.raceresults;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class RaceResultsServiceFirstTest {

	@Test
	public void subscribedClientShouldReceiveMessage() {
		RaceResultsService raceResults = new RaceResultsService();
		Client client = mock(Client.class);
		Message message = mock(Message.class);

		raceResults.addSubscriber(client);
		raceResults.send(message);

		verify(client).receive(message);
	}
}
