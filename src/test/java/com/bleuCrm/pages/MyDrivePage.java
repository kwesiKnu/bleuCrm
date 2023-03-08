package com.bleuCrm.pages;

import com.bleuCrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MyDrivePage {

    public MyDrivePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div[id='top_menu_id_docs']>div")
    public List<WebElement> mainMenu;
}
