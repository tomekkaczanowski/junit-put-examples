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
public class RaceResultsServiceFirstAndSecondRefactoredTest {

	private RaceResultsService raceResults = new RaceResultsService();
	private Message message = mock(Message.class);
	private Client clientA = mock(Client.class, "clientA");
	private Client clientB = mock(Client.class, "clientB");

	@Test
	public void subscribedClientShouldReceiveMessage() {
		raceResults.addSubscriber(clientA);
		raceResults.send(message);

		verify(clientA).receive(message);
	}

	@Test
	public void allSubscribedClientsShouldReceiveMessages() {
		raceResults.addSubscriber(clientA);
		raceResults.addSubscriber(clientB);
		raceResults.send(message);

		verify(clientA).receive(message);
		verify(clientB).receive(message);
	}
}
