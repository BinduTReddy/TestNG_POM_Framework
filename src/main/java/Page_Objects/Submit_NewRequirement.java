package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class Submit_NewRequirement {
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath = "//*[text()='Sales']")
	private WebElement sales;

	@FindBy(xpath="//*[text()='Requirement']")
	private WebElement reqLink;

	@FindBy(xpath="//a[@href='#tabRequirement' and contains(text(),'Requirement')]")
	private WebElement reqLink2;

	@FindBy(xpath="//*[@class='regular ImgbtnAdd']")
	private WebElement newReqBtn;

	@FindBy(xpath="//*[@name='Requirement.RequirementTypeID'][1]")
	private WebElement ReqTypedropdown;

	@FindBy(xpath="//input[@name='ClientID_Display']")
	private WebElement ClientName;

	@FindBy(xpath="//*[@class='ui-corner-all'][1]")
	private WebElement ClientNamedropdown;

	@FindBy(xpath="//*[@id='Requirement_RequirementCategoryID']")
	private WebElement ReqcategoryDropdown;

	@FindBy(xpath="//*[@name='Requirement.RequirementSubCategoryID']")
	private WebElement ReqsubcategoryDropdown;

	@FindBy(xpath="//*[@id='btnNewJobTitle']")
	private WebElement NewJobTitleBtn;

	@FindBy(xpath="//*[@id='JobTitle']")
	private WebElement JobTitle;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//div/button[2]")
	private WebElement JobTitleSave;

	@FindBy(xpath="//*[@id='Requirement_JobTitle']")
	private WebElement reqJobTitle;

	@FindBy(xpath="//body/ul[1]/li/a[1]")
	private WebElement reqJobTitledropdown;

	@FindBy(xpath="//*[@id='Requirement_RequirementNumber']")
	private WebElement ClientReq;

	@FindBy(xpath="//*[@id='Requirement_NoOfPosition']")
	private WebElement NoPositions;

	@FindBy(xpath="//*[@id='Requirement_YearOfExp']")
	private WebElement YearsofExp;

	@FindBy(xpath="//*[@id='Requirement_ReceivedDate']")
	private WebElement RevOn;

	@FindBy(xpath="//*[@id='Requirement_EndDate']")
	private WebElement SubEndDate;

	@FindBy(xpath="//*[@id='Requirement_DurationInYears']")
	private WebElement DurationinYears;

	@FindBy(xpath="//*[@id='Requirement_DurationInMonths']")
	private WebElement AssignmentDuration;

	@FindBy(xpath="//*[@id='Requirement_DurationInDays']")
	private WebElement Durationindays;	

	@FindBy(xpath="//*[@id='Requirement_ProjectStartDate']")
	private WebElement EstStartDate;

	@FindBy(xpath="//*[@id='btnNewHiringContact']")
	private WebElement NewHiringManagerBtn;

	@FindBy(xpath="//*[@id='91'][@name='ContactTypeIDList']")
	private WebElement BillingCheckbox;

	@FindBy(xpath="//*[@name='ClientContact.Contact.FirstName']")
	private WebElement contactFirstName;

	@FindBy(xpath="//*[@name='ClientContact.Contact.LastName']")
	private WebElement ContactLastName;

	@FindBy(xpath="//*[@id='Requirement_HiringMgrContactID']")
	private WebElement HiringManager;

	@FindBy(xpath="//*[@id='Requirement_CurrencyID']")
	private WebElement BillrateCurrency;

	@FindBy(xpath="//*[@id='Requirement_BillFrequencyID']")
	private WebElement Billratetype;

	@FindBy(xpath="//*[@id='Requirement_BillRate']")
	private WebElement BillRatefrom;

	@FindBy(xpath="//*[@id='Requirement_BillRateTo']")
	private WebElement BillRateTo;
	
	@FindBy(xpath="//*[@id='Requirement_PRCurrencyID']")
	private WebElement PayrateCurrency;

	@FindBy(xpath="//*[@id='Requirement_PayFrequencyID']")
	private WebElement Payratetype;

	@FindBy(xpath="//*[@id='Requirement_PayRate']")
	private WebElement payRatefrom;

	@FindBy(xpath="//*[@id='Requirement_PayRateTo']")
	private WebElement payRateTo;

	@FindBy(xpath="//*[@name='EmploymentTypeIDList'][1]")
	private WebElement EmpType;

	@FindBy(xpath="//*[@id='btnAddWorkLocation']")
	private WebElement AddworkLoc;

	@FindBy(xpath="//*[@id='ClientLocation_LocationTypeID']")
	private WebElement LocTypeID;

	@FindBy(xpath="//*[@id='ClientLocation_LocationName']")
	private WebElement LocName;

	@FindBy(xpath="//*[@id='ClientLocation_Address_Address1']")
	private WebElement ClientAddress;

	@FindBy(xpath="//*[@id='ClientLocation_Address_City']")
	private WebElement Clientcity;

	@FindBy(xpath="//*[@id='ClientLocation_Address_CountryID']")
	private WebElement ClientCountry;

	@FindBy(xpath="//*[@id='ClientLocation_Address_StateID']")
	private WebElement Clientstate;

	@FindBy(xpath="//*[@id='ClientLocation_Address_ZipCode']")
	private WebElement ClientZipcode;

	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement SaveBtn;

	@FindBy(xpath="//*[@id='Requirement_WorkLocationID']")
	private WebElement WorkLoc;

	@FindBy(xpath="//div[@class='t-button t-upload-button']")
	private WebElement FileSelect;

	@FindBy(xpath="//*[@id='Requirement_LoadRecruiterBy']")
	private WebElement LoadRecruiter;

	@FindBy(xpath="//*[@id='btnLeadRecruiter']")
	private WebElement lookupRecBtn;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//table/tbody/tr[2]/td[3]/button[1]")
	private WebElement Selectone;

	@FindBy(xpath="//*[@id='Requirement_LeadRecruiterID']")
	private WebElement LeadRecID;

	@FindBy(xpath="//*[@id='btnClientToRecruiter']")
	private WebElement LookupClientRecBtn;

	@FindBy(xpath="//*[@id='Requirement_RecruiterManagerID']")
	private WebElement RecID;

	@FindBy(xpath="//select[@name='Requirement.SalesExecutiveID']")
	private WebElement SalesManager;

	@FindBy(xpath="//*[@id='RequirementDetail_MandatorySkills']")
	private WebElement Mandatoryskills;

	@FindBy(xpath="//*[@class='regular ImgbtnSave']")
	private WebElement savebtn;

	@FindBy(xpath="//*[text()='New Requirement']")
	private WebElement newReqPage;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//table/tbody/tr[2]/td[1]/select")
	private WebElement ClientLookup;

	@FindBy(xpath="//*[@class='shm_link001' and @id='150']")
	private WebElement MgmtBtn;

	@FindBy(xpath="//*[@class='shm_link002' and @id='468']")
	private WebElement Workflowmenu;

	@FindBy(xpath="//*[@id='txtInitiatedMgmtSearch']")
	private WebElement Searchbyword;

	@FindBy(xpath="/html/body/ul[1]/li/a")
	private WebElement AutoPopup;

	@FindBy(xpath="//*[@id='txtAssignedTo']")
	private WebElement AssignedBy;

	@FindBy(xpath="//*[@id='txtMgmtTask']")
	private WebElement Taskto;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchImg;

	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]")
	private WebElement ImgBtnTask;

	@FindBy(xpath="//*[@class='RibbonImgBtnWarper' and @id='ImgBtnOK']")
	private WebElement ApproveBtn;


	public Submit_NewRequirement(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void Create_NewRequirement(Map<String,String> hmap) throws Exception{
		lib = new Generic_Methods(driver);
		Thread.sleep(2000);
		sales.click();
		reqLink.click();
		lib.handlingFrame("frmContent");
		reqLink2.click();
		newReqBtn.click();
		lib.switchOutOfFrame();
//		driver.manage().timeouts().implicitlyWait(9,TimeUnit.SECONDS);
		Thread.sleep(3000);
		lib.select(ReqTypedropdown, hmap.get("RequirementType"));	
		try {
			lib.waitForElementLoad(ClientName);
			ClientName.sendKeys(hmap.get("Clientname"));
			ClientNamedropdown.click();
		}catch(TimeoutException e){}

		lib.select(ReqcategoryDropdown, hmap.get("Reqcategory"));
		lib.select(ReqsubcategoryDropdown, hmap.get("ReqSubcategory"));	

		try {
			lib.waitForElementLoad(ClientReq);
			ClientReq.sendKeys(hmap.get("ClientReqNo"));
		}catch(TimeoutException e){}

		try {
			lib.waitForElementLoad(reqJobTitle);
//			NewJobTitleBtn.click();
//			Thread.sleep(1000);
//			JobTitle.sendKeys(hmap.get("RequirementTitle"));
//			JobTitleSave.click();
//			Thread.sleep(1000);
			reqJobTitle.sendKeys(hmap.get("RequirementTitle"));
		}catch(TimeoutException e) {}

		Thread.sleep(1000);
		reqJobTitledropdown.click();
		Thread.sleep(500);
		lib.select(YearsofExp,hmap.get("Experience"));
		RevOn.clear();
		Thread.sleep(500);
		RevOn.click();
		RevOn.sendKeys(hmap.get("ReceivedOn"));

		try {
			lib.waitForElementLoad(SubEndDate);
			SubEndDate.click();
			SubEndDate.sendKeys(hmap.get("Subenddate"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(DurationinYears);
			DurationinYears.sendKeys(hmap.get("DurInYears"));
		}catch(TimeoutException e){}

		try {
			lib.waitForElementLoad(AssignmentDuration);
			AssignmentDuration.sendKeys(hmap.get("DurInMonths"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(Durationindays);
			Durationindays.sendKeys(hmap.get("DurIndays"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(NoPositions);	
			NoPositions.clear();
			NoPositions.sendKeys(hmap.get("Positions"));
		}catch(TimeoutException e) {}

		EstStartDate.click();
		EstStartDate.sendKeys(hmap.get("Eststartdate"));

		try {
			lib.waitForElementLoad(NewHiringManagerBtn);
			NewHiringManagerBtn.click();
			Thread.sleep(1000);
			BillingCheckbox.click();
			contactFirstName.sendKeys(hmap.get("FirstName"));
			ContactLastName.sendKeys(hmap.get("LastName"));
			SaveBtn.click();
			Thread.sleep(2000);
			lib.select(HiringManager,hmap.get("Hiringmanager"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(BillrateCurrency);
			lib.select(BillrateCurrency,hmap.get("BillrateCurrency"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(Billratetype);
			lib.select(Billratetype,hmap.get("BillRateType"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(BillRatefrom);
			BillRatefrom.sendKeys(hmap.get("BillrateFrom"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(BillRateTo);
			BillRateTo.sendKeys(hmap.get("BillrateTo"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(Payratetype);
			lib.select(Payratetype,hmap.get("PayRateType"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(payRatefrom);
			payRatefrom.sendKeys(hmap.get("PayRateFrom"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(payRateTo);
			payRateTo.sendKeys(hmap.get("PayRateTo"));
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(EmpType);
			EmpType.click();
		}catch(TimeoutException e) {}

		AddworkLoc.click();
		Thread.sleep(1000);
		lib.select(LocTypeID,hmap.get("LocType"));
		Thread.sleep(1000);
		LocName.sendKeys(hmap.get("Locname"));
		ClientAddress.sendKeys(hmap.get("Add"));
		Clientcity.sendKeys(hmap.get("city"));
		lib.select(ClientCountry,hmap.get("country"));
		Thread.sleep(1000);
		lib.select(Clientstate,hmap.get("state"));
		Thread.sleep(1000);
		ClientZipcode.sendKeys(hmap.get("Zipcode"));
		SaveBtn.click();
		Thread.sleep(2000);
		lib.select(WorkLoc,hmap.get("Location"));

		try {
			lib.waitForElementLoad(FileSelect);
			FileSelect.click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath"));
			Thread.sleep(3000);
		}catch(TimeoutException e) {}

		//		try {
		//			lib.waitForElementLoad(SalesManager);
		//			SalesManager.sendKeys(hmap.get("SalesManagerName"));
		//		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(RecID);
			RecID.sendKeys(hmap.get("RecruiterName"));
		}catch(TimeoutException e) {}
		
		try {
			lib.waitForElementLoad(lookupRecBtn);
			lookupRecBtn.click();
			Thread.sleep(2000);
			WebElement List=ClientLookup;
			Select multi = new Select(List);
			multi.selectByIndex(0);
			multi.selectByIndex(1);
			multi.selectByIndex(2);
			multi.selectByIndex(3);
			multi.selectByIndex(4);
			multi.selectByIndex(5);
			multi.selectByIndex(6);
			multi.selectByIndex(7);
			Selectone.click();
			Thread.sleep(1000);
			SaveBtn.click();
			Thread.sleep(2000);			
		}catch(TimeoutException e) {}
		
		lib.select(LeadRecID,hmap.get("LeadRecruiterName"));
		Mandatoryskills.clear();
		Mandatoryskills.sendKeys(hmap.get("MandatorySkills"));
		Thread.sleep(1000);
		savebtn.click();
		Thread.sleep(2000);
	}

	public void Req_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(1000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchKeyword"));
		AutoPopup.click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("Task1"));
		SearchImg.click();
		Thread.sleep(1000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(1000);
		ApproveBtn.click();
		Thread.sleep(2000);
	}
}
