package com.practicalunittesting.chp11.code_coverage.coveragetypes.branch;

import com.practicalunittesting.chp11.code_coverage.coveragetypes.MyClass;
import org.junit.Test;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class BranchCoverageTest {

	/*@Test
	public void shouldGetFullBranchCoverage() {
		MyClass sut = new MyClass();
        sut.foo(1,1);
        sut.foo(0,1);
        sut.foo(1,0);
        sut.foo(0,0);
    }*/

	@Test
	public void shouldGetFullBranchCoverage() {
		MyClass sut = new MyClass();
		sut.bar(true, false);
		sut.bar(false, true);
		sut.bar(true, true);
		//sut.bar(false, false);
	}

}
