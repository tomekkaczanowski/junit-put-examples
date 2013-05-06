package com.practicalunittesting.chp05.raceresults;

import java.util.Collection;
import java.util.HashSet;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class RaceResultsService {

	private Collection<Client> clients = new HashSet<Client>();

	public void addSubscriber(Client client) {
		clients.add(client);
	}

	public void send(Message message) {
		for (Client client : clients) {
			client.receive(message);
		}
	}

	public void removeSubscriber(Client client) {
		clients.remove(client);
	}
}
