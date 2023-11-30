package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class EmpMod_NewEmployee {
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;
	
	@FindBy(xpath="//*[@class='shm_link001' and @id='26']")
	private WebElement EmpModule;

	@FindBy(xpath="//*[@class='shm_link002' and @id='28']")
	private WebElement NewEmpBtn;
	
	@FindBy(xpath="//*[@id='Contact_SalutationID']")
	private WebElement SalutationID;
	
	@FindBy(xpath="//*[@id='Contact_FirstName']")
	private WebElement FirstName;
	
	@FindBy(xpath="//*[@id='Contact_LastName']")
	private WebElement LastName;
	
	@FindBy(xpath="//*[@id='Employee_SSN']")
	private WebElement EmpSSN;
	
	@FindBy(xpath="//*[@id='Contact_Mobile']")
	private WebElement MobileNum;
	
	@FindBy(xpath="//*[@id='Contact_EmailID']")
	private WebElement EmailID;
	
	@FindBy(xpath="//*[@id='Employee_NAICSCode']")
	private WebElement NAICSCode;
	
	@FindBy(xpath="//*[@id='Employee_CountryID']")
	private WebElement CountryID;
	
	@FindBy(xpath="//*[@id='Employee_ClassificationID']")
	private WebElement Classification;
	
	@FindBy(xpath="//*[@id='Employee_EmploymentTypeID']")
	private WebElement EmpTypeID;
	
	@FindBy(xpath="//*[@id='Employee_CategoryID']")
	private WebElement PayrollID;
	
	@FindBy(xpath="//*[@id='Employee_EEOCategoryID']")
	private WebElement EEOCategory;
	
	@FindBy(xpath="//*[@id='Employee_DateOfBirth']")
	private WebElement DOB;
	
	@FindBy(xpath="//*[@id='Employee_DateOfJoin']")
	private WebElement DateOfJoin;
		
	@FindBy(xpath="//*[@id='Contact_GenderID']")
	private WebElement GenderID;
	
	@FindBy(xpath="//*[@id='Employee_MaritalStatusID']")
	private WebElement MaritalStatus;
	
	@FindBy(xpath="//*[@id='Employee_PayrollID']")
	private WebElement PayrollNumID;
	
	@FindBy(xpath="//input[@id='Employee_VmsID']")
	private WebElement VMSID;
	
	@FindBy(xpath="//*[@id='Contact_EthnicityID']")
	private WebElement EthinicityID;
	
	@FindBy(xpath="//*[@id='Employee_VeteranID']")
	private WebElement VeteranID;
	
	@FindBy(xpath="//input[@id='Address_Address1']")
	private WebElement Address;
	
	@FindBy(xpath="//input[@id='Address_City']")
	private WebElement AddressCity;
	
	@FindBy(xpath="//*[@id='Address_CountryID']")
	private WebElement AddressCountryID;
	
	@FindBy(xpath="//*[@id='Address_StateID']")
	private WebElement AddressStateID;
	
	@FindBy(xpath="//*[@id='Address_ZipCode']")
	private WebElement Zipcode;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']//tr[8]/td[2]/a")
	private WebElement PhysicalAddress;
	
	@FindBy(xpath="//*[@id='btnSubmit']")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//*[@class='shm_link001' and @id='150']")
	private WebElement MgmtBtn;

	@FindBy(xpath="//*[@class='shm_link002' and @id='468']")
	private WebElement Workflowmenu;

	@FindBy(xpath="//*[@id='txtInitiatedMgmtSearch']")
	private WebElement Searchbyword;

	@FindBy(xpath="//*[@id='txtAssignedTo']")
	private WebElement AssignedBy;

	@FindBy(xpath="//*[@id='txtMgmtTask']")
	private WebElement Taskto;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchImg;

	@FindBy(xpath="//table/tbody/tr[1]/td[1]/a")
	private WebElement ImgBtnTask;
	
	@FindBy(xpath="//*[@class='RibbonImgBtnWarper' and @id='ImgBtnOK']")
	private WebElement ApproveBtn;
	
	public EmpMod_NewEmployee(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void Emp_EmpModule(Map<String,String> hmap) throws Exception{
		
		lib = new Generic_Methods(driver);
		EmpModule.click();
		NewEmpBtn.click();
		Thread.sleep(1500);
		lib.select(SalutationID, hmap.get("Salutation"));
		Thread.sleep(500);
		FirstName.sendKeys(hmap.get("Firstname"));
		LastName.sendKeys(hmap.get("Lastname"));
		EmpSSN.click();
		EmpSSN.sendKeys(hmap.get("SSN"));
		MobileNum.click();
		MobileNum.sendKeys(hmap.get("MobileNum"));
		EmailID.sendKeys(hmap.get("Email"));
		NAICSCode.sendKeys(hmap.get("Naics_Code"));
		lib.select(CountryID, hmap.get("country"));
		lib.select(Classification,hmap.get("payrollclassification"));
		lib.select(EmpTypeID, hmap.get("emptype"));
		Thread.sleep(1000);
		lib.select(PayrollID, hmap.get("PayrollCode"));
		lib.select(EEOCategory, hmap.get("EEOcategory"));
		DOB.click();
		DOB.sendKeys(hmap.get("DOB"));
		DateOfJoin.click();
		DateOfJoin.sendKeys(hmap.get("startDate"));
		lib.select(GenderID, hmap.get("gender"));
		lib.select(MaritalStatus, hmap.get("Maritalstatus"));
		Thread.sleep(1000);
		
		String ExemptOpt =hmap.get("ExemptStatus");
		String ExemptOption = "//*[@id='Employee_IsNonExempt']/following::label[text()='"+ ExemptOpt +"']/preceding::input[@type='radio'][1]";
		driver.findElement(By.xpath(ExemptOption)).click();	
		Thread.sleep(1000);
		
		PayrollNumID.sendKeys(hmap.get("PayrollID"));
		VMSID.sendKeys(hmap.get("VMSID"));
		lib.select(EthinicityID, hmap.get("ethnicity"));
		Thread.sleep(1000);
		
		String TSRemOpt =hmap.get("TS_Remainder");
		String TSOption = "//input[@id='Employee_IsIgnoreReminderMail']/following-sibling::label[text()='"+ TSRemOpt +"']/preceding-sibling::input[@type='radio'][1]";
		driver.findElement(By.xpath(TSOption)).click();	
		Thread.sleep(1000);
		
		lib.select(VeteranID, hmap.get("Veteranstatus"));
		Address.sendKeys(hmap.get("address"));
		AddressCity.sendKeys(hmap.get("CityName"));
		lib.select(AddressCountryID, hmap.get("Countryname"));
		Thread.sleep(1000);
		lib.select(AddressStateID, hmap.get("stateName"));
		Zipcode.sendKeys(hmap.get("Pincode"));
		Thread.sleep(1000);
		PhysicalAddress.click();
		Thread.sleep(1000);
		SaveBtn.click();
		Thread.sleep(1500);
	}
	
	public void NewEmp_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(1500);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("EmpSearchText"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("TaskAppBy"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();		
		Thread.sleep(1000);
		ApproveBtn.click();
		
		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("TaskAppBy1"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();		
		Thread.sleep(1000);
		ApproveBtn.click();
	}
	
	
	
}
