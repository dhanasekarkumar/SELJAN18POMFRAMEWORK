package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC005_Duplicate_Lead_POMFrameWork extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC005_Duplicate_Lead_POMFrameWork";
		testDescription="Duplicating the lead information";
		testNodes="Leads";
		category="Smoke";
		authors="Dhana";
		browserName="chrome";
		dataSheetName="TC005-Duplicate";
	}



	@Test(dataProvider="fetchData")
	public void performDuplicate(String uName,String pwd,String email, String resultPageText) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickOnCRMSFALink()
		.clickOnLeadsLink()
		.clickOnFindLeadsLink()
		.clickOnEmailTab()
		.enterEmail(email)
		.clickOnFindLeadsButton()
		.clickOnFirstResultElement()
		.clickOnDuplicateLeadButton()
		.clickOnCreateLeadButton()
		.clickOnFindLeadsLink()
		.clickOnEmailTab()
		.enterEmail(email)
		.clickOnFindLeadsButton()
		.verifyResultPage(resultPageText);
		}
}
