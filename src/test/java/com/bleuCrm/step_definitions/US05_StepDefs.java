package com.bleuCrm.step_definitions;

import com.bleuCrm.pages.HomePage;
import com.bleuCrm.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

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
       String actualOptions = homePage.mobileApplicationOptions.getText();

        Assert.assertTrue(actualOptions.contains(expectedOptions.get(0)));
        Assert.assertTrue(actualOptions.contains(expectedOptions.get(1)));
    }

}
