package com.bleuCrm.step_definitions;

import com.bleuCrm.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US07_StepDefs {
HomePage homepage = new HomePage();
    @When("users click the MORE tab")
    public void users_click_the_more_tab() {
homepage.moreTab.click();
    }
    @Then("verify the users see following options:")
    public void verify_the_users_see_following_options(List<String> expectedOptions) {
        String actualOptions = homepage.moreTabOptions.getText();


       for(int i = 0; i < expectedOptions.size(); i++){
           Assert.assertTrue(actualOptions.contains(expectedOptions.get(i)));}

    }
}
