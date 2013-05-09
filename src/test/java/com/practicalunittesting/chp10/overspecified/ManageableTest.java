package com.practicalunittesting.chp10.overspecified;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class ManageableTest {

	private Validator validator;
	private Dao dao;
	private Service sut;

	@Before
	public void setUp() {
		validator = new Validator();
		dao = mock(Dao.class);
		sut = new Service(dao, validator);
	}

	@Test
	public void testAll() {
		Object result = sut.duSomething();
		assertNull(result);
		verify(dao).load();
	}

	@Test
	public void testFetchingFromDao() {
		sut.duSomething();
		verify(dao).load();
	}

	@Test
	public void testReturnedValue() {
		Object result = sut.duSomething();
		assertNull(result);
	}

	private class Service {
		private Dao dao;
		private Validator validator;

		public Service(Dao dao, Validator validator) {
			this.dao = dao;
			this.validator = validator;
		}

		public Object duSomething() {
			dao.load();
			return new Object();
		}
	}

	private class Validator {
	}

	private class Dao {
		public Void load() {
			return null;  //To change body of created methods use File | Settings | File Templates.
		}
	}
}
