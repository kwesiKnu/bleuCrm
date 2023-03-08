package com.bleuCrm.step_definitions;

import com.bleuCrm.pages.HomePage;
import com.bleuCrm.pages.MyDrivePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US10_StepDefs {

    HomePage homePage = new HomePage();
    MyDrivePage myDrivePage = new MyDrivePage();
    @When("user clicks the Drive module")
    public void user_clicks_the_drive_module() {
       homePage.driveModule.click();
    }
    @Then("verify the user sees following options:")
    public void verify_the_user_sees_following_options(List<String> expectedOptions) {
        List<WebElement> menu = myDrivePage.mainMenu;
        List<String> actualOptions = new ArrayList<>();

        for (WebElement each : menu) {
            actualOptions.add(each.getText());
        }
        Assert.assertEquals(expectedOptions,actualOptions);
    }

}
