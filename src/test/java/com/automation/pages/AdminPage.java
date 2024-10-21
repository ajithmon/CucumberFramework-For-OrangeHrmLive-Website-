package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminPage extends BasePage{

    @FindBy(xpath = "//button[text()=' Add ']")
    WebElement addBtn;

    @FindBy(xpath = "//li/a//span[text()='Admin']")
    WebElement admin;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    WebElement nameInput;

    @FindBy(xpath = "//label[text()='Username']/../..//div/input")
    WebElement usernameInput;

    @FindBy(xpath = "//div/label[text()='Password']/../..//input[@type='password']")
    WebElement userPassword;

    @FindBy(xpath = "//label[text()='Confirm Password']/../..//div/input")
    WebElement confirmPassword;

    @FindBy(xpath = "//button[contains(@type,'submit')]")
    WebElement saveBtn;

    @FindBy(xpath = "//label[contains(text(),'Status')]/../..//div/i")
    WebElement userStatus;

    @FindBy(xpath = "//div/label[text()='User Role']/../..//div/i")
    WebElement userRole;

    @FindBy(xpath = "//span[text()='ESS']")
    WebElement essOption;

    @FindBy(xpath = "(//div[@class='oxd-autocomplete-option'])[1]")
    WebElement selectName;

    @FindBy(xpath = "//span[text()='Enabled']")
    WebElement status;

    @FindBy(xpath = "//p[text()='Successfully Saved']")
    WebElement successMessage;

    @FindBy(xpath = "(//button[@class='oxd-icon-button'])[2]")
    WebElement systemUserBtn;

    @FindBy(xpath = "//label[text()='Status']/../..//div/i")
    WebElement systemUserStatus;

    @FindBy(xpath = "//label[text()='Username']/../..//div/input")
    WebElement usernameVerify;

    @FindBy(xpath = "//label[text()='User Role']/../..//div/i")
    WebElement systemUserRole;

    @FindBy(xpath = "//button[text()=' Search ']")
    WebElement searchBtn;

    @FindBy(xpath = "//div[@class='oxd-table-row oxd-table-row--with-border']")
    List<WebElement> addedUsers;

    @FindBy(xpath = "//i[@class='oxd-icon bi-trash']")
    WebElement delete;

    @FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")
    WebElement clickYes;

    @FindBy(xpath = "//p[text()='Successfully Deleted']")
    WebElement deleteSuccess;

    public void clickOnAddBtn(){
        addBtn.click();
    }
    public void clickOnAdminBtn(){
        admin.click();
    }
    public boolean isAddButtonIsDisplayed(){
        return addBtn.isDisplayed();
    }
    public void fillUserDetails() throws InterruptedException {
        userRole.click();
        essOption.click();
        nameInput.sendKeys("a");
        Thread.sleep(3000);
        selectName.click();
        userStatus.click();
        status.click();
        usernameInput.sendKeys(ConfigReader.getConfigValue("fill.username"));
        userPassword.click();
        userPassword.sendKeys(ConfigReader.getConfigValue("fill.password"));
        confirmPassword.sendKeys(ConfigReader.getConfigValue("fill.confirmpassword"));
        confirmPassword.click();

    }

    public void clickOnSaveButton(){
        saveBtn.click();
    }

    public boolean isSuccessMessageDisplayed(){
        return successMessage.isDisplayed();
    }

    public boolean verifyAddedItemPresent(){
        int c=addedUsers.size();
        if(c>0){
            return true;
        }
        return  false;
    }

    public void clickOnSearchElement() {
        for(int i=0;i<2;i++) {
            systemUserBtn.click();
        }
    }

    public void searchElement() throws InterruptedException {
        usernameVerify.sendKeys(ConfigReader.getConfigValue("fill.username"));
        systemUserRole.click();
        essOption.click();
        nameInput.sendKeys("a");
        Thread.sleep(3000);
        selectName.click();
        systemUserStatus.click();
        status.click();
        searchBtn.click();
    }

    public void clickOnDeleteButton(){
        delete.click();
    }

    public void clickOnYesButton(){
        clickYes.click();
    }

    public boolean isDeleteSuccessMessagedisplayed(){
        return deleteSuccess.isDisplayed();
    }



}
