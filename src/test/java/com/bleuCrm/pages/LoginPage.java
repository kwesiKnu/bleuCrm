package com.bleuCrm.pages;


import com.bleuCrm.utilities.ConfigurationReader;
import com.bleuCrm.utilities.Driver;
import com.bleuCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name="USER_LOGIN")
    public WebElement userName;


    @FindBy(name="USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement logInBtn;

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberMeOnThisComputerCheckBox;

    @FindBy(className = "login-item-checkbox-label")
    public WebElement rememberMeMsg;


    public void loginMethod() {
        userName.sendKeys(ConfigurationReader.getProperty("hr_username"));
        password.sendKeys(ConfigurationReader.getProperty("hr_password"));
        logInBtn.click();
        // verification that we logged
    }



}
