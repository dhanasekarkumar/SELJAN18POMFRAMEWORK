package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadPage extends ProjectMethods{
	
	public DuplicateLeadPage() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyNameField;

	public DuplicateLeadPage enterCompanyName(String data) {
		type(eleCompanyNameField, data);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstNameField;

	public DuplicateLeadPage enterFirstName(String data) {
		type(eleFirstNameField, data);
		return this;		
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastNameField;

	public DuplicateLeadPage enterLastName(String data) {
		type(eleLastNameField, data);
		return this;		
	}	
	
	@FindBy(how=How.ID,using="createLeadForm_primaryEmail")
	private WebElement eleEmailField;

	public DuplicateLeadPage enterEmail(String data) {
		type(eleEmailField, data);
		return this;		
	}
	@FindBy(how=How.ID,using="createLeadForm_primaryPhoneNumber")
	private WebElement eleMobileNumber;

	public DuplicateLeadPage enterMobileNumber(String data) {
		type(eleMobileNumber, data);
		return this;		
	}

	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadButtonInDuplicateLeadPage;

	public ViewLeadsPage clickOnCreateLeadButton() {
		click(eleCreateLeadButtonInDuplicateLeadPage);
		return new ViewLeadsPage();		
	}
}
