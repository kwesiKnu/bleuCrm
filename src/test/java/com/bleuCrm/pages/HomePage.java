package com.bleuCrm.pages;

import com.bleuCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

   @FindBy (id = "user-name")
    public WebElement userProfile;

    @FindBy (xpath = "//span[.='Log out']")
    public WebElement logOut;

    @FindBy (xpath = "(//div[@class='b24-app-block-content'])[1]")
    public WebElement desktopClientOptions;

    @FindBy (xpath = "(//div[@class='b24-app-block-content'])[2]")
    public WebElement mobileApplicationOptions;


    public void logOutMeth(){
        userProfile.click();
        logOut.click();
    }

    public void desktopOptionsMeth(){
        String options = desktopClientOptions.getText();
        System.out.println(options);
    }
}
