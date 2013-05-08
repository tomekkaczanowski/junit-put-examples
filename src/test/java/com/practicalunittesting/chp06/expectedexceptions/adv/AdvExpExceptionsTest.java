package com.practicalunittesting.chp06.expectedexceptions.adv;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static com.googlecode.catchexception.CatchException.catchException;
import static com.googlecode.catchexception.CatchException.caughtException;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.mock;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class AdvExpExceptionsTest {

	Request request;
	RequestProcessor requestProcessor;
	RequestHandler sut;

	@Before
	public void setUp() {
		request = createInvalidRequest();
		requestProcessor = mock(RequestProcessor.class);
		sut = new RequestHandler(requestProcessor);
	}

	@Test
	public void shouldNotProcessInvalidRequests() {
		Request request = createInvalidRequest();
		RequestProcessor requestProcessor = mock(RequestProcessor.class);

		RequestHandler sut = new RequestHandler(requestProcessor);

		try {
			sut.handle(request);
			fail("Should have thrown InvalidRequestException");
		} catch (InvalidRequestException e) {
			Mockito.verifyZeroInteractions(requestProcessor);
		}
	}

	@Test(expected = InvalidRequestException.class)
	public void shouldThrowExceptionForInvalidRequest() throws InvalidRequestException {
		sut.handle(request);
	}

	@Test
	public void shouldNotProcessInvalidRequest() {
		try {
			sut.handle(request);
		} catch (InvalidRequestException e) {
		}
		Mockito.verifyZeroInteractions(requestProcessor);
	}

	private Request createInvalidRequest() {
		return null;
	}

	@Test
	public void shouldThrowExceptions() throws InvalidRequestException {
		Request request = createInvalidRequest();
		RequestProcessor requestProcessor = mock(RequestProcessor.class);

		RequestHandler sut = new RequestHandler(requestProcessor);

		catchException(sut).handle(request);

		assertTrue("Should have thrown exception of InvalidRequestException class",
				caughtException() instanceof InvalidRequestException);

		Mockito.verifyZeroInteractions(requestProcessor);
	}

}
