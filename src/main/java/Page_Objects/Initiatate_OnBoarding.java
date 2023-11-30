package Page_Objects;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Reusable_Methods.Generic_Methods;

public class Initiatate_OnBoarding {

	WebDriver driver;
	Generic_Methods lib;

	@FindBy(xpath="//*[@id='divWfh']//tr[2]/td/div//button[text()='No']")
	private WebElement RemotePopup;

	@FindBy(xpath="//*[@id='OB_Consultant_SSN']")
	private WebElement SSNField;

	@FindBy(xpath="//*[@id='OB_Consultant_DOB']")
	private WebElement DOBfield;

	@FindBy(xpath="//*[@id='OB_Consultant_OBClassificationID']")
	private WebElement OBjobcla;

	@FindBy(xpath="//*[@id='OB_Consultant_WorkLocationID']")
	private WebElement OBWorkLoc;

	@FindBy(xpath="//*[@id='OB_Consultant_ClassificationID']")
	private WebElement payrollClassification;

	@FindBy(xpath="//*[@name='CountryID'][@class='valid']")
	private WebElement Country;

	@FindBy(xpath="//*[@id='OB_Consultant_CategoryID']")
	private WebElement Emptype;

	@FindBy(xpath="//*[@id='PayrollCodeID']")
	private WebElement PayRollCode;

	@FindBy(xpath="//*[@id='OB_Consultant_OfferLetterTemplateID']")
	private WebElement OfferLetterTemp;

	@FindBy(xpath="//*[@id='OB_Consultant_BenefitEligibilityClassID']")
	private WebElement BenefitEligibilityClass;

	@FindBy(xpath="//*[@id='OB_Consultant_BenefitEligibilityDate']")
	private WebElement BenefitEligibilityDate;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_ReferenceNo']")
	private WebElement PORef;

	@FindBy(xpath="//*[@id='OB_Consultant_StartDate']")
	private WebElement StartDate;

	@FindBy(xpath="//*[@id='OB_Consultant_ScheduledEndDate']")
	private WebElement Scheduledenddate;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_InclusiveTax'][@value='True']")
	private WebElement IncTax;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_InvoiceFrequencyID']")
	private WebElement Invoicefreq;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_TimesheetTemplateID']")
	private WebElement TSTemplate;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_TimesheetFrequencyID']")
	private WebElement TsFrequency;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_NoofShifts']")
	private WebElement NoofShifts;

	@FindBy(xpath="//*[@id='OB_Consultant_HolidayBR']")
	private WebElement HolBillRate;

	@FindBy(xpath="//*[@id='OB_Consultant_HolidayPR']")
	private WebElement HolPayrate;

	@FindBy(xpath="//*[@id='OB_Consultant_OTBillrate']")
	private WebElement OTbillrate;

	@FindBy(xpath="//*[@id='OB_Consultant_OTPayrate']")
	private WebElement OTPayrate;

	@FindBy(xpath="//*[@id='OB_Consultant_DTBillrate']")
	private WebElement DTbillrate;

	@FindBy(xpath="//*[@id='OB_Consultant_DTPayrate']")
	private WebElement DTPayrate;

	@FindBy(xpath="//*[@id='OB_Consultant_OncallBR']")
	private WebElement OncallRate;

	@FindBy(xpath="//*[@id='OB_Consultant_CallBackBR']")
	private WebElement CallbackRate;

	@FindBy(xpath="//*[@id='OB_Consultant_ChargeBR']")
	private WebElement ChargeRate;

	@FindBy(xpath="//*[@id='OB_Consultant_OrientationBR']")
	private WebElement OrientBR;

	@FindBy(xpath="//*[@id='OB_Consultant_OrientationPR']")
	private WebElement OrientPR;

	@FindBy(xpath="//*[@id='OB_Consultant_TATOBR']")
	private WebElement TatoBR;

	@FindBy(xpath="//*[@id='OB_Consultant_TATOPR']")
	private WebElement TatoPR;

	@FindBy(xpath="//*[@id='OB_Consultant_TravelTimeBR']")
	private WebElement TravelTimeBR;

	@FindBy(xpath="//*[@id='OB_Consultant_TravelBonus']")
	private WebElement joiningbonus;

	@FindBy(xpath="//*[@id='OB_Consultant_PayJoiningID']")
	private WebElement joiningdropdown;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_PerdiemTypeID']")
	private WebElement perDiemdropdown;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_PerDiem']")
	private WebElement Perdiem;

	@FindBy(xpath="//*[@id='OB_Consultant_StandardHours']")
	private WebElement standardHrs;

	@FindBy(xpath="//*[@id='OB_Consultant_MinGuarantHours']")
	private WebElement MinGuarenteedHrs;

	@FindBy(xpath="//*[@id='btnBillingContact']")
	private WebElement billingctMenu;

	@FindBy(xpath="//*[@id='91' and @type='checkbox']")
	private WebElement billingcheckbox;

	@FindBy(xpath="//*[@id='ClientContact_Contact_FirstName']")
	private WebElement FirstName;

	@FindBy(xpath="//*[@id='ClientContact_Contact_LastName']")
	private WebElement LastName;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement SaveButton;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_BillingContact1']")
	private WebElement billingct;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_WorkerCompStateID']")
	private WebElement Workerscomp;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_Attention']")
	private WebElement Attentionto;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_InvoiceEmailID']")
	private WebElement Invoiceemail;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_ClientPaymentTerms']")
	private WebElement clientpayterms;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_VisaTypeID']")
	private WebElement Visatype;
	
	@FindBy(xpath="//*[@id='OB_Consultant_Project_VisaNumber']")
	private WebElement VisaNumber;
	
	@FindBy(xpath="//*[@id='OB_Consultant_Project_VisaStartDate']")
	private WebElement VisaStartDate;
	
	@FindBy(xpath="//*[@id='OB_Consultant_Project_VisaEndDate']")
	private WebElement VisaEndDate;
	
	@FindBy(xpath="//*[@id='OB_Consultant_Project_LCACaseNumber']")
	private WebElement Visa_LCANum;
	
	@FindBy(xpath="//*[@id='OB_Consultant_Project_LCACity']")
	private WebElement Visa_LCACity;
	
	@FindBy(xpath="//*[@id='OB_Consultant_Project_LCAStateID']")
	private WebElement VisaLCAState;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_OBOwnerID']")
	private WebElement OnBoardingowner;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_VMSRefID']")
	private WebElement VMSref;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_CommRecipient1']")
	private WebElement Recipientdropdown;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_CommSplit1']")
	private WebElement split;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_CommLocationID1']")
	private WebElement BranchLoc;

	@FindBy(xpath="//*[@onclick='return CPXWindow_Save(this);']")
	private WebElement SaveBtn;

	@FindBy(xpath="//*[@id='ExceptionNotes']")
	private WebElement ExpNotes;

	@FindBy(xpath="//a[@class='t-icon t-plus']")
	private WebElement clickonicon;

	@FindBy(xpath="//*[@id='OB_Consultant_BillrateTypeID']")
	private WebElement BRtype;

	@FindBy(xpath="//*[@id='OB_Consultant_PayrateTypeID']")
	private WebElement PRtype;

	@FindBy(xpath="//*[contains(text(),'Tax/Comm/Misc')]")
	private WebElement TaxTab;

	@FindBy(xpath="//*[@id='OB_Consultant_Project_StateTaxTypeID']")
	private WebElement StateTax;


	public Initiatate_OnBoarding(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void InitiateOnboarding(Map<String,String> hmap) throws InterruptedException
	{
		Thread.sleep(3000);
		lib=new Generic_Methods(driver);			
		try {
			lib.waitForElementLoad(RemotePopup);
			String optText =hmap.get("WFHPopup");
			String Ratesinc = "//*[@id='divWfh']//tr[2]/td/div//button[text()='" + optText + "']";
			driver.findElement(By.xpath(Ratesinc)).click();
		} catch (TimeoutException e) {}	

		Thread.sleep(1000);		
		try {
			lib.waitForElementLoad(SSNField);
			SSNField.click();
			SSNField.sendKeys(hmap.get("SSN"));
			DOBfield.click();
			DOBfield.sendKeys(hmap.get("DOB"));
		}catch(TimeoutException e) {}
		
		try {
			lib.waitForElementLoad(OBjobcla);
			lib.select(OBjobcla,hmap.get("OBJobClassification"));
		}catch(TimeoutException e) {}

		lib.select(OBWorkLoc, hmap.get("OBWorkLocation"));
		Thread.sleep(1500);
		try {
			lib.waitForElementLoad(RemotePopup);
			String optText =hmap.get("WFHPopup");
			String Ratesinc = "//*[@id='divWfh']//tr[2]/td/div//button[text()='" + optText + "']";
			driver.findElement(By.xpath(Ratesinc)).click();
		} catch (TimeoutException e) {}	

		Thread.sleep(1000);
		lib.select(payrollClassification,hmap.get("payrollclassification"));
		lib.select(Emptype,hmap.get("emptype"));
		Thread.sleep(1000);
		
		try {
			lib.waitForElementLoad(PayRollCode);	
			lib.select(PayRollCode,hmap.get("PayrollCode"));
		}catch(TimeoutException e) {}
		
		try {
			lib.waitForElementLoad(OfferLetterTemp);
			lib.select(OfferLetterTemp,hmap.get("OfferLetTemp"));
		} catch (TimeoutException e) {}	
		try {
			lib.waitForElementLoad(BenefitEligibilityClass);
			lib.select(BenefitEligibilityClass,hmap.get("BenefitEligibilityclass"));
		} catch (TimeoutException e) {}	

		PORef.sendKeys(hmap.get("PoReference"));
		Thread.sleep(500);
		try {
			//			driver.findElement(By.id("btnNewEndClient")).click();
			//			driver.findElement(By.id("ProjectEndClient_EndClientName")).sendKeys("Infotech");
			//			driver.findElement(By.xpath("//*[@id=\"CustomFormcpxPopDiv2\"]/table[2]/tbody/tr/td/div/button[2]")).click();
			//			Thread.sleep(1000);
			driver.findElement(By.id("EndClientID_Display")).sendKeys("Infotech");
		}catch(TimeoutException e) {}

		StartDate.click();
		StartDate.sendKeys(hmap.get("startDate"));
		Thread.sleep(500);
		Scheduledenddate.clear();
		Scheduledenddate.click();	
		Scheduledenddate.sendKeys(hmap.get("ScheduledEnddate"));

		try {
			lib.waitForElementLoad(IncTax);
			String optText =hmap.get("Inc_Tax");
			String Ratesinc = "//*[@id='OB_Consultant_Project_InclusiveTax'][@value='"+ optText +"']";
			driver.findElement(By.xpath(Ratesinc)).click();
		}catch(TimeoutException e) {}

		Thread.sleep(500);
		lib.select(Invoicefreq,hmap.get("Invoicefreq"));
		Thread.sleep(500);
		lib.select(TSTemplate,hmap.get("TSTemp"));	
		lib.select(TsFrequency,hmap.get("TSFreq"));
		try {
			lib.waitForElementLoad(BRtype);
			lib.select(BRtype,hmap.get("BRType"));
		} catch (TimeoutException e) {}	
		try {
			lib.waitForElementLoad(PRtype);
			lib.select(PRtype,hmap.get("PRType"));
		} catch (TimeoutException e) {}	
		try {
			lib.waitForElementLoad(NoofShifts);
			NoofShifts.sendKeys(hmap.get("Shifts"));
		} catch (TimeoutException e) {}	
		try {
			lib.waitForElementLoad(OrientBR);
			OrientBR.sendKeys(hmap.get("OrientBR"));
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(OncallRate);
			OncallRate.sendKeys(hmap.get("Oncallrate"));
		} catch (TimeoutException e) {}		
		try {
			lib.waitForElementLoad(CallbackRate);
			CallbackRate.sendKeys(hmap.get("callbackrate"));
		} catch (TimeoutException e) {}
		try {
			lib.waitForElementLoad(ChargeRate);
			ChargeRate.sendKeys(hmap.get("chargerate"));
		} catch (TimeoutException e) {}

		HolBillRate.sendKeys(hmap.get("Holbillrate"));	
		//		try {
		//			lib.waitForElementLoad(OTbillrate);
		//			OTbillrate.clear();
		//			OTbillrate.sendKeys(hmap.get("OBBillrate"));
		//		}catch(TimeoutException e) {}
		//		try {
		//			lib.waitForElementLoad(OTPayrate);
		//			OTPayrate.clear();
		//			OTPayrate.sendKeys(hmap.get("Otpr"));
		//		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(TatoBR);
			TatoBR.sendKeys(hmap.get("TatoBR"));
		} catch (TimeoutException e) {}

		try {
			lib.waitForElementLoad(TravelTimeBR);
			TravelTimeBR.sendKeys(hmap.get("TravelBR"));
		}catch(TimeoutException e) {}

		joiningbonus.sendKeys(hmap.get("JoiningBonus"));
		lib.select(joiningdropdown,hmap.get("Joiningdropdown"));
		Thread.sleep(500);	
		lib.select(perDiemdropdown,hmap.get("PerDiemDropdown"));
		Thread.sleep(500);
		Perdiem.clear();
		Perdiem.sendKeys(hmap.get("perdiem"));
		Thread.sleep(500);
		lib.select(billingct,hmap.get("BillingCt"));

//		lib.select(Workerscomp,hmap.get("workerscomp"));
		Thread.sleep(500);
		lib.select(clientpayterms,hmap.get("Clientpayterm"));
		Thread.sleep(500);
		lib.select(Visatype,hmap.get("VisaType"));
		
		String VisaType=hmap.get("VisaType");
		
		if(VisaType.equals("B1")||VisaType.equals("B2")||VisaType.equals("F1")||VisaType.equals("F1-CPT")||
			VisaType.equals("F1-OPT")||VisaType.equals("H1-B")||VisaType.equals("480")||VisaType.equals("J1")||
			VisaType.equals("J4")||VisaType.equals("L1")||VisaType.equals("L2")||VisaType.equals("EAD")||
			VisaType.equals("TN Visa")||VisaType.equals("H-4")||VisaType.equals("H4 - EAD"))
		{
			VisaNumber.sendKeys(hmap.get("VisaNum"));
			VisaStartDate.click();
			VisaStartDate.sendKeys(hmap.get("VisaStartDate"));
			VisaEndDate.click();
			VisaEndDate.sendKeys(hmap.get("VisaEndDate"));
			Visa_LCANum.sendKeys(hmap.get("LCANum"));
			Visa_LCACity.sendKeys(hmap.get("LCACity"));
			lib.select(VisaLCAState, hmap.get("LCAState"));
		}
		lib.select(OnBoardingowner,hmap.get("onboardingowner"));
		Thread.sleep(500);
		TaxTab.click();
		try {
			lib.waitForElementLoad(StateTax);
			lib.select(StateTax,hmap.get("TaxType"));
		}catch(TimeoutException e) {}

		VMSref.sendKeys(hmap.get("VMSRef"));
//		try {
//			lib.waitForElementLoad(Recipientdropdown);
//			lib.select(Recipientdropdown,hmap.get("RepicientName"));
//			split.sendKeys(hmap.get("split"));
//			lib.select(BranchLoc,hmap.get("LocBranch"));
//		} catch (TimeoutException e) {}
		Thread.sleep(500);
		SaveBtn.click();
		Thread.sleep(2000);
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys(hmap.get("ExceptionNotes"));
			SaveBtn.click();
		} catch (TimeoutException e) {}
	}

}


