package com.bleuCrm.step_definitions;

import com.bleuCrm.pages.HomePage;
import com.bleuCrm.pages.MyProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US09_StepDefs {
    HomePage homePage = new HomePage();
    MyProfilePage myProfilePage = new MyProfilePage();
    @When("user click the user profile")
    public void user_click_the_user_profile() {
        homePage.userProfile.click();
        homePage.myProfile.click();

    }
    @Then("verify the user see following options:")
    public void verify_the_user_see_following_options(List<String> expectedOptions) {
        List<WebElement> menu = myProfilePage.mainMenuOptions;
        List<String> actualOptions = new ArrayList<>();

        for (WebElement each : menu) {
            actualOptions.add(each.getText());
        }

        Assert.assertEquals(expectedOptions,actualOptions);

    }
}
