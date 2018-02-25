package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_Edit_Lead_POMFrameWork extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_Edit_Lead_POMFrameWork";
		testDescription="Editing the existing lead information";
		testNodes="Leads";
		category="Smoke";
		authors="Dhana";
		browserName="chrome";
		dataSheetName="TC003-Edit";
	}



	@Test(dataProvider="fetchData")
	public void performEdit(String uName,String pwd,String oldCompanyName,String NewCompanyName,String fName) {

		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickOnCRMSFALink()
		.clickOnLeadsLink()
		.clickOnFindLeadsLink()
		.enterFirstName(fName)
		.clickOnFindLeadsButton()
		.clickOnFirstResultElement()
		.clickOnEditButton()
		.enterCompanyNameField(NewCompanyName)
		.clickOnUpdateButton()
		.verifyCompanyName(NewCompanyName);		
	}

}
