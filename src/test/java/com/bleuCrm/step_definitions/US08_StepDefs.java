package com.bleuCrm.step_definitions;

import com.bleuCrm.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US08_StepDefs {
HomePage homePage = new HomePage();
    @When("user clicks the Chat and Calls module")
    public void user_clicks_the_chat_and_calls_module() {
homePage.chatAndCalls.click();
    }

    @Then("verify the user sees the following options:")
    public void verify_the_user_sees_the_following_options(List<String> expectedOptions) {
       List<WebElement> chatAndCallsSubOptions = homePage.chatAndCallsOptions1;
List<String> actualOptions = new ArrayList<>();
        for (WebElement each : chatAndCallsSubOptions) {
            actualOptions.add(each.getAttribute("title").trim());
        }

       // System.out.println(actualOptions);

       // System.out.println(expectedOptions);


            Assert.assertEquals(expectedOptions,actualOptions);
        }

}
