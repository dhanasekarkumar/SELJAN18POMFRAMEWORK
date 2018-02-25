package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyNameField;
	@Given("Enter the Company Name (.*)")
	public CreateLeadPage enterCompanyName(String data) {
		type(eleCompanyNameField, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstNameField;
	@Given("Enter the First Name of the User (.*)")
	public CreateLeadPage enterFirstName(String data) {
		type(eleFirstNameField, data);
		return this;		
	}	

	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastNameField;
	@Given("Enter the Last Name of the User (.*)")
	public CreateLeadPage enterLastName(String data) {
		type(eleLastNameField, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmailField;
	@Given("Enter the Email of the User (.*)")
	public CreateLeadPage enterEmail(String data) {
		type(eleEmailField, data);
		return this;		
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement eleMobileNumber;
	@Given("Enter the MobileNumber of the User (.*)")
	public CreateLeadPage enterMobileNumber(String data) {
		type(eleMobileNumber, data);
		return this;		
	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadSubmit;
	@Given("click on Create Lead Button")
	public ViewLeadsPage clickOnCreateLeadSubmit() {
		click(eleCreateLeadSubmit);
		return new ViewLeadsPage();		
	}
}
