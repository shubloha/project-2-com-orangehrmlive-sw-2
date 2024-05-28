package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
        @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        //click on the ‘Forgot your password’ link
        driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")).click();
        //Verify the text ‘Reset Password’
           String resetPassword =  driver.findElement(By.xpath("//button[@type='submit']")).getText();
           Assert.assertEquals("Reset Password",resetPassword);

    }
    //    @After
//    public void tearDown() {
//        closeBrowser();
//    }

}
