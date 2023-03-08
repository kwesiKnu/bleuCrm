package com.bleuCrm.pages;


import com.bleuCrm.utilities.ConfigurationReader;
import com.bleuCrm.utilities.Driver;
import com.bleuCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement userName;


    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement logInBtn;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeOnThisComputerCheckBox;

    @FindBy(className = "login-item-checkbox-label")
    public WebElement rememberMeMsg;


    public void loginMethod() {
        userName.sendKeys(ConfigurationReader.getProperty("helpDesk_username"));
        password.sendKeys(ConfigurationReader.getProperty("helpDesk_password"));
        logInBtn.click();

    }

    public void loginMethod(String userType) {
        //based on input enter that user information
        //String username =null;
        //String password =null;

        if(userType.equalsIgnoreCase("hr")){
            userName.sendKeys(ConfigurationReader.getProperty("hr_username"));
            password.sendKeys(ConfigurationReader.getProperty("hr_password"));
            logInBtn.click();
        }else if(userType.equalsIgnoreCase("helpDesk")){
            userName.sendKeys(ConfigurationReader.getProperty("helpDesk_username"));
            password.sendKeys(ConfigurationReader.getProperty("helpDesk_password"));
            logInBtn.click();
        }else if(userType.equalsIgnoreCase("marketing")){
            userName.sendKeys(ConfigurationReader.getProperty("marketing_username"));
            password.sendKeys(ConfigurationReader.getProperty("marketing_password"));
            logInBtn.click();
        }
        //send username and password and login
        //new LoginPage().login(username,password);
    }

        //new LoginPage().login(username,password);



}