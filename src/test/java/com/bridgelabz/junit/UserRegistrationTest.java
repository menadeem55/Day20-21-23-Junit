package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;

public class UserRegistrationTest {
	@Test
	public void givenFirstName_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.firstNameValidate("Nadeem");
		Assert.assertTrue(result);
	}

	@Test
	public void givenFirstName_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.firstNameValidate("nadeem");
		Assert.assertFalse(result);
	}

	@Test
	public void givenLastName_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.lastNameValidate("Akhtar");
		Assert.assertTrue(result);
	}

	@Test
	public void givenLastName_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.lastNameValidate("akhtar");
		Assert.assertFalse(result);
	}

	@Test
	public void givenEmail_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.co.in");
		Assert.assertTrue(result);
	}

	@Test
	public void givenEmail_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.emailValidate("abc.xyz@bl.in");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPhone_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.phoneNumberValidate("91 8826923224");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPhone_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.phoneNumberValidate("1247852145");
		Assert.assertFalse(result);
	}

	@Test
	public void givenPassword_whenProper_ShouldReturnTrue() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.passwordValidate("Nadeem@1247");
		Assert.assertTrue(result);
	}

	@Test
	public void givenPassword_whenNotProper_ShouldReturnFalse() {
		UserRegistration userRegistrationRegEx = new UserRegistration();
		boolean result = userRegistrationRegEx.passwordValidate("nadeem@12");
		Assert.assertFalse(result);
	}
}
