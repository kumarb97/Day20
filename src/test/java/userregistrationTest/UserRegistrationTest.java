package userregistrationTest;
import userregistration_main.UserRegistrationMain;
import userregistration_main.InputInvalidException;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistrationMain u = new UserRegistrationMain();
	
	/**
	 * In this test case we will pass the first name and use the assert method to check if the test result is true.
	 * @throws InputInvalidException - We will throw the custom exception. 
	 */
	@Test
    public void firstName() throws InputInvalidException {
        String firstName = "Kumar";
        Assert.assertTrue(u.testFirstName(firstName));
    }

	/**
	 * In this test case we will pass the last name and use the assert method to check if the test result is true.
	 * @throws InputInvalidException - We will throw the custom exception. 
	 */
    @Test
    public void lastName() throws InputInvalidException {
        String lastName = "Bamankar";
        Assert.assertTrue(u.testLastName(lastName));
    }
    
    /**
	 * In this test case we will pass the emailid and use the assert method to check if the test result is true.
	 * @throws InputInvalidException - We will throw the custom exception. 
	 */
    @Test
    public void emailId() throws InputInvalidException {
        String emailId = "kumar.bamankar97@gmail.com";
        Assert.assertTrue(u.testEmailId(emailId));
    }
    
    /**
	 * In this test case we will pass the mobile number and use the assert method to check if the test result is true.
	 * @throws InputInvalidException - We will throw the custom exception. 
	 */
    @Test
    public void mobileNumber() throws InputInvalidException {
        String mobileNumber = "91-9604073955";
        Assert.assertTrue(u.testMobileNumber(mobileNumber));
    }

    /**
	 * In this test case we will pass the password and use the assert method to check if the test result is true.
	 * @throws InputInvalidException - We will throw the custom exception. 
	 */
    @Test
    public void password() throws InputInvalidException{
        String password = "Sratyu@19";
        Assert.assertTrue(u.testPassword(password));
    }
	
}
