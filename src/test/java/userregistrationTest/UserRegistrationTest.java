package userregistrationTest;
import userregistration_main.UserRegistrationMain;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
	UserRegistrationMain u = new UserRegistrationMain();
	
	@Test
	public void checkFirstName_ifValid_returnTrue() {
		boolean result = u.validFirstName("Kumar");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void checkFirstName_ifInValid_returnFalse() {
		boolean result = u.validFirstName("kumar");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void checkLastName_ifValid_returnTrue() {
		boolean result = u.validLastName("Bamankar");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void checkLastName_ifInValid_returnFalse() {
		boolean result = u.validLastName("bamankar");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void checkEmailID_ifValid_returnTrue() {
		boolean result = u.validEmailid("kumarbamankar@gmail.com");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void checkEmailID_ifInValid_returnFalse() {
		boolean result = u.validEmailid("kumarbamankar@.com");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void checkPhnNumber_ifValid_returnTrue() {
		boolean result = u.validMobileNumber("91-9876543210");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void checkPhnNumber_ifInValid_returnFalse() {
		boolean result = u.validMobileNumber("91-9876");
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void checkPassword_ifValid_returnTrue() {
		boolean result = u.validPassword("Abcdef@123");
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void checkPassword_ifInValid_returnFalse() {
		boolean result = u.validPassword("abcdeg");
		Assert.assertEquals(false, result);
	}
	
}
