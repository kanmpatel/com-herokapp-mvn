package login.com.herokuapp.the_internet.pages;

import login.com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.xpath("//button[@class='radius']");
    By welcomeLoginText = By.tagName("h2");
    By getErrorMessage = By.cssSelector("div#flash");

    public void enterUserName(String userName){

        sendTextToElement(userNameField,userName);
    }

    public void enterPassword(String password){

        sendTextToElement(passwordField,password);
    }

    public void clickOnLoginButton(){

        clickOnElement(loginButton);
    }
    public String getWelcomeMessage(){

        return getTextFromElement(welcomeLoginText);
    }

    public String getErrorMessage(){

        return getTextFromElement(getErrorMessage);
    }



}
