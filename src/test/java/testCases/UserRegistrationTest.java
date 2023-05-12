package testCases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import testMain.UserRegistration;

public class UserRegistrationTest {
	UserRegistration user = new UserRegistration();

	@Test
	public void isValidFirstName() {
		System.out.println("Happy Test Case:\nisValidFirstName");
		boolean actualOutput = user.isValidFirstName("Kiran");
		assertTrue(actualOutput);
	}

	@Test
	public void isValidFirstName1() {
		System.out.println("Sad Test Case:\nisValidFirstName1");
		boolean actualOutput = user.isValidFirstName("nick");
		assertFalse(actualOutput);
	}

	@Test
	public void isemail() {
		System.out.println("Happy Test Case:\nisemail");
		boolean actualOutput = user.isemail("abc.xyz@bl.co.in");
		assertTrue(actualOutput);
	}

	@Test
	public void isemail1() {
		System.out.println("Sad Test Case:\nisemail");
		boolean actualOutput = user.isemail("ab.xy@ll.do");
		assertFalse(actualOutput);
	}

	@Test
	public void isValidLastName() {
		System.out.println("Happy Test Case:\nisValidLastName");
		boolean actualOutput = user.isValidLastName("Kiran");
		assertTrue(actualOutput);
	}

	@Test
	public void isValidLastName1() {
		System.out.println("Sad Test Case:\nisValidLastName1");
		boolean actualOutput = user.isValidLastName("nick");
		assertFalse(actualOutput);
	}

	@Test
	public void isPhoneNumber() {
		System.out.println("Happy Test Case:\nisPhoneNumber");
		boolean actualOutput = user.isPhoneNumber("919898984353");
		assertTrue(actualOutput);
	}

	@Test
	public void isPhoneNumber1() {
		System.out.println("Sad Test Case:\nisPhoneNumber1");
		boolean actualOutput = user.isPhoneNumber("91 9898984444");
		assertFalse(actualOutput);
	}

	@Test
	public void isPassword() {
		System.out.println("Happy Test Case:\nisPassword");
		boolean actualOutput = user.isPassword("Ravitej$89");
		assertTrue(actualOutput);
	}

	@Test
	public void isPassword1() {
		System.out.println("Sad Test Case:\nisPassword1");
		boolean actualOutput = user.isPassword("ravi");
		assertFalse(actualOutput);
	}

}
