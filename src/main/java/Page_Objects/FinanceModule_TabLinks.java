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

public class FinanceModule_TabLinks {

	WebDriver driver;
	Generic_Methods lib;

	@FindBy(linkText="Finance")
	private WebElement FinanceModule;

	@FindBy(xpath="//a[@id='60']")
	private WebElement Fin_DashBoard;

	@FindBy(linkText="Chart")
	private WebElement ChartSubTab;

	@FindBy(linkText="Trend")
	private WebElement TrendSubTab;

	@FindBy(linkText="Timesheets")
	private WebElement TimesheetsTab;

	@FindBy(linkText="Enter Timesheet")
	private WebElement EnterTS;

	@FindBy(linkText="Pending Timesheet")
	private WebElement PendingTS; 

	@FindBy(linkText="View Web Timesheet")
	private WebElement ViewWebTS;

	@FindBy(linkText="Timesheet Adjustments")
	private WebElement TSAdjustments;

	@FindBy(linkText="Batch Timesheet")
	private WebElement BatchTS;

	@FindBy(linkText="Timesheet Reminder")
	private WebElement TSReminder;

	@FindBy(linkText="Units")
	private WebElement UnitsTab;

	@FindBy(linkText="Invoices")
	private WebElement InvoicesTab;

	@FindBy(linkText="Pending Invoice")
	private WebElement PendingInvoice;

	@FindBy(linkText="Batch Invoice")
	private WebElement BatchInvoice;

	@FindBy(linkText="Misc Invoice")
	private WebElement MiscInvoice;

	@FindBy(linkText="Misc Invoice - Credit")
	private WebElement MiscInvoiceCredit;

	@FindBy(linkText="Misc Invoice - Expense")
	private WebElement MiscInvoiceExpense;

	@FindBy(linkText="Void Invoice")
	private WebElement VoidInvoice;

	@FindBy(linkText="Invoice Pre-Validation")
	private WebElement InvoicePreValidation;

	@FindBy(linkText="View Invoice")
	private WebElement ViewInvoiceTab;

	@FindBy(linkText="Travel & Expense")
	private WebElement TravelandExpenseTab;

	@FindBy(linkText="Banking Center")
	private WebElement Banking_CenterTab;

	@FindBy(linkText="Credit Card Center")
	private WebElement CreditCard_CenterTab;

	@FindBy(linkText="Document Center")
	private WebElement DocumentCenterTab;

	@FindBy(linkText="CFO Summary")
	private WebElement CFO_SummaryTab;

	@FindBy(linkText="Export")
	private WebElement ExportTab;

	@FindBy(linkText="Invoices - Export")
	private WebElement InvoicesExport_SubTab;

	@FindBy(linkText="Client Specific Format")
	private WebElement ClientSpecificFormat_SubTab;

	@FindBy(linkText="Reports")
	private WebElement ReportsTab;

	@FindBy(linkText="Un Billed")
	private WebElement UnBilledReport;

	@FindBy(xpath="//*[@id='txtUnbilledEndDate']")
	private WebElement Unbilled_Date;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchImgBtn;

	@FindBy(xpath="//*[@title='Search']")
	private WebElement Search_TSreport;

	@FindBy(xpath="//*[@class='ImgbtnExcel img']")
	private WebElement ExcelIconBtn;

	@FindBy(linkText="Timesheet - Monthly")
	private WebElement TSMonthly_Report;

	@FindBy(xpath="//select[@id='MainContent_ctl00_ddlMonth']")
	private WebElement TSMonth_Data;

	@FindBy(xpath="//select[@id='MainContent_ctl00_ddlYear']")
	private WebElement TSYear_Data;

	@FindBy(linkText="Timesheet - For Solomon")
	private WebElement TSsolomon_Report;

	@FindBy(xpath="//*[@id='MainContent_ctl00_txtTSDate']")
	private WebElement TSsolomon_FromDate;

	@FindBy(xpath="//*[@id='MainContent_ctl00_txtTsEndDate']")
	private WebElement TSsolomon_TillDate;

	@FindBy(linkText="Timesheet - Consolidated")
	private WebElement TSConsolidated_Report;

	@FindBy(xpath="//*[@id='txtTimesheetStartDate']")
	private WebElement TsConsolidated_startDate;

	@FindBy(linkText="Weekly Revenue Report")
	private WebElement WeeklyRevenue_Report;

	@FindBy(xpath="//*[@id='txtRevenueFromDate']")
	private WebElement RevenueFromDate;

	@FindBy(linkText="VMS Fees Report")
	private WebElement VMSFees_Report;

	@FindBy(xpath="//*[@id='txtVMSFeesFromDate']")
	private WebElement VMSFeeFromDate;

	@FindBy(linkText="Income - Direct Hire")
	private WebElement IncomeDH_Report;

	@FindBy(xpath="//*[@id='ddlDHIncomeMonth']")
	private WebElement DHIncomeMonth;

	@FindBy(xpath="//*[@id='ddlDHIncomeYear']")
	private WebElement DHIncomeYear;

	@FindBy(linkText="Income - Payroll by State")
	private WebElement IncomePayrollState_Report;

	@FindBy(xpath="//*[@id='MainContent_ctl00_ddlMonth']")
	private WebElement PayrollState_Month;

	@FindBy(xpath="//*[@id='MainContent_ctl00_ddlYear']")
	private WebElement PayrollState_Year;

	@FindBy(linkText="Income - Conversion")
	private WebElement IncomeConversion_Report;

	@FindBy(xpath="//*[@id='ddlConvIncomeMonth']")
	private WebElement ConvIncMonth;

	@FindBy(linkText="New Client Report")
	private WebElement NewClient_Report;

	@FindBy(xpath="//*[@id='txtNewClientFromDate']")
	private WebElement NewClientFromDate;

	@FindBy(linkText="Workers Comp Report")
	private WebElement WorkersComp_Report;

	@FindBy(xpath="//*[@id='txtStartDate']")
	private WebElement WorkComp_FromDate;

	@FindBy(linkText="Active Timesheet Approver")
	private WebElement ActiveTSApprover_Report;

	@FindBy(linkText="Sales Tax Report")
	private WebElement SalesTax_Report;

	@FindBy(xpath="//*[@id='txtFromDate']")
	private WebElement Inv_StartDate;

	@FindBy(xpath="//*[@id='txtTodate']")
	private WebElement Inv_EndDate;

	@FindBy(linkText="Direct Hire Activity Report")
	private WebElement DH_Activity_Report;

	@FindBy(linkText="Days Sales Outstanding (DSO)")
	private WebElement DaysSalesOutstanding_Report;

	@FindBy(linkText="Invoice List Report")
	private WebElement InvoiceList_Report;

	@FindBy(xpath="//*[@id='txtInvoiceListFromDate']")
	private WebElement InvList_FromDate;

	@FindBy(linkText="D/H Fee by Producer")
	private WebElement DH_FeeProducer_Report;

	@FindBy(xpath="//*[@id='txtDHFeesFromDate']")
	private WebElement DhFee_FromDate;

	@FindBy(linkText="Temp - D/H Producer Report")
	private WebElement DH_producerReport;

	@FindBy(xpath="//*[@id='MainContent_ctl00_txtFromDate']")
	private WebElement DHprod_FromDate;

	@FindBy(xpath="//*[@id='MainContent_ctl00_txtToDate']")
	private WebElement DHprod_ToDate;
	
	@FindBy(linkText="Investment")
	private WebElement InvestmentTab;
	
	@FindBy(linkText="Submitted List")
	private WebElement SubmittedList;
	
	@FindBy(linkText="Approved List")
	private WebElement ApprovedList;
	
	@FindBy(linkText="Rejected List")
	private WebElement RejectedList;

	public FinanceModule_TabLinks(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void FinanceMod_TabLinks(Map<String,String> hmap) throws Exception {

		lib = new Generic_Methods(driver);
		FinanceModule.click();
		Fin_DashBoard.click();		
		lib.handlingFrame("frmContent");
		ChartSubTab.click();
		Thread.sleep(500);
		TrendSubTab.click();
		lib.switchOutOfFrame();
		TimesheetsTab.click();
		Thread.sleep(1000);
		PendingTS.click();
		Thread.sleep(2000);
		TimesheetsTab.click();
		Thread.sleep(1000);
		ViewWebTS.click();
		Thread.sleep(2000);
		TimesheetsTab.click();
		Thread.sleep(1000);
		TSAdjustments.click();
		Thread.sleep(2000);
		TimesheetsTab.click();
		Thread.sleep(1000);
		BatchTS.click();
		Thread.sleep(2000);	
		TimesheetsTab.click();
		Thread.sleep(1000);
		TSReminder.click();
		Thread.sleep(2000);		
		InvoicesTab.click();
		Thread.sleep(1000);
		PendingInvoice.click();
		Thread.sleep(2000);
		InvoicesTab.click();
		Thread.sleep(1000);
		BatchInvoice.click();
		Thread.sleep(2000);
		InvoicesTab.click();
		Thread.sleep(1000);
		MiscInvoice.click();
		Thread.sleep(2000);
		InvoicesTab.click();
		Thread.sleep(1000);
		MiscInvoiceCredit.click();
		Thread.sleep(2000);
		InvoicesTab.click();
		Thread.sleep(1000);
		MiscInvoiceExpense.click();
		Thread.sleep(2000);
		InvoicesTab.click();
		Thread.sleep(1000);
		VoidInvoice.click();
		Thread.sleep(2000);
		InvoicesTab.click();
		Thread.sleep(1000);
		InvoicePreValidation.click();
		Thread.sleep(2000);

		ViewInvoiceTab.click();
		Thread.sleep(2000);		
		TravelandExpenseTab.click();
		Thread.sleep(2000);
		Banking_CenterTab.click();
		Thread.sleep(2000);
		CreditCard_CenterTab.click();
		Thread.sleep(2000);
		DocumentCenterTab.click();
		Thread.sleep(2000);
		CFO_SummaryTab.click();
		Thread.sleep(2000);
		ExportTab.click();
		Thread.sleep(2000);
		InvoicesExport_SubTab.click();
		Thread.sleep(2000);
		ClientSpecificFormat_SubTab.click();
		Thread.sleep(2000);

		ReportsTab.click();
		Thread.sleep(500);
		UnBilledReport.click();
		lib.handlingFrame("frmContent");
		Unbilled_Date.clear();
		Unbilled_Date.click();
		Unbilled_Date.sendKeys(hmap.get("Rep_ValidDate"));
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);	
		TSMonthly_Report.click();
		lib.handlingFrame("frmContent");
		lib.select(TSMonth_Data, hmap.get("Rep_TSMonth"));
		lib.select(TSYear_Data, hmap.get("Rep_TSYear"));
		Thread.sleep(500);
		Search_TSreport.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);	
		TSsolomon_Report.click();
		lib.handlingFrame("frmContent");
		TSsolomon_FromDate.click();
		TSsolomon_FromDate.sendKeys(hmap.get("Rep_ValidDate"));
		TSsolomon_TillDate.click();
		TSsolomon_TillDate.sendKeys(hmap.get("Rep_ValidToDate"));
		Thread.sleep(500);
		Search_TSreport.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);	
		TSConsolidated_Report.click();
		lib.handlingFrame("frmContent");
		TsConsolidated_startDate.clear();
		TsConsolidated_startDate.click();
		TsConsolidated_startDate.sendKeys(hmap.get("Rep_ValidDate"));
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);		
		WeeklyRevenue_Report.click();
		lib.handlingFrame("frmContent");
		RevenueFromDate.clear();
		RevenueFromDate.click();
		RevenueFromDate.sendKeys(hmap.get("Rep_ValidDate"));
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);	
		VMSFees_Report.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		VMSFeeFromDate.clear();
		VMSFeeFromDate.click();
		VMSFeeFromDate.sendKeys(hmap.get("Rep_ValidDate"));
		Thread.sleep(1000);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);	
		IncomeDH_Report.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		lib.select(DHIncomeMonth, hmap.get("Rep_TSMonth"));
		lib.select(DHIncomeYear, hmap.get("Rep_TSYear"));
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);
		IncomePayrollState_Report.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		lib.select(PayrollState_Month, hmap.get("Rep_TSMonth"));
		lib.select(PayrollState_Year,hmap.get("Rep_TSYear"));
		Thread.sleep(500);
		SearchImgBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);
		IncomeConversion_Report.click();
		lib.handlingFrame("frmContent");
		lib.select(ConvIncMonth, hmap.get("Rep_TSMonth"));
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);
		NewClient_Report.click();
		lib.handlingFrame("frmContent");
		NewClientFromDate.clear();
		NewClientFromDate.click();
		NewClientFromDate.sendKeys(hmap.get("Rep_ValidDate"));
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);
		WorkersComp_Report.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		WorkComp_FromDate.clear();
		WorkComp_FromDate.click();
		WorkComp_FromDate.sendKeys(hmap.get("Rep_ValidDate"));
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);
		ActiveTSApprover_Report.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);
		SalesTax_Report.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		Inv_StartDate.click();
		Inv_StartDate.sendKeys(hmap.get("Rep_ValidDate"));
		Inv_EndDate.click();
		Inv_EndDate.sendKeys(hmap.get("Rep_ValidToDate"));
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);
		DH_Activity_Report.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);
		DaysSalesOutstanding_Report.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);
		InvoiceList_Report.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		InvList_FromDate.clear();
		InvList_FromDate.click();
		InvList_FromDate.sendKeys(hmap.get("Rep_ValidDate"));
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);
		DH_FeeProducer_Report.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		DhFee_FromDate.clear();
		DhFee_FromDate.click();
		DhFee_FromDate.sendKeys(hmap.get("Rep_ValidDate"));
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();

		ReportsTab.click();
		Thread.sleep(500);
		DH_producerReport.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		DHprod_FromDate.click();
		DHprod_FromDate.sendKeys(hmap.get("Rep_ValidDate"));
		DHprod_ToDate.click();
		DHprod_ToDate.sendKeys(hmap.get("Rep_ValidToDate"));
		Thread.sleep(500);
		SearchImgBtn.click();
		Thread.sleep(1000);
		ExcelIconBtn.click();
		lib.switchOutOfFrame();
		
		InvestmentTab.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		SubmittedList.click();
		Thread.sleep(2000);
		ApprovedList.click();
		Thread.sleep(2000);
		RejectedList.click();
		Thread.sleep(2000);
		
	}
}
