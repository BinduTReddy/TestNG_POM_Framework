package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class Change_OfferStatus {

	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath="//a[@class='t-icon t-plus']")
	private WebElement clickicon;

	@FindBy(xpath="//*[@style='text-decoration:underline']")
	private WebElement Submitted;

	@FindBy(xpath="//*[@id='RequirementCandidateHistory_CandidateReqStatusID']")
	private WebElement Statuschange;

	@FindBy(xpath="//*[@onclick='return CPXWindow_Save(this);']")
	private WebElement savebtn;

	@FindBy(xpath="//*[@id='liEngagementAccept']")
	private WebElement PSN;
	
	@FindBy(xpath="//a[contains(text(),'New Document')]")
	private WebElement NewDocument;
	
	@FindBy(xpath="//*[@class='t-button t-upload-button']")
	private WebElement UploadBtn;
	
	@FindBy(xpath="//*[@onclick='OnSaveClick(this);']")
	private WebElement SaveBtn;

	@FindBy(xpath="//*[@onclick='clickOnFacilityAdd()']")
	private WebElement Facilitymenu;

	@FindBy(xpath="//*[@id='ClientFacility_FacilityName']")
	private WebElement AddFacility;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Savebtn;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_FacilityID']")
	private WebElement facdropdown;

	@FindBy(xpath="//*[@id='SubmissionPSN_SubmissionDate']")
	private WebElement Subdate;

	@FindBy(xpath="//*[@id='SubmissionPSN_OfferReceivedOn']")
	private WebElement offerRecDate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_EndDate']")
	private WebElement EndDate;

	@FindBy(xpath="//*[@id='SubmissionPSN_RecruiterID']")
	private WebElement PSNRecID;

	@FindBy(xpath="//*[@id='SubmissionPSN_TeamLeadID']")
	private WebElement PSNTeamID;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PayrateTypeID']")
	private WebElement PayRateType;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_BillrateTypeID']")
	private WebElement BillRateType;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OTPayRate']")
	private WebElement OTpayrate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_HolidayPR']")
	private WebElement Holidaypayrate;
	
	@FindBy(xpath="//*[@id='SubmissionPSN_TatoPR']")
	private WebElement TatoPayRate;
	
	@FindBy(xpath="//*[@id='SubmissionPSN_TravelTimePR']")
	private WebElement TravelTimePR;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OrientationPR']")
	private WebElement OrientationPR;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OncallPR']")
	private WebElement OncallPayrate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_CallBackPR']")
	private  WebElement callbackpayrate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_ChargePR']")
	private WebElement Chargepayrate;
	
	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OrientationPR']")
	private WebElement Orientationpayrate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PerDiemTypeID']")
	private WebElement PerDiemType;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PerDiem']")
	private WebElement PerDiem;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_StandardHours']")
	private WebElement ExpectedHours;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_MinGuarantHours']")
	private WebElement GuaranteedHours;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OrientHours']")
	private WebElement OrientationHours;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PaidOrientHours']")
	private WebElement PaidorientationHours;

	@FindBy(xpath="//*[@id='Mobile']")
	private WebElement Mobile;
	
	@FindBy(xpath="//*[@id='Address1']")
	private WebElement Address;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_NoofShifts']")
	private WebElement NoofShifts;

	@FindBy(xpath="//*[@onclick='return CPXWindow_Save(this);']")
	private WebElement save;

	@FindBy(xpath="//*[@id='ExceptionNotes']")
	private WebElement ExpNotes;

	public Change_OfferStatus(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void Select_Candidate() {
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		clickicon.click();
		Submitted.click();
		lib.switchOutOfFrame();		
	}

	public void Update_OfferRequest(Map<String,String> hmap) throws InterruptedException {
		lib = new Generic_Methods(driver);
		Thread.sleep(1000);
		lib.select(Statuschange,hmap.get("StatusChangeTo"));
		savebtn.click();
	}
	
	public void Clinical_OfferAccept(Map<String,String> hmap) throws InterruptedException, IOException 
	{	
		Thread.sleep(1000);
		lib = new Generic_Methods(driver);
		lib.select(Statuschange,hmap.get("StatusChangeTo1"));
		
//		try {
//			lib.waitForElementLoad(NewDocument);
//			NewDocument.click();
//			Thread.sleep(2000);
//			UploadBtn.click();
//			Thread.sleep(1500);
//			Runtime.getRuntime().exec(props.getProperty("filepath3"));
//			Thread.sleep(2000);
//			SaveBtn.click();
//			Thread.sleep(1500);
//			NewDocument.click();
//			Thread.sleep(2000);
//			UploadBtn.click();
//			Thread.sleep(1500);
//			Runtime.getRuntime().exec(props.getProperty("filepath1"));
//			Thread.sleep(2500);
//			SaveBtn.click();
//			Thread.sleep(1000);
//		}catch(TimeoutException e) {}
//		
		Thread.sleep(1000);
		PSN.click();
//		Facilitymenu.click();
//		Thread.sleep(1000);
//		AddFacility.sendKeys(hmap.get("Facility"));
//		Savebtn.click();
		Thread.sleep(2000);
		lib.select(facdropdown,hmap.get("facilitydropdown"));
		Subdate.click();
		Subdate.sendKeys(hmap.get("SubmissionDate"));
		
		offerRecDate.click();
		offerRecDate.sendKeys(hmap.get("OfferReceivedOn"));

		EndDate.click();
		EndDate.sendKeys(hmap.get("Enddate"));
		
		lib.select(PSNRecID,hmap.get("Recruiter"));
		lib.select(PSNTeamID,hmap.get("TeamLead"));
		try {
			lib.waitForElementLoad(PayRateType);
		    lib.select(PayRateType,hmap.get("PRType"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(OTpayrate);
			OTpayrate.click();
			OTpayrate.clear();
		    OTpayrate.sendKeys(hmap.get("Otpr"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(Holidaypayrate);
			Holidaypayrate.click();
			Holidaypayrate.clear();
		    Holidaypayrate.sendKeys(hmap.get("Holidaypr"));
		} catch (TimeoutException e) {}					
		try {
			lib.waitForElementLoad(OncallPayrate);
			OncallPayrate.clear();
			OncallPayrate.sendKeys(hmap.get("OncallPr"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(callbackpayrate);
			callbackpayrate.clear();
		    callbackpayrate.sendKeys(hmap.get("callbackpr"));
		} catch (TimeoutException e) {}		
		try {
			lib.waitForElementLoad(Chargepayrate);
			Chargepayrate.clear();
			Chargepayrate.sendKeys(hmap.get("Chargepr"));
		} catch (TimeoutException e) {}		
		try {
			lib.waitForElementLoad(Orientationpayrate);
			Orientationpayrate.clear();
			Orientationpayrate.sendKeys(hmap.get("OrientPR"));
		} catch (TimeoutException e) {}	
		
		lib.select(PerDiemType,hmap.get("PerdiemType"));
		PerDiem.sendKeys(hmap.get("Perdiem"));		
		try {
			lib.waitForElementLoad(ExpectedHours);
			ExpectedHours.clear();
		    ExpectedHours.sendKeys(hmap.get("ExpectedHrs"));
		} catch (TimeoutException e) {}		
		try {
			lib.waitForElementLoad(BillRateType);
		    lib.select(BillRateType,hmap.get("BRType"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(GuaranteedHours);
			GuaranteedHours.clear();
			GuaranteedHours.sendKeys(hmap.get("GuaranteedHrs"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(OrientationHours);
			OrientationHours.clear();
			OrientationHours.sendKeys(hmap.get("OrientationHrs"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(PaidorientationHours);
			PaidorientationHours.clear();
		    PaidorientationHours.sendKeys(hmap.get("PaidorientationHrs"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(Mobile);
			Mobile.clear();
			Mobile.click();
			Mobile.sendKeys(hmap.get("MobileNum"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(Address);
			Address.clear();
			Address.click();
			Address.sendKeys(hmap.get("address"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(NoofShifts);
		    NoofShifts.sendKeys(hmap.get("shifts"));
		} catch (TimeoutException e) {}		
		save.click();	
		Thread.sleep(1000);
		try {
		    lib.waitForElementLoad(ExpNotes);
		    ExpNotes.sendKeys(hmap.get("ExceptionNotes"));
		    save.click();
		} catch (TimeoutException e) {}
		Thread.sleep(4000);
		} 



	public void NonClinical_OfferAccept(Map<String,String> hmap) throws InterruptedException 
	{	
		Thread.sleep(1000);
		lib = new Generic_Methods(driver);
		lib.select(Statuschange,hmap.get("StatusChangeTo1"));
		PSN.click();
//		Facilitymenu.click();
//		Thread.sleep(1000);
//		AddFacility.sendKeys(hmap.get("Facility"));
//		Savebtn.click();
		Thread.sleep(2000);
		lib.select(facdropdown,hmap.get("facilitydropdown"));
		Subdate.click();
		Subdate.sendKeys(hmap.get("SubmissionDate"));
		
		offerRecDate.click();
		offerRecDate.sendKeys(hmap.get("OfferReceivedOn"));
		
		EndDate.click();
		EndDate.sendKeys(hmap.get("Enddate"));
		lib.select(PSNRecID,hmap.get("Recruiter"));
		lib.select(PSNTeamID,hmap.get("TeamLead"));
		try {
			lib.waitForElementLoad(PayRateType);
			lib.select(PayRateType,hmap.get("PRType"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(OTpayrate);
			OTpayrate.click();
			OTpayrate.clear();
			OTpayrate.sendKeys(hmap.get("Otpr"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(Holidaypayrate);
			Holidaypayrate.click();
			Holidaypayrate.clear();
			Holidaypayrate.sendKeys(hmap.get("Holidaypr"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(TatoPayRate);
			TatoPayRate.sendKeys(hmap.get("TatoPR"));
		} catch (TimeoutException e) {}		
		try {
			lib.waitForElementLoad(TravelTimePR);
			TravelTimePR.sendKeys(hmap.get("TravelPR"));
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(OrientationPR);
			OrientationPR.sendKeys(hmap.get("OrientPR"));
		}catch(TimeoutException e) {}
		
		lib.select(PerDiemType,hmap.get("PerdiemType"));
		Thread.sleep(1000);
		PerDiem.sendKeys(hmap.get("Perdiem"));			
		try {
			lib.waitForElementLoad(BillRateType);
			lib.select(BillRateType,hmap.get("BRType"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(Mobile);
			Mobile.clear();
			Mobile.click();
			Mobile.sendKeys(hmap.get("MobileNum"));
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(Address);
			Address.clear();
			Address.click();
			Address.sendKeys(hmap.get("address"));
		} catch (TimeoutException e) {}		

		save.click();	
		Thread.sleep(1000);
		try {
			lib.waitForElementLoad(ExpNotes);
			ExpNotes.sendKeys(hmap.get("ExceptionNotes"));
			save.click();
		} catch (TimeoutException e) {}
		Thread.sleep(3500);
	} 
}


