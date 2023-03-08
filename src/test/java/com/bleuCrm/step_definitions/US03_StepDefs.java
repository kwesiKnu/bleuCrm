package com.bleuCrm.step_definitions;

import com.bleuCrm.pages.HomePage;
import com.bleuCrm.pages.LoginPage;
import com.bleuCrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US03_StepDefs {

    LoginPage login = new LoginPage();
    HomePage homePage = new HomePage();

    @Given("the user is on the homepage")
    public void the_users_are_on_the_homepage() {
        login.loginMethod("hr");

    }

    @When("user click the user profile name")
    public void user_click_the_user_profile_name() {

    }

    @When("user select the “Log Out” option")
    public void user_select_the_log_out_option() {
        homePage.logOutMeth();

    }

    @Then("verify the user back to the login page")
    public void verify_the_user_back_to_the_login_page() {
        String expectedInTitle = "Authorization";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }
}
