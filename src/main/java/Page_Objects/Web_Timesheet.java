package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class Web_Timesheet {	
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath="//*[@id='UserName']")
	private WebElement UserName;

	@FindBy(xpath="//*[@id='Password']")
	private WebElement Password;

	@FindBy(xpath="//*[@type='submit']")
	private WebElement Submit;

	@FindBy(xpath="//a[contains(text(),'Timesheet')]")
	private WebElement TSTab;

	@FindBy(xpath="//a[@class='ImgbtnView img']")
	private WebElement ImgBtnView;

	@FindBy(xpath="//*[@id='TimesheetList']/table/tbody/tr/td[1]/a")
	private WebElement TSImgViewBtn;

	@FindBy(xpath="//a[contains(text(),'Add Timesheet')]")
	private WebElement AddTSBtn;

	@FindBy(xpath="//a[contains(text(),'Fill Hours')]")
	private WebElement FillHrs;

	@FindBy(xpath="//a[contains(text(),'Change')]")
	private WebElement ChangeBtn;

	@FindBy(xpath="//*[@id='txtStartTime_1']")
	private WebElement txtStartTime_1;

	@FindBy(xpath="//*[@id='txtStartTime_2']")
	private WebElement txtStartTime_2;

	@FindBy(xpath="//*[@id='txtStartTime_3']")
	private WebElement txtStartTime_3;

	@FindBy(xpath="//*[@id='txtStartTime_4']")
	private WebElement txtStartTime_4;

	@FindBy(xpath="//*[@id='txtStartTime_5']")
	private WebElement txtStartTime_5;

	@FindBy(xpath="//*[@id='txtEndTime_1']")
	private WebElement txtEndTime_1;

	@FindBy(xpath="//*[@id='txtEndTime_2']")
	private WebElement txtEndTime_2;

	@FindBy(xpath="//*[@id='txtEndTime_3']")
	private WebElement txtEndTime_3;

	@FindBy(xpath="//*[@id='txtEndTime_4']")
	private WebElement txtEndTime_4;

	@FindBy(xpath="//*[@id='txtEndTime_5']")
	private WebElement txtEndTime_5;

	@FindBy(xpath="//input[@id='txtNB1_4']")
	private WebElement TxtHol_1;

	@FindBy(xpath="//input[@id='txtNB3_5']")
	private WebElement TxtSick_3;

	@FindBy(xpath="//input[@id='txtNB5_7']")
	private WebElement TxtVac_5;

	@FindBy(xpath="//*[@id='TSTable']//table/tbody/tr[2]/td[2]/div/div/div")
	private WebElement TimesheetAttachment;
	
	@FindBy(xpath="//*[@id='ChangeReasonID']")
	private WebElement ChangeReasonID;

	@FindBy(xpath="//a[contains(text(),'Submit for Approval')]")
	private WebElement SubmitForApp;

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
	
	@FindBy(xpath="//*[@id='TimesheetList']//tr[1]/td[1]/a")
	private WebElement TSView;
	
	@FindBy(xpath="//*[@id='cpxPopDiv2']//table[3]/tbody/tr/td[3]/img")
	private WebElement TSChangeIcon;

	@FindBy(xpath="//a[contains(text(),'Save')]")
	private WebElement SaveBtn;

	@FindBy(xpath="//a[contains(text(),'Un Approved')]")
	private WebElement UnApprovedBtn;

	@FindBy(xpath="//button[contains(text(),'Approve')]")
	private WebElement ApproveBtn;

	@FindBy(xpath="//*[@id='TimesheetList']/table/tbody/tr[1]/td[15]")
	private WebElement TSStatus;

	@FindBy(xpath="/html/body/div[4]/div/a/span")
	private WebElement CloseBtn;

	@FindBy(xpath="//*[contains(text(),'Delete T/S')]")
	private WebElement DeleteTS;

	@FindBy(xpath="//*[@id='ReasonID']")
	private WebElement DeleteTSReason;

	@FindBy(xpath="//div/a[contains(text(),'Delete')]")
	private WebElement DeleteBtn;

	@FindBy(xpath="//*[@id='txtEmployee']")
	private WebElement ClientEmpsearch;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchImg;

	@FindBy(xpath="//*[@class='ImgbtnView img']")
	private WebElement ImbBtnView;

	@FindBy(xpath="//*[@id='RejectionReason']")
	private WebElement RejectionReason;

	public Web_Timesheet(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void US_WebTS_EmpPortal(Map<String,String> hmap) throws Exception {

		String secondWebsiteURL = hmap.get("EmpPortalLogin");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open(arguments[0], '_blank')", secondWebsiteURL);

		String firstTab = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		String secondTab = "";
		for (String handle : windowHandles) {
			if (!handle.equals(firstTab)) {
				secondTab = handle;
				break;
			}}
		driver.switchTo().window(secondTab);
		UserName.sendKeys(hmap.get("Email"));
		Password.sendKeys(hmap.get("Pwd"));
		Thread.sleep(1000);
		Submit.click();
		Thread.sleep(2000);

		TSTab.click();
		Thread.sleep(1000);
		ImgBtnView.click();
		Thread.sleep(1000);
		AddTSBtn.click();
		Thread.sleep(2000);
		FillHrs.click();
		Thread.sleep(1000);
		txtStartTime_1.sendKeys(hmap.get("StartTime_1"));
		txtStartTime_2.sendKeys(hmap.get("StartTime_2"));
		txtStartTime_3.sendKeys(hmap.get("StartTime_3"));
		txtStartTime_4.sendKeys(hmap.get("StartTime_4"));
		txtStartTime_5.sendKeys(hmap.get("StartTime_5"));
		Thread.sleep(1000);
		txtEndTime_1.sendKeys(hmap.get("EndTime_1"));
		txtEndTime_2.sendKeys(hmap.get("EndTime_2"));
		txtEndTime_3.sendKeys(hmap.get("EndTime_3"));
		txtEndTime_4.sendKeys(hmap.get("EndTime_4"));
		txtEndTime_5.sendKeys(hmap.get("EndTime_5"));
		Thread.sleep(1000);
//		TxtHol_1.sendKeys(hmap.get("Hol_1"));
//		TxtSick_3.sendKeys(hmap.get("Sick_3"));
//		TxtVac_5.sendKeys(hmap.get("Vac_5"));
//		Thread.sleep(1500);
		SubmitForApp.click();
		Thread.sleep(1500);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(1500);
		TSTab.click();
		Thread.sleep(2000);
		ImgBtnView.click();
		Thread.sleep(2000);
		driver.close();		
		driver.switchTo().window(firstTab);

		String thirdWebsiteURL = hmap.get("ClientPortalLogin");
		js.executeScript("window.open(arguments[0], '_blank')", thirdWebsiteURL);

		String thirdTab = "";
		windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {
			if (!handle.equals(firstTab) && !handle.equals(secondTab)) {
				thirdTab = handle;
				break;
			}}
		driver.switchTo().window(thirdTab);
		UserName.sendKeys(hmap.get("ClientUserId"));
		Password.sendKeys(hmap.get("ClientPwd"));
		Thread.sleep(1000);
		Submit.click();
		Thread.sleep(2000);
		ClientEmpsearch.sendKeys(hmap.get("EmpName"));
		SearchImg.click();
		Thread.sleep(1000);
		ImbBtnView.click();
		Thread.sleep(3000);

		String TSAppOpt =hmap.get("StatusBtn");
		String xpathExpression = "//a[@title='" + TSAppOpt +"']";		
		if(TSAppOpt.equals("Reject")) {
			RejectionReason.sendKeys(hmap.get("RejReason"));
			driver.findElement(By.xpath(xpathExpression)).click();
			Thread.sleep(1500);
		}else {
			driver.findElement(By.xpath(xpathExpression)).click();
		}

		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(firstTab);
		
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
		Searchimg.click();
		Thread.sleep(2000);
		ViewBtn.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		Thread.sleep(4000);
		CloseBtn.click();
	}	

	public void US_ReSubmitTS(Map<String,String> hmap) throws Exception {
		String TSAppOpt =hmap.get("StatusBtn");
		if(TSAppOpt.equals("Reject")) {	
			String secondWebsiteURL = hmap.get("EmpPortalLogin");
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.open(arguments[0], '_blank')", secondWebsiteURL);
			String firstTab = driver.getWindowHandle();
			Set<String> windowHandles = driver.getWindowHandles();
			String secondTab = "";
			for (String handle : windowHandles) {
				if (!handle.equals(firstTab)) {
					secondTab = handle;
					break;
				}}
			driver.switchTo().window(secondTab);
			
			UserName.sendKeys(hmap.get("Email"));
			Password.sendKeys(hmap.get("Pwd"));
			Thread.sleep(1000);
			Submit.click();
			Thread.sleep(2000);

			TSTab.click();
			Thread.sleep(1000);
			ImgBtnView.click();
			Thread.sleep(2000);
			TSImgViewBtn.click();
			Thread.sleep(2000);
			ChangeBtn.click();
			Thread.sleep(2000);
			FillHrs.click();
			Thread.sleep(1000);
			txtStartTime_1.sendKeys(hmap.get("StartTime_1"));
			txtStartTime_2.sendKeys(hmap.get("StartTime_2"));
			txtStartTime_3.sendKeys(hmap.get("StartTime_3"));
			txtStartTime_4.sendKeys(hmap.get("StartTime_4"));
			txtStartTime_5.sendKeys(hmap.get("StartTime_5"));
			Thread.sleep(1000);
			txtEndTime_1.sendKeys(hmap.get("EndTime_1"));
			txtEndTime_2.sendKeys(hmap.get("EndTime_2"));
			txtEndTime_3.sendKeys(hmap.get("EndTime_3"));
			txtEndTime_4.sendKeys(hmap.get("EndTime_4"));
			txtEndTime_5.sendKeys(hmap.get("EndTime_5"));
//			Thread.sleep(1000);
//			TxtHol_1.sendKeys(hmap.get("Hol_1"));
//			TxtSick_3.sendKeys(hmap.get("Sick_3"));
//			TxtVac_5.sendKeys(hmap.get("Vac_5"));
			Thread.sleep(1500);
			SubmitForApp.click();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			driver.navigate().refresh();
			Thread.sleep(1500);
			TSTab.click();
			Thread.sleep(1000);
			ImgBtnView.click();
			Thread.sleep(2000);
			driver.close();		
			driver.switchTo().window(firstTab);

			String thirdWebsiteURL = hmap.get("ClientPortalLogin");
			js.executeScript("window.open(arguments[0], '_blank')", thirdWebsiteURL);

			String thirdTab = "";
			windowHandles = driver.getWindowHandles();
			for (String handle : windowHandles) {
				if (!handle.equals(firstTab) && !handle.equals(secondTab)) {
					thirdTab = handle;
					break;
				}}
			driver.switchTo().window(thirdTab);
			
			UserName.sendKeys(hmap.get("ClientUserId"));
			Password.sendKeys(hmap.get("ClientPwd"));
			Thread.sleep(1000);
			Submit.click();
			Thread.sleep(2000);
			ClientEmpsearch.sendKeys(hmap.get("EmpName"));
			SearchImg.click();
			Thread.sleep(1000);
			ImbBtnView.click();
			Thread.sleep(1500);	

			String xpathExpression1 = "//a[@title='Approve']";
			driver.findElement(By.xpath(xpathExpression1)).click();
			Thread.sleep(1500);
			driver.switchTo().alert().accept();
			driver.close();
			driver.switchTo().window(firstTab);
			
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
			Searchimg.click();
			Thread.sleep(2000);
			ViewBtn.click();
			Thread.sleep(2000);
			lib.switchOutOfFrame();
			Thread.sleep(2000);
//			CloseBtn.click();
		}
		
	}
	
	public void US_DeleteTimesheet(Map<String,String> hmap) throws Exception {
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
		Searchimg.click();
		Thread.sleep(2000);
		ViewBtn.click();
		lib.switchOutOfFrame();
		Thread.sleep(1000);
		DeleteTS.click();
		Thread.sleep(1500);
		lib.select(DeleteTSReason, hmap.get("TSDelReason"));
		Thread.sleep(1000);
		DeleteBtn.click();
	}


	public void US_WebTSChange_CPX(Map<String,String> hmap) throws Exception {

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
		Searchimg.click();
		Thread.sleep(2000);
		ViewBtn.click();
		lib.switchOutOfFrame();
		Thread.sleep(1000);
		TSView.click();
		Thread.sleep(2000);
		TSChangeIcon.click();
		Thread.sleep(1500);
		
//		String TSAppOpt =hmap.get("TSMsgOpt");
//		String xpathExpression = "//div[2]/table[1]/tbody[1]/tr[2]/td[1]/div[1]//button[contains(text(),'" + TSAppOpt + "')]";
//		driver.findElement(By.xpath(xpathExpression)).click();
//		Thread.sleep(2000);

		FillHrs.click();
		Thread.sleep(1000);
		txtStartTime_1.clear();
		txtStartTime_1.sendKeys(hmap.get("StartTime_1"));
		txtStartTime_2.clear();
		txtStartTime_2.sendKeys(hmap.get("StartTime_2"));
		txtStartTime_3.clear();
		txtStartTime_3.sendKeys(hmap.get("StartTime_3"));
		txtStartTime_4.clear();
		txtStartTime_4.sendKeys(hmap.get("StartTime_4"));
		txtStartTime_5.clear();
		txtStartTime_5.sendKeys(hmap.get("StartTime_5"));
		Thread.sleep(1000);
		txtEndTime_1.clear();
		txtEndTime_1.sendKeys(hmap.get("Edit_EndTime_1"));
		txtEndTime_2.clear();
		txtEndTime_2.sendKeys(hmap.get("Edit_EndTime_2"));
		txtEndTime_3.clear();
		txtEndTime_3.sendKeys(hmap.get("Edit_EndTime_3"));
		txtEndTime_4.clear();
		txtEndTime_4.sendKeys(hmap.get("Edit_EndTime_4"));
		txtEndTime_5.clear();
		txtEndTime_5.sendKeys(hmap.get("Edit_EndTime_5"));
		Thread.sleep(1000);	
		TimesheetAttachment.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3500);
		lib.select(ChangeReasonID,hmap.get("ChangeReason"));
		SaveBtn.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();

		String secondWebsiteURL = hmap.get("EmpPortalLogin");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open(arguments[0], '_blank')", secondWebsiteURL);

		String firstTab = driver.getWindowHandle();
		Set<String> windowHandles = driver.getWindowHandles();
		String secondTab = "";
		for (String handle : windowHandles) {
			if (!handle.equals(firstTab)) {
				secondTab = handle;
				break;
			}}
		driver.switchTo().window(secondTab);
		UserName.sendKeys(hmap.get("Email"));
		Password.sendKeys(hmap.get("Pwd"));
		Thread.sleep(1000);
		Submit.click();
		Thread.sleep(2000);	
		TSTab.click();
		Thread.sleep(1000);
		ImgBtnView.click();
		Thread.sleep(2000);

	}
}