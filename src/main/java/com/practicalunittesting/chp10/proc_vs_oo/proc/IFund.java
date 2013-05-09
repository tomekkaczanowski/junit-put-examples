package com.practicalunittesting.chp10.proc_vs_oo.proc;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public interface IFund {

	ICurrentValue getCurrentValue();

	IRegister getRegisterX();

	IRegister getRegisterY();

}