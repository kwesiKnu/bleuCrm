package com.bleuCrm.step_definitions;

import com.bleuCrm.pages.HomePage;
import com.bleuCrm.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US05_StepDefs {
    LoginPage login = new LoginPage();
    HomePage homePage = new HomePage();
    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        login.loginMethod();

    }
    @Then("verify the user can see following mobile app options:")
    public void verify_the_user_can_see_following_mobile_app_options(List<String> expectedOptions) {
       List<WebElement> options = homePage.mobileApplicationOptions;
       List<String> actualOptions = new ArrayList<>();

        for (WebElement each : options) {
            actualOptions.add(each.getText());
        }

            Assert.assertEquals(expectedOptions,actualOptions);


    }

}
