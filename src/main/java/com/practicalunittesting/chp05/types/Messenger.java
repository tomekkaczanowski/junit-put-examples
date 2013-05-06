package com.practicalunittesting.chp05.types;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Messenger {

	private TemplateEngine templateEngine;
	private MailServer mailServer;

	public Messenger(MailServer mailServer,
					 TemplateEngine templateEngine) {
		this.mailServer = mailServer;
		this.templateEngine = templateEngine;
	}

	public void sendMessage(Client client, Template template) {
		String msgContent =
				templateEngine.prepareMessage(template, client);
		mailServer.send(client.getEmail(), msgContent);
	}
}
