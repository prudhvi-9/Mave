package testMain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	
	
	
	public static boolean isValidFirstName(String string) {
		/*
		 * Creating Regex to check valid FirstName.
		 */
		String regex = "^[A-Z]\\w{3,20}$";

		/*
		 * To Compile the Regex.
		 */
		Pattern pattern = Pattern.compile(regex);

		/*
		 * If the FirstName is empty,return false
		 */

		if (string == null) {
			return false;
		}

		/*
		 * To find matching between given FirstName and regular expression.
		 */

		Matcher match = pattern.matcher(string);

		/*
		 * Return if the FirstName matched the ReGex.
		 */

		return match.matches();
	}

	public static boolean isValidLastName(String string) {
		/*
		 * Regex to check valid LastName.
		 */
		String regex = "^[A-Z]\\w{3,20}$";

		/*
		 * To compile the ReGex.
		 */
		Pattern pattern = Pattern.compile(regex);

		/*
		 * If the LastName is empty, return false.
		 */

		if (string == null) {
			return false;
		}

		/*
		 * To find matching between given LastName and regular expression.
		 */

		Matcher match = pattern.matcher(string);

		/*
		 * Return if the LastName matched the ReGex.
		 */

		return match.matches();
	}

	public static boolean isemail(String string) {
		/*
		 * Regex to check valid email .
		 */
		String regex = "[a-zA-Z0-9_.]*[-]*[+]*[a-zA-Z0-9]*@[a-zA-Z0-9]+([.][a-zA-Z]{2,}[,.a-z]+)+";

		/*
		 * To compile the Regex.
		 */
		Pattern p = Pattern.compile(regex);

		/*
		 * If the email is empty,return false.
		 */

		if (string == null) {
			return false;
		}

		/*
		 * To find matching between given email and regular expression.
		 */

		Matcher m = p.matcher(string);

		/*
		 * Return if the email matched the Regex.
		 */

		return m.matches();
	}

	public static boolean isPhoneNumber(String string) {
		/*
		 * Regex to check valid PhoneNumber.
		 */
		String regex = "91\\s[0-9]{10}";

		/*
		 * To compile the ReGex.
		 */
		Pattern p = Pattern.compile(regex);

		/*
		 * If thePhoneNumber is empty,return false.
		 */

		if (string == null) {
			return false;
		}

		/*
		 * To find matching between given PhoneNumber and regular expression.
		 */

		Matcher m = p.matcher(string);

		/*
		 * Return if the PhoneNumber matched the Regex.
		 */

		return m.matches();
	}

	public static boolean isPassword(String string) {
		/*
		 * Regex to check valid Password .
		 */
		String regex = "[[A-Z]+[a-z]+[@#!$%^&*?|]{1}[0-9]+]{8,}";

		/*
		 * To compile the Regex.
		 */
		Pattern p = Pattern.compile(regex);

		/*
		 * If the Password is empty,return false.
		 */

		if (string == null) {
			return false;
		}

		/*
		 * To find matching between given Password and regular expression.
		 */

		Matcher m = p.matcher(string);

		/*
		 * Return if the Password matched the Regex.
		 */

		return m.matches();
	}

}
