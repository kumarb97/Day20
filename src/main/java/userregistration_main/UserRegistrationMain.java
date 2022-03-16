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
    * @param: name
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
	
	/**
	 *  In this method we will check for exception for the first name.
	 *  If the first name is valid then it will print valid.
	 *  If the first name is Invalid then it will throw the exception and print the message.
	 * @param firstName - We will pass the first name to this method.
	 * @return - The method will compute and return a boolean value true if correct pattern.
	 * @throws InputInvalidException - We will throw the custom exception.  
	 */
	public boolean testFirstName(String firstName) throws InputInvalidException {
        try {
            if (!validFirstName(firstName)) {
                throw new InputInvalidException("Entered FirstName is Invalid\n" +
                        "First name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered FirstName is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred " + e);
            e.printStackTrace();
        }
        return validFirstName(firstName);
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
    
    public boolean testLastName(String lastName) throws InputInvalidException {
        try {
            if (!validLastName(lastName)) {
                throw new InputInvalidException("Entered LastName is Invalid\n" +
                        "Last name starts with Capital Letter and has\n" +
                        "minimum 3 characters");
            } else {
                System.out.println("Entered LastName is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
            e.printStackTrace();
        }
        return validLastName(lastName);
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
    	
		String condition = "[A-z a-z 0-9 + -]+([.]{1}[a-z 0-9]+)*[@][a-z 0-9]{1,5}([.][a-z]{2,3})+([. a-z]{2})?";
		Pattern p = Pattern.compile(condition);
		Matcher m = p.matcher(email);
		return m.matches();
    }
    
    public boolean testEmailId(String emailId) throws InputInvalidException {
        try {
            if (!validEmailid(emailId)) {
                throw new InputInvalidException("Entered EmailId is Invalid");
            } else {
                System.out.println("Entered EmailId is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return validEmailid(emailId);
    }
    
    /*
	 * @purpose: As a User need to follow pre defined Mobile Format - E.g. 91
	 * 9919819801 - Country code follow by space and 10 digit number
	 * 
	 * @param: number
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
    
    public boolean testMobileNumber(String mobileNumber) throws InputInvalidException {
        try {
            if (!validMobileNumber(mobileNumber)) {
                throw new InputInvalidException("Entered MobileNumber is Invalid\n" +
                        "Mobile Number Must Contain Country Code");
            } else {
                System.out.println("Entered MobileNumber is Valid\n");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return validMobileNumber(mobileNumber);
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
    
    public boolean testPassword(String password) throws InputInvalidException {
        try {
            if (!validPassword(password)) {
                throw new InputInvalidException("Entered Password is Invalid\n" +
                        "Password Must Contain at least\n" +
                        "one Uppercase, one Numeric, one Special Char\n" +
                        "and minimum 8 Characters ");
            } else {
                System.out.println("Entered Password is Valid");
            }
        } catch (InputInvalidException e) {
            System.out.println("Exception is Occurred" + e);
        }
        return validPassword(password);
    }
}
