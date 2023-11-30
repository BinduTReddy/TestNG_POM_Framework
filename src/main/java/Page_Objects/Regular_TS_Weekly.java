package Page_Objects;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class Regular_TS_Weekly {
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath="//*[@id='59'][@class='shm_link001']")
	private WebElement FinanceTab;

	@FindBy(xpath="//*[contains(text(),'Timesheets')][@id='61']")
	private WebElement TimesheetTab;

	@FindBy(xpath="//*[@id='62'][@class='shm_link003']")
	private WebElement EnterTimesheet;

	@FindBy(xpath="//*[@id='ClientSearchBox']")
	private WebElement Clientname;

	@FindBy(xpath="//html/body/ul[1]/li/a")
	private WebElement Clientnamepopup;

	@FindBy(xpath="//*[@id='EmployeeSearchBox']")
	private WebElement EmpName;

	@FindBy(xpath="//html/body/ul[2]/li/a")
	private WebElement Empnamepopup;

	@FindBy(xpath="//*[@id='ddlEmployeeStatus']")
	private WebElement EmpStatus;

	@FindBy(xpath="//table/tbody/tr[2]/td[8]/a")
	private WebElement Searchimg;

	@FindBy(xpath="//*[@id='grdProjectList']/table/tbody/tr/td[1]/a")
	private WebElement ViewBtn;

	@FindBy(xpath="//*[@id='cpxPopDiv1']/fieldset/div/a")
	private WebElement TimesheetBtn;

	@FindBy(xpath="//*[@id='TSTable']//table/tbody/tr/td/table/tbody/tr[1]/td/div/a[2]")
	private WebElement FillHours;

	@FindBy(xpath="//*[@id='TSTable']//table/tbody/tr[2]/td[2]/div/div/div")
	private WebElement TimesheetAttachment;

	@FindBy(xpath="//*[@id='IsApproved'][@value='False']")
	private WebElement Unapproved;

	@FindBy(xpath="//*[contains(text(),'Un Approved')]")
	private WebElement UnapprovedLink;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']/table/tbody/tr[6]/td/div/button[2]")
	private WebElement ApproveButton;

	@FindBy(xpath="//*[@id='TSTable']//table[3]/tbody/tr/td/div/a[2]")
	private WebElement SaveBtn;

	@FindBy(xpath="/html/body/div[4]/div/a/span")
	private WebElement CloseButton;

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

	@FindBy(xpath="//*[@id='grdPendingInvoiceList']/table/tbody/tr[2]/td[3]/a")
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

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Regular')]/following-sibling::td[1]/input")
	private WebElement Day1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Regular')]/following-sibling::td[2]/input")
	private WebElement Day2;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Regular')]/following-sibling::td[3]/input")
	private WebElement Day3;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Regular')]/following-sibling::td[4]/input")
	private WebElement Day4;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Regular')]/following-sibling::td[5]/input")
	private WebElement Day5;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Regular')]/following-sibling::td[6]/input")
	private WebElement Day6;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Regular')]/following-sibling::td[7]/input")
	private WebElement Day7;

	@FindBy(xpath="/html/body/div[6]/div[2]/div/form/table/tbody/tr[6]/td/table[1]/tbody/tr[3]/td[9]/div")
	private WebElement TotalCount;

	@FindBy(xpath="//*[contains(text(),'Timesheet - Reports')]")
	private WebElement TSReport;

	@FindBy(xpath="//tbody/tr[5]/td/a")
	private WebElement HoursByDayPerDiem;

	@FindBy(xpath="//*[@id='PayRollCodeID']")
	private WebElement PayRollID;

	@FindBy(xpath="//*[@id='PayRollYearID']")
	private WebElement PayRollYear;

	@FindBy(xpath="//*[@id='CalenderID']")
	private WebElement PayRollCal;

	@FindBy(xpath="//table/tbody/tr/td[4]/a")
	private WebElement Search;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Holiday')]/following-sibling::td[2]/input")
	private WebElement Holiday;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Holiday')]/following-sibling::td[5]/input")
	private WebElement Holiday1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Sick')]/following-sibling::td[3]/input")
	private WebElement Sick;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Sick')]/following-sibling::td[6]/input")
	private WebElement Sick1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Time-Off/Billable')]/following-sibling::td[2]/input")
	private WebElement Timeoff_Billable;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Time-Off/Billable')]/following-sibling::td[5]/input")
	private WebElement Timeoff1_Billable;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Time Off')]/following-sibling::td[2]/input")
	private WebElement Timeoff;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Time Off')]/following-sibling::td[5]/input")
	private WebElement Timeoff1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Vacation')]/following-sibling::td[2]/input")
	private WebElement Vac;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Vacation')]/following-sibling::td[5]/input")
	private WebElement Vac1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'PTO Pay - No Bill')]/following-sibling::td[3]/input")
	private WebElement PTOPay;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'PTO Pay - No Bill')]/following-sibling::td[6]/input")
	private WebElement PTOPay1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'TATO')]/following-sibling::td[3]/input")
	private WebElement TATO;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'TATO')]/following-sibling::td[5]/input")
	private WebElement TATO1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Orientation')]/following-sibling::td[3]/input")
	private WebElement OrientHrs;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Orientation')]/following-sibling::td[5]/input")
	private WebElement OrientHrs1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Travel Hours')]/following-sibling::td[3]/input")
	private WebElement TravelHrs;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Travel Hours')]/following-sibling::td[5]/input")
	private WebElement TravelHrs1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'OnCall')]/following-sibling::td[2]/input")
	private WebElement Oncall;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'OnCall')]/following-sibling::td[5]/input")
	private WebElement Oncall1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Callback')]/following-sibling::td[4]/input")
	private WebElement Callback;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Callback')]/following-sibling::td[5]/input")
	private WebElement Callback1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Charge')]/following-sibling::td[2]/input")
	private WebElement Charge;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Charge')]/following-sibling::td[5]/input")
	private WebElement Charge1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Orientation')]/following-sibling::td[5]/input")
	private WebElement Orientation;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Orientation')]/following-sibling::td[7]/input")
	private WebElement Orientation1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Earned Leave')]/following-sibling::td[3]/input")
	private WebElement EarnedLeave;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Earned Leave')]/following-sibling::td[6]/input")
	private WebElement EarnedLeave1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Casual Leave')]/following-sibling::td[2]/input")
	private WebElement CasualLeave;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Casual Leave')]/following-sibling::td[5]/input")
	private WebElement CasualLeave1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Leave Without Pay')]/following-sibling::td[2]/input")
	private WebElement LeaveWithoutPay;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'Leave Without Pay')]/following-sibling::td[5]/input")
	private WebElement LeaveWithoutPay1;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'OD')]/following-sibling::td[2]/input")
	private WebElement OD;

	@FindBy(xpath="//table[@id='tblTS']/tbody//following-sibling::tr//td[contains(text(),'OD')]/following-sibling::td[5]/input")
	private WebElement OD1;

	public Regular_TS_Weekly(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void Clinical_RegTimesheet(Map<String,String> hmap) throws InterruptedException, IOException, ParseException{
		driver.navigate().refresh();
		Thread.sleep(2000);
		FinanceTab.click();
		Thread.sleep(2000);
		TimesheetTab.click();
		Thread.sleep(1000);
		EnterTimesheet.click();
		Thread.sleep(1000);
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		EmpName.click();
		Clientname.sendKeys(hmap.get("Clientname"));
		EmpName.sendKeys(hmap.get("EmpName"));
		lib.select(EmpStatus,hmap.get("Employeestatus"));
		Searchimg.click();
		Thread.sleep(2000);
		ViewBtn.click();
		Thread.sleep(1500);
		lib.switchOutOfFrame();
		TimesheetBtn.click();
		Thread.sleep(3500);	

		WebElement dateElement = driver.findElement(By.xpath("//*[@id='lblDate1']"));
		String dateText = dateElement.getText();
		String[] DAY= dateText.split("\n");	
		String dayOfWeek = DAY[1].trim();
		System.out.println(dayOfWeek);

		if (dayOfWeek.equalsIgnoreCase("Monday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day2.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day3.sendKeys(hmap.get("Day3"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day5"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;

			try {
				lib.waitForElementLoad(Sick);
				Holiday.sendKeys(hmap.get("Holiday"));
				Sick.sendKeys(hmap.get("Sick"));
				Timeoff_Billable.sendKeys(hmap.get("Timeoff"));
				Vac.sendKeys(hmap.get("Vacation"));
			}catch(TimeoutException e) {}			
			try {
				lib.waitForElementLoad(PTOPay);
				PTOPay.sendKeys(hmap.get("PtoPay"));
				Oncall.sendKeys(hmap.get("Oncall"));
				Callback.sendKeys(hmap.get("Callback"));
				Charge.sendKeys(hmap.get("Charge"));
				Orientation.sendKeys(hmap.get("Orientation"));
			}catch(TimeoutException e) {}
		}
		else if(dayOfWeek.equalsIgnoreCase("Thursday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day2.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day7.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

			try {
				lib.waitForElementLoad(Holiday1);
				Holiday1.sendKeys(hmap.get("Holiday"));
				Sick1.sendKeys(hmap.get("Sick"));
				Timeoff1_Billable.sendKeys(hmap.get("Timeoff"));
				Vac1.sendKeys(hmap.get("Vacation"));
			}catch(TimeoutException e) {}
			try {
				PTOPay1.sendKeys(hmap.get("PtoPay"));
				Oncall1.sendKeys(hmap.get("Oncall"));
				Callback1.sendKeys(hmap.get("Callback"));
				Charge1.sendKeys(hmap.get("Charge"));
				Orientation.sendKeys(hmap.get("Orientation"));
			}catch(TimeoutException e) {}
		}
		else if(dayOfWeek.equalsIgnoreCase("Friday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day7.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

			try {
				Holiday1.sendKeys(hmap.get("Holiday"));
				Sick1.sendKeys(hmap.get("Sick"));
				Timeoff1_Billable.sendKeys(hmap.get("Timeoff"));
				Vac1.sendKeys(hmap.get("Vacation"));
			}catch(TimeoutException e) {}
			try {
				lib.waitForElementLoad(PTOPay1);
				PTOPay1.sendKeys(hmap.get("PtoPay"));
				Oncall1.sendKeys(hmap.get("Oncall"));
				Callback.sendKeys(hmap.get("Callback"));
				Charge1.sendKeys(hmap.get("Charge"));
				Orientation.sendKeys(hmap.get("Orientation"));
			}catch(TimeoutException e) {}
		}

		else if(dayOfWeek.equalsIgnoreCase("Saturday"))
		{
			Day3.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day7.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			try {
				lib.waitForElementLoad(Holiday1);
				Holiday1.sendKeys(hmap.get("Holiday"));
				Sick.sendKeys(hmap.get("Sick"));
				Timeoff1_Billable.sendKeys(hmap.get("Timeoff"));
				Vac1.sendKeys(hmap.get("Vacation"));
			}catch(TimeoutException e) {}
			try {
				lib.waitForElementLoad(PTOPay);
				PTOPay.sendKeys(hmap.get("PtoPay"));
				Oncall1.sendKeys(hmap.get("Oncall"));
				Callback.sendKeys(hmap.get("Callback"));
				Charge1.sendKeys(hmap.get("Charge"));
				Orientation.sendKeys(hmap.get("Orientation"));
			}catch(TimeoutException e) {}
		}

		else if(dayOfWeek.equalsIgnoreCase("Sunday"))
		{
			Day2.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day3.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			try {
				Holiday.sendKeys(hmap.get("Holiday"));
				Sick.sendKeys(hmap.get("Sick"));
				Timeoff_Billable.sendKeys(hmap.get("Timeoff"));
				Vac.sendKeys(hmap.get("Vacation"));
			}catch(TimeoutException e) {}
			try {
				lib.waitForElementLoad(PTOPay);
				PTOPay.sendKeys(hmap.get("PtoPay"));
				Oncall.sendKeys(hmap.get("Oncall"));
				Callback.sendKeys(hmap.get("Callback"));
				Charge.sendKeys(hmap.get("Charge"));
				Orientation.sendKeys(hmap.get("Orientation"));
			}catch(TimeoutException e) {}
		}			
		Thread.sleep(2000);
		//		Unapproved.click();
		//		Thread.sleep(2000);
		TimesheetAttachment.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		SaveBtn.click();
		Thread.sleep(1500);
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {}	
	}

	public void ApproveTimesheet() throws InterruptedException{
		Thread.sleep(7000);
		UnapprovedLink.click();
		Thread.sleep(2000);
		ApproveButton.click();
		Thread.sleep(4000);
		CloseButton.click();
	}

	public void CloseTimesheet() throws InterruptedException{
		Thread.sleep(4000);
		CloseButton.click();
	}

	public void NonClinical_RegTimesheet(Map<String,String> hmap) throws InterruptedException, IOException, ParseException{
		driver.navigate().refresh();
		Thread.sleep(2000);
		FinanceTab.click();
		Thread.sleep(2000);
		TimesheetTab.click();
		Thread.sleep(2000);
		EnterTimesheet.click();
		Thread.sleep(3000);
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		EmpName.click();
		Clientname.sendKeys(hmap.get("Clientname"));
		EmpName.sendKeys(hmap.get("EmpName"));
		Thread.sleep(1000);
		lib.select(EmpStatus,hmap.get("Employeestatus"));
		Searchimg.click();
		Thread.sleep(2000);
		ViewBtn.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		TimesheetBtn.click();
		Thread.sleep(3000);	

		WebElement dateElement = driver.findElement(By.xpath("//*[@id='lblDate1']"));
		String dateText = dateElement.getText();
		String[] DAY= dateText.split("\n");	
		String dayOfWeek = DAY[1].trim();
		System.out.println(dayOfWeek);

		if (dayOfWeek.equalsIgnoreCase("Monday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day2.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day3.sendKeys(hmap.get("Day3"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day5"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;

			try {
				lib.waitForElementLoad(Holiday);
				Holiday.sendKeys(hmap.get("Holiday"));
				Sick.sendKeys(hmap.get("Sick"));
				try {
					lib.waitForElementLoad(Timeoff_Billable);
					Timeoff_Billable.sendKeys(hmap.get("Timeoff"));	
				}catch(TimeoutException e) {}
				try {
					lib.waitForElementLoad(Timeoff);
					Timeoff.sendKeys(hmap.get("Timeoff"));
				}catch(TimeoutException e) {}

				Vac.sendKeys(hmap.get("Vacation"));	
			}catch(TimeoutException e) {}
			try {
				lib.waitForElementLoad(PTOPay);
				PTOPay.sendKeys(hmap.get("PtoPay"));
				TATO.sendKeys(hmap.get("Tato"));
				OrientHrs.sendKeys(hmap.get("Orientation"));
				TravelHrs.sendKeys(hmap.get("Travel"));
			} catch (TimeoutException e) {}	

		}
		else if(dayOfWeek.equalsIgnoreCase("Thursday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day2.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day7.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

			try {
				lib.waitForElementLoad(Holiday1);
				Holiday1.sendKeys(hmap.get("Holiday"));
				Sick1.sendKeys(hmap.get("Sick"));
				try {
					lib.waitForElementLoad(Timeoff1);
					Timeoff1.sendKeys(hmap.get("Timeoff"));
				}catch(TimeoutException e) {}			
				try {
					lib.waitForElementLoad(Timeoff1_Billable);
					Timeoff1_Billable.sendKeys(hmap.get("Timeoff"));
				}catch(TimeoutException e) {}

				Vac1.sendKeys(hmap.get("Vacation"));
			}catch(TimeoutException e) {}
			try {
				lib.waitForElementLoad(PTOPay);
				PTOPay1.sendKeys(hmap.get("PtoPay"));
				TATO1.sendKeys(hmap.get("Tato"));
				OrientHrs1.sendKeys(hmap.get("Orientation"));
				TravelHrs1.sendKeys(hmap.get("Travel"));
			} catch (TimeoutException e) {}	
		}
		else if(dayOfWeek.equalsIgnoreCase("Friday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day7.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

			try {
				lib.waitForElementLoad(Holiday1);
				Holiday1.sendKeys(hmap.get("Holiday"));
				Sick1.sendKeys(hmap.get("Sick"));
				try {
					lib.waitForElementLoad(Timeoff1);
					Timeoff1.sendKeys(hmap.get("Timeoff"));
				}catch(TimeoutException e) {}			
				try {
					lib.waitForElementLoad(Timeoff1_Billable);
					Timeoff1_Billable.sendKeys(hmap.get("Timeoff"));
				}catch(TimeoutException e) {}

				Vac1.sendKeys(hmap.get("Vacation"));
			}catch(TimeoutException e) {}
			try {
				lib.waitForElementLoad(PTOPay);
				PTOPay1.sendKeys(hmap.get("PtoPay"));
				TATO.sendKeys(hmap.get("Tato"));
				OrientHrs.sendKeys(hmap.get("Orientation"));
				TravelHrs1.sendKeys(hmap.get("Travel"));
			} catch (TimeoutException e) {}	
		}

		else if(dayOfWeek.equalsIgnoreCase("Saturday"))
		{
			Day3.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day7.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

			try {
				lib.waitForElementLoad(Holiday1);
				Holiday1.sendKeys(hmap.get("Holiday"));
				Sick.sendKeys(hmap.get("Sick"));
				try {
					lib.waitForElementLoad(Timeoff1);
					Timeoff1.sendKeys(hmap.get("Timeoff"));
				}catch(TimeoutException e) {}			
				try {
					lib.waitForElementLoad(Timeoff1_Billable);
					Timeoff1_Billable.sendKeys(hmap.get("Timeoff"));
				}catch(TimeoutException e) {}

				Vac1.sendKeys(hmap.get("Vacation"));
			}catch(TimeoutException e) {}
			try {
				lib.waitForElementLoad(PTOPay);
				PTOPay.sendKeys(hmap.get("PtoPay"));
				TATO.sendKeys(hmap.get("Tato"));
				OrientHrs.sendKeys(hmap.get("Orientation"));
				TravelHrs.sendKeys(hmap.get("Travel"));
			} catch (TimeoutException e) {}	
		}
		else if(dayOfWeek.equalsIgnoreCase("Sunday"))
		{
			Day2.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day3.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

			try {
				lib.waitForElementLoad(Holiday);
				Holiday.sendKeys(hmap.get("Holiday"));
				Sick.sendKeys(hmap.get("Sick"));
				try {
					lib.waitForElementLoad(Timeoff);
					Timeoff.sendKeys(hmap.get("Timeoff"));
				}catch(TimeoutException e) {}			
				try {
					lib.waitForElementLoad(Timeoff_Billable);
					Timeoff_Billable.sendKeys(hmap.get("Timeoff"));
				}catch(TimeoutException e) {}			

				Vac.sendKeys(hmap.get("Vacation"));
			}catch(TimeoutException e) {}
			try {
				lib.waitForElementLoad(PTOPay);
				PTOPay.sendKeys(hmap.get("PtoPay"));
				TATO.sendKeys(hmap.get("Tato"));
				OrientHrs.sendKeys(hmap.get("Orientation"));
				TravelHrs.sendKeys(hmap.get("Travel"));
			} catch (TimeoutException e) {}	
		}			
		//		Thread.sleep(1000);
		//		Unapproved.click();
		Thread.sleep(1500);
		TimesheetAttachment.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		SaveBtn.click();
		Thread.sleep(1500);
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {}	
	}


	public void India_RegTimesheet(Map<String,String> hmap) throws InterruptedException, IOException, ParseException{
		driver.navigate().refresh();
		Thread.sleep(2000);
		FinanceTab.click();
		Thread.sleep(2000);
		TimesheetTab.click();
		Thread.sleep(2000);
		EnterTimesheet.click();
		Thread.sleep(3000);
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		EmpName.click();
		Clientname.sendKeys(hmap.get("Clientname"));
		EmpName.sendKeys(hmap.get("EmpName"));
		Thread.sleep(1000);
		lib.select(EmpStatus,hmap.get("Employeestatus"));
		Searchimg.click();
		Thread.sleep(2000);
		ViewBtn.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		TimesheetBtn.click();
		Thread.sleep(3000);	

		WebElement dateElement = driver.findElement(By.xpath("//*[@id='lblDate1']"));
		String dateText = dateElement.getText();
		String[] DAY= dateText.split("\n");	
		String dayOfWeek = DAY[1].trim();
		System.out.println(dayOfWeek);

		if (dayOfWeek.equalsIgnoreCase("Monday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day2.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day3.sendKeys(hmap.get("Day3"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day5"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;

			Holiday.sendKeys(hmap.get("Holiday"));
			EarnedLeave.sendKeys(hmap.get("EarnedLeave"));
			CasualLeave.sendKeys(hmap.get("CasualLeave"));	
			LeaveWithoutPay.sendKeys(hmap.get("LeaveWithoutPay"));
			OD.sendKeys(hmap.get("OD"));	
		}
		else if(dayOfWeek.equalsIgnoreCase("Thursday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day2.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day7.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

			Holiday1.sendKeys(hmap.get("Holiday"));
			EarnedLeave1.sendKeys(hmap.get("EarnedLeave"));
			CasualLeave1.sendKeys(hmap.get("CasualLeave"));	
			LeaveWithoutPay1.sendKeys(hmap.get("LeaveWithoutPay"));
			OD1.sendKeys(hmap.get("OD"));	
		}
		else if(dayOfWeek.equalsIgnoreCase("Friday"))
		{
			Day1.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day7.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

			Holiday1.sendKeys(hmap.get("Holiday"));
			EarnedLeave1.sendKeys(hmap.get("EarnedLeave"));
			CasualLeave1.sendKeys(hmap.get("CasualLeave"));	
			LeaveWithoutPay1.sendKeys(hmap.get("LeaveWithoutPay"));
			OD1.sendKeys(hmap.get("OD"));	
		}
		else if(dayOfWeek.equalsIgnoreCase("Saturday"))
		{
			Day3.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day7.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

			Holiday1.sendKeys(hmap.get("Holiday"));
			EarnedLeave1.sendKeys(hmap.get("EarnedLeave"));
			CasualLeave1.sendKeys(hmap.get("CasualLeave"));	
			LeaveWithoutPay1.sendKeys(hmap.get("LeaveWithoutPay"));
			OD1.sendKeys(hmap.get("OD"));	
		}
		else if(dayOfWeek.equalsIgnoreCase("Sunday"))
		{
			Day2.sendKeys(hmap.get("Day1"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day3.sendKeys(hmap.get("Day2"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day4.sendKeys(hmap.get("Day3"));;
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS) ;
			Day5.sendKeys(hmap.get("Day4"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;
			Day6.sendKeys(hmap.get("Day5"));
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS) ;

			Holiday.sendKeys(hmap.get("Holiday"));
			EarnedLeave.sendKeys(hmap.get("EarnedLeave"));
			CasualLeave.sendKeys(hmap.get("CasualLeave"));	
			LeaveWithoutPay.sendKeys(hmap.get("LeaveWithoutPay"));
			OD.sendKeys(hmap.get("OD"));	
		}			
		Thread.sleep(1000);
		TimesheetAttachment.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		SaveBtn.click();
		Thread.sleep(1500);
		try {
			driver.switchTo().alert().accept();
		} catch (NoAlertPresentException e) {}	
	}

	public void Reg_TSReport(Map<String,String> hmap) throws InterruptedException, IOException
	{
		Thread.sleep(2000);
		FinanceTab.click();
		Thread.sleep(2000);
		TimesheetTab.click();
		Thread.sleep(2000);
		TSReport.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		driver.findElement(By.xpath("//*[@id='txtEmployeeSearch']")).click();
		HoursByDayPerDiem.click();
		Thread.sleep(2000);
		lib.select(PayRollID,hmap.get("Payroll_ID"));
		lib.select(PayRollYear,hmap.get("Payrollyear"));
		lib.select(PayRollCal,hmap.get("Payrollcalender"));
		Thread.sleep(2000);
		Search.click();
		Thread.sleep(4000);
		lib.switchOutOfFrame();
	}	
}










