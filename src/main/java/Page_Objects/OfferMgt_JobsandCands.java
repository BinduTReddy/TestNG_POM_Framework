package Page_Objects;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class OfferMgt_JobsandCands {

	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath="//*[contains(text(),'Offer Mgmt')]")
	private WebElement OfferMgmtTab;

	@FindBy(xpath="//*[contains(text(),'Jobs & Candidates')]")
	private WebElement JobsandCand;

	@FindBy(xpath=" //a[contains(text(),'New Job')]")
	private WebElement NewJob;

	@FindBy(xpath="//*[@id='ClientID_Display']")
	private WebElement ClientName;

	@FindBy(xpath="/html/body/ul[2]/li/a")
	private WebElement ClientPopup;

	@FindBy(xpath="//*[@id='Requirement_WorkLocationID']")
	private WebElement WorkLoc;

	@FindBy(xpath="//*[@id='Requirement_ReqRefNumber']")
	private WebElement JobRefNum;

	@FindBy(xpath="//*[@value='Pull from ATS']")
	private WebElement PullFromATSBtn;

	@FindBy(xpath="//*[@id='Requirement_JobDivisionID']")
	private WebElement ATSJobDiv;

	@FindBy(xpath="//*[@id='txtIssueDate']")
	private WebElement JobIssueDate;

	@FindBy(xpath="//*[@id='txtStartDate']")
	private WebElement JobStartDate;

	@FindBy(xpath="//*[@id='txtEndDate']")
	private WebElement JobEndDate;

	@FindBy(xpath="//*[@id='Requirement_BillFrequencyID']")
	private WebElement BillRateType;

	@FindBy(xpath="//*[@id='Requirement_PayFrequencyID']")
	private WebElement PayRateType;

	@FindBy(xpath="//*[@id='Requirement_BillRate']")
	private WebElement MinBillRate;

	@FindBy(xpath="//*[@id='Requirement_BillRateTo']")
	private WebElement MaxBillRate;

	@FindBy(xpath="//*[@id='Requirement_PayRate']")
	private WebElement MinPayRate;

	@FindBy(xpath="//*[@id='Requirement_PayRateTo']")
	private WebElement MaxPayRate;

	@FindBy(xpath="//*[@id='MandatorySkills']")
	private WebElement JobDescription;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//a[contains(text(),'New Candidate')]")
	private WebElement NewCand;
	
	@FindBy(xpath="//*[@id='Candidate_Contact_EmailID']")
	private WebElement CandEmailID;
	
	@FindBy(xpath="//*[@id='Candidate_Contact_FirstName']")
	private WebElement CandFirstName;
	
	@FindBy(xpath="//*[@id='Candidate_Contact_LastName']")
	private WebElement CandLastName;
	
	@FindBy(xpath="//*[@id='Candidate_Contact_Mobile']")
	private WebElement CandMobileNum;
	
	@FindBy(xpath="//*[@id='Candidate_Contact_Address1']")
	private WebElement CandAddress;
	
	@FindBy(xpath="//*[@id='Candidate_Contact_City']")
	private WebElement CandCity;
	
	@FindBy(xpath="//*[@id='Candidate_Contact_CountryID']")
	private WebElement  CandCountryID;
	
	@FindBy(xpath="//*[@id='Candidate_Contact_StateID']")
	private WebElement CandStateID;
	
	@FindBy(xpath="//*[@id='Candidate_Contact_ZipCode']")
	private WebElement CandZipCode;
	
	@FindBy(xpath="//*[@id='btnCandSaveAndSubmit']")
	private WebElement CandSaveBtn;

	public OfferMgt_JobsandCands(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void OfferMgmt_NewJob(Map<String,String> hmap) throws Exception {		
		Thread.sleep(2000);
		OfferMgmtTab.click();
		Thread.sleep(1000);
		JobsandCand.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		NewJob.click();
		Thread.sleep(1500);
		lib.switchOutOfFrame();
		ClientName.sendKeys(hmap.get("Clientname"));
		ClientPopup.click();
		WorkLoc.click();
		lib.select(WorkLoc, hmap.get("JobWorkLoc"));
		Thread.sleep(1000);		
		JobRefNum.sendKeys(hmap.get("ATS_JobNum"));
		PullFromATSBtn.click();
		Thread.sleep(2000);
		lib.select(ATSJobDiv, hmap.get("ATS_JobDivision"));

		String optionText1 =hmap.get("Job_Issuedate");
		long serialNumber = Long.parseLong(optionText1);
		Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
		Date IssueDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
		DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		String DueDate = dateFormat.format(IssueDate);   
		JobIssueDate.clear();
		JobIssueDate.sendKeys(DueDate);

		String optionText2 =hmap.get("Job_Startdate");
		long serialNumber1 = Long.parseLong(optionText2);
		Date baseDate1 = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
		Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber1-2) + baseDate1.getTime());
		DateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
		String StartDate = dateFormat1.format(documentDate);
		JobStartDate.clear();
		JobStartDate.sendKeys(StartDate);

		JobEndDate.clear();
		JobEndDate.sendKeys(hmap.get("Job_Enddate"));
		lib.select(BillRateType, hmap.get("BillType"));
		lib.select(PayRateType, hmap.get("PayType"));
		MinBillRate.clear();
		MinBillRate.sendKeys(hmap.get("MinBillRate"));
		MaxBillRate.clear();
		MaxBillRate.sendKeys(hmap.get("MaxBillRate"));
		MinPayRate.clear();
		MinPayRate.sendKeys(hmap.get("MinPayRate"));
		MaxPayRate.clear();
		MaxPayRate.sendKeys(hmap.get("MaxPayRate"));
		JobDescription.clear();
		JobDescription.sendKeys(hmap.get("JobDesc"));
		Thread.sleep(1000);
		SaveBtn.click();
		Thread.sleep(1500);
	}

	public void OfferMgmt_NewCand(Map<String,String> hmap) throws Exception {		
		Thread.sleep(2000);
		OfferMgmtTab.click();
		Thread.sleep(1000);
		JobsandCand.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		NewCand.click();
		lib.switchOutOfFrame();
		CandEmailID.sendKeys(hmap.get("Cand_Email"));
		CandFirstName.sendKeys(hmap.get("Cand_FName"));
		CandLastName.sendKeys(hmap.get("Cand_LName"));
		CandMobileNum.click();
		CandMobileNum.sendKeys(hmap.get("Cand_Mobile"));
		CandAddress.sendKeys(hmap.get("Cand_Add"));
		CandCity.sendKeys(hmap.get("Cand_City"));
		lib.select(CandCountryID, hmap.get("Cand_Country"));
		lib.select(CandStateID, hmap.get("Cand_State"));
		CandZipCode.sendKeys(hmap.get("Cand_ZipCode"));
		CandSaveBtn.click();
		Thread.sleep(1500);
	}
	
}