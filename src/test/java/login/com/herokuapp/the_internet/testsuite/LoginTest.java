package login.com.herokuapp.the_internet.testsuite;

import login.com.herokuapp.the_internet.pages.LoginPage;
import login.com.herokuapp.the_internet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {
    //create the logintest object
    LoginPage loginPage = new LoginPage();


    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){
        //Enter “tomsmith” username
        loginPage.enterUserName("tomsmith");
        // Enter “SuperSecretPassword! password
        loginPage.enterPassword("SuperSecretPassword!");
        //* Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        //* Verify the ‘Secure Area’ text is display
        //this os form requirement
        String expectedLogInText = "Secure Area";
        String actualLogInText = loginPage.getWelcomeMessage();
        Assert.assertEquals(expectedLogInText,actualLogInText,"text is not match");
    }

    @Test
    public void verifyTheUsernameErrorMessage(){
        //Enter “tomsmith1” username
        loginPage.enterUserName("tomsmith1");
        // Enter “SuperSecretPassword! password
        loginPage.enterPassword("SuperSecretPassword!");
        //* Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        //* Verify the ‘Your username is invalid!’ text is display
        //this os form requirement
        String expectedLogInText = "Your username is invalid!";
        String actualLogInText = loginPage.getErrorMessage();
        Assert.assertEquals(expectedLogInText,actualLogInText,"text is not match");
    }

    @Test
    public void verifyThePasswordErrorMessage(){
        //Enter “tomsmith1” username
        loginPage.enterUserName("tomsmith");
        // Enter “SuperSecretPassword password
        loginPage.enterPassword("SuperSecretPassword");
        //* Click on ‘LOGIN’ button
        loginPage.clickOnLoginButton();
        //* Verify the ‘Your username is invalid!’ text is display
        //this os form requirement
        String expectedLogInText = "Your username is invalid!";
        String actualLogInText = loginPage.getErrorMessage();
        Assert.assertEquals(expectedLogInText,actualLogInText,"text is not match");
    }


}
