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

public class RunPayroll_Module {
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;
	
	@FindBy(xpath="//*[@id='99'][@class='shm_link001']")
	private WebElement PayrollTab;

	@FindBy(xpath="//*[@id='PayrollYearID']")
	private WebElement PayrollYear;

	@FindBy(xpath="//*[@id='PayPeriodID']")
	private WebElement PayrollDate;

	@FindBy(xpath="//*[@id='PayrollCalendarID']")
	private WebElement Payrollcalendar;

	@FindBy(xpath="//table[@id='tblPayData']//a[@title='Run Report']")
	private WebElement RunReport;

	@FindBy(xpath="//*[contains(text(),'Prev. Payroll Processed')]")
	private WebElement PrevPayrollProcessed;

	@FindBy(xpath="//div[@id='tabPayrollRunADP']//li[3]/a")
	private WebElement YetToProcess;

	@FindBy(xpath="//div[@id='tabPayrollRunADP']//li[4]/a")
	private WebElement TS_Adjustments;

	@FindBy(xpath="//div[@id='tabPayrollRunADP']//li[5]/a")
	private WebElement PrevPayroll_YetToProcess;

	@FindBy(xpath="//div[@id='tabPayrollRunADP']//li[6]/a")
	private WebElement PrevPayroll_TSAdjs;
	
	@FindBy(xpath="//div[@id='tabPayrollRunADP']//li[7]/a")
	private WebElement New_YetToProcess;
	
	@FindBy(xpath="//div[@id='tabPayrollRunADP']//li[8]/a")
	private WebElement New_TS_Adjs;
	
	@FindBy(xpath="//div[@id='tabPayrollRunADP']//li[9]/a")
	private WebElement FileDownload_History;
	
	@FindBy(xpath="//*[@id='487'][@class='shm_link002']")
	private WebElement Payroll_SubTab;
	
	@FindBy(xpath="//a[contains(text(),'Dashboard')]")
	private WebElement DashBoardTab;
	
	@FindBy(linkText="Payroll Provider")
	private WebElement PayrollProvider;
	
	@FindBy(linkText="View Timesheet")
	private WebElement ViewTimesheet;
	
	@FindBy(linkText="Payroll Advice")
	private WebElement PayrollAdvice;
	
	@FindBy(xpath="//select[@id='PayrollCodeList']")
	private WebElement PayrollCodeList;
	
	@FindBy(xpath="//select[@id='PayrollYearList']")
	private WebElement PayrollCodeYear;
	
	@FindBy(xpath="//select[@name='PayDate']")
	private WebElement PayDate;
	
	@FindBy(xpath="//tbody/tr[1]/td[9]/a[1]")
	private WebElement SearchImgBtn;
	
	@FindBy(xpath="//a[@onclick='ExportPayrollAdvice()']")
	private WebElement ExcelPayrollAdvice;
	
	@FindBy(linkText="Payroll History")
	private WebElement PayrollHistory;
	
	@FindBy(xpath="//*[@id='PayrollCodelst']")
	private WebElement PayrollCode;
	
	@FindBy(xpath="//*[@id='PayrollYearlst']")
	private WebElement PayrollHistory_Year;
	
	@FindBy(xpath="//*[@id='ddlPayPeriod']")
	private WebElement PayPeriod;
	
	@FindBy(xpath="//tbody/tr[1]/td[7]/a[1]")
	private WebElement PayrollcodeSearch;
	
	@FindBy(linkText="Payroll Calendar")
	private WebElement PayrollCalendar;
	
	@FindBy(linkText="Payroll Setting")
	private WebElement PayrollSetting;
	
	@FindBy(linkText="Net Pay Calc.")
	private WebElement NetPayCalc;
	
	public RunPayroll_Module(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void Run_PayRoll(Map<String,String> hmap) throws InterruptedException, IOException
	{
		driver.navigate().refresh();
		Thread.sleep(2000);
		lib = new Generic_Methods(driver);
		PayrollTab.click();
		lib.handlingFrame("frmContent");
		Thread.sleep(1000);
		PayrollYear.sendKeys(hmap.get("Payrollyear"));
		lib.select(PayrollDate, hmap.get("Payrollcalender"));
		Thread.sleep(1000);
		lib.select(Payrollcalendar, hmap.get("Payroll_code"));
		Thread.sleep(500);
		String optionText =hmap.get("Payroll_Data");
		String PayrollData = "//*[@name='rdData']//following-sibling::label[text()='"+ optionText +"']//preceding::input[@type='radio'][1]";
		driver.findElement(By.xpath(PayrollData)).click();
		RunReport.click();
		Thread.sleep(3000);
		PrevPayrollProcessed.click();
		Thread.sleep(3000);
		YetToProcess.click();
		Thread.sleep(4000);
		TS_Adjustments.click();
		Thread.sleep(4000);
		PrevPayroll_YetToProcess.click();
		Thread.sleep(4000);
		PrevPayroll_TSAdjs.click();
		Thread.sleep(4000);
		New_YetToProcess.click();
		Thread.sleep(4000);
		New_TS_Adjs.click();
		Thread.sleep(4000);
		FileDownload_History.click();
		Thread.sleep(4000);
		lib.switchOutOfFrame();
	}

	public void PayRoll_AllTabs(Map<String,String> hmap) throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		lib = new Generic_Methods(driver);
		PayrollTab.click();
		Thread.sleep(300);
		Payroll_SubTab.click();
		lib.handlingFrame("frmContent");
		DashBoardTab.click();
		Thread.sleep(2000);
		PayrollProvider.click();
		Thread.sleep(2000);
		ViewTimesheet.click();
		Thread.sleep(2000);
		
		PayrollAdvice.click();
		Thread.sleep(2000);
		lib.select(PayrollCodeList, hmap.get("Payroll_ID"));
		lib.select(PayrollCodeYear, hmap.get("Payrollyear"));
		Thread.sleep(500);
		lib.select(PayDate, hmap.get("Payrollcalender"));
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelPayrollAdvice.click();
		Thread.sleep(2500);

		PayrollHistory.click();
		lib.select(PayrollCode, hmap.get("Payroll_ID"));
		lib.select(PayrollHistory_Year, hmap.get("Payrollyear"));
		Thread.sleep(500);
		lib.select(PayPeriod, hmap.get("Payroll_code"));
		Thread.sleep(1000);
		PayrollcodeSearch.click();
		Thread.sleep(1500);
		
		PayrollCalendar.click();
		Thread.sleep(2000);
		
		PayrollSetting.click();
		Thread.sleep(2000);
		
		NetPayCalc.click();
		Thread.sleep(2000);
		
		
	}
}










