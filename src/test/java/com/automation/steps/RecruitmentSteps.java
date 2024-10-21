package com.automation.steps;

import com.automation.pages.RecruitmentPage;
import io.cucumber.java.en.When;

public class RecruitmentSteps {
    RecruitmentPage recruitmentPage=new RecruitmentPage();

    @When("user click on recruitment link")
    public void userClickOnRecruitmentLink() {
        recruitmentPage.clickOnRecruitmentLink();
    }

    @When("user fill candidate details")
    public void userFillCandidateDetails() {
        recruitmentPage.filluserDetails();
    }

    @When("user search the candidate name")
    public void userSearchTheCandidateName() {
        recruitmentPage.searchByname();
    }
}
