package com.bleuCrm.step_definitions;

import com.bleuCrm.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US02_StepDefs {

    LoginPage login = new LoginPage();
    @Given("the user go to the login page")
    public void the_users_go_to_the_login_page() {

    }
    @Then("Verify there is a “Remember me on this computer” message displayed")
    public void verify_there_is_a_remember_me_on_this_computer_message_displayed() {
        Assert.assertTrue(login.rememberMeMsg.isDisplayed());

    }
    @Then("verify the check box is clickable")
    public void verify_the_check_box_is_clickable() {
        Assert.assertTrue(login.rememberMeOnThisComputerCheckBox.isEnabled());

    }

}
