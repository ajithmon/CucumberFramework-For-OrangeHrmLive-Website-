package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RecruitmentPage extends BasePage {
    AdminPage adminPage=new AdminPage();

    @FindBy(xpath = "//li/a//span[text()='Recruitment']")
    WebElement recruitment;

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='middleName']")
    WebElement middleName;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastName;

    @FindBy(xpath = "//div[contains(text(),'-- Select --')]/..//div/i")
    WebElement vacancy;

    @FindBy(xpath = "//div[contains(@role,'listbox')]//div/span[text()='Junior Account Assistant']")
    WebElement vacancyName;

    @FindBy(xpath = "//label[contains(text(),'Email')]/../../div/input")
    WebElement Email;

    @FindBy(xpath = "//input[@type='file']")
    WebElement Browse;

    public void clickOnRecruitmentLink(){
        recruitment.click();
    }

    public void filluserDetails(){
        firstName.sendKeys(ConfigReader.getConfigValue("candidate.firstname"));
        lastName.sendKeys(ConfigReader.getConfigValue("candidate.lastname"));
        vacancy.click();
        vacancyName.click();
        Email.sendKeys(ConfigReader.getConfigValue("candidate.email"));
        System.out.println(System.getProperty("user.dir"));
        Browse.sendKeys(System.getProperty("user.dir")+"\\src\\test\\resources\\data\\resume.docx");
    }

    public void searchByname(){
        recruitment.click();
        adminPage.nameInput.sendKeys(ConfigReader.getConfigValue("candidate.firstname"));
        adminPage.selectName.click();
        adminPage.searchBtn.click();
    }


}
