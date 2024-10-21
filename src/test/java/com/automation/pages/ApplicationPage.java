package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ApplicationPage extends BasePage{
     @FindBy(xpath = "//span[@class='oxd-userdropdown-tab']")
     WebElement profile;

     @FindBy(xpath = "//a[text()='Logout']")
     WebElement logoutBtn;

     public boolean isApplicationPageDisplayed(){
         return profile.isDisplayed();
     }

     public void clickOnProfileBtn(){
         profile.click();
     }

     public void clickOnLogoutBtn(){
         logoutBtn.click();
     }


}
