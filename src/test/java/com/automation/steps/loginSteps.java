package com.automation.steps;

import com.automation.pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class loginSteps {
    loginPage loginPage= new loginPage();

    @Given("user open the website")
    public void user_open_the_website() {
        loginPage.openWebsite();
    }

    @Then("verify user is on login page")
    public void verify_user_is_on_login_page() {
        Assert.assertTrue(loginPage.isLoginPageDisplayed());

    }

    @When("user can login with username {string} and password {string}")
    public void user_can_login_with_username_and_password(String username, String password) {
        loginPage.doLogin(username,password);

    }




}
