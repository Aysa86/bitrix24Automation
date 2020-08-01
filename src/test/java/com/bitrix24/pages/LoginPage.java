package com.bitrix24.pages;

import com.bitrix24.utilities.ConfigurationReader;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    private final static Logger logger = Logger.getLogger(LoginPage.class);

    @FindBy(name = "User_Login")
    private WebElement email;

    @FindBy(name = "User_password")
    private WebElement password;

    public void login(){
     String userNameString = ConfigurationReader.getProperty("username");
     String passwordString = ConfigurationReader.getProperty("password");
     email.sendKeys(userNameString);
     password.sendKeys(passwordString, Keys.ENTER);
     logger.info("Login with "+userNameString+" username and "+passwordString+" password");
    }
}
