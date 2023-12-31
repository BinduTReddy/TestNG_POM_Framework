package Page_Objects;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reusable_Methods.Generic_Methods;

public class Submit_CandidateandRequirement {

	WebDriver driver;
	Generic_Methods lib;

	@FindBy(xpath="//*[@id='AutoCompleteSearchClientName']")
	private WebElement clientName;

	@FindBy(xpath="//*[@id='AutoCompleteSearchReqTitle']")
	private WebElement ReqTitle;
	
	@FindBy(xpath="//*[@id='AutoCompleteClientReqNumber']")
	private WebElement Clientreq;

	@FindBy(xpath="/html/body/ul[3]/li[1]/a")
	private WebElement Reqtitleautopopup;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement Searchimg;

	@FindBy(xpath="//*[@id=\"grdRequirementSearchList\"]/table/tbody/tr[1]/td[6]")
	private WebElement clickTosub;

	@FindBy(xpath="//*[@id='CandidateSubmittedTo_RateSubmitted']")
	private WebElement SubmittedRate;
	
	@FindBy(xpath="//*[@id='CandidateSubmittedTo_ATSAssuredPayFrequencyID']")
	private WebElement NegPayType;

	@FindBy(xpath="//*[@id='CandidateSubmittedTo_ATSAssuredRate']")
	private WebElement NegotiatedRate;

	@FindBy(xpath="//*[@id='CandidateSubmittedTo_AssuredRateMax']")
	private WebElement NegotiatedRateMax;

	@FindBy(xpath="//*[@id='grdCandidatedoclstcpxPopDiv4']/table/tbody/tr/td[1]/a")
	private WebElement Viewbtn;
	
	@FindBy(xpath="//*[@id='grdCandidatedoclstcpxPopDiv3']/table/tbody/tr/td[1]/a")
	private WebElement Viewbtn1;

	@FindBy(xpath="//*[@id='ConversationTypeId']")
	private WebElement conType;

	@FindBy(xpath="//*[@id='Summary']")
	private WebElement Summary;

	@FindBy(xpath="//*[contains(text(),'Save') and @class='regular ImgbtnSave']")
	private WebElement SaveBtn;

	@FindBy(xpath="//button[contains(text(),'Close')]")
	private WebElement closebtn;

	public Submit_CandidateandRequirement(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Submit_Candidate(Map<String,String> hmap) throws InterruptedException {
		Thread.sleep(1000);
		clientName.sendKeys(hmap.get("Clientname"));
		clientName.sendKeys(Keys.TAB);
		Clientreq.sendKeys(hmap.get("ClientReqNo"));
		Clientreq.sendKeys(Keys.TAB);
		ReqTitle.sendKeys(hmap.get("RequirementTitle"));
		Thread.sleep(500);
		Reqtitleautopopup.click();
		Thread.sleep(1000);
		Searchimg.click();
		Thread.sleep(1000);
		clickTosub.click();
	}

	public void Submit_Requirement(Map<String,String> hmap) throws IOException, InterruptedException {
		Thread.sleep(2000);
		lib = new Generic_Methods(driver);	
		try {
			lib.waitForElementLoad(SubmittedRate);
			SubmittedRate.sendKeys(hmap.get("SubmittedBillRate"));
		}catch(TimeoutException e) {}
		
		try {
			lib.waitForElementLoad(NegPayType);
			lib.select(NegPayType,hmap.get("PayRateType"));
		}catch(TimeoutException e) {}
		
		NegotiatedRate.sendKeys(hmap.get("NegotiatedPayRate"));
		
		try {
			lib.waitForElementLoad(NegotiatedRateMax);
			NegotiatedRateMax.sendKeys(hmap.get("SubmittedBillRate"));
		}catch(TimeoutException e) {}
		
		driver.findElement(By.id("btnAddCandidateResume")).click();
		try {
			lib.waitForElementLoad(Viewbtn);
			Viewbtn.click();
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(Viewbtn1);
			Viewbtn1.click();
		}catch(TimeoutException e) {}		
		
		lib.select(conType,hmap.get("ConversationTopic"));
		Summary.sendKeys(hmap.get("Notes"));
		SaveBtn.click();
		Thread.sleep(2000);
		closebtn.click();
	}

}