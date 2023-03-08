package com.bleuCrm.step_definitions;

import com.bleuCrm.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class US06_StepDefs {
    HomePage homePage = new HomePage();


    @When("user click the profile name")
    public void user_click_the_profile_name() {
       homePage.userProfile.click();

    }
    @Then("verify the user sees following  options:")
    public void verify_the_user_sees_following_options(List<String> expectedOptions) {
        String actualOptions = homePage.userProfileOptions.getText();
        System.out.println(actualOptions);
        System.out.println(expectedOptions);

       for(int i = 0; i<expectedOptions.size();i++){
            Assert.assertTrue(actualOptions.contains(expectedOptions.get(i)));
       }

    }
}
