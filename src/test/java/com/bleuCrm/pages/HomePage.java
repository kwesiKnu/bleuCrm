package com.bleuCrm.pages;

import com.bleuCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
    public WebElement userProfile;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logOut;

    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[1]")
    public WebElement desktopClientOptions;

    @FindBy(xpath = "(//div[@class='b24-app-block-content'])[2]")
    public WebElement mobileApplicationOptions;


    @FindBy(xpath = "//div[@class='menu-popup-items']")
    public WebElement userProfileOptions;

    @FindBy (id = "feed-add-post-form-link-text")
    public WebElement moreTab;

    @FindBy (xpath = "//div[@class='menu-popup-items']")
    public WebElement moreTabOptions;

    @FindBy (xpath = "//a[@title='Chat and Calls']")
    public WebElement chatAndCalls;

    @FindBy (xpath = "//div[@class='bx-desktop-appearance-tab']")
    public WebElement chatAndCallsOptions;

    @FindBy (xpath = "(//div[@class='bx-desktop-appearance-tab']/div)")
    public List<WebElement> chatAndCallsOptions1;

    public void logOutMeth() {
        userProfile.click();
        logOut.click();
    }

   // @FindBy (xpath = "//div[@title='Settings']")
   // public WebElement msgs;

    /*
    public void desktopOptionsMeth(){
        String options = desktopClientOptions.getText();
        System.out.println(options);
    }

     */
/*
    public void userNameOptionsMeth() {
        userProfile.click();
        String usOptions = userNameOptions.getText();
        System.out.println(usOptions);
    }

 */

}
