package com.practicalunittesting.chp05.mockornot;

/**
 * Practical Unit Testing with JUnit and Mockito - source code for examples.
 * Visit http://practicalunittesting.com for more information.
 *
 * @author Tomek Kaczanowski
 */
public class Phone {
	private final boolean mobile;
	private final String number;

	public Phone(String number, boolean mobile) {
		this.number = number;
		this.mobile = mobile;
	}

	public boolean isMobile() {
		return mobile;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Phone phone = (Phone) o;

		if (mobile != phone.mobile) return false;
		if (number != null ? !number.equals(phone.number) : phone.number != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = (mobile ? 1 : 0);
		result = 31 * result + (number != null ? number.hashCode() : 0);
		return result;
	}
}
