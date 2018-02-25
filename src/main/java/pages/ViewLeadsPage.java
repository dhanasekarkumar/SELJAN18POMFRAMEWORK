package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods{

	public ViewLeadsPage() {
		PageFactory.initElements(driver,this);
	}	

	@FindBy(how=How.XPATH,using="//a[text()='Edit']")
	private WebElement eleEditButton;

	public ViewLeadsPage clickOnEditButton() {
		click(eleEditButton);
		return new ViewLeadsPage();	
	}	

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompanyNameField;

	public ViewLeadsPage enterCompanyNameField(String data) {
		type(eleCompanyNameField, data);
		return this;	
	}	

	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleUpdateButton;

	public ViewLeadsPage clickOnUpdateButton() {
		click(eleUpdateButton);
		return this;	
	}

	@FindBy(how=How.XPATH,using="//span[@id='viewLead_companyName_sp']")
	private WebElement eleCompanyNameValue;

	public ViewLeadsPage verifyCompanyName(String data) {
		verifyPartialText(eleCompanyNameValue, data);
		return this;	
	}

	@FindBy(how=How.XPATH,using="//span[@id='viewLead_firstName_sp']")
	private WebElement eleFirstNameValue;
	@Given("Verify the first name of the create Lead (.*)")
	public ViewLeadsPage verifyLeadCreated(String data) {
		verifyPartialText(eleFirstNameValue, data);
		return this;	
	}	
	@FindBy(how=How.XPATH,using="//a[text()='Delete']")
	private WebElement eleDeleteButton;

	public MyLeadsPage clickOnDeleteButton() {
		click(eleDeleteButton);
		return new MyLeadsPage();	
	}	

	@FindBy(how=How.LINK_TEXT,using="Duplicate Lead")
	private WebElement eleDuplicateButton;

	public DuplicateLeadPage clickOnDuplicateLeadButton() {
		click(eleDuplicateButton);
		return new DuplicateLeadPage();	
	}
	
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadsLink;
	
	public FindLeadsPage clickOnFindLeadsLink() {
		click(eleFindLeadsLink);
		return new FindLeadsPage();		
	}
}
