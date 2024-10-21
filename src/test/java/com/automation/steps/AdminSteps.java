package com.automation.steps;

import com.automation.pages.AdminPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AdminSteps {
    AdminPage adminpage = new AdminPage();

    @And("user fill the user details")
    public void userFillTheUserDetails() throws InterruptedException {
        adminpage.fillUserDetails();

    }

    @When("user click on add button")
    public void userClickOnAddButton() {
        adminpage.clickOnAddBtn();
    }

    @Then("verify add button is present")
    public void verifyAddButtonIsPresent() {
        adminpage.isAddButtonIsDisplayed();
    }

    @When("user click on admin link")
    public void userClickOnAdminLink() {
        adminpage.clickOnAdminBtn();
    }

    @Then("verify success message displayed")
    public void verifySuccessMessageDisplayed() {
        Assert.assertTrue(adminpage.isSuccessMessageDisplayed());
    }

    @When("user fill search list")
    public void userFillSearchList() throws InterruptedException {
        adminpage.searchElement();

    }

    @Then("verify added item is present in search list")
    public void verifyAddedItemIsPresentInSearchList() {
        Assert.assertTrue(adminpage.verifyAddedItemPresent());
    }

    @When("user click on delete button on added item")
    public void userClickOnDeleteButtonOnAddedItem() {
        adminpage.clickOnDeleteButton();
    }

    @And("user click on confirmation message")
    public void userClickOnConfirmationMessage() {
        adminpage.clickOnYesButton();
    }

    @Then("Verify delete success message displayed")
    public void verifyDeleteSuccessMessageDisplayed() {
        Assert.assertTrue(adminpage.isDeleteSuccessMessagedisplayed());
    }

    @When("user click on search user button")
    public void userClickOnSearchUserButton() {
        adminpage.clickOnSearchElement();
    }

    @And("user click on save button")
    public void userClickOnSaveButton() {
        adminpage.clickOnSaveButton();
    }
}

