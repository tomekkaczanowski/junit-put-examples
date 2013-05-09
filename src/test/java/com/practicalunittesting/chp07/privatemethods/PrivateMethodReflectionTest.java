package com.practicalunittesting.chp07.privatemethods;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertTrue;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class PrivateMethodReflectionTest {

	@Test
	public void testingPrivateMethodWithReflection()
			throws NoSuchMethodException, InvocationTargetException,
			IllegalAccessException {
		SomeClass sut = new SomeClass();

		Class[] parameterTypes = new Class[1];
		parameterTypes[0] = java.lang.Long.class;
		Method m = sut.getClass()
				.getDeclaredMethod("privateMethod", parameterTypes);
		m.setAccessible(true);

		Object[] parameters = new Object[1];
		parameters[0] = 5569L;

		Boolean result = (Boolean) m.invoke(sut, parameters);

		assertTrue(result);
	}
}