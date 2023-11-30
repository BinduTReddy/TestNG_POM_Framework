package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class Submit_NewCandidate {
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath="//a[@class='t-icon t-plus']")
	private WebElement clickonicon;

	@FindBy(xpath = "(//td[@style='width:6%']//a)[1]")
	private WebElement clickonid;

	@FindBy(xpath="//span[contains(text(),'Submit a New Candidate')]")
	private WebElement subnewcand;

	@FindBy(xpath="//*[@id='Candidate_Contact_FirstName']")
	private WebElement FirstName;

	@FindBy(xpath="//*[@id='Candidate_Contact_LastName']")
	private WebElement LastName;

	@FindBy(xpath="//*[@id='Candidate_Contact_EmailID']")
	private WebElement Emailid;

	@FindBy(xpath="//*[@id='Candidate_Contact_Mobile']")
	private WebElement MobileNo;

	@FindBy(xpath="//*[@id='Candidate_Contact_Address1']")
	private WebElement Address;

	@FindBy(xpath="//*[@id='Candidate_Contact_City']")
	private WebElement City;

	@FindBy(xpath="//*[@id='Candidate_Contact_StateID']")
	private WebElement state;

	@FindBy(xpath="//*[@id='Candidate_Contact_ZipCode']")
	private WebElement pincode;

	@FindBy(xpath="//*[@id='Candidate_Contact_CountryID']")
	private WebElement country;

	@FindBy(xpath="//*[@class='t-button t-upload-button']")
	private WebElement Resumefile;

	@FindBy(xpath="//*[@id='CandidateResume_ResumeText']")
	private WebElement ResText;

	@FindBy(xpath="//*[@id='Candidate_JobPortalID']")
	private WebElement ResSource;

	@FindBy(xpath="//*[@id='Candidate_EducationID']")
	private WebElement Education;

	@FindBy(xpath="//*[@id='Candidate_TotalExperience']")
	private WebElement TotalExperience;

	@FindBy(xpath="//*[@id='btnCandSaveAndSubmit']")
	private WebElement savesubmit;

	@FindBy(xpath="//*[@id='AadharNumber']")
	private WebElement AadharNumber;

	@FindBy(xpath="//*[@id='DOB']")
	private WebElement DOB;

	@FindBy(xpath="//*[@id='SubmissionPSN_SubmissionDate']")
	private WebElement Subdate;

	@FindBy(xpath="//*[@id='SubmissionPSN_OfferReceivedOn']")
	private WebElement offerRecDate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_EndDate']")
	private WebElement EndDate;

	@FindBy(xpath="//*[@id='SubmissionPSN_RecruiterID']")
	private WebElement PSNRecID;

	@FindBy(xpath="//*[@id='SubmissionPSN_ReportingManagerID']")
	private WebElement ReportingManager;

	@FindBy(xpath="//*[@id='SubmissionPSN_TeamLeadID']")
	private WebElement PSNTeamID;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_CategoryID']")
	private WebElement EmpType;

	@FindBy(xpath="//*[@id='SubmissionPSN_OBClassificationID']")
	private WebElement ObJobClassification;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_ShiftScheduleID']")
	private WebElement shift;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_ProbationPeriodID']")
	private WebElement ProbationPeriod;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_NoticePeriod']")
	private WebElement NoticePeriod;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PayrateTypeID']")
	private WebElement PayRateID;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_BufferDuration']")
	private WebElement BufferDuration;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PRCurrencyID']")
	private WebElement PayCurrency;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PayRate']")
	private WebElement payRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OTPayRate']")
	private WebElement OtPayRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_BRCurrencyID']")
	private WebElement BillCurrency;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_BillrateTypeID']")
	private WebElement BillRateID;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_Billrate' and @type='text']")
	private WebElement Billrate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OTBillrate']")
	private WebElement OtBillRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PayJoiningID']")
	private WebElement PayJoiningList;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_TravelBonus']")
	private WebElement JoiningBonus;

	@FindBy(xpath="//*[@id='SubmissionPSN_IsUnderBond']")
	private WebElement IsUnderBond;

	@FindBy(xpath="//*[@id='SubmissionPSN_BondPeriod']")
	private WebElement BondPeriod;

	@FindBy(xpath="//*[@id='SubmissionPSN_BondAmount']")
	private WebElement BondAmount;

	@FindBy(xpath="//*[@onclick='return CPXWindow_Save(this);']")
	private WebElement Save;

	@FindBy(xpath="//*[@id='jjmenu_main']/span/div[2]//span[2]")
	private WebElement subexistingcand;

	@FindBy(xpath="//*[@id='AutoCompleteFirstName']")
	private WebElement CandFirstName;

	@FindBy(xpath="//*[@id='AutoCompleteLastName']")
	private WebElement CandLastName;

	@FindBy(xpath="/html/body/ul[1]/li[1]/a")
	private WebElement Autopopupfirstname;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchimgBtn;

	@FindBy(xpath="//*[@id='grdCandReqSearchList']/table/tbody/tr/td/div[1]")
	private WebElement ViewBtn;

	@FindBy(xpath="//*[@id='jjmenu_main']/span/div[6]//span[2]")
	private WebElement OnBenchCand;

	@FindBy(xpath="//*[@id='SubmissionPSN_RightToWork']")
	private WebElement RightToWork;
	
	@FindBy(xpath="//*[@id='Candidate_JobTitle']")
	private WebElement CandJobTitle;

	public Submit_NewCandidate(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void Add_NewCandidate(Map<String,String> hmap) throws Exception {
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", clickonicon);
		clickonicon.click();	
		js.executeScript("arguments[0].click();", clickonid);
		js.executeScript("arguments[0].click();", clickonid);	
		Thread.sleep(2000);
		subnewcand.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		Thread.sleep(5000);
		lib.waitForElementLoad(FirstName);
		FirstName.sendKeys(hmap.get("Firstname"));
		LastName.sendKeys(hmap.get("Lastname"));
		Emailid.sendKeys(hmap.get("Email"));
		MobileNo.click();
		MobileNo.sendKeys(hmap.get("MobileNum"));
		Address.sendKeys(hmap.get("address"));
		City.sendKeys(hmap.get("CityName"));
		lib.select(state,hmap.get("stateName"));
		pincode.sendKeys(hmap.get("Pincode"));
		lib.select(country,hmap.get("Countryname"));
	
		try {
			lib.waitForElementLoad(ResSource);
			lib.select(ResSource,hmap.get("Resumesource"));
		}catch(TimeoutException e) {}
		
		try {
			lib.waitForElementLoad(CandJobTitle);;
			CandJobTitle.sendKeys(hmap.get("RequirementTitle"));
		}catch(TimeoutException e) {}

		lib.select(Education,hmap.get("Education"));
		lib.select(TotalExperience,hmap.get("TotalExp"));
		js.executeScript("arguments[0].scrollIntoView();", Resumefile);
		Resumefile.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(4000);
		try {
			lib.waitForElementLoad(ResText);
			ResText.clear();
			ResText.click();
			ResText.sendKeys(hmap.get("ResumeText"));
		}catch(TimeoutException e) {}

		savesubmit.click();
		Thread.sleep(1500);
	}


	public void Select_ExistingCandidate(Map<String,String> hmap) throws Exception {
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", clickonicon);
		clickonicon.click();	
		js.executeScript("arguments[0].click();", clickonid);
		js.executeScript("arguments[0].click();", clickonid);	
		Thread.sleep(1000);
		subexistingcand.click();
		lib.switchOutOfFrame();
		Thread.sleep(3000);
		CandFirstName.sendKeys(hmap.get("Firstname"));
		 //Autopopupfirstname.click();
		Thread.sleep(1000);
		CandLastName.sendKeys(hmap.get("Lastname"));
		CandLastName.sendKeys(Keys.TAB);
		SearchimgBtn.click();
		Thread.sleep(1000);
		ViewBtn.click();
		Thread.sleep(2000);		
	}


	public void India_SubmitNewCandidate(Map<String,String> hmap) throws Exception {
		lib = new Generic_Methods(driver);
		Thread.sleep(2000);
		try {
			lib.waitForElementLoad(AadharNumber);
			AadharNumber.click();
			AadharNumber.sendKeys(hmap.get("AadharNumber"));
		}catch(TimeoutException e) {}

		DOB.click();
		DOB.sendKeys(hmap.get("DateOfBirth"));

		Subdate.click();
		Subdate.sendKeys(hmap.get("SubmissionDate"));
		offerRecDate.click();
		offerRecDate.sendKeys(hmap.get("OfferReceivedOn"));
		
		EndDate.click();
		EndDate.sendKeys(hmap.get("Enddate"));
		
		lib.select(PSNTeamID,hmap.get("TeamLead"));
		
		lib.select(PSNRecID,hmap.get("Recruiter"));
		try {
			lib.waitForElementLoad(ReportingManager);
			lib.select(ReportingManager,hmap.get("RepManager"));
		}catch(TimeoutException e) {}

		lib.select(EmpType, hmap.get("EmpType"));

		try {
			lib.waitForElementLoad(ObJobClassification);
			lib.select(ObJobClassification, hmap.get("OBJobClassification"));
		}catch(TimeoutException e) {}

		lib.select(shift,hmap.get("Shift"));

		try {
			lib.waitForElementLoad(ProbationPeriod);
			lib.select(ProbationPeriod,hmap.get("Probation"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(NoticePeriod);
			NoticePeriod.click();
			NoticePeriod.sendKeys(hmap.get("NP"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(RightToWork);			
			String optionText =hmap.get("RadioValue");
			String RightTowork = "//input[@value='" + optionText + "'][ancestor::td[@class='editor-field']]";
			driver.findElement(By.xpath(RightTowork)).click();
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(BillCurrency);
			lib.select(BillCurrency,hmap.get("BillCurr"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(BillRateID);
			lib.select(BillRateID,hmap.get("BillRateType"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(OtBillRate);
			OtBillRate.sendKeys(hmap.get("OTBillRate"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(BufferDuration);
			BufferDuration.sendKeys(hmap.get("BufferDur"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(PayCurrency);
			lib.select(PayCurrency,hmap.get("PayCurr"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(PayRateID);
			lib.select(PayRateID,hmap.get("PayRateType"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(payRate);
			payRate.sendKeys(hmap.get("PayRate"));
		}catch(TimeoutException e) {}
		
		try {
			lib.waitForElementLoad(OtPayRate);
			OtPayRate.sendKeys(hmap.get("OTPayRate"));
		}catch(TimeoutException e) {}

		lib.select(PayJoiningList,hmap.get("JoiningBonusOn"));
		JoiningBonus.click();
		JoiningBonus.sendKeys(hmap.get("JoiningBonus"));

//		try {
//			lib.waitForElementLoad(IsUnderBond);			
//			String option =hmap.get("Underbond");
//			String UnderBond = "//input[@id='SubmissionPSN_IsUnderBond'][@value='" + option + "'][ancestor::td[@class='editor-field']]";
//			driver.findElement(By.xpath(UnderBond)).click();
//		}catch(TimeoutException e) {}
//
//		try {
//			lib.waitForElementLoad(BondPeriod);
//			BondPeriod.click();
//			BondPeriod.sendKeys(hmap.get("Bondperiod"));
//			BondAmount.click();
//			BondAmount.sendKeys(hmap.get("Bondamount"));
//		}catch(TimeoutException e) {}

		Save.click();
		Thread.sleep(2000);
	}

	public void Select_OnBenchCandidate(Map<String,String> hmap) throws Exception 
	{
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", clickonicon);
		clickonicon.click();	
		js.executeScript("arguments[0].click();", clickonid);
		js.executeScript("arguments[0].click();", clickonid);	
		
		OnBenchCand.click();
		lib.switchOutOfFrame();
		Thread.sleep(3000);
		CandFirstName.sendKeys(hmap.get("Firstname"));
		Autopopupfirstname.click();
		Thread.sleep(1000);
		CandLastName.sendKeys(hmap.get("Lastname"));
		CandLastName.sendKeys(Keys.TAB);
		
		SearchimgBtn.click();
		Thread.sleep(1000);
		ViewBtn.click();
		Thread.sleep(2000);		
	}


}                       
