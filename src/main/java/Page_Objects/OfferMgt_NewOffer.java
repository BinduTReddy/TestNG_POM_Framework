package Page_Objects;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class OfferMgt_NewOffer {

	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath="//*[contains(text(),'Offer Mgmt')]")
	private WebElement OfferMgmtTab;

	@FindBy(xpath="//a[contains(text(),'Offers')]")
	private WebElement OffersSubMod;

	@FindBy(xpath="//a[contains(text(),'New Offer')]")
	private WebElement NewOffer;

	@FindBy(xpath="//a[contains(text(),' ATS(API) Wizard ')]")
	private WebElement ATSNewoffer;

	@FindBy(xpath="//a[contains(text(),'Manual')]")
	private WebElement ManualOffer;

	@FindBy(xpath="//*[@id='txtClientName']")
	private WebElement OfferClientName;

	@FindBy(xpath="/html/body/ul[3]/li/a")
	private WebElement ClientPopup;

	@FindBy(xpath="//input[@id='txtClientName']")
	private WebElement JobDivaNum;

	@FindBy(xpath="//*[@id='OfferMgmtCandidateListInSearchAjax']//tr[1]/td[1]/input")
	private WebElement OfferMgmtSelCand;

	@FindBy(xpath="//input[@value='Continue']")
	private WebElement ContBtn;
	
	@FindBy(xpath="//*[@id='grdCandReqSearchList1']//tr[1]/td[1]/input")
	private WebElement SelCandDocs;

	@FindBy(xpath="//*[@id='ClientWorkLocationID']")
	private WebElement ClientWorkLoc;

	@FindBy(xpath="//input[@value='New Work Location']")
	private WebElement NewWorkLocation;

	@FindBy(xpath="//*[@onclick='OnClientLocClick()']")
	private WebElement OnClientLoc;

	@FindBy(xpath="//*[@value='New Client']")
	private WebElement NewClient;

	@FindBy(xpath="//*[@id='Client_ClientName']")
	private WebElement ClientName;

	@FindBy(xpath="//tbody/tr[1]/td[1]/div[1]/a[1]")
	private WebElement ClientNewBtn;

	@FindBy(xpath="//*[@id='Client_MSPID']")
	private WebElement ClientMSP;

	@FindBy(xpath="//*[@id='Client_MSPFeePercent']")
	private WebElement MSPFee;

	@FindBy(xpath="//*[@class='t-button t-upload-button']")
	private WebElement MSAFileUpload;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//td[2]/div/div/div")
	private WebElement NewClientFileUpl;

	@FindBy(xpath="//*[@id='Client_TimesheetFrequencyID']")
	private WebElement Client_TSFreq;

	@FindBy(xpath="//*[@id='Client_TimesheetTemplateID']")
	private WebElement Client_TsTemp;

	@FindBy(xpath="//*[@id='Client_Address1']")
	private WebElement Client_Address;

	@FindBy(xpath="//*[@id='Client_City']")
	private WebElement Client_City;

	@FindBy(xpath="//*[@id='Client_CountryID']")
	private WebElement Client_CountryID;

	@FindBy(xpath="//*[@id='Client_StateID']")
	private WebElement Client_StateID;

	@FindBy(xpath="//*[@id='Client_ZipCode']")
	private WebElement Client_ZipCode;

	@FindBy(xpath="//*[@id='Client_StatusID']")
	private WebElement Client_StatusID;

	@FindBy(xpath="//*[@id='Client_PaymentTerm']")
	private WebElement Client_PaymentTerm;

	@FindBy(xpath="//*[@id='Client_InvoiceFlagID']")
	private WebElement InvoiceFlagID;

	@FindBy(xpath="//*[@id='Client_InvoiceFrequencyID']")
	private WebElement InvoiceFreqID;

	@FindBy(xpath="//*[@id='Client_InvoiceMethodID']")
	private WebElement InvoiceMethodID;

	@FindBy(xpath="//*[@id='Client_InvoiceEmailID']")
	private WebElement InvoiceEmailID;

	@FindBy(xpath="//*[@id='Client_IsGroupedInvoice']")
	private WebElement ConsolidatedInv;

	@FindBy(xpath="//*[@id='Client_GroupTypeID']")
	private WebElement ConsolidatedByID;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement SaveBtn;

	@FindBy(xpath="//button[@onclick='return CPXWindow_Save(this);']")
	private WebElement Save;

	@FindBy(xpath="//*[@class='shm_link001' and @id='150']")
	private WebElement MgmtBtn;

	@FindBy(xpath="//a[contains(text(),'Workflows')]")
	private WebElement Workflowmenu;

	@FindBy(xpath="//*[@id='txtInitiatedMgmtSearch']")
	private WebElement Searchbyword;

	@FindBy(xpath="/html/body/ul[1]/li/a")
	private WebElement SearchWordPopup;

	@FindBy(xpath="//*[@id='txtAssignedTo']")
	private WebElement AssignedBy;

	@FindBy(xpath="//*[@id='txtMgmtTask']")
	private WebElement Taskto;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchImg;

	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]")
	private WebElement ImgBtnTask;

	@FindBy(xpath="//div[@id='ImgBtnOK']")
	private WebElement ApproveBtn;

	@FindBy(xpath="//*[@id='ClientLocation_LocationTypeID']")
	private WebElement ClientLocType;

	@FindBy(xpath="//*[@id='ClientLocation_LocationName']")
	private WebElement ClientLocName;

	@FindBy(xpath="//*[@id='ClientLocation_Address_Address1']")
	private WebElement ClientAddLoc;

	@FindBy(xpath="//*[@id='ClientLocation_Address_City']")
	private WebElement ClientAddCity;

	@FindBy(xpath="//*[@id='ClientLocation_Address_CountryID']")
	private WebElement ClientCountryID;

	@FindBy(xpath="//*[@id='ClientLocation_Address_StateID']")
	private WebElement ClientStateID;

	@FindBy(xpath="//*[@id='ClientLocation_Address_ZipCode']")
	private WebElement ClientZipcode;

	@FindBy(xpath="//*[@id='ClientLocation_PhoneNo']")
	private WebElement ClientPhoneNo;

	@FindBy(xpath="//*[@id='ClientLocation_IsActive']")
	private WebElement ClientIsActive;

	@FindBy(xpath="//*[@onclick='OnNewJobClick()']")
	private WebElement OnNewJob;

	@FindBy(xpath="//*[@id='Requirement_ReqRefNumber']")
	private WebElement JobRefNum;

	@FindBy(xpath="//*[@value='Pull from ATS']")
	private WebElement PullFromATSBtn;

	@FindBy(xpath="//*[@id='Requirement_JobDivisionID']")
	private WebElement ATSJobDiv;

	@FindBy(xpath="//*[@id='AtsJobID']")
	private WebElement ATSJob;

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

	@FindBy(xpath="//*[@id='AtsJobID']")
	private WebElement ATSJobID;

	@FindBy(xpath="//*[@id='txtEmailId']")
	private WebElement CandEmail;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']//tr[14]/td/div/a")
	private WebElement NewCandBtn;

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

	@FindBy(xpath="//*[@onclick='OnCandidateSave(this)']")
	private WebElement CandSaveBtn;

	@FindBy(xpath="//*[@id='txtATSNewEmail']")
	private WebElement ATAMail;

	@FindBy(xpath="/html/body/ul[4]/li/a")
	private WebElement ATSMailPopup;

	@FindBy(xpath="//*[@onclick='GetFiltered()']")
	private WebElement SearchBtn;

	@FindBy(xpath="//input[@id='RecruiterName']")
	private WebElement RecruiterName;

	@FindBy(xpath="/html/body/ul[1]/li/a")
	private WebElement RecPopup;

	@FindBy(xpath="//input[@id='LeadRecruiterName']")
	private WebElement TeamLead;

	@FindBy(xpath="/html/body/ul[2]/li/a")
	private WebElement TeamLeadPopup;

	@FindBy(xpath="//*[@id='Candidate_JBSourceID']")
	private WebElement CandSourceID;

	@FindBy(xpath="//*[@id='Candidate_VisaTypeID']")
	private WebElement CandVisa;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_CategoryID']")
	private WebElement EmpType;

	@FindBy(xpath="//*[@id='SubmissionPSN_PayrollFrequencyID']")
	private WebElement Payrollfreq;

	@FindBy(xpath="//*[@id='SubmissionPSN_Notes']")
	private WebElement PSNNotes;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_StartDate']")
	private WebElement PSNStartDate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_EndDate']")
	private WebElement PSNEndDate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_StandardHours']")
	private WebElement PSNStndHrs;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_ShiftScheduleID']")
	private WebElement StndShift;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_WeekendShift']")
	private WebElement WeekendShift;

	@FindBy(xpath="//*[@id='SubmissionPSN_IsClientOfferGuranteedHours']")
	private WebElement ClientGurantedHrs;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_MinGuarantHours']")
	private WebElement ClientMinGuatHrs;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_CancellableShifts']")
	private WebElement CancellableShifts;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_SchduleNotes']")
	private WebElement ScheduleNotes;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_ApprovedTimeOff']")
	private WebElement ApprovedTimeoff;

	@FindBy(xpath="//a[contains(text(),'Rates')]")
	private WebElement RatesTab;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_Billrate']")
	private WebElement EABillRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PayRate']")
	private WebElement EAPayRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OTBillrate']")
	private WebElement OTBRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OTPayRate']")
	private WebElement OTPRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_DTBillrate']")
	private WebElement DTBillRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_DTPayRate']")
	private WebElement DTPayRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_HolidayBR']")
	private WebElement HolidayBillRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_HolidayPR']")
	private WebElement HolidayPayRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OncallBR']")
	private WebElement OnCallBillRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OncallPR']")
	private WebElement OnCallPayRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_CallBackBR']")
	private WebElement CallbackBillRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_CallBackPR']")
	private WebElement CallbackPayRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_ChargeBR']")
	private WebElement ChargeBillRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_ChargePR']")
	private WebElement ChargePayRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OrientationBR']")
	private WebElement OrientBillRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OrientationPR']")
	private WebElement OrientPayRate;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_OrientHours']")
	private WebElement OrientHours;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PayJoiningID']")
	private WebElement JoiningBonusID;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_TravelBonus']")
	private WebElement JoiningBonusAmount;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_CompletionBonus']")
	private WebElement CompletionBonusAmount;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PayCompletionID']")
	private WebElement CompletionBonusID;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_AdditionalBonus']")
	private WebElement AdditionalBonusAmount;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_PayAdditionalID']")
	private WebElement AdditionalBonusID;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_Reimbursement']")
	private WebElement ExpReimbursement;

	@FindBy(xpath="//div[@class='t-button t-upload-button']")
	private WebElement ExpReimfileUpload;

	@FindBy(xpath="//button[@id='btnValidate']")
	private WebElement ValidateBtn;

	@FindBy(xpath="//button[@id='btnSubmitApproval']")
	private WebElement SubmitApproval;

	@FindBy(xpath="//*[contains(text(),'Admin')]")
	private WebElement AdminBtn;

	@FindBy(xpath="//*[@class='shm_link002' and @id='583']")
	private WebElement History;

	@FindBy(xpath="//*[@class='shm_link003' and @id='599']")
	private WebElement EmailHistory;

	@FindBy(xpath="//*[@id='txtToMail']")
	private WebElement ToEmail;

	@FindBy(xpath="//*[@id='ddlCategory']")
	private WebElement Category;

	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]")
	private WebElement Viewlogo;

	@FindBy(xpath="//*[@id='cpxPopDiv1']/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td[2]/div[2]")
	private WebElement GetUserPwd;

	@FindBy(xpath="//*[@id='cpxPopDiv1']/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td[2]/div[2]/div/font/a")
	private WebElement GetUsrPwdLink;

	@FindBy(xpath="//*[@id='UserName']")
	private WebElement UserName;

	@FindBy(xpath="//*[@id='Password']")
	private WebElement Password;

	@FindBy(xpath="//*[@type='submit']")
	private WebElement Login;

	@FindBy(xpath="//*[@id='HomePhone']")
	private WebElement HomePhone;

	@FindBy(xpath="//*[@id='SSN']")
	private WebElement SSNNum;

	@FindBy(xpath="//*[@id='ConfirmSSN']")
	private WebElement ConfirmSSN;

	@FindBy(xpath="//*[@id='DOB']")
	private WebElement DOB;

	@FindBy(xpath="//*[@id='ConfirmDOB']")
	private WebElement ConfirmDOB;

	@FindBy(xpath="//*[@id='CandidateEngageAcceptance_DeclineReasonID']")
	private WebElement EADeclineReason;

	@FindBy(xpath="//*[@id='onClickNext1']")
	private WebElement NextBtn;

	@FindBy(xpath="//*[@id='IsTermsBreakAck']")
	private WebElement ClientTermsAck;

	@FindBy(xpath="//*[@id='onClickNext3']")
	private WebElement SubmitBtn;

	@FindBy(xpath="//*[@onclick='CPXWindow_Close(this);']")
	private WebElement Close;

	@FindBy(xpath="//span[contains(text(),'Submit a New Candidate')]")
	private WebElement Div;

	public OfferMgt_NewOffer(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void OfferMgmt_ATSWizard(Map<String,String> hmap) throws Exception {		
		Thread.sleep(2000);
		OfferMgmtTab.click();
		Thread.sleep(1000);
		OffersSubMod.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");		
		Actions actions = new Actions(driver);
		actions.moveToElement(NewOffer);		
		actions.moveToElement(ATSNewoffer);
		actions.click().build().perform();	
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		JobDivaNum.sendKeys(hmap.get("JobDiva_Num"));
		ContBtn.click();

		try {
			lib.waitForElementLoad(NewClient);
			String value = hmap.get("NewClient"); 
			if (value.equalsIgnoreCase("yes")) {
				NewClient.click();
				ClientName.sendKeys(hmap.get("Clientname"));
				lib.select(ClientMSP,hmap.get("ClientMSP"));
				MSPFee.sendKeys(hmap.get("ClientFee"));
				MSAFileUpload.click();
				Thread.sleep(1000);
				Runtime.getRuntime().exec(props.getProperty("filepath1"));
				Thread.sleep(2000);
				lib.select(Client_TSFreq, hmap.get("ClientTSFreq"));
				Thread.sleep(1000);
				lib.select(Client_TsTemp, hmap.get("ClientTSTemp"));
				Client_Address.sendKeys(hmap.get("Clientadd"));
				Client_City.sendKeys(hmap.get("ClientCity"));
				lib.select(Client_CountryID, hmap.get("ClientCountry"));
				lib.select(Client_StateID, hmap.get("Clientstate"));
				Client_ZipCode.sendKeys(hmap.get("ClientzipCode"));
				lib.select(Client_StatusID, hmap.get("ClientStatus"));
				lib.select(Client_PaymentTerm, hmap.get("Clientpayment"));
				lib.select(InvoiceFlagID, hmap.get("ClientInvFlag"));
				lib.select(InvoiceFreqID, hmap.get("ClientInvFreq"));
				lib.select(InvoiceMethodID, hmap.get("ClientInvMethod"));
				InvoiceEmailID.sendKeys(hmap.get("InvoiceEmailID"));	 		
				try {
					lib.waitForElementLoad(ConsolidatedInv);
					String option =hmap.get("ConsInvoiceValue");
					String ViewEmpPortal = "//*[@id='Client_IsGroupedInvoice'][@value='" + option + "']";
					driver.findElement(By.xpath(ViewEmpPortal)).click();	
				}catch(TimeoutException e) {}	 		
				lib.select(ConsolidatedByID, hmap.get("ConsolidatedBy"));
				SaveBtn.click();
				Thread.sleep(1500);	 

				driver.navigate().refresh();
				Thread.sleep(2000);
				MgmtBtn.click();
				Thread.sleep(1000);
				Workflowmenu.click();		
				lib = new Generic_Methods(driver);
				lib.handlingFrame("frmContent");
				Searchbyword.sendKeys(hmap.get("SrchByWord"));
				AssignedBy.sendKeys(hmap.get("Assignedby"));
				Taskto.sendKeys(hmap.get("TaskApproval"));
				SearchImg.click();
				Thread.sleep(2000);
				ImgBtnTask.click();
				Thread.sleep(2000);
				lib.switchOutOfFrame();	
				ApproveBtn.click();
				Thread.sleep(1500);

				Thread.sleep(2000);
				OfferMgmtTab.click();
				Thread.sleep(1000);
				OffersSubMod.click();		
				lib = new Generic_Methods(driver);
				lib.handlingFrame("frmContent");		
				actions.moveToElement(NewOffer);		
				actions.moveToElement(ATSNewoffer);
				actions.click().build().perform();	
				Thread.sleep(1000);
				lib.switchOutOfFrame();
				JobDivaNum.sendKeys(hmap.get("JobDiva_Num"));
				ContBtn.click(); 		
			}		
			String ReqDoc =hmap.get("SelectClient");
			String ChkBoxOpt = "//tr[contains(td/text(), '"+ ReqDoc +"')]/td/input[@type='checkbox']";
			driver.findElement(By.xpath(ChkBoxOpt)).click();
			Thread.sleep(1000);	     
			ContBtn.click();
			Thread.sleep(1000);
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(NewWorkLocation);
			String Option = hmap.get("NewWorkLoc"); 
			if (Option.equalsIgnoreCase("yes")) {
				NewWorkLocation.click();
				Thread.sleep(1000);		    	
				lib.select(ClientLocType, hmap.get("NewLocType"));
				ClientLocName.sendKeys(hmap.get("NewLocName"));
				ClientAddLoc.sendKeys(hmap.get("NewLocationAdd"));
				ClientAddCity.sendKeys(hmap.get("NewLocCity"));
				lib.select(ClientCountryID, hmap.get("NewLocCountry"));
				lib.select(ClientStateID, hmap.get("NewLocState"));
				ClientZipcode.sendKeys(hmap.get("NewLocZipCode"));
				ClientPhoneNo.sendKeys(hmap.get("NewLocPhoneNum"));
				try {
					lib.waitForElementLoad(ClientIsActive);
					String option =hmap.get("ISActive");
					String ViewEmpPortal = "//*[@id='ClientLocation_IsActive'][@value='" + option + "']";
					driver.findElement(By.xpath(ViewEmpPortal)).click();
				}catch(TimeoutException e) {}
				SaveBtn.click();
				Thread.sleep(1000);		    	 
			}

			String CheckBoxOpt =hmap.get("WorkLocCheckBox");
			String ChkBox = "//tr[contains(td/text(), '"+ CheckBoxOpt +"')]/td/input[@type='checkbox']";
			driver.findElement(By.xpath(ChkBox)).click();
			Thread.sleep(1000);	     
			ContBtn.click();
			Thread.sleep(1000);
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(ATSJobDiv);
			lib.select(ATSJobDiv, hmap.get("ATS_JobDivision"));
			Thread.sleep(1500);
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

			Thread.sleep(1000);
			MinBillRate.clear();
			MinBillRate.sendKeys(hmap.get("MinBillRate"));
			MaxBillRate.clear();
			MaxBillRate.sendKeys(hmap.get("MaxBillRate"));
			MinPayRate.clear();
			MinPayRate.sendKeys(hmap.get("MinPayRate"));
			MaxPayRate.clear();
			MaxPayRate.sendKeys(hmap.get("MaxPayRate"));
			Thread.sleep(1000);
			JobDescription.clear();
			JobDescription.sendKeys(hmap.get("JobDesc"));
			Thread.sleep(1000);
			SaveBtn.click();
			Thread.sleep(1500);
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(OfferMgmtSelCand);			
			OfferMgmtSelCand.click();
			Thread.sleep(1000);

			WebElement Text=driver.findElement(By.xpath("//*[@id='OfferMgmtCandidateListInSearchAjax']/table/tbody/tr/td[3]"));
			String EmailTxt=Text.getText();
			System.out.println(EmailTxt);

			FileInputStream fis = new FileInputStream(props.getProperty("TestDataPath"));
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("TestCaseSheet");     
			int targetRowNum = 1;
			int targetColumnNum = 53; 
			Row targetRow = sheet.getRow(targetRowNum);
			if (targetRow == null) {
				targetRow = sheet.createRow(targetRowNum);}
			Cell targetCell = targetRow.createCell(targetColumnNum);
			targetCell.setCellValue(EmailTxt);
			FileOutputStream fileOutputStream = new FileOutputStream(props.getProperty("TestDataPath"));
			wb.write(fileOutputStream);
			fileOutputStream.close(); 
			fis.close();
			Thread.sleep(1000);
			ContBtn.click();
			Thread.sleep(3000);
			
			try {
			lib.waitForElementLoad(CandMobileNum);
			CandMobileNum.click();			
			CandMobileNum.sendKeys(hmap.get("Cand_Mobile"));
			Thread.sleep(1000);
			CandFirstName.clear();
			CandFirstName.sendKeys(hmap.get("Cand_FName"));
			CandLastName.clear();
			CandLastName.sendKeys(hmap.get("Cand_LName"));
			Thread.sleep(500);
			CandAddress.sendKeys(hmap.get("Cand_Add"));
			CandCity.sendKeys(hmap.get("Cand_City"));
			lib.select(CandStateID, hmap.get("Cand_State"));
			Thread.sleep(1000);
			CandZipCode.sendKeys(hmap.get("Cand_ZipCode"));
			Thread.sleep(1000);
			CandSaveBtn.click();
			Thread.sleep(3000);
			OfferMgmtSelCand.click();
			Thread.sleep(1000);
			ContBtn.click();
			Thread.sleep(2000);	
			OfferMgmtSelCand.click();
			Thread.sleep(1000);
			ContBtn.click();
			Thread.sleep(2000);	
			}catch(TimeoutException e) {}
		}catch(TimeoutException e) {
			e.printStackTrace();}
		
		try {
			lib.waitForElementLoad(ContBtn);
			ContBtn.click();
			Thread.sleep(2000);	
		}catch(TimeoutException e) {}
		
		RecruiterName.sendKeys(hmap.get("RecName"));
		RecPopup.click();
		TeamLead.sendKeys(hmap.get("TeamLead"));
		TeamLeadPopup.click();
		Thread.sleep(1000);
		lib.select(CandSourceID, hmap.get("CandSource"));
		lib.select(CandVisa, hmap.get("CandVisaType"));
		Thread.sleep(1000);

		String Opt1 =hmap.get("IsOnSiteJob");
		String OnSiteJob = "//*[@id='SubmissionPSN_IsOnsiteJob'][@value='" + Opt1 + "']";
		driver.findElement(By.xpath(OnSiteJob)).click();				
		String Opt2 =hmap.get("IsClinicalJob");
		String ClinicalJob = "//*[@id='IsClinicalJob'][@value='" + Opt2 + "']";
		driver.findElement(By.xpath(ClinicalJob)).click();				
		String Opt3 =hmap.get("CliPatientFacing");
		String ClinicalPF = "//*[@id='IsClinicalPatientFacing'][@value='" + Opt3 + "']";
		driver.findElement(By.xpath(ClinicalPF)).click();
		Thread.sleep(1000);
		lib.select(EmpType, hmap.get("Emp_Type"));

		String Opt4 =hmap.get("ExemptStatus");
		String IsExempt = "//*[@id='CandidateEngageAcceptance_IsNonExempt'][@value='" + Opt4 + "']";
		driver.findElement(By.xpath(IsExempt)).click();		

		lib.select(Payrollfreq, hmap.get("PayrollFreq"));
		PSNNotes.sendKeys(hmap.get("PSNnotes"));
		Thread.sleep(1000);

		String optionText3 =hmap.get("Job_Startdate");
		long serialNumber2 = Long.parseLong(optionText3);
		Date baseDate2 = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
		Date documentDate1 = new Date(TimeUnit.DAYS.toMillis(serialNumber2-2) + baseDate2.getTime());
		DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy");
		String StartDate1 = dateFormat2.format(documentDate1);
		PSNStartDate.click();
		PSNStartDate.sendKeys(StartDate1);				
		PSNEndDate.click();
		PSNEndDate.sendKeys(hmap.get("Job_Enddate"));
		Thread.sleep(1000);
		PSNStndHrs.sendKeys(hmap.get("PSNStndHrs"));
		lib.select(StndShift, hmap.get("StndShifts"));
		Thread.sleep(1000);
		lib.select(WeekendShift, hmap.get("WeekendShifts"));

		String Opt5 =hmap.get("GurantedHrs");
		String GuarentedHrs = "//*[@id='SubmissionPSN_IsClientOfferGuranteedHours'][@value='" + Opt5 + "']";
		driver.findElement(By.xpath(GuarentedHrs)).click();	
		ClientMinGuatHrs.sendKeys(hmap.get("GuarantedHrs"));
		Thread.sleep(1000);
		CancellableShifts.sendKeys(hmap.get("Cancellable_Shifts"));
		ScheduleNotes.sendKeys(hmap.get("Schedule_Notes"));
		ApprovedTimeoff.sendKeys(hmap.get("App_Timeoff"));
		Thread.sleep(2000);
		RatesTab.click();
		Thread.sleep(1500);
		EABillRate.sendKeys(hmap.get("Reg_BillRate"));
		EAPayRate.sendKeys(hmap.get("Reg_PayRate"));
		Thread.sleep(1000);
		OTBRate.sendKeys(hmap.get("OT_BillRate"));
		OTPRate.sendKeys(hmap.get("OT_PayRate"));

		String Opt6 =hmap.get("ClientPayOTRate");
		String ClientPay = "//*[@id='ISClientPayOTRate'][@value='" + Opt6 + "']";
		driver.findElement(By.xpath(ClientPay)).click();

		String DTOpt =hmap.get("DTRate");
		String DoubleTime = "//*[@id='DoubleTimeRates'][@value='" + DTOpt + "']";
		driver.findElement(By.xpath(DoubleTime)).click();
		if (DTOpt.equalsIgnoreCase("True")) {
			Thread.sleep(1000);
			DTBillRate.click();
			DTBillRate.sendKeys(hmap.get("DT_BR"));
			DTPayRate.click();
			DTPayRate.sendKeys(hmap.get("DT_PR"));		
		}

		String HolOpt =hmap.get("HolRate");
		String Holiday = "//*[@id='HolidayRates'][@value='" + HolOpt + "']";
		driver.findElement(By.xpath(Holiday)).click();
		if (HolOpt.equalsIgnoreCase("True")) {
			HolidayBillRate.click();
			HolidayBillRate.sendKeys(hmap.get("Hol_BR"));
			HolidayPayRate.click();
			HolidayPayRate.sendKeys(hmap.get("Hol_PR"));		
		}

		String OnCallOpt =hmap.get("OnCallRate");
		String Oncall = "//*[@id='OnCallRates'][@value='" + OnCallOpt + "']";
		driver.findElement(By.xpath(Oncall)).click();
		if (OnCallOpt.equalsIgnoreCase("True")) {
			Thread.sleep(1000);
			OnCallBillRate.click();
			OnCallBillRate.sendKeys(hmap.get("OnCall_BR"));
			OnCallPayRate.click();
			OnCallPayRate.sendKeys(hmap.get("OnCall_PR"));		
		}

		String CallbackOpt =hmap.get("CallbackRate");
		String Callback = "//*[@id='CallbackRates'][@value='" + CallbackOpt + "']";
		driver.findElement(By.xpath(Callback)).click();
		if (CallbackOpt.equalsIgnoreCase("True")) {
			Thread.sleep(1000);
			CallbackBillRate.click();
			CallbackBillRate.sendKeys(hmap.get("Callback_BR"));
			CallbackPayRate.click();
			CallbackPayRate.sendKeys(hmap.get("Callback_PR"));		
		}

		String ChargeOpt =hmap.get("ChargeRate");
		String Charge = "//*[@id='ChargeRates'][@value='" + ChargeOpt + "']";
		driver.findElement(By.xpath(Charge)).click();
		if (ChargeOpt.equalsIgnoreCase("True")) {
			Thread.sleep(1000);
			ChargeBillRate.click();
			ChargeBillRate.sendKeys(hmap.get("Charge_BR"));
			ChargePayRate.click();
			ChargePayRate.sendKeys(hmap.get("Charge_PR"));		
		}
		Thread.sleep(1000);
		String OrientOpt =hmap.get("OrientRate");
		String Orientation = "//*[@id='OrientationRates'][@value='" + OrientOpt + "']";
		driver.findElement(By.xpath(Orientation)).click();
		if (OrientOpt.equalsIgnoreCase("True")) {
			Thread.sleep(1000);
			OrientBillRate.click();
			OrientBillRate.sendKeys(hmap.get("Orient_BR"));
			OrientPayRate.click();
			OrientPayRate.sendKeys(hmap.get("Orient_PR"));		
		}
		OrientHours.sendKeys(hmap.get("OrientHrs"));
		Thread.sleep(1000);
		JoiningBonusAmount.sendKeys(hmap.get("JoiningBonusAmt"));
		lib.select(JoiningBonusID, hmap.get("JoiningBonusType"));
		Thread.sleep(1000);
		CompletionBonusAmount.sendKeys(hmap.get("CompletionBonusAmt"));
		lib.select(CompletionBonusID, hmap.get("CompletionBonusType"));
		Thread.sleep(1000);
		AdditionalBonusAmount.sendKeys(hmap.get("AddBonusAmt"));
		lib.select(AdditionalBonusID, hmap.get("AddBonusType"));
		Thread.sleep(1000);
		ExpReimbursement.sendKeys(hmap.get("Exp_Reimbursement"));
		ExpReimfileUpload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(2000);
		ValidateBtn.click();
		Thread.sleep(3000);
		SubmitApproval.click();
		Thread.sleep(1500);
	}	

	public void OfferMgmt_Manual(Map<String,String> hmap) throws Exception {

		Thread.sleep(2000);
		OfferMgmtTab.click();
		Thread.sleep(1000);
		OffersSubMod.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");		
		Actions actions = new Actions(driver);
		actions.moveToElement(NewOffer);		
		actions.moveToElement(ManualOffer);
		actions.click().build().perform();	
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		Thread.sleep(2000);

		String value = hmap.get("NewClient"); 
		if (value.equalsIgnoreCase("yes")) {
			ClientNewBtn.click();
			Thread.sleep(1000);
			ClientName.sendKeys(hmap.get("Clientname"));
			lib.select(ClientMSP,hmap.get("ClientMSP"));
			MSPFee.sendKeys(hmap.get("ClientFee"));
			NewClientFileUpl.click();
			Thread.sleep(1000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(2000);
			lib.select(Client_TSFreq, hmap.get("ClientTSFreq"));
			Thread.sleep(1000);
			lib.select(Client_TsTemp, hmap.get("ClientTSTemp"));
			Client_Address.sendKeys(hmap.get("Clientadd"));
			Client_City.sendKeys(hmap.get("ClientCity"));
			lib.select(Client_CountryID, hmap.get("ClientCountry"));
			lib.select(Client_StateID, hmap.get("Clientstate"));
			Client_ZipCode.sendKeys(hmap.get("ClientzipCode"));
			lib.select(Client_StatusID, hmap.get("ClientStatus"));
			lib.select(Client_PaymentTerm, hmap.get("Clientpayment"));
			lib.select(InvoiceFlagID, hmap.get("ClientInvFlag"));
			lib.select(InvoiceFreqID, hmap.get("ClientInvFreq"));
			lib.select(InvoiceMethodID, hmap.get("ClientInvMethod"));
			InvoiceEmailID.sendKeys(hmap.get("InvoiceEmailID"));	 		
			try {
				lib.waitForElementLoad(ConsolidatedInv);
				String option =hmap.get("ConsInvoiceValue");
				String ViewEmpPortal = "//*[@id='Client_IsGroupedInvoice'][@value='" + option + "']";
				driver.findElement(By.xpath(ViewEmpPortal)).click();	
			}catch(TimeoutException e) {}	 		
			lib.select(ConsolidatedByID, hmap.get("ConsolidatedBy"));
			Thread.sleep(1000);
			Save.click();
			Thread.sleep(1500);	 

			driver.navigate().refresh();
			Thread.sleep(2000);
			MgmtBtn.click();
			Thread.sleep(1000);
			Workflowmenu.click();		
			lib = new Generic_Methods(driver);
			lib.handlingFrame("frmContent");
			Searchbyword.sendKeys(hmap.get("SrchByWord"));
			AssignedBy.sendKeys(hmap.get("Assignedby"));
			Taskto.sendKeys(hmap.get("TaskApproval"));
			SearchImg.click();
			Thread.sleep(2000);
			ImgBtnTask.click();
			Thread.sleep(2000);
			lib.switchOutOfFrame();	
			ApproveBtn.click();
			Thread.sleep(1500);

			Thread.sleep(2000);
			OfferMgmtTab.click();
			Thread.sleep(1000);
			OffersSubMod.click();		
			lib = new Generic_Methods(driver);
			lib.handlingFrame("frmContent");		
			actions.moveToElement(NewOffer);		
			actions.moveToElement(ManualOffer);
			actions.click().build().perform();	
			Thread.sleep(1000);
			lib.switchOutOfFrame();			
		}	     
		OfferClientName.sendKeys(hmap.get("SelectClient"));
		ClientPopup.click();
		Thread.sleep(1000);	     

		String Option = hmap.get("NewWorkLoc"); 
		if (Option.equalsIgnoreCase("yes")) {
			OnClientLoc.click();
			Thread.sleep(1000);		    	
			lib.select(ClientLocType, hmap.get("NewLocType"));
			ClientLocName.sendKeys(hmap.get("NewLocName"));
			ClientAddLoc.sendKeys(hmap.get("NewLocationAdd"));
			ClientAddCity.sendKeys(hmap.get("NewLocCity"));
			lib.select(ClientCountryID, hmap.get("NewLocCountry"));
			lib.select(ClientStateID, hmap.get("NewLocState"));
			ClientZipcode.sendKeys(hmap.get("NewLocZipCode"));
			ClientPhoneNo.sendKeys(hmap.get("NewLocPhoneNum"));
			try {
				lib.waitForElementLoad(ClientIsActive);
				String option =hmap.get("ISActive");
				String ViewEmpPortal = "//*[@id='ClientLocation_IsActive'][@value='" + option + "']";
				driver.findElement(By.xpath(ViewEmpPortal)).click();
			}catch(TimeoutException e) {}
			Save.click();
			Thread.sleep(1000);		    	 
		}
		ClientWorkLoc.click();
		Thread.sleep(2000);
		lib.select(ClientWorkLoc,hmap.get("WorkLocCheckBox"));	
		Thread.sleep(1500);				


		String ATSOption = hmap.get("NewJob"); 
		if (ATSOption.equalsIgnoreCase("yes")) {
			OnNewJob.click();
			Thread.sleep(2000);
			JobRefNum.sendKeys(hmap.get("ATS_JobNum"));
			PullFromATSBtn.click();
			Thread.sleep(1500);
			lib.select(ATSJobDiv, hmap.get("ATS_JobDivision"));
			String optionText1 =hmap.get("Job_Issuedate");
			long serialNumber = Long.parseLong(optionText1);
			Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
			Date IssueDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
			String DueDate = dateFormat.format(IssueDate);   
			JobIssueDate.clear();
			JobIssueDate.sendKeys(DueDate);
			Thread.sleep(1500);

			String optionText2 =hmap.get("Job_Startdate");
			long serialNumber1 = Long.parseLong(optionText2);
			Date baseDate1 = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
			Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber1-2) + baseDate1.getTime());
			DateFormat dateFormat1 = new SimpleDateFormat("MM/dd/yyyy");
			String StartDate = dateFormat1.format(documentDate);
			JobStartDate.clear();
			JobStartDate.sendKeys(StartDate);
			Thread.sleep(1500);

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
			Save.click();
			Thread.sleep(1500);			    	 
		}
		ATSJobID.click();
		lib.select(ATSJobID, hmap.get("ATS_JobNum"));
		Thread.sleep(1500);


		String CandOption = hmap.get("NewCandidate"); 
		if (CandOption.equalsIgnoreCase("yes")) {
			NewCandBtn.click();
			Thread.sleep(1500);		    	 
			CandEmailID.sendKeys(hmap.get("Email"));
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
		ATAMail.sendKeys(hmap.get("Email"));
		ATSMailPopup.click();
		Thread.sleep(2000);

		RecruiterName.sendKeys(hmap.get("RecName"));
		RecPopup.click();
		TeamLead.sendKeys(hmap.get("TeamLead"));
		TeamLeadPopup.click();
		Thread.sleep(1000);
		lib.select(CandSourceID, hmap.get("CandSource"));
		lib.select(CandVisa, hmap.get("CandVisaType"));
		Thread.sleep(1000);

		String Opt1 =hmap.get("IsOnSiteJob");
		String OnSiteJob = "//*[@id='SubmissionPSN_IsOnsiteJob'][@value='" + Opt1 + "']";
		driver.findElement(By.xpath(OnSiteJob)).click();				
		String Opt2 =hmap.get("IsClinicalJob");
		String ClinicalJob = "//*[@id='IsClinicalJob'][@value='" + Opt2 + "']";
		driver.findElement(By.xpath(ClinicalJob)).click();				
		String Opt3 =hmap.get("CliPatientFacing");
		String ClinicalPF = "//*[@id='IsClinicalPatientFacing'][@value='" + Opt3 + "']";
		driver.findElement(By.xpath(ClinicalPF)).click();
		Thread.sleep(1000);
		lib.select(EmpType, hmap.get("Emp_Type"));

		String Opt4 =hmap.get("ExemptStatus");
		String IsExempt = "//*[@id='CandidateEngageAcceptance_IsNonExempt'][@value='" + Opt4 + "']";
		driver.findElement(By.xpath(IsExempt)).click();		

		lib.select(Payrollfreq, hmap.get("PayrollFreq"));
		PSNNotes.sendKeys(hmap.get("PSNnotes"));
		Thread.sleep(1000);

		String optionText3 =hmap.get("Job_Startdate");
		long serialNumber2 = Long.parseLong(optionText3);
		Date baseDate2 = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
		Date documentDate1 = new Date(TimeUnit.DAYS.toMillis(serialNumber2-2) + baseDate2.getTime());
		DateFormat dateFormat2 = new SimpleDateFormat("MM/dd/yyyy");
		String StartDate1 = dateFormat2.format(documentDate1);
		PSNStartDate.click();
		PSNStartDate.sendKeys(StartDate1);				
		PSNEndDate.click();
		PSNEndDate.sendKeys(hmap.get("Job_Enddate"));
		Thread.sleep(1000);
		PSNStndHrs.sendKeys(hmap.get("PSNStndHrs"));
		lib.select(StndShift, hmap.get("StndShifts"));
		Thread.sleep(1000);
		lib.select(WeekendShift, hmap.get("WeekendShifts"));

		String Opt5 =hmap.get("GurantedHrs");
		String GuarentedHrs = "//*[@id='SubmissionPSN_IsClientOfferGuranteedHours'][@value='" + Opt5 + "']";
		driver.findElement(By.xpath(GuarentedHrs)).click();	
		ClientMinGuatHrs.sendKeys(hmap.get("GuarantedHrs"));
		Thread.sleep(1000);
		CancellableShifts.sendKeys(hmap.get("Cancellable_Shifts"));
		ScheduleNotes.sendKeys(hmap.get("Schedule_Notes"));
		ApprovedTimeoff.sendKeys(hmap.get("App_Timeoff"));
		Thread.sleep(2000);
		RatesTab.click();
		Thread.sleep(1500);
		EABillRate.sendKeys(hmap.get("Reg_BillRate"));
		EAPayRate.sendKeys(hmap.get("Reg_PayRate"));
		Thread.sleep(1000);
		OTBRate.sendKeys(hmap.get("OT_BillRate"));
		OTPRate.sendKeys(hmap.get("OT_PayRate"));

		String Opt6 =hmap.get("ClientPayOTRate");
		String ClientPay = "//*[@id='ISClientPayOTRate'][@value='" + Opt6 + "']";
		driver.findElement(By.xpath(ClientPay)).click();

		String DTOpt =hmap.get("DTRate");
		String DoubleTime = "//*[@id='DoubleTimeRates'][@value='" + DTOpt + "']";
		driver.findElement(By.xpath(DoubleTime)).click();
		if (DTOpt.equalsIgnoreCase("True")) {
			Thread.sleep(1000);
			DTBillRate.click();
			DTBillRate.sendKeys(hmap.get("DT_BR"));
			DTPayRate.click();
			DTPayRate.sendKeys(hmap.get("DT_PR"));		
		}

		String HolOpt =hmap.get("HolRate");
		String Holiday = "//*[@id='HolidayRates'][@value='" + HolOpt + "']";
		driver.findElement(By.xpath(Holiday)).click();
		if (HolOpt.equalsIgnoreCase("True")) {
			HolidayBillRate.click();
			HolidayBillRate.sendKeys(hmap.get("Hol_BR"));
			HolidayPayRate.click();
			HolidayPayRate.sendKeys(hmap.get("Hol_PR"));		
		}

		String OnCallOpt =hmap.get("OnCallRate");
		String Oncall = "//*[@id='OnCallRates'][@value='" + OnCallOpt + "']";
		driver.findElement(By.xpath(Oncall)).click();
		if (OnCallOpt.equalsIgnoreCase("True")) {
			Thread.sleep(1000);
			OnCallBillRate.click();
			OnCallBillRate.sendKeys(hmap.get("OnCall_BR"));
			OnCallPayRate.click();
			OnCallPayRate.sendKeys(hmap.get("OnCall_PR"));		
		}

		String CallbackOpt =hmap.get("CallbackRate");
		String Callback = "//*[@id='CallbackRates'][@value='" + CallbackOpt + "']";
		driver.findElement(By.xpath(Callback)).click();
		if (CallbackOpt.equalsIgnoreCase("True")) {
			Thread.sleep(1000);
			CallbackBillRate.click();
			CallbackBillRate.sendKeys(hmap.get("Callback_BR"));
			CallbackPayRate.click();
			CallbackPayRate.sendKeys(hmap.get("Callback_PR"));		
		}

		String ChargeOpt =hmap.get("ChargeRate");
		String Charge = "//*[@id='ChargeRates'][@value='" + ChargeOpt + "']";
		driver.findElement(By.xpath(Charge)).click();
		if (ChargeOpt.equalsIgnoreCase("True")) {
			Thread.sleep(1000);
			ChargeBillRate.click();
			ChargeBillRate.sendKeys(hmap.get("Charge_BR"));
			ChargePayRate.click();
			ChargePayRate.sendKeys(hmap.get("Charge_PR"));		
		}
		Thread.sleep(1000);
		String OrientOpt =hmap.get("OrientRate");
		String Orientation = "//*[@id='OrientationRates'][@value='" + OrientOpt + "']";
		driver.findElement(By.xpath(Orientation)).click();
		if (OrientOpt.equalsIgnoreCase("True")) {
			Thread.sleep(1000);
			OrientBillRate.click();
			OrientBillRate.sendKeys(hmap.get("Orient_BR"));
			OrientPayRate.click();
			OrientPayRate.sendKeys(hmap.get("Orient_PR"));		
		}
		OrientHours.sendKeys(hmap.get("OrientHrs"));
		Thread.sleep(1000);
		JoiningBonusAmount.sendKeys(hmap.get("JoiningBonusAmt"));
		lib.select(JoiningBonusID, hmap.get("JoiningBonusType"));
		Thread.sleep(1000);
		CompletionBonusAmount.sendKeys(hmap.get("CompletionBonusAmt"));
		lib.select(CompletionBonusID, hmap.get("CompletionBonusType"));
		Thread.sleep(1000);
		AdditionalBonusAmount.sendKeys(hmap.get("AddBonusAmt"));
		lib.select(AdditionalBonusID, hmap.get("AddBonusType"));
		Thread.sleep(1000);
		ExpReimbursement.sendKeys(hmap.get("Exp_Reimbursement"));
		ExpReimfileUpload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(2000);
		ValidateBtn.click();
		Thread.sleep(2000);
		SubmitApproval.click();
		Thread.sleep(1000);
	}	

	public void NewOffer_RecMgrApproval(Map<String,String> hmap) throws Exception {		
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("TaskSrchWord"));
		//SearchWordPopup.click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("TaskApp"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();	
		ApproveBtn.click();
		Thread.sleep(1500);
	}

	public void NewOffer_MgrApproval(Map<String,String> hmap) throws Exception {		
		Thread.sleep(1000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("TaskSrchWord"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.clear();
		Taskto.sendKeys(hmap.get("TaskTo2"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();	
		ApproveBtn.click();
		Thread.sleep(1500);		
	}


	public void OfferMgmtEA_EmailHistory(Map<String,String> hmap) throws Exception 
	{
		Thread.sleep(3000);
		AdminBtn.click();
		Thread.sleep(1000);
		History.click();
		EmailHistory.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		ToEmail.click();
		ToEmail.sendKeys(hmap.get("Email"));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='ddlCategory']")).sendKeys(hmap.get("category"));
		SearchImg.click();
		Thread.sleep(2000);
		Viewlogo.click();
		lib.switchOutOfFrame();

		String str = GetUserPwd.getText();
		String un = str.split("User ID : ")[1].split("Password:")[0];
		String pwd = str.split("Password:")[1].substring(1,7);
		System.out.println(pwd);

		try {
			lib.waitForElementLoad(GetUsrPwdLink);
			Actions a=new Actions(driver);
			a.keyDown(Keys.CONTROL).build().perform();
			GetUsrPwdLink.click();
			a.keyUp(Keys.CONTROL).build().perform();
		} catch (TimeoutException e) {}		

		String parentWindow= driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}}

		UserName.sendKeys(un);
		Password.sendKeys(pwd);
		Login.click();
		Thread.sleep(2000);

		String EAContract =hmap.get("EAContract_Opt");
		String ViewEmpPortal = "//*[@id='IAgree'][@value='" + EAContract + "']";
		driver.findElement(By.xpath(ViewEmpPortal)).click();

		if (EAContract.equalsIgnoreCase("True")) {
			Thread.sleep(1000);
			HomePhone.click();
			HomePhone.sendKeys(hmap.get("Cand_Mobile"));
			SSNNum.click();
			SSNNum.sendKeys(hmap.get("Cand_SSN"));
			ConfirmSSN.click();
			ConfirmSSN.sendKeys(hmap.get("Cand_SSN"));
			DOB.click();
			DOB.sendKeys(hmap.get("Cand_DOB"));
			ConfirmDOB.click();
			ConfirmDOB.sendKeys(hmap.get("Cand_DOB"));	
			Thread.sleep(1000);
			NextBtn.click();
			Thread.sleep(1500);
			ClientTermsAck.click();
			Thread.sleep(1000);
			SubmitBtn.click();
			Thread.sleep(1000);
			driver.close();
		}else {
			Thread.sleep(1000);
			lib.select(EADeclineReason, hmap.get("EADecline_Reason"));
			Thread.sleep(1000);
			NextBtn.click();
			Thread.sleep(1500);
			driver.navigate().refresh();
		}

		driver.switchTo().window(parentWindow);
		Close.click();


	}






}


