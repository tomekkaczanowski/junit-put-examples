package com.practicalunittesting.chp11.code_coverage.coveragetypes.line;

import com.practicalunittesting.chp11.code_coverage.coveragetypes.MyClass;
import org.junit.Test;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class LineCoverageTest {

	//@Test
//    public void shouldGetFullLineCoverage() {
//        MyClass sut = new MyClass();
//        sut.foo(1,1);
//    }

	@Test
	public void shouldGetFullLineCoverage() {
		MyClass sut = new MyClass();
		sut.bar(true, true);
	}
}
