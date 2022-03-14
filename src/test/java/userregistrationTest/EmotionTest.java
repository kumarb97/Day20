package userregistrationTest;
import userregistration_main.EmotionCheck;
import org.junit.Test;
import org.junit.Assert;

/**
 *  This class tests the emotion if it is  happy or sad.
 *
 */
public class EmotionTest {
	EmotionCheck emotion = new EmotionCheck();

	/**
	 * we created this test case to check if the user is happy.
	 * If it is happy then it will be true
	 */
    @Test
    public void givenMessage_WhenHappy_ReturnEntrySuccessful() {
        String actualResult = emotion.analyseEmotion("User is Happy");
        Assert.assertEquals("Entry Successful", actualResult);
    }

    /**
	 * we created this test case to check if the user is sad.
	 */
    @Test
    public void givenMessage_WhenNotProper_ReturnEntryFailed() {
        String actualResult = emotion.analyseEmotion("User is Sad");
        Assert.assertEquals("Entry Failed", actualResult);
    }

}
