package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

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

public class BG_Check_Sterling {

	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

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

	@FindBy(xpath="//*[@id='tabStripOBStatus']/ul/li[2]/a")
	private  WebElement Summaraytab;

	@FindBy(xpath="//*[@id='tabStripOBStatus']/ul/li[1]/a")
	private WebElement Dashboardtab;

	@FindBy(xpath="//a[normalize-space()='Initiate']")
	private WebElement InitiateBtn;

	@FindBy(xpath="//td[text()='Pending Background Check - Consent']/following-sibling::td[@class='t-last']/input[@type='checkbox']")
	private WebElement BGCheckDoc;

	@FindBy(xpath="//*[@id='tdDocUpload']/a/img")
	private WebElement UploadDoc1;

	@FindBy(xpath="//*[@class='t-widget t-upload']/div/div")
	private WebElement fileUpload;

	@FindBy(xpath="//*[@type='button'][contains(text(),'Save')]")
	private WebElement DocSaveBtn;

	@FindBy(xpath="//*[@id='tabOBDashboard']//table[7]/tbody/tr[3]/td[5]/a/img")
	private WebElement ApproveBtn2;

	@FindBy(xpath="//input[@id='VerifyDoc']")
	private WebElement VerifySignature;

	@FindBy(xpath="//button[contains(text(),'Approve')]")
	private WebElement ApproveBtn;

	@FindBy(xpath="//*[contains(text(),' Sterling')]//following::td/div/a")
	private WebElement SterlingLaunchBtn;

	@FindBy(xpath="//input[@id='txtPackageName']")
	private WebElement PackageName;

	@FindBy(xpath="/html/body/ul/li/a")
	private WebElement PackageNamePopup;

	@FindBy(xpath="//div[@class='msg_head']//img")
	private WebElement PackagePlusIcon;

	@FindBy(xpath="//div[@class='msg_head']//td[2]/div/a")
	private WebElement LaunchBtn;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']/table[1]/tbody/tr/td[2]/table/tbody/tr[2]/td")
	private WebElement ScreeningType;

	@FindBy(xpath="//*[@id='BackGroundCheck_BG_BackgroundCheck_Notes']")
	private WebElement BG_Notes;

	@FindBy(xpath="//input[@id='BackGroundCheck_BG_BackgroundCheck_DateOfBirth']")
	private WebElement BG_DOB;

	@FindBy(xpath="//input[@id='BackGroundCheck_BG_BackgroundCheck_SSN']")
	private WebElement BG_SSN;

	@FindBy(xpath="//*[@id='BackGroundCheck_BG_BackgroundCheck_GenderID']")
	private WebElement BG_GenderID;

	@FindBy(xpath="//*[@name='Screening.Screening.LicenseType']")
	private WebElement Cred_LicenceType;

	@FindBy(xpath="//*[@name='Screening.Screening.LicenseAgencyName']")
	private WebElement Cred_IssuingAgency;

	@FindBy(xpath="//*[@name='Screening.Screening.LicenseStartDate']")
	private WebElement Cred_StartDate;

	@FindBy(xpath="//*[@name='Screening.Screening.LicenseEndDate']")
	private WebElement Cred_EndDate;

	@FindBy(xpath="//*[@name='Screening.Screening.LicenseNumber']")
	private WebElement Cred_LicenseNumber;

	@FindBy(xpath="//*[@id='BackGroundCheck_BG_BackgroundCheck_DriverLicense']")
	private WebElement BG_DriverLicense;

	@FindBy(xpath="//*[@id='BackGroundCheck_BG_BackgroundCheck_DriverLicenseStateID']")
	private WebElement BG_stateIssuedDL;

	@FindBy(xpath="//*[@name='ScreeningEducationList[0].InstitutionName']")
	private WebElement BG_EduInstName;

	@FindBy(xpath="//*[@name='ScreeningEducationList[0].CompletedTypeID']")
	private WebElement BG_EduCmptdTypeID;

	@FindBy(xpath="//*[@name='ScreeningEducationList[0].StateID']")
	private WebElement BG_EduStateID;

	@FindBy(xpath="//*[@name='ScreeningEducationList[0].InstitutionTypeID']")
	private WebElement BG_InstTypeID;

	@FindBy(xpath="//*[@name='ScreeningEducationList[0].StartDate']")
	private WebElement BG_StartDate;

	@FindBy(xpath="//*[@name='ScreeningEducationList[0].EndDate']")
	private WebElement BG_EndDate;

	@FindBy(xpath="//*[@name='ScreeningEducationList[0].Speciality']")
	private WebElement BG_Speciality;

	@FindBy(xpath="//*[@id='ScreeningEducationList[0].CandidateOtherName']")
	private WebElement BG_AttendanceName;

	@FindBy(xpath="//*[@name='ScreeningIEducationList[1].InstitutionName']")
	private WebElement BG_IEduInstName;

	@FindBy(xpath="//*[@name='ScreeningIEducationList[1].StartDate']")
	private WebElement BG_IEduStartDate;

	@FindBy(xpath="//*[@name='ScreeningIEducationList[1].EndDate']")
	private WebElement BG_IEduEndDate;

	@FindBy(xpath="//*[@name='ScreeningIEducationList[1].InstitutionCountryID']")
	private WebElement BG_IEduCountryID;

	@FindBy(xpath="//*[@name='ScreeningIEducationList[1].InstitutionTypeID']")
	private WebElement BG_IEduInstTypeID;

	@FindBy(xpath="//*[@name='ScreeningIEducationList[1].Region']")
	private WebElement BG_IEduRegion;

	@FindBy(xpath="//*[@name='ScreeningIEducationList[1].Speciality']")
	private WebElement BG_IEduSpec;

	@FindBy(xpath="//*[@name='ScreeningEmployementList[1].CompanyName']")
	private WebElement EmploymentVer_CompName;

	@FindBy(xpath="//*[@name='ScreeningEmployementList[1].StateID']")
	private WebElement EmploymentVer_StateID;

	@FindBy(xpath="//*[@name='ScreeningEmployementList[1].StartDate']")
	private WebElement EmploymentVer_StartDate;

	@FindBy(xpath="//*[@name='ScreeningEmployementList[1].EndDate']")
	private WebElement EmploymentVer_EndDate;

	@FindBy(xpath="//*[@name='ScreeningEmployementList[1].City']")
	private WebElement EmploymentVer_City;

	@FindBy(xpath="//*[@name='ScreeningEmployementList[1].ReferencePhoneNumber']")
	private WebElement EmploymentVer_PhoneNo;

	@FindBy(xpath="//*[@id='BackGroundCheck_BG_BackgroundCheck_CriminalCountryID']")
	private WebElement Intl_CriminalSearch;

	@FindBy(xpath="//*[@name='ScreeningIEmployment[1].ScreeningEmployment.CompanyName']")
	private WebElement Intl_EmploymentVer_CompName;

	@FindBy(xpath="//*[@name='ScreeningIEmployment[1].ScreeningEmployment.CountryID']")
	private WebElement Intl_EmploymentVer_CountryID;

	@FindBy(xpath="//*[@name='ScreeningIEmployment[1].ScreeningEmployment.StartDate']")
	private WebElement Intl_EmploymentVer_StartDate;

	@FindBy(xpath="//*[@name='ScreeningIEmployment[1].ScreeningEmployment.EndDate']")
	private WebElement Intl_EmploymentVer_EndDate;

	@FindBy(xpath="//*[@name='ScreeningIEmployment[1].ScreeningEmployment.City']")
	private WebElement Intl_EmploymentVer_City;

	@FindBy(xpath="//*[@name='ScreeningIEmployment[1].ScreeningEmployment.ReferencePhoneNumber']")
	private WebElement Intl_EmploymentVer_PhoneNo;

	@FindBy(xpath="//*[@name='ScreeningIEmployment[1].ScreeningEmployment.Region']")
	private WebElement Intl_EmploymentVer_Region;

	@FindBy(xpath="//*[@id='Screening_Screening_ReferenceFirstName']")
	private WebElement BG_PerFirstName;

	@FindBy(xpath="//*[@id='Screening_Screening_ReferenceLastName']")
	private WebElement BG_PerLastName;

	@FindBy(xpath="//*[@id='Screening_Screening_ReferencePhoneNumber']")
	private WebElement BG_PerPhoneNum;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement SaveBtn;

	@FindBy(xpath="//*[@id='username']")
	private WebElement SterlingUserName;

	@FindBy(xpath="//*[@id='password']")
	private WebElement SterlingPwd;

	@FindBy(xpath="//*[@type='submit']")
	private WebElement SubmitBtn;

	@FindBy(xpath="//*[@type='search']")
	private WebElement SearchFilter;

	@FindBy(xpath="//*[@id='screening-list']//tbody/tr[1]")
	private WebElement ScreeningList;

	@FindBy(xpath="//*[@class='sub-items']//tbody[1]/tr[5]//td[@class='button']")
	private WebElement SSNTrace_ActionBtn;

	@FindBy(xpath="//*[@class='sub-items']//tbody[2]/tr[5]//td[@class='button']")
	private WebElement CriminalSearch_ActionBtn;

	@FindBy(xpath="//*[@class='sub-items']//tbody[3]/tr[5]//td[@class='button']")
	private WebElement LocatorSelect_ActionBtn;

	@FindBy(xpath="//*[@class='sub-items']//tbody[4]/tr[5]//td[@class='button']")
	private WebElement LocCountryValidator_ActionBtn;

	@FindBy(xpath="//*[@class='sub-items']//tbody[5]/tr[5]//td[@class='button']")
	private WebElement DOJOffender_ActionBtn;

	@FindBy(xpath="//*[@id='tabOBDashboard']/div[4]/table[2]//a/span")
	private WebElement BGView;

	@FindBy(xpath="//*[@onclick='SterlingRefresh()']")
	private WebElement Refresh;

	public BG_Check_Sterling(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}


	public void OB_BackGroundCheck(Map<String,String> hmap) throws Exception{
		driver.navigate().refresh();
		Thread.sleep(2500);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		lib = new Generic_Methods(driver);
		OnBoarding.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		Thread.sleep(2000);
		CandName.sendKeys(hmap.get("EmpName"));
		//		Thread.sleep(1000);
		//		CandPopup.click();
		Thread.sleep(2000);
		ClientName.sendKeys(hmap.get("Clientname"));
		ClientName.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		viewlogo.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);		

		InitiateBtn.click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

		try {
			lib.waitForElementLoad(BGCheckDoc);
			String optionText =hmap.get("AddDoc");
			String BG_check = "//td[text()='"+ optionText +"']/following-sibling::td[@class='t-last']/input[@type='checkbox']";
			driver.findElement(By.xpath(BG_check)).click();
			DocSaveBtn.click();
			Thread.sleep(1500);
			Summaraytab.click();
			Thread.sleep(1500);
			Dashboardtab.click();
			Thread.sleep(2000);

			js.executeScript("arguments[0].scrollIntoView();", UploadDoc1);
			UploadDoc1.click();
			Thread.sleep(1000);
			fileUpload.click();
			Thread.sleep(1000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(2000);
			SaveBtn.click();
			Thread.sleep(2000);
			ApproveBtn2.click();
			Thread.sleep(1000);
			VerifySignature.click();
			ApproveBtn.click();
			Thread.sleep(1500);
		} catch (TimeoutException e) {}

		InitiateBtn.click();
		Thread.sleep(2000);		
		SterlingLaunchBtn.click();
		Thread.sleep(1500);

		String Ster_Opt=hmap.get("Sterling_PackageName");
		String Ster_PackName = "//div[@class='msg_head'][contains(., '"+ Ster_Opt +"')]//td[2]";
		driver.findElement(By.xpath(Ster_PackName)).click();
		Thread.sleep(3000);

		lib.select(BG_GenderID, hmap.get("gender"));			
		BG_Notes.sendKeys(hmap.get("BG_Notes"));
		Thread.sleep(1000);

		String ScreeningTypeText = ScreeningType.getText();
		System.out.println(ScreeningTypeText);

		if(ScreeningTypeText.equals("Screening Type - Basic Package"))
		{
			BG_PerFirstName.sendKeys(hmap.get("Per_Fname"));
			BG_PerLastName.sendKeys(hmap.get("Per_Lname"));
			BG_PerPhoneNum.click();
			BG_PerPhoneNum.sendKeys(hmap.get("Per_PhoneNum"));
			Thread.sleep(1000);
		}
		else if(ScreeningTypeText.equals("Screening Type - Advanced Package")) 
		{
			BG_DriverLicense.sendKeys(hmap.get("LicNo_DR"));
			lib.select(BG_stateIssuedDL, hmap.get("LicState_DR"));
			Thread.sleep(1000);

			//			BG_EduInstName.sendKeys(hmap.get("EduVer_InstName"));
			lib.select(BG_EduCmptdTypeID,hmap.get("EduVer_DegComp"));
			//			lib.select(BG_EduStateID,hmap.get("EduVer_InstState"));
			lib.select(BG_InstTypeID, hmap.get("EduVer_SchoolType"));
			//			BG_StartDate.click();
			//			BG_StartDate.sendKeys(hmap.get("EduVer_StartDate"));
			//			Thread.sleep(1000);
			//			BG_EndDate.click();
			//			BG_EndDate.sendKeys(hmap.get("EduVer_EndDate"));		
			BG_Speciality.sendKeys(hmap.get("EduVer_DegName"));
			Thread.sleep(1500);

			BG_IEduInstName.sendKeys(hmap.get("IntEduVer_Inst"));
			BG_IEduStartDate.click();
			BG_IEduStartDate.sendKeys(hmap.get("IEduVer_Startdate"));
			Thread.sleep(1000);
			BG_IEduEndDate.click();
			BG_IEduEndDate.sendKeys(hmap.get("IEduVer_EndDate"));
			lib.select(BG_IEduCountryID,hmap.get("IEduVer_InstCountry"));
			lib.select(BG_IEduInstTypeID,hmap.get("IEduVer_SchoolType"));
			BG_IEduRegion.sendKeys(hmap.get("IEduVer_Region"));
			BG_IEduSpec.sendKeys(hmap.get("IEduVer_DegreeName"));
			Thread.sleep(1000);

			EmploymentVer_CompName.clear();
			EmploymentVer_CompName.sendKeys(hmap.get("EmplVer_EmpName"));
			String ExpValue=hmap.get("Empl_Curr");
			String CurrentEmp = "//*[@name='ScreeningEmployementList[1].IsPresentEmployer'][@value='" + ExpValue + "']";
			Thread.sleep(1000);
			driver.findElement(By.xpath(CurrentEmp)).click();
			Thread.sleep(500);
			lib.select(EmploymentVer_StateID,hmap.get("Empl_State"));
			EmploymentVer_StartDate.clear();
			EmploymentVer_StartDate.click();
			EmploymentVer_StartDate.sendKeys(hmap.get("Empl_StartDate"));
			EmploymentVer_EndDate.clear();
			EmploymentVer_EndDate.click();
			EmploymentVer_EndDate.sendKeys(hmap.get("Empl_EndDate"));
			EmploymentVer_City.clear();
			EmploymentVer_City.click();
			EmploymentVer_City.sendKeys(hmap.get("Empl_City"));
			EmploymentVer_PhoneNo.click();
			EmploymentVer_PhoneNo.sendKeys(hmap.get("Empl_PhoneNum"));
			Thread.sleep(1500);

			lib.select(Intl_CriminalSearch, hmap.get("Intl_CrimSrch_ctry"));

			Intl_EmploymentVer_CompName.sendKeys(hmap.get("IntlEmpl_EmpName"));
			String IEmplOption=hmap.get("IntlEmpl_CurrEmpl");
			String CurrEmpl = "//*[@name='ScreeningIEmployment[1].ScreeningEmployment.IsPresentEmployer'][@value='" + IEmplOption + "']";
			Thread.sleep(1000);
			driver.findElement(By.xpath(CurrEmpl)).click();
			Thread.sleep(500);
			lib.select(Intl_EmploymentVer_CountryID,hmap.get("IntlEmpl_Country"));
			Intl_EmploymentVer_StartDate.click();
			Intl_EmploymentVer_StartDate.sendKeys(hmap.get("IntlEmpl_StartDate"));
			Intl_EmploymentVer_EndDate.click();
			Intl_EmploymentVer_EndDate.sendKeys(hmap.get("IntlEmpl_EndDate"));
			Intl_EmploymentVer_City.click();
			Intl_EmploymentVer_City.sendKeys(hmap.get("IntlEmpl_City"));
			Intl_EmploymentVer_PhoneNo.click();
			Intl_EmploymentVer_PhoneNo.sendKeys(hmap.get("IntlEmpl_PhoneNum"));
			Intl_EmploymentVer_Region.sendKeys(hmap.get("IntlEmpl_Region"));
			Thread.sleep(1500);
		}else if(ScreeningTypeText.equals("Screening Type - Advanced Package(New)")) 
		{
			Cred_LicenceType.sendKeys(hmap.get("Cred_LicType"));
			Cred_IssuingAgency.sendKeys(hmap.get("Cred_IssAgency"));
			Cred_StartDate.click();
			Cred_StartDate.sendKeys(hmap.get("Cred_StartDate"));
			Cred_EndDate.click();
			Cred_EndDate.sendKeys(hmap.get("Cred_EndDate"));
			Cred_LicenseNumber.sendKeys(hmap.get("Cred_LicNum"));
			Thread.sleep(1500);

			BG_DriverLicense.sendKeys(hmap.get("LicNo_DR"));
			lib.select(BG_stateIssuedDL, hmap.get("LicState_DR"));
			Thread.sleep(1000);

			//						BG_EduInstName.sendKeys(hmap.get("EduVer_InstName"));
			lib.select(BG_EduCmptdTypeID,hmap.get("EduVer_DegComp"));
			//			lib.select(BG_EduStateID,hmap.get("EduVer_InstState"));
			lib.select(BG_InstTypeID, hmap.get("EduVer_SchoolType"));
			//						BG_StartDate.click();
			//						BG_StartDate.sendKeys(hmap.get("EduVer_StartDate"));
			//						Thread.sleep(1000);
			//						BG_EndDate.click();
			//						BG_EndDate.sendKeys(hmap.get("EduVer_EndDate"));		
			BG_Speciality.sendKeys(hmap.get("EduVer_DegName"));
			Thread.sleep(1500);

			BG_IEduInstName.sendKeys(hmap.get("IntEduVer_Inst"));
			BG_IEduStartDate.click();
			BG_IEduStartDate.sendKeys(hmap.get("IEduVer_Startdate"));
			Thread.sleep(1000);
			BG_IEduEndDate.click();
			BG_IEduEndDate.sendKeys(hmap.get("IEduVer_EndDate"));
			lib.select(BG_IEduCountryID,hmap.get("IEduVer_InstCountry"));
			lib.select(BG_IEduInstTypeID,hmap.get("IEduVer_SchoolType"));
			BG_IEduRegion.sendKeys(hmap.get("IEduVer_Region"));
			BG_IEduSpec.sendKeys(hmap.get("IEduVer_DegreeName"));
			Thread.sleep(1000);

			BG_PerFirstName.sendKeys(hmap.get("Per_Fname"));
			BG_PerLastName.sendKeys(hmap.get("Per_Lname"));
			BG_PerPhoneNum.click();
			BG_PerPhoneNum.sendKeys(hmap.get("Per_PhoneNum"));
			Thread.sleep(1000);			
		}			
		SaveBtn.click();
		Thread.sleep(3000);

		String secondWebsiteURL = hmap.get("SterlingURL");
		js.executeScript("window.open(arguments[0], '_blank')", secondWebsiteURL);
		String firstTab = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		String secondTab = "";
		for (String handle : windowHandles) {
			if (!handle.equals(firstTab)) {
				secondTab = handle;
				break;
			}}
		driver.switchTo().window(secondTab);
		Thread.sleep(1500);
		SterlingUserName.sendKeys(hmap.get("Sterling_UserName"));
		SterlingPwd.sendKeys(hmap.get("Sterling_Pwd"));
		Thread.sleep(1000);
		SubmitBtn.click();
		Thread.sleep(3500);
		SearchFilter.sendKeys(hmap.get("Email"));
		Thread.sleep(2000);
		ScreeningList.click();

		try {
			lib.waitForElementLoad(SSNTrace_ActionBtn);
			SSNTrace_ActionBtn.click();
			Thread.sleep(1000);
			String SSNOpt=hmap.get("SSNTrace_Option");
			String SSNTrace = "//*[@class='sub-items']//tbody[1]/tr[5]//td[@class='button']//ul/li[normalize-space()='"+ SSNOpt +"'][1]";
			driver.findElement(By.xpath(SSNTrace)).click();			
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(CriminalSearch_ActionBtn);
			CriminalSearch_ActionBtn.click();
			Thread.sleep(1000);
			String CriminalOpt=hmap.get("CriminalSearch_Option");
			String CriminalSearch = "//*[@class='sub-items']//tbody[2]/tr[5]//td[@class='button']//ul/li[normalize-space()='"+ CriminalOpt +"'][1]";
			driver.findElement(By.xpath(CriminalSearch)).click();	
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(LocatorSelect_ActionBtn);
			LocatorSelect_ActionBtn.click();
			Thread.sleep(1000);
			String LocSelOpt=hmap.get("LocatorSelect_Option");
			String LocatorSelect = "//*[@class='sub-items']//tbody[3]/tr[5]//td[@class='button']//ul/li[normalize-space()='"+ LocSelOpt +"'][1]";
			driver.findElement(By.xpath(LocatorSelect)).click();	
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(LocCountryValidator_ActionBtn);
			LocCountryValidator_ActionBtn.click();
			Thread.sleep(1000);
			String LocValidator=hmap.get("LocCountryValidator_Opt");
			String LocCountryValidator = "//*[@class='sub-items']//tbody[4]/tr[5]//td[@class='button']//ul/li[normalize-space()='"+ LocValidator +"'][1]";
			driver.findElement(By.xpath(LocCountryValidator)).click();	
			Thread.sleep(2000);
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(DOJOffender_ActionBtn);
			DOJOffender_ActionBtn.click();
			Thread.sleep(1000);
			String DOJOpt=hmap.get("DOJOffender_Opt");
			String DOJOffender = "//*[@class='sub-items']//tbody[5]/tr[5]//td[@class='button']//ul/li[normalize-space()='"+ DOJOpt +"'][1]";
			driver.findElement(By.xpath(DOJOffender)).click();	
			Thread.sleep(2000);
		}catch(TimeoutException e) {}

		driver.close();
		driver.switchTo().window(firstTab);

		Summaraytab.click();
		Thread.sleep(3000);
		Dashboardtab.click();
		Thread.sleep(2000);
		BGView.click();
		Thread.sleep(1000);
		Refresh.click();
		Thread.sleep(2000);
	}
}
