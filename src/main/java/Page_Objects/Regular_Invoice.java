package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class Regular_Invoice {
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;
	
	@FindBy(xpath="//*[@id='59'][@class='shm_link001']")
	private WebElement FinanceTab;

	@FindBy(xpath="//*[contains(text(),'Timesheets')][@id='61']")
	private WebElement TimesheetTab;

	@FindBy(xpath="//*[@id='65'][@class='shm_link002']")
	private WebElement InvoiceTab;

	@FindBy(xpath="//*[@id='66'][@class='shm_link003']")
	private WebElement PendingInvoice;

	@FindBy(xpath="//*[@id='grdPendingInvoiceList']//tr/th[7]/div/span")
	private WebElement EmployeeFilter;

	@FindBy(xpath="//*[@id='grdPendingInvoiceList']/div[3]/div/input[1]")
	private WebElement SearchText;

	@FindBy(xpath="//*[@id='grdPendingInvoiceList']/div[3]/div/button[2]")
	private WebElement FilterIcon;

	@FindBy(xpath="//*[@id='grdPendingInvoiceList']/table/tbody/tr[last()]/td[3]/a")
	private WebElement InvoiceViewBtn;

	@FindBy(xpath="//*[@name='Submit']")
	private WebElement save;

	@FindBy(xpath="//*[@class='shm_link001'][@id='150']")
	private WebElement Mgmt;

	@FindBy(xpath="//*[@class='shm_link002'][@id='468']")
	private WebElement workflows;

	@FindBy(xpath="//*[@id='txtInitiatedMgmtSearch']")
	private WebElement SearchByword;

	@FindBy(xpath="//*[@id='txtAssignedTo']")
	private WebElement AssignedBy;

	@FindBy(xpath="//*[@id='txtMgmtTask']")
	private WebElement TaskTo;

	@FindBy(xpath="//*[@id='tabMgmtInProgress']//table/tbody/tr/td[7]/a")
	private WebElement SearchBtn;

	@FindBy(xpath="//table/tbody/tr[1]/td[1]/a")
	private WebElement ImgView;

	@FindBy(xpath="//*[@id='ImgBtnOK']")
	private WebElement ApproveBtn;

	@FindBy(xpath="//*[@class='shm_link002'][@id='72']")
	private WebElement ViewInvoice;

	@FindBy(xpath="//*[@id='grdInvoiceList']/table/tbody/tr/td[1]/a")
	private WebElement InvoiceView;

	@FindBy(xpath="//*[@id='cpxPopDiv1']//table[1]/tbody/tr[2]/td/a")
	private WebElement Invoicepdf;

	@FindBy(xpath="/html/body/div[11]/div[1]/a/span")
	private WebElement CrossBtn;

	@FindBy(xpath="//*[@id='cpxPopDiv1']//tbody/tr/td/div/button")
	private WebElement Close;

	public Regular_Invoice(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void Reg_SaveInvoice(Map<String,String> hmap) throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		lib = new Generic_Methods(driver);
		FinanceTab.click();
		Thread.sleep(2000);
		InvoiceTab.click();
		Thread.sleep(2000);
		PendingInvoice.click();
		lib.handlingFrame("frmContent");
		Thread.sleep(1000);
		EmployeeFilter.click();
		Thread.sleep(1000);
		SearchText.sendKeys(hmap.get("EmpName"));
		FilterIcon.click();
		Thread.sleep(4000);
		InvoiceViewBtn.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", save);
		save.click();
		Thread.sleep(1000);
	}

	public void RegInvoice_Approval(Map<String,String> hmap) throws InterruptedException, IOException{
		Thread.sleep(1500);
		Mgmt.click();
		Thread.sleep(2000);
		workflows.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Thread.sleep(1000);
		SearchByword.sendKeys(hmap.get("Inv_search"));
		driver.findElement(By.xpath("/html/body/ul[1]/li/a")).click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		TaskTo.sendKeys(hmap.get("Inv_TaskTo"));
		SearchBtn.click();
		Thread.sleep(1500);
		ImgView.click();
		lib.switchOutOfFrame();
		Thread.sleep(1500);
		ApproveBtn.click();
		Thread.sleep(7000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", Close);
		Close.click();
	}
	
	
}










