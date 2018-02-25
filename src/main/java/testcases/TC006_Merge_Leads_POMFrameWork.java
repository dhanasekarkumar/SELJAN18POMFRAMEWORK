package testcases;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC006_Merge_Leads_POMFrameWork extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC006_Merge_Leads_POMFrameWork";
		testDescription="Duplicating the lead information";
		testNodes="Leads";
		category="Smoke";
		authors="Dhana";
		browserName="firefox";
		dataSheetName="TC006_Merge_Lead";
	}



	@Test(dataProvider="fetchData")
	public void performMergeLeads(String uName,String pwd,String fromLeadID, String toLeadID) throws InterruptedException {
		System.out.println(fromLeadID +toLeadID);
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.clickOnCRMSFALink()
		.clickOnLeadsLink()
		.clickOnMergeLeadsLink()
		.clickOnFromLeadLink()
		.enterLeadID(fromLeadID)
		.clickOnFindLeadsButton()
		.clickOn1stResultElement()
		.clickOnToLeadLink()
		.enterLeadID(toLeadID)
		.clickOnFindLeadsButton()
		.clickOn1stResultElement();
		}
}
