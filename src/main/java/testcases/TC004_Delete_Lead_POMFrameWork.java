package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_Delete_Lead_POMFrameWork extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC004_Delete_Lead_POMFrameWork";
		testDescription="Editing the existing lead information";
		testNodes="Leads";
		category="Smoke";
		authors="Dhana";
		browserName="chrome";
		dataSheetName="TC004-Delete";
	}



	@Test(dataProvider="fetchData")
	public void performDelete(String uName,String pwd,String mobile, String resultPageText) throws InterruptedException {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickOnCRMSFALink()
		.clickOnLeadsLink()
		.clickOnFindLeadsLink()
		.clickOnPhoneTab()
		.enterPhoneNumber(mobile)
		.clickOnFindLeadsButton()
		.clickOnFirstResultElement()
		.clickOnDeleteButton()
		.clickOnFindLeadsLink()
		.clickOnPhoneTab()
		.enterPhoneNumber(mobile)
		.clickOnFindLeadsButton()
		.verifyResultPage(resultPageText);		
	}
}
