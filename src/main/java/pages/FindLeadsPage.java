package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	List<String> windowList = null;
	public FindLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	public FindLeadsPage(List<String> windowListTemp) {
		this.windowList = windowListTemp;
		System.out.println(" windowList size " + this.windowList.size());
		System.out.println(" windowListTemp size " + windowListTemp.size());
		
	}
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstNameField;

	@FindBy(how=How.XPATH,using="//input[@name='id']")
	private WebElement eleLeadIDField;

	public FindLeadsPage enterLeadID(String data) {
		type(eleLeadIDField, data);
		return this;		
	}
	
	public FindLeadsPage enterFirstName(String data) {
		type(eleFirstNameField, data);
		return this;		
	}

	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement eleFindLeadsButton;

	public FindLeadsPage clickOnFindLeadsButton() {
		click(eleFindLeadsButton);
		return this;		
	}

	@FindBy(how=How.XPATH,using="//table[@class='x-grid3-row-table']/tbody/tr/td/div[1]/a")
	private WebElement eleFirstResultElement;

	public ViewLeadsPage clickOnFirstResultElement() {
		click(eleFirstResultElement);
		return new ViewLeadsPage();		
	}

	@FindBy(how=How.XPATH,using="//table[@class='x-grid3-row-table']/tbody/tr/td/div[1]/a")
	private WebElement eleFirstResultElementForMergeLeads;

	public MergeLeadsPage clickOn1stResultElement() throws InterruptedException {
		clickWithNoSnap(eleFirstResultElementForMergeLeads);
		switchToWindow(windowList.get(0));
		Thread.sleep(5000);
		return new MergeLeadsPage();		
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Phone']")
	private WebElement elePhoneTab;

	public FindLeadsPage clickOnPhoneTab() {
		click(elePhoneTab);
		return this;		
	}
	
	@FindBy(how=How.XPATH,using="//ul[@class='x-tab-strip x-tab-strip-top']/li[3]")
	private WebElement eleEmailTab;

	public FindLeadsPage clickOnEmailTab() {
		click(eleEmailTab);
		return this;		
	}

	@FindBy(how=How.XPATH,using="//input[@name='phoneNumber']")
	private WebElement elePhoneField;

	public FindLeadsPage enterPhoneNumber(String data) throws InterruptedException {
		Thread.sleep(3000);
		type(elePhoneField,data);
		return this;		
	}

	@FindBy(how=How.NAME,using="emailAddress")
	private WebElement eleEmailField;

	public FindLeadsPage enterEmail(String data) throws InterruptedException {
		Thread.sleep(3000);
		type(eleEmailField,data);
		return this;		
	}
	
	@FindBy(how=How.CLASS_NAME,using="x-paging-info")
	private WebElement eleResults;

	public FindLeadsPage verifyResultPage(String data) {
		verifyPartialText(eleResults, data);
		return this;		
	}	
}
