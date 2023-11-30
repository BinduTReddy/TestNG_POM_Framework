package Page_Objects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Reusable_Methods.Generic_Methods;

public class Approval_Screens {

	WebDriver driver;
	Generic_Methods lib;
	
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

	@FindBy(xpath="//*[@id='NewObject_OB_Consultant_BenefitEligibilityClassID']")
	private WebElement HealthCoverage;
	
	@FindBy(xpath="//*[@class='RibbonImgBtnWarper' and @id='ImgBtnOK']")
	private WebElement ApproveBtn;

	@FindBy(xpath="//tbody/tr[3]/td[3]/span[1]/input[1]")
	private List<WebElement> StateW4Reviewed;

	@FindBy(xpath="//tbody/tr[4]/td[3]/span[1]/input[1]")
	private List<WebElement> W4Federalreviewed;

	@FindBy(xpath="//tbody/tr[5]/td[3]/span[1]/input[1]")
	private List<WebElement> paperlesspolicyreviewed;

	@FindBy(xpath="//tbody/tr[6]/td[3]/span[1]/input[1]")
	private List<WebElement> DirectdepositReviewed;
	
	@FindBy(xpath="//tbody/tr[7]/td[3]/span[1]/input[1]")
	private List<WebElement> VoidedchkReviewed;

	@FindBy(xpath="//input[@name='IsPODocRecollect' and @value='false']")
	private WebElement POReviewed;

	@FindBy(xpath="//input[@name='IsWorksheetRecollect' and @value='false']")
	private WebElement WorksheetReviewed;

	@FindBy(xpath="//input[@name='ReviewDocList[0].IsRecollectReq' and @value='false']")
	private List<WebElement> DocListReview;
	
	@FindBy(xpath="//*[@name='ReviewDocList[1].IsRecollectReq'][@value='false']")
	private List<WebElement> DocListReview1;
	
	@FindBy(xpath="//*[@name='ReviewDocList[2].IsRecollectReq'][@value='false']")
	private List<WebElement> DocListReview2;

	@FindBy(xpath="//*[@id='ImgBtnOK']")
	private WebElement Complete;

	@FindBy(xpath="//*[@id='NewObject_OB_Consultant_Project_BillingContact1']")
	private WebElement billingct;
	
	@FindBy(xpath="//*[@id='NewObject_PayrollCodeID']")
	private WebElement Payrollcode;
	
	@FindBy(xpath="//*[@id='NewObject_OB_Consultant_EEOCategoryID']")
	private WebElement EEOCat;
	
	@FindBy(xpath="//*[@id='NewObject_OB_Consultant_Project_InvoiceFrequencyID']")
	private WebElement InvoiceFreq;
	
	@FindBy(xpath="//*[@id='NewObject_OB_Consultant_Project_InvoiceFlagID']")
	private WebElement InvoiceFlag;
	
	@FindBy(xpath="//*[@id='NewObject_OB_Consultant_BenefitEligibilityClassID']")
	private WebElement HealthInsCoverage;
	
	@FindBy(xpath="//*[@id='divWfh']/table/tbody/tr[2]/td/div/button[2]")
	private WebElement RemotePopup;
		
	@FindBy(xpath="//*[contains(text(),'Tax/Comm/Misc')]")
	private WebElement TaxTab;
	
	@FindBy(xpath="//*[@id='NewObject_OB_Consultant_Project_StateTaxTypeID']")
	private WebElement StateTax;


	public Approval_Screens(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Onboarding_RecManagerApproval(Map<String,String> hmap) throws Exception {

		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("Task"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();	
		Thread.sleep(2500);

		try {
			lib.waitForElementLoad(Payrollcode);
			lib.select(Payrollcode,hmap.get("PayrollCode"));
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(HealthCoverage);
			lib.select(HealthCoverage,hmap.get("Healthcoverage"));
		}catch(TimeoutException e) {}
		
			ApproveBtn.click();
			Thread.sleep(1000);
	}
	
	public void Onboarding_ManagerApproval(Map<String,String> hmap) throws Exception {
	
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("TaskTo2"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();	
		Thread.sleep(2500);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Payrollcode);
		lib.select(Payrollcode,hmap.get("PayrollCode"));	
		Thread.sleep(1000);
		
		ApproveBtn.click();
		Thread.sleep(2000);
	}

	
	public void US_Onboarding_RecManagerApproval(Map<String,String> hmap) throws Exception {

		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("Task"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();	
		Thread.sleep(2500);
		
		try {
			lib.waitForElementLoad(RemotePopup);
			String optText =hmap.get("WFHPopup");
			String WFHOpt = "//*[@id='divWfh']//tr[2]/td/div//button[text()='" + optText + "']";
			driver.findElement(By.xpath(WFHOpt)).click();
		} catch (TimeoutException e) {}			
		try {
			lib.waitForElementLoad(Payrollcode);
			lib.select(Payrollcode,hmap.get("PayrollCode"));
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(HealthCoverage);
			lib.select(HealthCoverage,hmap.get("Healthcoverage"));
		}catch(TimeoutException e) {}
		
		try {
			lib.waitForElementLoad(RemotePopup);
			String optText =hmap.get("WFHPopup");
			String Ratesinc = "//*[@id='divWfh']//button[text()='" + optText + "']";
			driver.findElement(By.xpath(Ratesinc)).click();
		} catch (TimeoutException e) {}		
		try {
			lib.waitForElementLoad(TaxTab);
			TaxTab.click();
		}catch(TimeoutException e) {}		
		try {
			lib.waitForElementLoad(StateTax);
			lib.select(StateTax,hmap.get("TaxType"));
		}catch(TimeoutException e) {}
		
			ApproveBtn.click();
			Thread.sleep(1000);
	}
	
	public void US_Onboarding_ManagerApproval(Map<String,String> hmap) throws Exception {
	
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("TaskTo2"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();	
		Thread.sleep(2500);
		
		try {
			lib.waitForElementLoad(RemotePopup);
			String optText =hmap.get("WFHPopup");
			String WFHOpt = "//*[@id='divWfh']//tr[2]/td/div//button[text()='" + optText + "']";
			driver.findElement(By.xpath(WFHOpt)).click();
		} catch (TimeoutException e) {}	
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Payrollcode);
		lib.select(Payrollcode,hmap.get("PayrollCode"));	
		Thread.sleep(1000);
				
		try {
			lib.waitForElementLoad(EEOCat);
			EEOCat.sendKeys(hmap.get("EEOcategory"));
			TaxTab.click();
			Thread.sleep(1000);
			lib.select(StateTax,hmap.get("TaxType"));
		}catch(TimeoutException e) {}
		
		ApproveBtn.click();
		Thread.sleep(2000);
	}
	
	
	public void HRPayroll_Approval(Map<String,String> hmap) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();	
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Thread.sleep(1000);
		Taskto.click();
		Taskto.sendKeys(hmap.get("Taskto"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();		
		Thread.sleep(2000);
		POReviewed.click();
		WorksheetReviewed.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		lib.select(InvoiceFlag,hmap.get("InvoiceflagType"));
		lib.select(InvoiceFreq,hmap.get("Invoicefreq"));
		js.executeScript("arguments[0].scrollIntoView();", billingct);
		lib.select(billingct,hmap.get("BillingCt"));
		ApproveBtn.click();		
		Thread.sleep(2000);

		MgmtBtn.click();
		Workflowmenu.click();
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Thread.sleep(1000);
		Taskto.click();
		Taskto.sendKeys(hmap.get("TaskTo1"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		if (StateW4Reviewed.size() > 0) {
			StateW4Reviewed.get(0).click();}
		
		if (W4Federalreviewed.size() > 0) {
			W4Federalreviewed.get(0).click();}
		
		if (paperlesspolicyreviewed.size() > 0) {
			paperlesspolicyreviewed.get(0).click();}
		
		if (DirectdepositReviewed.size() > 0) {
			DirectdepositReviewed.get(0).click();}
		
		if (VoidedchkReviewed.size() > 0) {
			VoidedchkReviewed.get(0).click();}
		ApproveBtn.click();
		Thread.sleep(2000);

		lib.handlingFrame("frmContent");
		Taskto.clear();
//		Taskto.sendKeys(hmap.get("Taskto"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(1500);
		
		if (DocListReview.size() > 0) {
			DocListReview.get(0).click();}
		
		if (DocListReview1.size() > 0) {
			DocListReview1.get(0).click();}
		
		if (DocListReview2.size() > 0) {
			DocListReview2.get(0).click();}		
		ApproveBtn.click();
		Thread.sleep(1500);
	}

	
	public void SmartSoc_Approval(Map<String,String> hmap) throws InterruptedException {
		driver.navigate().refresh();
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();	
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Thread.sleep(1000);
		Taskto.click();
		Taskto.sendKeys(hmap.get("Taskto"));
		Thread.sleep(1000);
		SearchImg.click();
		Thread.sleep(1000);
		ImgBtnTask.click();
		Thread.sleep(1500);
		lib.switchOutOfFrame();		
		POReviewed.click();
		Thread.sleep(1000);
		WorksheetReviewed.click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		lib.select(InvoiceFlag,hmap.get("InvoiceflagType"));
		Thread.sleep(1000);
		lib.select(InvoiceFreq,hmap.get("Invoicefreq"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", billingct);
		lib.select(billingct,hmap.get("BillingCt"));
		Thread.sleep(1000);
		ApproveBtn.click();		
		Thread.sleep(2000);

		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("Taskto"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();	
		if (DocListReview.size() > 0) {
			DocListReview.get(0).click();}
		
		if (DocListReview1.size() > 0) {
			DocListReview1.get(0).click();}	
		ApproveBtn.click();
		Thread.sleep(1000);
	}
	
	public void CreateEmployee_Approval(Map<String,String> hmap) throws InterruptedException
	{
		Thread.sleep(1000);
		MgmtBtn.click();
		Thread.sleep(500);
		Workflowmenu.click();	
		Thread.sleep(500);
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchByWord1"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Thread.sleep(1000);
		Taskto.clear();
		Taskto.sendKeys(hmap.get("TaskTo3"));
		SearchImg.click();
		Thread.sleep(1000);
		ImgBtnTask.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		Complete.click();
		Thread.sleep(2000);
	}
	
	public void VP_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SearchWord"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("TaskTo2"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();	
		Thread.sleep(2000);
		ApproveBtn.click();
		Thread.sleep(2000);
	}
}
