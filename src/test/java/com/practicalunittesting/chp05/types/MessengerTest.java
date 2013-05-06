package com.practicalunittesting.chp05.types;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class MessengerTest {

	private static final String CLIENT_EMAIL = "some@email.com";
	private static final String MSG_CONTENT = "Dear John! You are fired.";

	@Test
	public void shouldSendEmail() {
		Template template = mock(Template.class);
		Client client = mock(Client.class);
		MailServer mailServer = mock(MailServer.class);
		TemplateEngine templateEngine = mock(TemplateEngine.class);

		Messenger sut = new Messenger(mailServer, templateEngine);

		when(client.getEmail()).thenReturn(CLIENT_EMAIL);
		when(templateEngine.prepareMessage(template, client))
				.thenReturn(MSG_CONTENT);

		sut.sendMessage(client, template);

		verify(mailServer).send(CLIENT_EMAIL, MSG_CONTENT);
	}
}

