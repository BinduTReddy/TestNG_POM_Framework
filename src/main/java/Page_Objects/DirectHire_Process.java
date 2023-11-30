package Page_Objects;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reusable_Methods.Generic_Methods;

public class DirectHire_Process {

	WebDriver driver;
	Generic_Methods lib;

	@FindBy(xpath="//*[@id='CurrencyID']")
	private WebElement CurrencyId;

	@FindBy(xpath = "//*[@id='NegotiatedSalary']")
	private WebElement NewNegotiatedSalary;

	@FindBy(xpath="//*[@id='IsPercent']")
	private WebElement FeeType;

	@FindBy(xpath="//input[@id='IsPercent'][@value='True']")
	private WebElement FeeTypeOpt;

	@FindBy(xpath="//*[@id='ClientCommission']")
	private WebElement FeeOption;

	@FindBy(xpath="//*[@id='InvoiceDate']")
	private WebElement InvoiceDate;

	@FindBy(xpath="//input[@id='Project_IsSignUpBonus'][@value='True']")
	private WebElement SignUpBonus;

	@FindBy(xpath="//input[@id='Project_SignUpAmount']")
	private WebElement SignUpAmt;

	@FindBy(xpath="//input[@id='Project_AddPONumberToInvoice'][@value='True']")
	private WebElement PONumToInvoice;

	@FindBy(xpath="//input[@id='Project_RelocationAmount']")
	private WebElement ProjReLoc;

	@FindBy(xpath="//input[@id='Project_IsRelocationExpense'][@value='True']")
	private WebElement ProjReLocExp;

	@FindBy(xpath="//input[@id='Project_ReferenceNo']")
	private WebElement ProjRefNum;

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

	@FindBy(xpath="//*[@id='Project_BillingContact1']")
	private WebElement billingct;

	@FindBy(xpath="//*[@id='Project_ClientPaymentTerms']")
	private WebElement ClientpayTerms;

	@FindBy(xpath="//*[@id='Project_InvoiceMethodID']")
	private WebElement InvoiceMethod;

	@FindBy(xpath="//*[@id='Project_LocationID']")
	private WebElement ProjLocID;		

	@FindBy(xpath="//*[@id='CommSplit1_RecipientID']")
	private WebElement CommSplitName;

	@FindBy(xpath="//*[@id='CommSplit1_SplitPercent']")
	private WebElement CommSplitPer;

	@FindBy(xpath="//*[@id='CommSplit1_LocationID']")
	private WebElement CommSplitLoc;

	@FindBy(xpath="//*[@class='regular ImgbtnSave']")
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

	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]")
	private WebElement ImgBtnTask;

	@FindBy(xpath="//*[@class='RibbonImgBtnWarper' and @id='ImgBtnOK']")
	private WebElement ApproveBtn;

	@FindBy(xpath = "//a[@class='shm_link001'][@id='514']")
	private WebElement DirectHireTab;

	@FindBy(xpath="//input[@id='txtEmployeeSearch']")
	private WebElement Empsearch;

	@FindBy(xpath="//input[@id='txtClientSearch']")
	private WebElement Clientsearch;

	@FindBy(xpath="//input[@id='txtEmailSearch']")
	private WebElement Email;

	@FindBy(xpath="//*[@id='grdDirectHireEmployeeList']/table/tbody/tr/td[2]")
	private WebElement ViewBtn;

	public DirectHire_Process(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Create_DirectHire(Map<String,String> hmap) throws Exception
	{
		lib = new Generic_Methods(driver);
		try {
			lib.waitForElementLoad(CurrencyId);
			lib.select(CurrencyId,hmap.get("CurrencyId"));
		}catch(TimeoutException e) {}

		NewNegotiatedSalary.sendKeys(hmap.get("NewNegSalary"));
		Thread.sleep(1000);

		try {
			lib.waitForElementLoad(FeeType);			
			String FeeOpt =hmap.get("Feetype");
			String FType = "//input[@id='IsPercent'][@value='" + FeeOpt + "'][ancestor::td[@class='editor-field']]";
			driver.findElement(By.xpath(FType)).click();
			Thread.sleep(1000);
			if(FeeTypeOpt.isSelected()) {
				FeeOption.sendKeys(hmap.get("FeePercentage"));
				Thread.sleep(1000);			
			}else {
				FeeOption.sendKeys(hmap.get("FeeAmount")); }	
		}catch(TimeoutException e) {}

		if(InvoiceDate.isDisplayed()) {
			InvoiceDate.click();
			Thread.sleep(1000);
			InvoiceDate.sendKeys(hmap.get("Invoicedate"));
		}
		try {
			lib.waitForElementLoad(SignUpBonus);			
			String FeeOpt =hmap.get("SignupBonusOpt");
			String FType = "//input[@id='Project_IsSignUpBonus'][@value='" + FeeOpt + "'][ancestor::td[@class='editor-field']]";
			driver.findElement(By.xpath(FType)).click();
			Thread.sleep(1000);
			if(SignUpBonus.isSelected()) {
				SignUpAmt.sendKeys(hmap.get("BonusSignupAmt"));
			}else {}			
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(ProjReLocExp);			
			String FeeOpt =hmap.get("ReLocOpt");
			String FType = "//input[@id='Project_IsRelocationExpense'][@value='" + FeeOpt + "'][ancestor::td[@class='editor-field']]";
			driver.findElement(By.xpath(FType)).click();
			Thread.sleep(1000);
			if(ProjReLocExp.isSelected()) {
				ProjReLoc.sendKeys(hmap.get("ExpAmt"));
			}else {}			
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(PONumToInvoice);			
			String FeeOpt =hmap.get("POInvoice");
			String FType = "//input[@id='Project_AddPONumberToInvoice'][@value='" + FeeOpt + "'][ancestor::td[@class='editor-field']]";
			driver.findElement(By.xpath(FType)).click();
			Thread.sleep(1000);
			if(PONumToInvoice.isSelected()) {
				ProjRefNum.sendKeys(hmap.get("PoRefNum"));
			}
		}catch(TimeoutException e) {}
		
		try {
			lib.waitForElementLoad(billingct);		
			lib.select(billingct,hmap.get("BillingContact"));
			Thread.sleep(1000);
			lib.select(InvoiceMethod,hmap.get("Invoicemethod"));
			Thread.sleep(1000);
		}catch(TimeoutException e) {}
		
//		try {
//			lib.select(ClientpayTerms,hmap.get("clientPayTerms"));
//			Thread.sleep(1000);	
//			lib.select(ProjLocID,hmap.get("ProjLocation"));
//			Thread.sleep(1000);
//		}catch(TimeoutException e) {}
		
		SaveBtn.click();
		Thread.sleep(2500);
	}

	public void DirectHireApproval(Map<String,String> hmap) throws InterruptedException 
	{
		driver.navigate().refresh();
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		Thread.sleep(1000);
		AssignedBy.sendKeys(hmap.get("Assignedby"));
//		Taskto.sendKeys(hmap.get("TaskBy"));
		Thread.sleep(1000);
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		ApproveBtn.click();
		Thread.sleep(2000);
	}

	public void SearchEmployee_DirectHireModule(Map<String,String> hmap) throws Exception
	{
		lib = new Generic_Methods(driver);
		Thread.sleep(1000);
		DirectHireTab.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Empsearch.sendKeys(hmap.get("CandName"));
		Thread.sleep(1000);
		//		Clientsearch.sendKeys(hmap.get("Clientname"));
		//		Thread.sleep(1000);
		Email.sendKeys(hmap.get("Email"));
		Email.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		ViewBtn.click();

	}
}
