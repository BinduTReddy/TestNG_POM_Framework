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

public class EmpView_EmpModule {

	WebDriver driver;
	Generic_Methods lib;

	@FindBy(xpath="//*[@class='shm_link001' and @id='26']")
	private WebElement EmpModule;

	@FindBy(xpath="//*[@class='shm_link002' and @id='29']")
	private WebElement EmpSubModule;

	@FindBy(xpath="//*[@id='txtEmpSearch']")
	private WebElement EmpNametxtBox;

	@FindBy(xpath="//body[1]/ul[2]/li[1]/a[1]")
	private WebElement EmpNamepopup;
	
	@FindBy(xpath="//*[@id='txtEmailSearch']")
	private WebElement EmailTxt;
	
	@FindBy(xpath="//body[1]/ul[3]/li[1]/a[1]")
	private WebElement Emailpopup;

	@FindBy(xpath="//*[@id='grdEmployeeList']/div[2]/table/tbody/tr[1]/td[1]/a")
	private WebElement Plusicon;

	@FindBy(xpath="//*[@class='ImgbtnView img']")
	private WebElement Viewicon;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Placement')]")
	private WebElement PlacementTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']//ul//a[contains(text(),'Bill-Pay Rate')]")
	private WebElement BillPayRate_SubTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']//ul//a[contains(text(),'Documents')]")
	private WebElement Documents_SubTab;
	
	@FindBy(linkText="Commission Split")
	private WebElement CommissionSplit_SubTab;
	
	@FindBy(linkText="Workers Comp")
	private WebElement WorkersComp_SubTab;
	
	
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Emp. Status')]")
	private WebElement EmpStatus;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Emp.Docs')]")
	private WebElement EmpDocsTab;
	
	@FindBy(xpath="//*[@id='tabStripDocument']/ul//a[contains(text(),'Sales')]")
	private WebElement SalesTab;
	
	@FindBy(xpath="//*[@id='tabStripDocument']/ul//a[contains(text(),'Payroll')]")
	private WebElement PayrollTab;

	@FindBy(xpath="//*[@id='tabStripDocument']/ul//a[contains(text(),'Pay Option')]")
	private WebElement PayOptionTab;
	
	@FindBy(xpath="//*[@id='tabStripDocument']/ul//a[contains(text(),'Gratuity')]")
	private WebElement GratuityTab;
	
	@FindBy(xpath="//*[@id='tabStripDocument']/ul//a[contains(text(),'Drug Test')]")
	private WebElement DrugTestTab;
	
	@FindBy(xpath="//*[@id='tabStripDocument']/ul//a[contains(text(),'B/G Test')]")
	private WebElement BGTab;
	
	@FindBy(xpath="//*[@id='tabStripDocument']/ul//a[contains(text(),'Healthcare')]")
	private WebElement HealthcareTab;
	
	@FindBy(xpath="//*[@id='tabStripDocument']/ul//a[contains(text(),'Misc')]")
	private WebElement MiscTab;
	
	@FindBy(xpath="//*[@id='tabStripDocument']/ul/li[10]/a[contains(text(),'Document')]")
	private WebElement DocumentTab;
	
	@FindBy(xpath="//*[@id='tabStripDocument']/ul//a[contains(text(),'Document Request')]")
	private WebElement DocRequestTab;
	
	@FindBy(xpath="//*[@id='tabStripDocument']/ul//a[contains(text(),'History')]")
	private WebElement HistoryTab;		
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Financials')]")
	private WebElement FinancialsTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Net Pay')]")
	private WebElement NetPayTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Total Cost')]")
	private WebElement TotalcostTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Emergency')]")
	private WebElement EmergencyTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Education')]")
	private WebElement EducationTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Family')]")
	private WebElement FamilyTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Notes/Conversation')]")
	private WebElement NotesConvTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Event/Reminder')]")
	private WebElement EventRemTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Payroll Advice')]")
	private WebElement PayrollAdviceTab;	
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Invoice Advice')]")
	private WebElement InvAdviceTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Client OB Docs')]")
	private WebElement ClientOBDocsTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'A/R Detail')]")
	private WebElement AR_DetailTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Prev. Employment')]")
	private WebElement PrevEmploymentTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Asset')]")
	private WebElement AssetTab;	
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Resume')]")
	private WebElement ResumeTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Reference')]")
	private WebElement ReferenceTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Part Time')]")
	private WebElement PartTimeTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Passport')]")
	private WebElement PassportTab;	
	
	@FindBy(xpath="//*[@id='tabpassport']//img")
	private WebElement SubPassportTab;
	
	@FindBy(xpath="//*[@id='Passport_PassportNo']")
	private WebElement PassportNumber;
	
	@FindBy(xpath="//*[@id='Passport_IssuedCountryID']")
	private WebElement IssuedCountry;
	
	@FindBy(xpath="//*[@id='Passport_IssuedPlace']")
	private WebElement IssuedPlace;
	
	@FindBy(xpath="//*[@id='Passport_IssuedDate']")
	private WebElement IssuedDate;
	
	@FindBy(xpath="//*[@id='Passport_ExpiryDate']")
	private WebElement ExpiryDate;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//*[@id='Passport_LinkID']")
	private WebElement Dependent;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'EP Login')]")
	private WebElement EPLoginTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Login History')]")
	private WebElement LoginHistoryTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Payroll Code History')]")
	private WebElement PayrollCodeHistoryTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul//a[contains(text(),'Workflows')]")
	private WebElement WorkflowsTab;
	
	@FindBy(xpath="//*[@id='30']")
	private WebElement ReportsLink;
	
	@FindBy(linkText="Employee Start")
	private WebElement Emp_Start;
	
	@FindBy(xpath="//a[@class='ImgbtnExcel img']")
	private WebElement ExcelIcon_Download;
	
	@FindBy(xpath="//input[@value='Generate Report']")
	private WebElement GenerateReport;
	
	@FindBy(xpath="//*[@title='Generate Report']")
	private WebElement SearchIcon;
	
	@FindBy(linkText="Employee Summary")
	private WebElement Emp_Summary;
	
	@FindBy(linkText="Employees Status")
	private WebElement Emp_Status;
	
	@FindBy(linkText="Employee Income*")
	private WebElement Emp_Income;
	
	@FindBy(linkText="Emp. Bill Rate Change")
	private WebElement Emp_BillRateChange;
	
	@FindBy(linkText="Emp. Pay Rate Change")
	private WebElement Emp_PayRateChange;
		
	@FindBy(linkText="Active Placements")
	private WebElement Active_Placements;
	
	@FindBy(linkText="Placement Start Note")
	private WebElement Placement_StartNote;
	
	@FindBy(xpath="//*[@id='MainContent_ctl00_txtStartDate']")
	private WebElement StartDate;
	
	@FindBy(linkText="Hires/Terms by Client")
	private WebElement HiresorTerms_Client;
	
	@FindBy(linkText="Placement Ends")
	private WebElement Placement_Ends;
	
	@FindBy(linkText="Employee Scheduled End")
	private WebElement Emp_Scheduled_End;
	
	@FindBy(xpath="//*[@id='txtStrDate']")
	private WebElement ScheEnd_startDate;
		
	@FindBy(linkText="Zero Bill Rate Report")
	private WebElement Zero_BillRate_Report;
	
	@FindBy(linkText="Zero Pay Rate Report")
	private WebElement Zero_PayRate_Report;
	
	@FindBy(linkText="Employee Address Report")
	private WebElement Emp_Add_Report;
	
	@FindBy(linkText="Employee Offboard Date–Reason")
	private WebElement Emp_Offboard_DateReason;
		
	@FindBy(xpath="//input[@id='txtOffboardFromDate']")
	private WebElement OffBoardFromDate;
	
	@FindBy(xpath="//a[@class='ImgbtnSearch img']")
	private WebElement ImgSearchBtn;
	
	@FindBy(linkText="Employee Payment Option")
	private WebElement Emp_Payment_Option;
	
	@FindBy(linkText="Total Hours Report")
	private WebElement Total_Hrs_Report;
	
	@FindBy(linkText="Zero Hour Timesheet")
	private WebElement Zero_Hour_TS;
	
	public EmpView_EmpModule(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void External_Employee(Map<String,String> hmap) throws Exception {
		Thread.sleep(1500);
		EmpModule.click();
		EmpSubModule.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Thread.sleep(1000);
		EmpNametxtBox.sendKeys(hmap.get("EmpName"));
		Thread.sleep(500);
		EmpNamepopup.click();
		EmailTxt.click();
		EmailTxt.sendKeys(hmap.get("Email"));
		Thread.sleep(500);
		Emailpopup.click();
		Thread.sleep(1000);
		EmailTxt.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		Viewicon.click();
		Thread.sleep(1000);	
	}
	
	
	public void EmpModule_AllTabLinks(Map<String,String> hmap) throws Exception {
		
		lib = new Generic_Methods(driver);
		PlacementTab.click();
		Thread.sleep(2000);
		
		
		
		EmpStatus.click();
		Thread.sleep(2000);
		
		EmpDocsTab.click();
		Thread.sleep(1500);
		SalesTab.click();
		Thread.sleep(1000);
		PayrollTab.click();
		Thread.sleep(2000);
		PayOptionTab.click();
		Thread.sleep(2000);
		GratuityTab.click();
		Thread.sleep(2000);
		DrugTestTab.click();
		Thread.sleep(2000);
		BGTab.click();
		Thread.sleep(2000);
		HealthcareTab.click();
		Thread.sleep(2000);
		MiscTab.click();
		Thread.sleep(2000);
		DocumentTab.click();
		Thread.sleep(2000);
		DocRequestTab.click();
		Thread.sleep(2000);
		HistoryTab.click();
		Thread.sleep(2000);
		
		FinancialsTab.click();
		Thread.sleep(2000);
		NetPayTab.click();
		Thread.sleep(2000);
		TotalcostTab.click();
		Thread.sleep(2000);
		EmergencyTab.click();
		Thread.sleep(2000);
		EducationTab.click();
		Thread.sleep(2000);
		FamilyTab.click();
		Thread.sleep(2000);
		NotesConvTab.click();
		Thread.sleep(2000);
		EventRemTab.click();
		Thread.sleep(2000);
		PayrollAdviceTab.click();
		Thread.sleep(2000);
		InvAdviceTab.click();
		Thread.sleep(2000);
		ClientOBDocsTab.click();
		Thread.sleep(2000);
		AR_DetailTab.click();
		Thread.sleep(2000);
		PrevEmploymentTab.click();
		Thread.sleep(2000);
		AssetTab.click();
		Thread.sleep(2000);
		ResumeTab.click();
		Thread.sleep(2000);
		ReferenceTab.click();
		Thread.sleep(2000);
		PartTimeTab.click();
		Thread.sleep(2000);
		
		PassportTab.click();
		Thread.sleep(2000);
		SubPassportTab.click();
		Thread.sleep(1000);
		
		String value = hmap.get("PassportType"); 
		String PassportType = "//*[@id='tabpassport']//following-sibling::ul//a[normalize-space()='"+ value +"']";
		driver.findElement(By.xpath(PassportType)).click();
		Thread.sleep(1000);
		
		if (value.equalsIgnoreCase("New Passport")) {	
			lib.switchOutOfFrame();
			PassportNumber.sendKeys(hmap.get("PassportNum"));
			Thread.sleep(500);
			lib.select(IssuedCountry, hmap.get("IssuedCountry"));
			Thread.sleep(500);
			IssuedPlace.sendKeys(hmap.get("Issued_Place"));
			Thread.sleep(500);
			IssuedDate.click();
			IssuedDate.sendKeys(hmap.get("Issued_Date"));
			Thread.sleep(500);
			ExpiryDate.click();
			ExpiryDate.sendKeys(hmap.get("Expiry_Date"));
			Thread.sleep(500);
			SaveBtn.click();
			Thread.sleep(500);	
			lib.handlingFrame("frmContent");
			Thread.sleep(1000);	
		}
		else if (value.equalsIgnoreCase("Dependent Passport")) {
			lib.switchOutOfFrame();
			lib.select(Dependent, hmap.get("Dependent_Name"));
			Thread.sleep(500);
			PassportNumber.sendKeys(hmap.get("PassportNum"));
			Thread.sleep(500);
			lib.select(IssuedCountry, hmap.get("IssuedCountry"));
			Thread.sleep(500);
			IssuedPlace.sendKeys(hmap.get("Issued_Place"));
			Thread.sleep(500);
			IssuedDate.click();
			IssuedDate.sendKeys(hmap.get("Issued_Date"));
			Thread.sleep(500);
			ExpiryDate.click();
			ExpiryDate.sendKeys(hmap.get("Expiry_Date"));
			Thread.sleep(500);
			SaveBtn.click();
			Thread.sleep(500);	
			lib.handlingFrame("frmContent");
			Thread.sleep(1000);		
		}
				
		EPLoginTab.click();
		Thread.sleep(2000);
		LoginHistoryTab.click();
		Thread.sleep(2000);
		PayrollCodeHistoryTab.click();
		Thread.sleep(2000);
		WorkflowsTab.click();
		Thread.sleep(2000);		
	}
	
    public void EmpModule_ReportsLinks(Map<String,String> hmap) throws Exception {
		
		lib = new Generic_Methods(driver);
		Thread.sleep(1500);
		EmpModule.click();
		Thread.sleep(1000);
		ReportsLink.click();
		Thread.sleep(500);		
		Emp_Start.click();
		lib.handlingFrame("frmContent");
		ExcelIcon_Download.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);	
		Emp_Summary.click();
		lib.handlingFrame("frmContent");
		GenerateReport.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);	
		Emp_Status.click();
		lib.handlingFrame("frmContent");
		ExcelIcon_Download.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);	
		Emp_Income.click();
		lib.handlingFrame("frmContent");
		ExcelIcon_Download.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);	
		Emp_BillRateChange.click();
		lib.handlingFrame("frmContent");
		ExcelIcon_Download.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);	
		Emp_PayRateChange.click();
		lib.handlingFrame("frmContent");
		ExcelIcon_Download.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);	
		Active_Placements.click();
		lib.handlingFrame("frmContent");
		ExcelIcon_Download.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);	
		Placement_StartNote.click();
		lib.handlingFrame("frmContent");
		StartDate.clear();
		StartDate.click();
		StartDate.sendKeys("11/01/2023");
		Thread.sleep(500);
		SearchIcon.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);	
		HiresorTerms_Client.click();
		lib.handlingFrame("frmContent");
		ExcelIcon_Download.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);
		Placement_Ends.click();
		lib.handlingFrame("frmContent");
		ExcelIcon_Download.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);
		Emp_Scheduled_End.click();
		lib.handlingFrame("frmContent");
		ScheEnd_startDate.clear();
		ScheEnd_startDate.click();
		ScheEnd_startDate.sendKeys("11/01/2023");
		Thread.sleep(500);
		ImgSearchBtn.click();
		ExcelIcon_Download.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);
		Zero_BillRate_Report.click();
		lib.handlingFrame("frmContent");
		ExcelIcon_Download.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);
		Zero_PayRate_Report.click();
		lib.handlingFrame("frmContent");
		ExcelIcon_Download.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);
		Emp_Add_Report.click();
		lib.handlingFrame("frmContent");
		ExcelIcon_Download.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);
		Emp_Offboard_DateReason.click();
		lib.handlingFrame("frmContent");
		OffBoardFromDate.clear();
		OffBoardFromDate.click();
		OffBoardFromDate.sendKeys("11/01/2023");
		Thread.sleep(500);
		ImgSearchBtn.click();
		Thread.sleep(1000);
		ExcelIcon_Download.click();
		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
		ReportsLink.click();
		Thread.sleep(500);
		Emp_Payment_Option.click();
		Thread.sleep(2000);
		
		ReportsLink.click();
		Thread.sleep(500);
		Total_Hrs_Report.click();
		Thread.sleep(2500);
		
		ReportsLink.click();
		Thread.sleep(500);
		Zero_Hour_TS.click();
		Thread.sleep(2500);
		
}
	
	
}
