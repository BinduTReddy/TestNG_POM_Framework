package Page_Objects;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class TJCDoc_EmpModule {	
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath="//*[@class='regular ImgbtnAdd']")
	private WebElement OBDocumentsTab;

	@FindBy(xpath="//*[@id='tabStripEmployee']/ul/li[4]/a")
	private WebElement DocTab;

	@FindBy(xpath="//*[@id='tabDocuments']/div/a[1]")
	private WebElement SubDoctab;

	@FindBy(xpath="//*[@id='ddlCategoryType']")
	private WebElement CategoryType;

	@FindBy(xpath="//*[@id='DocumentCategoryID']")
	private WebElement DocCatID;

	@FindBy(xpath="//*[@id='EmployeeDocument_DocumentTypeID']")
	private WebElement DocTypeID;

	@FindBy(xpath="//*[@id='OBMiscDocument_DocumentTypeID']")
	private WebElement OBMiscDocType;

	@FindBy(xpath="//*[@class='t-button t-upload-button']")
	private WebElement Upload;

	@FindBy(xpath="//*[@id='trAttachment']/td//following-sibling::td/div/div/div")
	private WebElement OBDocUpload;

	@FindBy(xpath="//*[@id='DocSupport']/td[2]/div/div/div")
	private WebElement JCSuppDoc;

	@FindBy(xpath="//*[@id='DueDate']")
	private WebElement DueDate;

	@FindBy(xpath="//*[@id='ReasonID']")
	private WebElement ReasonID;

	@FindBy(xpath="//*[@id='Notes']")
	private WebElement Notes;

	@FindBy(xpath="//*[@id='Document_DisplayName']")
	private WebElement DocName;

	@FindBy(xpath="//*[@id='OBMiscDocument_Title']")
	private WebElement OBDocTitle;

	@FindBy(xpath="//*[@id='DocRefNumber']")
	private WebElement DocRefNum;

	@FindBy(xpath="//*[@id='OBMiscDocument_DocRefNumber']")
	private WebElement OBUniqueNum;

	@FindBy(xpath="//*[@id='Document_ValidFromDate']")
	private WebElement ValidFrom;

	@FindBy(xpath="//*[@id='Document_ValidTillDate']")
	private WebElement ValidTill;

	@FindBy(xpath="//*[@id='EmployeeDocument_IsShowEmpPortal']")
	private WebElement ShowEmpPortal;

	@FindBy(xpath="//*[@id='IsForJC'][@value='True']")
	private WebElement RequestExp;

	@FindBy(xpath="//*[@id='EmployeeDocument_StatusID']")
	private WebElement DocStatus;

	@FindBy(xpath="//*[@id='SourceID']")
	private WebElement DocSourceid;

	@FindBy(xpath="//*[@id='PortalName']")
	private WebElement PortalName;

	@FindBy(xpath="//*[@class='regular ImgbtnSave']")
	private WebElement SaveBtn;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//div/button[2]")
	private WebElement OBDocSave;

	@FindBy(xpath="//*[@id='CoverUnderCriminalCheck']")
	private WebElement UnderCriminalCheck;

	@FindBy(xpath="//*[contains(text(),'OK')]")
	private WebElement OkBtn;

	@FindBy(xpath="//*[@class='shm_link001' and @id='380']")
	private WebElement OnBoarding;

	@FindBy(xpath="//*[@class='shm_link002 shm_highLight_2Tier' and @id='381']")
	private WebElement Dashboard;

	@FindBy(xpath="//*[@id='txtCandidateName']")
	private WebElement CandName;

	@FindBy(xpath="//html/body/ul[1]/li/a")
	private WebElement CandPopup;

	@FindBy(xpath="//*[@id='txtClientName']")
	private WebElement ClientName;

	@FindBy(xpath="//html/body/ul[2]/li/a")
	private WebElement ClientPopup;

	@FindBy(xpath="//*[@class=' ImgbtnView  img']")
	private WebElement viewlogo;

	@FindBy(xpath="//*[@id='tabStripOBStatus']/ul/li[4]/a")
	private WebElement AllDoc;

	public TJCDoc_EmpModule(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void EmpModule_TJC_Documents(Map<String,String> hmap) throws Exception {
		lib = new Generic_Methods(driver);
		DocTab.click();
		Thread.sleep(1500);
		SubDoctab.click();
		lib.switchOutOfFrame();	
		lib.select(DocCatID,hmap.get("DocumentCatID"));
		Thread.sleep(1000);
		lib.select(DocTypeID,hmap.get("DocumentTypeID"));
		Thread.sleep(1000);
		Upload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(2500);
		try {
			lib.waitForElementLoad(DocName);
			DocName.sendKeys(hmap.get("DocumentName"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(ValidFrom);
			String optionText1 =hmap.get("DocValidFrom");
			if (optionText1 != null && !optionText1.isEmpty()) {
				long serialNumber = Long.parseLong(optionText1);
				Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
				Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
				String formattedDate = dateFormat.format(documentDate);
				System.out.println(formattedDate);

				String dateOfBirthStr = hmap.get("DOB");
				Date dateOfBirth = new SimpleDateFormat("MM/dd/yyyy").parse(dateOfBirthStr);

				String JC_DocName = hmap.get("DocumentTypeID");
				String StartDate=hmap.get("startDate");
				Date startDate = new SimpleDateFormat("MM/dd/yyyy").parse(StartDate);
				Calendar calendar = Calendar.getInstance();
				calendar.setTime(startDate);
				calendar.add(Calendar.YEAR, -1);
				Date oneYearLater = calendar.getTime();
				calendar.add(Calendar.YEAR, -1); 
				Date twoYearsLater = calendar.getTime();
				calendar.add(Calendar.YEAR, -1); 
				Date threeYearsLater = calendar.getTime();
				calendar.add(Calendar.YEAR, -1); 
				Date fourYearsLater = calendar.getTime();
				calendar.add(Calendar.YEAR, -1); 
				Date fiveYearsLater = calendar.getTime();

				ValidFrom.click();
				ValidFrom.sendKeys(formattedDate);

				if(JC_DocName.equals("Registered Nurse(RN)")|| JC_DocName.equals("LPN/LVN")||JC_DocName.equals("Medical Assistant (MA)")||JC_DocName.equals("APRN")||JC_DocName.equals("Certified Nurses Aid (CNA)")||JC_DocName.equals("Medical Physicist (MP)")
						||JC_DocName.equals("COTA")||JC_DocName.equals("LMFT")||JC_DocName.equals("LPC")||JC_DocName.equals("Medical Technologist (MT/MTL)")||JC_DocName.equals("Occupational Therapist (OT)")
						||JC_DocName.equals("Pharmacist (PharmD)")||JC_DocName.equals("Pharmacy Technician (CPhT)")||JC_DocName.equals("Phlebotomist")||JC_DocName.equals("Physical Therapist (PT)")
						||JC_DocName.equals("Physical Therapy Assistant (PTA)")||JC_DocName.equals("Primary Source Verification (Others)")||JC_DocName.equals("Primary Source Verification (Nursys)")||JC_DocName.equals("RRT/CRT")||JC_DocName.equals("LSW/LCSW/LISW/LMSW")
						||JC_DocName.equals("SLP")||JC_DocName.equals("Physical License")||JC_DocName.equals("SPT")||JC_DocName.equals("Surgical Technician")
						||JC_DocName.equals("Others")||JC_DocName.equals("AWHONN")||JC_DocName.equals("Other Certifications")||JC_DocName.equals("Hepatitis A Titers/Series of vaccine")
						||JC_DocName.equals("Hepatitis B Titers/Series of vaccine")||JC_DocName.equals("Hepatitis C Titers/Series of vaccine")||JC_DocName.equals("MMR Tites/Series of vaccine")||JC_DocName.equals("Varicella Titers/Series of vaccine"))
				{
					if(documentDate.before(dateOfBirth)){
						lib.select(DocStatus,hmap.get("DocumentStatus"));
						SaveBtn.click();
						Assert.fail("Document does not meet validation");
					}}
				else if (JC_DocName.equals("Skills Checklist")||JC_DocName.equals("Healthcare Staffing Orientation")||JC_DocName.equals("NIHSS")||JC_DocName.equals("Crisis Prevention Institute (CPI)")||JC_DocName.equals("Core l")||JC_DocName.equals("Core ll")
						||JC_DocName.equals("Core lll")||JC_DocName.equals("Speciality I")||JC_DocName.equals("Speciality II")||JC_DocName.equals("Speciality III")||JC_DocName.equals("Prevention Medication Errors")||JC_DocName.equals("Criminal Check")
						||JC_DocName.equals("Pharmacology")||JC_DocName.equals("HSH Combined Core")||JC_DocName.equals("T-Spot/TB Gold/TB Skin Test")||JC_DocName.equals("TB Questionnaire")||JC_DocName.equals("Physical Exam")||JC_DocName.equals("Fit test")||JC_DocName.equals("Color Vision test")
						||JC_DocName.equals("Criminal Check")||JC_DocName.equals("Education Verification")|| JC_DocName.equals("Employment Verification (7 Years)")|| JC_DocName.equals("Reference Checks)")||JC_DocName.equals("Declinations")||JC_DocName.equals("Exemptions")
						||JC_DocName.equals("Drug Test")|| JC_DocName.equals("OIG")|| JC_DocName.equals("SAM")|| JC_DocName.equals("OFAC")|| JC_DocName.equals("National Sex Offender")|| JC_DocName.equals("Fingerpritning")|| JC_DocName.equals("Other Background releted documents")||JC_DocName.equals("FACIS 3"))
				{
					if(documentDate.before(oneYearLater)) {
						lib.select(DocStatus,hmap.get("DocumentStatus"));
						SaveBtn.click();
						Assert.fail("Document does not meet validation");
					}}
				else if (JC_DocName.equals("Basic Life Support (BLS)")||JC_DocName.equals("ACLS")||JC_DocName.equals("PALS")||JC_DocName.equals("NRP")||JC_DocName.equals("ACS")
						||JC_DocName.equals("ARRT")||JC_DocName.equals("Certified Nursing Assistant (CNA)")||JC_DocName.equals("Certified Medical Technologist (CMT)")||JC_DocName.equals("Certified Nuclear Medicine Technologist (CNMT)")
						||JC_DocName.equals("Certified Pharmacy Technician (CPhT)")||JC_DocName.equals("Certified Surgical First Assistants (CSFA)")||JC_DocName.equals("Medical Coder (CPC, COC, CIC, CRC, Specialty)")||JC_DocName.equals("Neonatal STABLE Program"))
				{
					if(documentDate.before(twoYearsLater)) {
						lib.select(DocStatus,hmap.get("DocumentStatus"));
						SaveBtn.click();
						Assert.fail("Document does not meet validation");
					}}
				else if (JC_DocName.equals("Behavioral Health Certificate"))
				{
					if(documentDate.before(threeYearsLater)) {
						lib.select(DocStatus,hmap.get("DocumentStatus"));
						SaveBtn.click();
						Assert.fail("Document does not meet validation");
					}}
				else if (JC_DocName.equals("TNCC")||JC_DocName.equals("Certified Cardiographic Technician (CCT)")||JC_DocName.equals("Certified Respiratory Therapist (CRT)")
						||JC_DocName.equals("Certified Surgical Technologists (CST)")||JC_DocName.equals("Emergency Nursing Pediatric Course (ENPC)"))
				{
					if(documentDate.before(fourYearsLater)) {
						lib.select(DocStatus,hmap.get("DocumentStatus"));
						SaveBtn.click();
						Assert.fail("Document does not meet validation");
					}}
				else if (JC_DocName.equals("ARDMS")||JC_DocName.equals("Certified Medical Assistant (CMA)")||JC_DocName.equals("Nephrology Nursing Certification Commission")||JC_DocName.equals("Chest Xray"))
				{
					if(documentDate.before(fiveYearsLater)) {					
						lib.select(DocStatus,hmap.get("DocumentStatus"));
						SaveBtn.click();
						Assert.fail("Document does not meet validation");
					}}
			}}catch (TimeoutException e) {} 
		catch (ParseException e) {}

		try {
			lib.waitForElementLoad(ValidTill);
			String optionText1 =hmap.get("DocValidTill");
			if (optionText1 != null && !optionText1.isEmpty()) {
				long serialNumber = Long.parseLong(optionText1);
				Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
				Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
				String TillDate = dateFormat.format(documentDate);   
				ValidTill.click();
				ValidTill.sendKeys(TillDate);}
		} catch (TimeoutException e) {}

		try {
			lib.waitForElementLoad(DocStatus);	
			lib.select(DocStatus,hmap.get("DocumentStatus"));
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(DocRefNum);
			DocRefNum.sendKeys(hmap.get("DocUniqueId"));
		}catch(TimeoutException e) {}

		lib.select(DocSourceid,hmap.get("DocumentSourceid"));

		try {
			lib.waitForElementLoad(PortalName);
			if (PortalName.isEnabled()) {
				lib.select(PortalName,hmap.get("DocumentPortal"));}
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(ShowEmpPortal);
			String optionText2 =hmap.get("ShowEmpPortal");
			String ViewEmpPortal = "//*[@id='EmployeeDocument_IsShowEmpPortal'][@value='" + optionText2 + "']";
			driver.findElement(By.xpath(ViewEmpPortal)).click();	
		}catch(TimeoutException e) {}

		SaveBtn.click();
		Thread.sleep(2000);
	}

	public void OB_TJC_DocTab(Map<String,String> hmap) throws Exception {
		driver.navigate().refresh();
		lib = new Generic_Methods(driver);
		OnBoarding.click();
		lib.handlingFrame("frmContent");
		Thread.sleep(2000);
		CandName.sendKeys(hmap.get("EmpName"));
		//CandPopup.click();
		ClientName.sendKeys(hmap.get("Clientname"));
		ClientName.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		viewlogo.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		Thread.sleep(1500);
	}

	public void OB_TJC_Documents(Map<String,String> hmap) throws Exception {
		Thread.sleep(1500);
		lib = new Generic_Methods(driver);		
		AllDoc.click();
		OBDocumentsTab.click();
		Thread.sleep(1000);
		lib.select(CategoryType, hmap.get("CategoryType"));
		Thread.sleep(1000);
		lib.select(DocCatID,hmap.get("DocumentCatID"));
		Thread.sleep(1000);
		String DocTypeName = hmap.get("DocumentTypeID");
		lib.select(OBMiscDocType,hmap.get("DocumentTypeID"));
		Thread.sleep(1000);

		if(DocTypeName.equals("Drug Test")||DocTypeName.equals("Education Verification")||DocTypeName.equals("Employment Verification (7 Years)")||
				DocTypeName.equals("FACIS 3")||DocTypeName.equals("Fingerprinting")||DocTypeName.equals("National Sex Offender")||
				DocTypeName.equals("OFAC")||DocTypeName.equals("OIG ")||DocTypeName.equals("Other Background releted documents")||
				DocTypeName.equals("Reference Checks")||DocTypeName.equals("SAM"))
		{
			try {
				lib.waitForElementLoad(UnderCriminalCheck);
				UnderCriminalCheck.click();
			}catch(TimeoutException e) {}

			try {
				lib.waitForElementLoad(OBDocTitle);
				OBDocTitle.sendKeys(hmap.get("DocumentName"));
			}catch(TimeoutException e) {}
			try {
				lib.waitForElementLoad(ValidFrom);
				String optText1 =hmap.get("DocValidFrom1");
				if (optText1 != null && !optText1.isEmpty()) {
					long serialNumber = Long.parseLong(optText1);
					Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
					Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
					DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
					String formattedDate = dateFormat.format(documentDate);
					ValidFrom.click();
					ValidFrom.sendKeys(formattedDate);
					Thread.sleep(500);
					OBDocSave.click();
					Thread.sleep(2000);
				}}catch(TimeoutException e) {}

			try {
				lib.waitForElementLoad(ValidFrom);
				String optText2 =hmap.get("DocValidFrom");
				if (optText2 != null && !optText2.isEmpty()) {
					long serialNumber = Long.parseLong(optText2);
					Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
					Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
					DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
					String formattedDate = dateFormat.format(documentDate);
					ValidFrom.clear();
					ValidFrom.click();
					ValidFrom.sendKeys(formattedDate);} 
			}catch (ParseException e) {}
			try {
				lib.waitForElementLoad(ValidTill);
				String optionText1 =hmap.get("DocValidTill");
				if (optionText1 != null && !optionText1.isEmpty()) {
					long serialNumber = Long.parseLong(optionText1);
					Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
					Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
					DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
					String TillDate = dateFormat.format(documentDate);   
					ValidTill.click();
					ValidTill.sendKeys(TillDate);}
			} catch (TimeoutException e) {}

		}else {
			try {
				lib.waitForElementLoad(OBDocTitle);
				OBDocTitle.sendKeys(hmap.get("DocumentName"));
			}catch(TimeoutException e) {}
			Thread.sleep(500);
			try {
				lib.waitForElementLoad(DocName);
				DocName.sendKeys(hmap.get("DocumentName"));
			}catch(TimeoutException e) {}
			try {
				lib.waitForElementLoad(ValidFrom);
				String optText1 =hmap.get("DocValidFrom1");
				if (optText1 != null && !optText1.isEmpty()) {
					long serialNumber = Long.parseLong(optText1);
					Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
					Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
					DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
					String formattedDate = dateFormat.format(documentDate);
					ValidFrom.click();
					ValidFrom.sendKeys(formattedDate);
					Thread.sleep(500);
					OBDocSave.click();
					Thread.sleep(2000);
				}}catch(TimeoutException e) {}

			try {
				lib.waitForElementLoad(ValidFrom);
				String optText2 =hmap.get("DocValidFrom");
				if (optText2 != null && !optText2.isEmpty()) {
					long serialNumber = Long.parseLong(optText2);
					Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
					Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
					DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
					String formattedDate = dateFormat.format(documentDate);
					ValidFrom.clear();
					ValidFrom.click();
					ValidFrom.sendKeys(formattedDate);
					Thread.sleep(500);
				} } 
			catch (ParseException e) {}
			try {
				lib.waitForElementLoad(ValidTill);
				String optionText1 =hmap.get("DocValidTill");
				if (optionText1 != null && !optionText1.isEmpty()) {
					long serialNumber = Long.parseLong(optionText1);
					Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
					Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
					DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
					String TillDate = dateFormat.format(documentDate);   
					ValidTill.click();
					ValidTill.sendKeys(TillDate);
				}
			} catch (TimeoutException e) {}
			Thread.sleep(500);
			OBDocUpload.click();
			Thread.sleep(1000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(4000);
			try {
				lib.waitForElementLoad(OBUniqueNum);
				OBUniqueNum.sendKeys(hmap.get("DocUniqueId"));
				Thread.sleep(500);
			}catch(TimeoutException e) {}	
			lib.select(DocSourceid,hmap.get("DocumentSourceid"));
		}

		try {
			lib.waitForElementLoad(RequestExp);
			String optionText2 =hmap.get("ReqExp");
			String ViewEmpPortal = "//*[@id='IsForJC'][@value='" + optionText2 + "']";
			driver.findElement(By.xpath(ViewEmpPortal)).click();	

			if(RequestExp.isSelected()){
				OBDocSave.click();
				Thread.sleep(2000);
				JCSuppDoc.click();
				Thread.sleep(1000);
				Runtime.getRuntime().exec(props.getProperty("filepath3"));
				Thread.sleep(3000);

				String optionText1 =hmap.get("ExpDuedate");
				long serialNumber = Long.parseLong(optionText1);
				Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
				Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
				DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
				String Duedate = dateFormat.format(documentDate);   
				DueDate.click();
				DueDate.sendKeys(Duedate);

				lib.select(ReasonID, hmap.get("Reason"));
				Thread.sleep(1500);
				Notes.sendKeys(hmap.get("Notes"));		
			}
		}catch(TimeoutException e) {}

		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotDestination = "C:\\Users\\Public\\JC\\" + DocTypeName + ".png";
		try {
			FileUtils.copyFile(screenshotFile, new File(screenshotDestination));
		} catch (IOException e) {}

		OBDocSave.click();
		try {
			lib.waitForElementLoad(OkBtn);
			OkBtn.click();
			Thread.sleep(500);
		}catch(TimeoutException e) {}
	}

}