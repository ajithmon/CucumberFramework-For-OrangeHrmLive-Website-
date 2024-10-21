package com.automation.steps;

import com.automation.pages.ApplicationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ApplicationSteps {

    ApplicationPage applicationPage = new ApplicationPage();

    @Then("verify user is on application page")
    public void verify_user_is_on_application_page() {
        Assert.assertTrue(applicationPage.isApplicationPageDisplayed());

    }

    @When("user click on profile button")
    public void user_click_on_profile_button() {
        applicationPage.clickOnProfileBtn();

    }

    @When("user click on logout button")
    public void user_click_on_logout_button() {
        applicationPage.clickOnLogoutBtn();

    }

}

