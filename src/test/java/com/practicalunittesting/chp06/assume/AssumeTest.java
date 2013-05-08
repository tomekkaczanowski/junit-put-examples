package com.practicalunittesting.chp06.assume;

import org.junit.Test;

import static org.junit.Assume.*;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class AssumeTest {

	@Test
	public void shouldRunOnlyOnWindows() {
		assumeTrue(thisIsAWindowsMachine());
		System.out.println("running on Windows!");
	}

	private boolean thisIsAWindowsMachine() {
		return System.getProperty("os.name").startsWith("Windows");
	}

	@Test
	public void shouldRunOnlyOnLinux() {
		assumeTrue(thisIsALinuxMachine());
		System.out.println("running on Linux!");
	}

	private boolean thisIsALinuxMachine() {
		return System.getProperty("os.name").startsWith("Linux");
	}
}
