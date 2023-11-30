package Page_Objects;

import java.io.*;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class Submit_NewClient {
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;
	
	@FindBy(xpath = "//*[@id='2']")
	private WebElement client;

	@FindBy(xpath = "//*[@id='4']")
	private WebElement Newclient;

	@FindBy(xpath = "//input[@id='Client_ClientName']")
	private WebElement C_Name;
	
	@FindBy(xpath="//*[@id='Client_GSTNo']")
	private List<WebElement> C_GST;
	
	@FindBy(xpath="//*[@id='Client_PANCardNo']")
	private List<WebElement> C_PanCardNo;

	@FindBy(xpath = "//input[@id='Client_Address1']")
	private WebElement C_Add;

	@FindBy(xpath = "//*[@id='Client_City']")
	private WebElement C_city;

	@FindBy(xpath = "//*[@id='Client_CountryID']")
	private WebElement C_country;

	@FindBy(xpath = "//*[@id='Client_StateID']")
	private WebElement C_State;

	@FindBy(xpath = "//*[@id='Client_ZipCode']")
	private WebElement C_zipcode;
	
	@FindBy(xpath="//*[@id='Client_Website']")
	private List<WebElement> C_Website;

	@FindBy(xpath = "//*[@id='Client_StatusID']")
	private WebElement C_Status;

	@FindBy(xpath="//*[@id='Client_TimesheetFrequencyID']")
	private WebElement C_TSFrequency;
	
	@FindBy(xpath = "//*[@id='Client_TimesheetTemplateID']")
	private WebElement C_Timesheet;

	@FindBy(xpath="//*[@id='Client_TimesheetTypeID']")
	private WebElement C_TimesheetType;
	
	@FindBy(xpath = "//*[@id='Client_AccountManagerID']")
	private WebElement AccountManager;

	@FindBy(xpath="//*[@id='Client_SalesManagerID']")
	private WebElement SalesManager;
	
	@FindBy(xpath="//*[@id='Client_HRSupportEmail']")
	private WebElement HRSuppMail;

	@FindBy(xpath="//*[@class='t-button t-upload-button']")
	private WebElement C_MSADoc;

	@FindBy(xpath = "//*[@id='Client_InvoiceFlagID']")
	private WebElement c_invoiceflag;

	@FindBy(xpath = "//*[@id='Client_InvoiceFrequencyID']")
	private WebElement c_invoicefrequency;

	@FindBy(xpath = "//*[@id='Client_InvoiceMethodID']")
	private WebElement c_invoicemethod;

	@FindBy(xpath = "//*[@id='Client_InvoiceAttentionTo']")
	private WebElement c_invoiceAttentionTo;

	@FindBy(xpath = "//*[@id='Client_InvoiceEmailID']")
	private WebElement c_invoiceEmailTo;

	@FindBy(xpath="//*[@id='Client_ApplyTaxOnInvoice']")
	private WebElement TaxInvoice;
	
	@FindBy(xpath="//*[@id='Client_RatesIncludeTax']")
	private WebElement RatesincTax;
	
	@FindBy(xpath = "//*[@id='Client_PaymentTerm']")
	private WebElement c_PaymentTerms;

	@FindBy(xpath = "//*[@id='BusinessTypesIDList']")
	private WebElement c_BusinessType;

	@FindBy(xpath="//*[@id='tabStripNewClientDetails']/ul/li[2]/a")
	private WebElement AdditionalDetails;

	@FindBy(xpath="//*[@id='VerticalTypesIDList']")
	private WebElement VerticalList;

	@FindBy(xpath="//*[@id='Client_IsBackgroundCheckRequired']")
	private WebElement BackgroundCheck;

	@FindBy(xpath="//*[@id='Client_IsDrugCheckRequired']")
	private WebElement DrugCheck;

	@FindBy(xpath = "//*[@class='regular ImgbtnSave']")
	private WebElement c_savebtn;

	@FindBy(xpath = "//*[@class='shm_link001' and @id='150']")
	private WebElement MgmtBtn;

	@FindBy(xpath = "//*[@class='shm_link002' and @id='468']")
	private WebElement Workflowmenu;

	@FindBy(xpath = "//*[@id='txtInitiatedMgmtSearch']")
	private WebElement Searchbyword;

	@FindBy(xpath = "//*[@id='txtAssignedTo']")
	private WebElement AssignedBy;
	
	@FindBy(xpath="/html/body/ul[1]/li/a")
	private WebElement Clientpopup;

	@FindBy(xpath = "//*[@class='ImgbtnSearch img']")
	private WebElement SearchImg;

	@FindBy(xpath = "//tbody/tr[1]/td[1]/a[1]")
	private WebElement ImgBtnTask;

	@FindBy(xpath = "//*[@class='RibbonImgBtnWarper' and @id='ImgBtnOK']")
	private WebElement ApproveBtn;
	
	@FindBy(xpath="//a[@id='5']")
	private WebElement ClientSubTab;

	@FindBy(xpath="//input[@id='txtClientSearch']")
	private WebElement ClientName;
	
	@FindBy(xpath="//a[@class='ImgbtnView img']")
	private WebElement ImgViewBtn;
	
	@FindBy(linkText="Location")
	private WebElement LocationTab;
	
	@FindBy(linkText="Contacts/TS Approver")
	private WebElement TSApproverTab;
	
	@FindBy(linkText="Notes/Conversation")
	private WebElement Notes_Tab;
	
	@FindBy(linkText="A/R Collection Notes")
	private WebElement Notes_SubTab;
	
	@FindBy(linkText="Cost Center")
	private WebElement CostCenterTab;
	
	@FindBy(linkText="Asset Cost")
	private WebElement AssetCostTab;
	
	@FindBy(linkText="Documents")
	private WebElement DocumentsTab;
	
	@FindBy(linkText="Purchase Order")
	private WebElement PurchaseOrderSubTab;
	
	@FindBy(linkText="COI - Limit")
	private WebElement COI_Limit;
	
	@FindBy(linkText="Tax Exemption")
	private WebElement TaxExemptionTab;
	
	@FindBy(linkText="Onboarding Docs")
	private WebElement OBDocsTab;
	
	@FindBy(linkText="Employee List")
	private WebElement EmpListTab;
	
	@FindBy(linkText="Invoices")
	private WebElement InvoicesTab;
	
	@FindBy(linkText="Invoice Schedule")
	private WebElement InvScheduleTab;
	
	@FindBy(linkText="Invoice Notes")
	private WebElement InvNotesTab;
	
	@FindBy(linkText="Verification")
	private WebElement VerificationTab;
	
	@FindBy(linkText="MSP Score")
	private WebElement MSP_ScoreTab;
	
	@FindBy(linkText="A/R Detail")
	private WebElement AR_DetailTab;
	
	@FindBy(linkText="Subscription Setting")
	private WebElement Subs_SettingTab;
	
	@FindBy(linkText="Subscription Billing")
	private WebElement Subs_BillingTab;
	
	@FindBy(linkText="Fixed Invoices")
	private WebElement FixedInvoicesTab;
	
	@FindBy(linkText="Tenure Detail")
	private WebElement TenureDetailTab;
	
	@FindBy(linkText="Competitor")
	private WebElement CompetitorTab;
	
	@FindBy(linkText="Social Media")
	private WebElement SocialMediaTab;
	
	@FindBy(linkText="TS Appr. History")
	private WebElement TSAppr_HistoryTab;
	
	@FindBy(linkText="Status History")
	private WebElement StatusHistoryTab;
	
	@FindBy(linkText="Login History")
	private WebElement LoginHistoryTab;
	
	@FindBy(linkText="Company Information")
	private WebElement CompanyInfoTab;
	
	@FindBy(linkText="General Information")
	private WebElement GeneralInfo_SubTab;
	
	@FindBy(linkText="Credit Limit")
	private WebElement CreditLimitTab;
	
	@FindBy(linkText="Client Retainer Invoice")
	private WebElement ClientRetainerInv_Tab;
	
	@FindBy(linkText="Contact Merge")
	private WebElement ContactMergeTab;
	
	@FindBy(linkText="Lead")
	private WebElement LeadTab;
	
	@FindBy(linkText="Opportunities")
	private WebElement OpportunitiesTab;
	
	@FindBy(linkText="Holidays")
	private WebElement HolidaysTab;
	
	@FindBy(linkText="Rate Card")
	private WebElement RateCardTab;
	
	@FindBy(linkText="Workflows")
	private WebElement WorkflowsTab;
	
	@FindBy(linkText="Completed Requests")
	private WebElement CompletedRequests_SubTab;
	
	@FindBy(xpath="//ul/li[2]/ul//a[contains(text(),'Communication')]")
	private WebElement Communication;
	
	@FindBy(xpath="//*[@id='txtStartDate']")
	private WebElement StartDateTxt;
	
	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchImgBtn;
	
	@FindBy(xpath="//ul/li[2]/ul//a[contains(text(),'End Client List')]")
	private WebElement EndClientList;
	
	@FindBy(xpath="//ul/li[2]/ul//a[contains(text(),'Verification Agency')]")
	private WebElement VerificationAgency;
	
	@FindBy(xpath="//ul/li[2]/ul//a[contains(text(),'Client Merge')]")
	private WebElement ClientMerge;
	
	@FindBy(xpath="//ul/li[2]/ul//a[contains(text(),'Import')]")
	private WebElement Import;
	
	@FindBy(xpath="//ul/li[2]/ul//a[contains(text(),'Report')]")
	private WebElement Report;
	
	@FindBy(linkText="Client Employee Start")
	private WebElement ClientEmpStart_Report;
	
	@FindBy(linkText="Employee by Status")
	private WebElement EmpByStatus;
	
	@FindBy(xpath="//*[@id='txtEmpStatusFromDate']")
	private WebElement EmpByStatus_FromDate;
	
	@FindBy(xpath="//*[@class='ImgbtnExcel img']")
	private WebElement ExcelDownload;
	
	@FindBy(linkText="Client Income")
	private WebElement ClientIncomeReport;
	
	@FindBy(xpath="//*[@id='txtFromDate']")
	private WebElement ClientInc_FromDate;
	
	@FindBy(linkText="Client Bill Rate Change")
	private WebElement ClientBRChangeReport;
	
	@FindBy(xpath="//*[@id='txtBillRateFromDate']")
	private WebElement BillRateFromDate;
	
	@FindBy(linkText="Total Bill Rate by Client")
	private WebElement Total_BR_ClientReport;
	
	@FindBy(xpath="//*[@class='datePicker hasDatepicker']")
	private WebElement TotalBR_FromDate;
	
	public Submit_NewClient(WebDriver driver) throws IOException {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}
	 
	public void Client(Map<String, String> hmap) throws Exception {
		lib = new Generic_Methods(driver);
		Thread.sleep(2000);
		client.click();
		Thread.sleep(1000);
		Newclient.click();
		Thread.sleep(1000);
		C_Name.sendKeys(hmap.get("Clientname"));
		
//		if (C_GST.size() > 0) {
//			C_GST.get(0).sendKeys(hmap.get("ClientGST"));}
//		
//		if (C_PanCardNo.size() > 0) {
//			C_PanCardNo.get(0).sendKeys(hmap.get("ClientPanCard"));}
		
		C_Add.sendKeys(hmap.get("Clientadd"));
		C_city.sendKeys(hmap.get("ClientCity"));
		lib.select(C_country, hmap.get("ClientCountry"));
		Thread.sleep(1000);
		lib.select(C_State, hmap.get("Clientstate"));
		C_zipcode.sendKeys(hmap.get("ClientzipCode"));

		if (C_Website.size() > 0) {
			C_Website.get(0).sendKeys(hmap.get("Website"));}
		
		lib.select(C_Status, hmap.get("Clientstatus"));
		Thread.sleep(1000);
		lib.select(C_TSFrequency,hmap.get("ClientTSFreq"));
		lib.select(C_Timesheet, hmap.get("ClientTimesheet"));
		Thread.sleep(1000);
		lib.select(C_TimesheetType,hmap.get("ClientTimesheetType"));
		Thread.sleep(1000);
		lib.select(AccountManager,hmap.get("Accountmanager")); 
//		lib.select(SalesManager,hmap.get("Salesmanager"));
		Thread.sleep(1000);
		C_MSADoc.click();
		Thread.sleep(1500);
        Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		lib.select(c_invoiceflag, hmap.get("ClientinvoiceflagType"));
		Thread.sleep(500);
		lib.select(c_invoicefrequency, hmap.get("Clientinvoicefreq"));
		Thread.sleep(500);
		lib.select(c_invoicemethod, hmap.get("Clientinvoicemethod"));
		Thread.sleep(500);
		c_invoiceAttentionTo.clear();
		c_invoiceAttentionTo.sendKeys(hmap.get("ClientinvoiceAttention"));
		c_invoiceEmailTo.sendKeys(hmap.get("ClientinvoiceEMail"));
		Thread.sleep(500);
		lib.select(c_PaymentTerms, hmap.get("Clientpaymentterms"));
	
		try {
			lib.waitForElementLoad(TaxInvoice);			
			String optionText =hmap.get("TaxValue");
			String Taxinvoice = "//input[@id='Client_ApplyTaxOnInvoice'][@value='" + optionText + "'][ancestor::td[@class='editor-field']]";
			driver.findElement(By.xpath(Taxinvoice)).click();
		}catch(TimeoutException e) {}
		
		try {
			lib.waitForElementLoad(RatesincTax);			
			String optText =hmap.get("Ratesvalue");
			String Ratesinc = "//input[@id='Client_RatesIncludeTax'][@value='" + optText + "'][ancestor::td[@class='editor-field']]";
			driver.findElement(By.xpath(Ratesinc)).click();
		}catch(TimeoutException e) {}
		
		lib.select(c_BusinessType,hmap.get("CBusinessType"));
		Thread.sleep(500);
		lib.select(c_BusinessType,hmap.get("CBusinessType1"));
//		lib.select(c_BusinessType,hmap.get("CBusinessType2"));
		Thread.sleep(1000);
		
		try {
			lib.waitForElementLoad(HRSuppMail);
			HRSuppMail.sendKeys(hmap.get("HR_Supp"));
		}catch(TimeoutException e) {}
		
		AdditionalDetails.click();
		WebElement List1 = VerticalList;
		Select multi1 = new Select(List1);
		multi1.selectByIndex(0);
		Thread.sleep(500);
		multi1.selectByIndex(4);
		Thread.sleep(500);
		multi1.selectByIndex(5);
		Thread.sleep(500);
		multi1.selectByIndex(7);
		
		try {
			lib.waitForElementLoad(BackgroundCheck);			
			String BGText =hmap.get("BackgroundChk");
			String Background = "//input[@id='Client_IsBackgroundCheckRequired'][@value='" + BGText + "'][ancestor::td[@class='editor-field']]";
			driver.findElement(By.xpath(Background)).click();
		}catch(TimeoutException e) {}
		
		try {
			lib.waitForElementLoad(DrugCheck);			
			String DrugText =hmap.get("DrugChk");
			String Drugchk = "//input[@id='Client_IsDrugCheckRequired'][@value='" + DrugText + "'][ancestor::td[@class='editor-field']]";
			driver.findElement(By.xpath(Drugchk)).click();
		}catch(TimeoutException e) {}
		
		c_savebtn.click();
		Thread.sleep(2000);
	}


	public void ClientApproval(Map<String, String> hmap) throws InterruptedException {
		Thread.sleep(1000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("Clientname"));
		Thread.sleep(500);
		Clientpopup.click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Thread.sleep(1000);
		SearchImg.click();
		Thread.sleep(1500);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(1000);
		ApproveBtn.click();
		Thread.sleep(1000);
	}
	
	public void ClientModule_TabLinks(Map<String, String> hmap) throws InterruptedException {
		
		lib = new Generic_Methods(driver);	
		client.click();
		Thread.sleep(500);
		ClientSubTab.click();
		lib.handlingFrame("frmContent");
		ClientName.sendKeys(hmap.get("Clientname"));
		ClientName.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		ImgViewBtn.click();
		Thread.sleep(2000);		
		
		LocationTab.click();
		Thread.sleep(2000);		
//		TSApproverTab.click();
//		Thread.sleep(2000);		
//		Notes_Tab.click();
//		Thread.sleep(2000);		
//		Notes_SubTab.click();
//		Thread.sleep(2000);		
//		CostCenterTab.click();
//		Thread.sleep(2000);		
//		AssetCostTab.click();
//		Thread.sleep(2000);		
//		DocumentsTab.click();
//		Thread.sleep(2000);		
//		PurchaseOrderSubTab.click();
//		Thread.sleep(2000);		
//		COI_Limit.click();
//		Thread.sleep(2000);		
//		TaxExemptionTab.click();
//		Thread.sleep(2000);		
//		OBDocsTab.click();
//		Thread.sleep(2000);		
//		EmpListTab.click();
//		Thread.sleep(2000);		
//		InvoicesTab.click();
//		Thread.sleep(2000);		
//		InvScheduleTab.click();
//		Thread.sleep(2000);		
//		InvNotesTab.click();
//		Thread.sleep(2000);	
//		VerificationTab.click();
//		Thread.sleep(2000);		
//		MSP_ScoreTab.click();
//		Thread.sleep(2000);		
//		AR_DetailTab.click();
//		Thread.sleep(2000);		
//		Subs_SettingTab.click();
//		Thread.sleep(2000);		
////		Subs_BillingTab.click();
////		Thread.sleep(2000);		
//		FixedInvoicesTab.click();
//		Thread.sleep(2000);		
//		TenureDetailTab.click();
//		Thread.sleep(2000);		
//		CompetitorTab.click();
//		Thread.sleep(2000);		
//		SocialMediaTab.click();
//		Thread.sleep(2000);	
//		TSAppr_HistoryTab.click();
//		Thread.sleep(2000);		
//		StatusHistoryTab.click();
//		Thread.sleep(2000);		
//		LoginHistoryTab.click();
//		Thread.sleep(2000);
//		
//		CompanyInfoTab.click();
//		Thread.sleep(2000);		
//		GeneralInfo_SubTab.click();
//		Thread.sleep(2000);
//		
//		CreditLimitTab.click();
//		Thread.sleep(2000);		
//		ClientRetainerInv_Tab.click();
//		Thread.sleep(2000);		
//		ContactMergeTab.click();
//		Thread.sleep(2000);		
//		LeadTab.click();
//		Thread.sleep(2000);		
//		OpportunitiesTab.click();
//		Thread.sleep(2000);		
//		HolidaysTab.click();
//		Thread.sleep(2000);		
//		RateCardTab.click();
//		Thread.sleep(2000);		
		WorkflowsTab.click();
		Thread.sleep(2000);
		CompletedRequests_SubTab.click();
		lib.switchOutOfFrame();
		
		
		Communication.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		StartDateTxt.clear();
		StartDateTxt.click();
		StartDateTxt.sendKeys("11/01/2023");
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();

		EndClientList.click();
		Thread.sleep(2000);
		VerificationAgency.click();
		Thread.sleep(2000);
		ClientMerge.click();
		Thread.sleep(2000);
		Import.click();
		Thread.sleep(2000);
		
		Report.click();
		Thread.sleep(2000);
		ClientEmpStart_Report.click();
		Thread.sleep(2000);
		
		Report.click();
		Thread.sleep(2000);
		EmpByStatus.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		EmpByStatus_FromDate.clear();
		EmpByStatus_FromDate.click();
		EmpByStatus_FromDate.sendKeys("11/01/2023");
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelDownload.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		
		Report.click();
		Thread.sleep(2000);
		ClientIncomeReport.click();
		lib.handlingFrame("frmContent");
		ClientInc_FromDate.clear();
		ClientInc_FromDate.click();
		ClientInc_FromDate.sendKeys("11/01/2023");
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelDownload.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		
		Report.click();
		Thread.sleep(2000);
		ClientBRChangeReport.click();
		lib.handlingFrame("frmContent");
		BillRateFromDate.clear();
		BillRateFromDate.click();
		BillRateFromDate.sendKeys("11/01/2023");
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelDownload.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		
		Report.click();
		Thread.sleep(2000);
		Total_BR_ClientReport.click();
		lib.handlingFrame("frmContent");
		TotalBR_FromDate.clear();
		TotalBR_FromDate.click();
		TotalBR_FromDate.sendKeys("11/01/2023");
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		
		
	}	
	
}
