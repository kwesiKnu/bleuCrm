package com.bleuCrm.step_definitions;

import com.bleuCrm.pages.HomePage;
import com.bleuCrm.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class US04_StepDefs {
    LoginPage login = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("users are on the homepage")
    public void users_are_on_the_homepage() {
        login.loginMethod();
        // homePage.desktopOptionsMeth();
    }

    @Then("verify the users see flowing desktop options:")
    public void verify_the_users_see_flowing_desktop_options(List<String> expectedOptions) {
        String actualOptions = homePage.desktopClientOptions.getText();

        Assert.assertTrue(actualOptions.contains(expectedOptions.get(0)));
        Assert.assertTrue(actualOptions.contains(expectedOptions.get(1)));
        Assert.assertTrue(actualOptions.contains(expectedOptions.get(2)));

    }

}
