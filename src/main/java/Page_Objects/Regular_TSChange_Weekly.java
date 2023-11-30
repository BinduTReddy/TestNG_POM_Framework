package Page_Objects;

import java.io.IOException;
import java.text.ParseException;
import java.util.Map;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class Regular_TSChange_Weekly {
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
	
	@FindBy(xpath="//*[@id='TimesheetList']//tr/td[1]/a")
	private WebElement TSList;
	
	@FindBy(xpath="//*[@class='regular ImgbtnEdit']")
	private WebElement ChangeBtn;

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

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[2]/input")
	private WebElement Day1;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[3]/input")
	private WebElement Day2;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[4]/input")
	private WebElement Day3;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[5]/input")
	private WebElement Day4;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[6]/input")
	private WebElement Day5;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[7]/input")
	private WebElement Day6;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[3]/td[8]/input")
	private WebElement Day7;

	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[4]/td[2]/input")
	private WebElement OT1;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[4]/td[3]/input")
	private WebElement OT2;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[4]/td[4]/input")
	private WebElement OT3;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[4]/td[5]/input")
	private WebElement OT4;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[4]/td[6]/input")
	private WebElement OT5;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[4]/td[7]/input")
	private WebElement OT6;
	
	@FindBy(xpath="//*[@id='tblTS']/tbody/tr[4]/td[8]/input")
	private WebElement OT7;

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
	
	@FindBy(xpath="//*[@id='ChangeReasonID']")
	private WebElement ChangeReason;

	public Regular_TSChange_Weekly(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void Change_Timesheet(Map<String,String> hmap) throws InterruptedException, IOException, ParseException{
		driver.navigate().refresh();
		Thread.sleep(2000);
		FinanceTab.click();
		Thread.sleep(2000);
		TimesheetTab.click();
		Thread.sleep(2500);
		EnterTimesheet.click();
		Thread.sleep(2000);
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		EmpName.click();
		Clientname.sendKeys(hmap.get("Clientname"));
		EmpName.sendKeys(hmap.get("EmpName"));
		lib.select(EmpStatus,hmap.get("Employeestatus"));
		Thread.sleep(1000);
		Searchimg.click();
		Thread.sleep(3000);
		ViewBtn.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		Thread.sleep(1500);
		TSList.click();
		Thread.sleep(3000);	
		ChangeBtn.click();		
				
		WebElement dateElement = driver.findElement(By.xpath("//*[@id='lblDate1']"));
		String dateText = dateElement.getText();
		String[] DAY= dateText.split("\n");	
		String dayOfWeek = DAY[1].trim();
		System.out.println(dayOfWeek);
		
		if (dayOfWeek.equalsIgnoreCase("Monday"))
		{
			String field1Value = OT1.getAttribute("value");
			int field1Int = Integer.parseInt(field1Value);			
			String field2Value = OT2.getAttribute("value");
			int field2Int = Integer.parseInt(field2Value);			
			String field3Value = OT3.getAttribute("value");
			int field3Int = Integer.parseInt(field3Value);			
			String field4Value = OT4.getAttribute("value");
			int field4Int = Integer.parseInt(field4Value);			
			String field5Value = OT5.getAttribute("value");
			int field5Int = Integer.parseInt(field5Value);
			
			int Sum = field1Int + field2Int + field3Int + field4Int + field5Int;			
			String LastField=Day5.getAttribute("value");
			int Dayfield = Integer.parseInt(LastField);			
			int Total = Dayfield + Sum;
			Day5.clear();
			String sumStr = Integer.toString(Total);
			Day5.sendKeys(sumStr);
			Thread.sleep(1000);
			OT1.clear();
			OT2.clear();
			OT3.clear();
			OT4.clear();
			OT5.clear();
		}
		if (dayOfWeek.equalsIgnoreCase("Thursday"))
		{
			String field1Value = OT1.getAttribute("value");
			int field1Int = Integer.parseInt(field1Value);			
			String field2Value = OT2.getAttribute("value");
			int field2Int = Integer.parseInt(field2Value);			
			String field3Value = OT5.getAttribute("value");
			int field3Int = Integer.parseInt(field3Value);			
			String field4Value = OT6.getAttribute("value");
			int field4Int = Integer.parseInt(field4Value);			
			String field5Value = OT7.getAttribute("value");
			int field5Int = Integer.parseInt(field5Value);
			
			int Sum = field1Int + field2Int + field3Int + field4Int + field5Int;			
			String LastField=Day7.getAttribute("value");
			int Dayfield = Integer.parseInt(LastField);			
			int Total = Dayfield + Sum;
			Day7.clear();
			String sumStr = Integer.toString(Total);
			Day7.sendKeys(sumStr);
			Thread.sleep(1000);
			OT1.clear();
			OT2.clear();
			OT5.clear();
			OT6.clear();
			OT7.clear();
		}
		if (dayOfWeek.equalsIgnoreCase("Friday"))
		{
			String field1Value = OT1.getAttribute("value");
			int field1Int = Integer.parseInt(field1Value);			
			String field2Value = OT4.getAttribute("value");
			int field2Int = Integer.parseInt(field2Value);			
			String field3Value = OT5.getAttribute("value");
			int field3Int = Integer.parseInt(field3Value);			
			String field4Value = OT6.getAttribute("value");
			int field4Int = Integer.parseInt(field4Value);			
			String field5Value = OT7.getAttribute("value");
			int field5Int = Integer.parseInt(field5Value);
			
			int Sum = field1Int + field2Int + field3Int + field4Int + field5Int;			
			String LastField=Day7.getAttribute("value");
			int Dayfield = Integer.parseInt(LastField);			
			int Total = Dayfield + Sum;
			Day7.clear();
			String sumStr = Integer.toString(Total);
			Day7.sendKeys(sumStr);
			Thread.sleep(1000);
			OT1.clear();
			OT4.clear();
			OT5.clear();
			OT6.clear();
			OT7.clear();
		}
			Thread.sleep(2000);
			lib.select(ChangeReason,hmap.get("ChangeReason"));
			Thread.sleep(2000);
			SaveBtn.click();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			Thread.sleep(2000);  
			CloseButton.click();
	}
}
