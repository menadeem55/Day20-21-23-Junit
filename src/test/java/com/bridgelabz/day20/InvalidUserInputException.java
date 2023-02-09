package com.bridgelabz.day20;

import org.junit.Assert;
import org.junit.Test;

public class InvalidUserInputException extends Exception {
	@Test
	public void givenFirstName_whenProper_ShouldReturnTrue() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.firstNameValidate("Nadeem");
			Assert.assertTrue(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenFirstName_whenNotProper_ShouldReturnFalse() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.firstNameValidate("nadeem");
			Assert.assertFalse(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.lastNameValidate("Akhtar");
			Assert.assertTrue(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenLastName_whenNotProper_ShouldReturnFalse() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.lastNameValidate("akhtar");
			Assert.assertFalse(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenEmail_whenProper_ShouldReturnTrue() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
			Assert.assertTrue(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenEmail_whenNotProper_ShouldReturnFalse() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
			Assert.assertFalse(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenPhone_whenProper_ShouldReturnTrue() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.phoneNumberValidate("91 8826923224");
			Assert.assertTrue(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenPhone_whenNotProper_ShouldReturnFalse() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.phoneNumberValidate("8826923224");
			Assert.assertFalse(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenPassword_whenProper_ShouldReturnTrue() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.passwordValidate("Abc12345#");
			Assert.assertTrue(result);
		} catch (Exception e) {
		}
	}

	@Test
	public void givenPassword_whenNotProper_ShouldReturnFalse() {
		try {
			UserRegistration userRegistrationRegEx = new UserRegistration();
			boolean result = userRegistrationRegEx.passwordValidate("Nadeem3#%");
			Assert.assertFalse(result);
		} catch (Exception e) {
		}
	}
}
