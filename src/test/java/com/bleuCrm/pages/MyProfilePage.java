package com.bleuCrm.pages;

import com.bleuCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyProfilePage {

    public MyProfilePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (css = "div[id='profile-menu-filter']>a")
    public List<WebElement> mainMenuOptions;
}
