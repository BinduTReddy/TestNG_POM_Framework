package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class OfferMgt_ClientsAndWorkLoc {

	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath="//*[contains(text(),'Offer Mgmt')]")
	private WebElement OfferMgmtTab;

	@FindBy(xpath="//*[contains(text(),'Clients & Work Locations')]")
	private WebElement ClientandWorkLoc;

	@FindBy(xpath="//table/tbody/tr[1]/td/div/a")
	private WebElement NewClient;

	@FindBy(xpath="//*[@id='Client_ClientName']")
	private WebElement ClientName;

	@FindBy(xpath="//*[@id='Client_MSPID']")
	private WebElement ClientMSP;

	@FindBy(xpath="//*[@id='Client_MSPFeePercent']")
	private WebElement MSPFee;

	@FindBy(xpath="//*[@class='t-button t-upload-button']")
	private WebElement MSAFileUpload;

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
	
	@FindBy(xpath="//*[@class='shm_link001' and @id='150']")
	private WebElement MgmtBtn;

	@FindBy(xpath="//a[contains(text(),'Workflows')]")
	private WebElement Workflowmenu;

	@FindBy(xpath="//*[@id='txtInitiatedMgmtSearch']")
	private WebElement Searchbyword;

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
	
	@FindBy(xpath="//*[contains(text(),'New Work Location')]")
	private WebElement NewWorkLoc;
	
	@FindBy(xpath="//*[@id='ClientID_Display']")
	private WebElement ClientID;
	
	@FindBy(xpath="/html/body/ul/li/a")
	private WebElement ClientPopup;
	
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
	
	public OfferMgt_ClientsAndWorkLoc(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void OfferMgmt_NewClient(Map<String,String> hmap) throws Exception {		
		Thread.sleep(2000);
		OfferMgmtTab.click();
		Thread.sleep(1000);
		ClientandWorkLoc.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		NewClient.click();
		Thread.sleep(2000);		
		lib.switchOutOfFrame();	
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
	}
	
	public void OfferMgmt_NewClient_Approval(Map<String,String> hmap) throws Exception {		
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
	}
	
	public void OfferMgmt_NewWorkLoc(Map<String,String> hmap) throws Exception {		
		Thread.sleep(2000);
		OfferMgmtTab.click();
		Thread.sleep(1000);
		ClientandWorkLoc.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		NewWorkLoc.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();	
		ClientID.click();
		ClientID.sendKeys(hmap.get("Clientname"));
		ClientPopup.click();
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
	
	public void OfferMgmt_NewWorkLoc_Approval(Map<String,String> hmap) throws Exception {		
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("TaskTitle"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("TaskToApp"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();	
		ApproveBtn.click();
		Thread.sleep(1500);
	}
}