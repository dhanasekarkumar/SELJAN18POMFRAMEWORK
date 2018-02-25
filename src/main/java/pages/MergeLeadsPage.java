package pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{
	String fromLead, toLead;
	public MergeLeadsPage() {
		PageFactory.initElements(driver,this);
	}	
	List<String> windowList = null;
	
	@FindBy(how=How.XPATH,using="//div[@class='subSectionBlock']/form/table/tbody/tr[1]/td[2]/a")
	private WebElement eleFromLeadSearch;
	
	public FindLeadsPage clickOnFromLeadLink() throws InterruptedException {
		clickWithNoSnap(eleFromLeadSearch);
		Thread.sleep(5000);
		windowList = windowHandler();
		System.out.println(" windowList size " + windowList.size());
		switchToWindow(windowList.get(1));
		return new FindLeadsPage(windowList);		
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='subSectionBlock']/form/table/tbody/tr[2]/td[2]/a")
	private WebElement eleToLeadSearch;
	
	public FindLeadsPage clickOnToLeadLink() throws InterruptedException {
		clickWithNoSnap(eleToLeadSearch);
		Thread.sleep(5000);
		windowList = windowHandler();
		switchToWindow(windowList.get(1));
		return new FindLeadsPage(windowList);		
	}
	@FindBy(how=How.XPATH,using="buttonDangerous")
	private WebElement eleButtonToMerge;
	
	public ViewLeadsPage clickOnButtonToMerge() throws InterruptedException {
		clickWithNoSnap(eleButtonToMerge);
		Thread.sleep(3000);
		Alert myAlert = switchToAlert();
		Thread.sleep(2000);
		acceptAlert(myAlert);
		return new ViewLeadsPage();		
	}
}
