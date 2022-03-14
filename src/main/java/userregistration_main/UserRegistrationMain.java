package userregistration_main;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationMain {
public static Scanner sc = new Scanner(System.in);
	
   /*
    * @purpose: As a User need to enter a valid First Name. First name starts with
    * Cap and has minimum 3 characters
    * 
    * @param: firstName
    * 
    * @function: To check first name is Valid or not
    * 
    * @returns true or false
    */
	public boolean validFirstName(String name) {
		
		String condition = "[A-Z]{1}[a-z]+";
		Pattern p = Pattern.compile(condition);
		Matcher m = p.matcher(name);
		return m.matches();
	}
	
	/*
	 * @purpose: As a User need to enter a valid last Name. Last name starts with
	 * Cap and has minimum 3 characters
	 * 
	 * @param: lastName
	 * 
	 * @function: To check last name is Valid or not
	 * 
	 * @returns true or false
	 */
    public boolean validLastName(String lastName) {
		
		String condition = "[A-Z]{1}[a-z]+";
		Pattern p = Pattern.compile(condition);
		Matcher m = p.matcher(lastName);
		return m.matches();
		
	}
    
    /*
	 * @purpose: As a User need to enter a valid email E.g. abc.xyz@bl.co.in - Email
	 * has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in) with precise @
	 * and . positions
	 * 
	 * @param: email
	 * 
	 * @function: To check email is Valid or not
	 * 
	 * @returns true or false
	 */
    public boolean validEmailid(String email) {
    	
		String condition = "[A-z a-z 0-9 + -]+([.]{1}[a-z 0-9]+)*[@][a-z 0-9]{1,5}([.][a-z]{2,3})+([. a-z]{2,3})?";
		Pattern p = Pattern.compile(condition);
		Matcher m = p.matcher(email);
		return m.matches();
    }
    
    /*
	 * @purpose: As a User need to follow pre defined Mobile Format - E.g. 91
	 * 9919819801 - Country code follow by space and 10 digit number
	 * 
	 * @param: mobileNumber
	 * 
	 * @function: To check mobile Number is Valid or not
	 * 
	 * @returns true or false
	 */
    public boolean validMobileNumber(String number) {
    	
    	String condition = "[0-9]{2}[-][0-9]{10}";
    	Pattern p = Pattern.compile(condition);
    	Matcher m = p.matcher(number);
    	return m.matches();
    }
    
    /*
	 * @purpose: As a User need to follow pre-defined Password rules.
	 * NOTE – All rules must be passed
	 * 
	 * @param: password
	 * 
	 * @function: To check password is Valid or not
	 * 
	 * @returns true or false
	 */
    public boolean validPassword(String password) {
    	
    	String condition = "(?=.*[A-Z])(?=.*[0-9])(?=.*[~!@#$%^&*_<>/',.])[a-z A-Z 0-9 ~!@#$%^&*_<>/',.]{8,}";
    	Pattern p = Pattern.compile(condition);
    	Matcher m = p.matcher(password);
    	return m.matches();
    	
    }
}
