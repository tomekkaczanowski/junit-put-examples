package com.practicalunittesting.chp05.raceresults;

import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class RaceResultsServiceTest {

	private RaceResultsService raceResults = new RaceResultsService();
	private Client clientA = mock(Client.class, "clientA");
	private Client clientB = mock(Client.class, "clientB");
	private Message message = mock(Message.class);

	@Test
	public void messageShouldBeSentToAllSubscribedClients() {
		raceResults.send(message);
		verify(clientA, never()).receive(message);
		verify(clientB, never()).receive(message);

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

	@Test
	public void notSubscribedClientShouldNotReceiveMessage() {
		raceResults.send(message);
		//verify(clientA, never()).receive(message);
		verify(clientA).receive(message);
		verify(clientB, never()).receive(message);
	}

	@Test
	public void shouldSendOnlyOneMessageToMultiSubscriber() {
		raceResults.addSubscriber(clientA);
		raceResults.addSubscriber(clientA);
		raceResults.send(message);
		//verify(clientA, times(1)).receive(message); // same as below - times(1) is the default
		verify(clientA).receive(message);
	}

	@Test
	public void unsubscribedClientShouldNotReceiveMessages() {
		raceResults.addSubscriber(clientA);
		raceResults.removeSubscriber(clientA);
		raceResults.send(message);
		verify(clientA, never()).receive(message);
	}
}




















