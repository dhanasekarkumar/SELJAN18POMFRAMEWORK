package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadsLink;
	
	public FindLeadsPage clickOnFindLeadsLink() {
		click(eleFindLeadsLink);
		return new FindLeadsPage();		
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLeadsLink;
	@Given("click Create Lead")
	public CreateLeadPage clickOnCreateLeadLink() {
		click(eleCreateLeadsLink);
		return new CreateLeadPage();		
	}

	@FindBy(how=How.LINK_TEXT,using="Merge Leads")
	private WebElement eleMergeLeadsLink;
	
	public MergeLeadsPage clickOnMergeLeadsLink() {
		click(eleMergeLeadsLink);
		return new MergeLeadsPage();		
	}
	
}
