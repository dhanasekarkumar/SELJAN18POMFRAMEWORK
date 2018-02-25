package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_Create_Lead_POMFrameWork extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC002_Create_Lead_POMFrameWork";
		testDescription="Creating the lead information";
		testNodes="Leads";
		category="Smoke";
		authors="Dhana";
		browserName="chrome";
		dataSheetName="TC002-Create";
	}

	@Test(dataProvider="fetchData")
	public void performCreate(String uName,String pwd,String companyName,String fname,String lName,String email, String mobile) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickOnCRMSFALink()
		.clickOnLeadsLink()
		.clickOnCreateLeadLink()
		.enterCompanyName(companyName)
		.enterFirstName(fname)
		.enterLastName(lName)
		.enterEmail(email)
		.enterMobileNumber(mobile)
		.clickOnCreateLeadSubmit()
		.verifyCompanyName(companyName);
		
		}

}
