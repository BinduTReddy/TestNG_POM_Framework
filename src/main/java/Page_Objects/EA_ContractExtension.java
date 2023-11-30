package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class EA_ContractExtension {
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath="//*[@id='26'][@class='shm_link001']")
	private WebElement Employee;

	@FindBy(xpath="//*[@class='shm_link002' and @id='29']")
	private WebElement EmpModule;

	@FindBy(xpath="//*[@id='txtEmployeeSearch']")
	private WebElement EmpSearch;

	@FindBy(xpath="//*[@id='txtClientSearch']")
	private WebElement ClientName;

	@FindBy(xpath="//tbody/tr[2]/td[13]/table/tbody/tr/td[1]/a")
	private WebElement Searchimg;

	@FindBy(xpath="//*[@class='ImgbtnView img']")
	private WebElement viewicon;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']//li[2]/a[contains(text(),'Placement')]")
	private WebElement PlacementTab;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']//li[4]/a[contains(text(),'Extensions')]")
	private WebElement ExtensionsTab;

	@FindBy(xpath="//*[@id='tblRightSideMenu']/tbody/tr[7]/td/a")
	private WebElement payrateedit;
	
	@FindBy(xpath="//*[@id='Project']/table/tbody/tr/td[1]/a")
	private WebElement Payrateeditview;

	@FindBy(xpath="//*[@name='RateChangeOption'][@value='3']")
	private WebElement Both;

	@FindBy(xpath="//*[@name='RateChangeOption'][@value='2']")
	private WebElement PayRateEdit;
	
	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[4]/input")
	private WebElement PayRate;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']//table[3]//table/tbody/tr[3]/td[2]/div/div/div")
	private WebElement OfferLetterFileupload;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']//table[3]//table/tbody/tr[3]/td[4]/div/div/div")
	private WebElement Orientationfileupload;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']/table[3]//table/tbody/tr[6]/td[2]/div/div/div")
	private WebElement ProofAddressfileupload;

	@FindBy(xpath="//*[@id='btnSaveForm']")
	private WebElement savebtn;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement Save;
	
	@FindBy(xpath="//*[@id='btnValidate']")
	private WebElement ValidateBtn;
	
	@FindBy(xpath="//*[@id='EngagementContract_NoofShifts']")
	private WebElement NOshifts;
	
	@FindBy(xpath="//*[@id='EngagementContract_ShiftScheduleID']")
	private WebElement Shift;
	
	@FindBy(xpath="//*[@id='EngagementContract_SchduleNotes']")
	private WebElement InternalNotes;
	
	@FindBy(xpath="//*[@id='EngagementContract_WeekendShift']")
	private WebElement EA_weekendshift;
	
	@FindBy(xpath="//*[@id='EngagementContract_CancellableShifts']")
	private WebElement EA_cancellableshift;
	
	@FindBy(xpath="//*[@id='EngagementContract_ApprovedTimeOff']")
	private WebElement EA_Timeoff;
	
	@FindBy(xpath="//*[@id='EngagementContract_DoubleTime']")
	private WebElement EA_DoubleTime;
	
	@FindBy(xpath="//*[@id='EngagementContract_PreferredCalltime']")
	private WebElement EA_CallTime;
	
	@FindBy(xpath="//*[@id='EngagementContract_WorkSchedule']")
	private WebElement EA_WorkSche;
	
	@FindBy(xpath="//*[@id='EngagementContract_OtherNotes']")
	private WebElement EA_OtherNotes;
	
	@FindBy(xpath="//*[@id='UserName']")
	private WebElement UserName;
	
	@FindBy(xpath="//*[@id='Password']")
	private WebElement Pwd;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement LoginBtn;
	
	@FindBy(xpath="//*[contains(text(),'Temporary Contract')]")
	private WebElement TempCont;
	
	@FindBy(xpath="//*[contains(text(),' Sign ')]")
	private WebElement Sign;
	
	@FindBy(xpath="//*[@id='IAgree'][@value='True']")
	private WebElement IAgreeRadioBtn;
	
	@FindBy(xpath="//*[@id='EATerms']/tbody/tr[5]/td/input[2]")
	private WebElement IAccept;
	
	@FindBy(xpath="//*[@id='IAgree'][@value='False']")
	private WebElement EADecline;
	
	@FindBy(xpath="//*[@id='EngagementContract_DeclineReasonID']")
	private WebElement Dec_ReasonID;
	
	@FindBy(xpath="//*[@id='EAShow']//tr[27]//input")
	private WebElement EASubmit;
	
	@FindBy(xpath="//*[@id='grdEngagementContract']//td[1]//span")
	private WebElement ViewEACont;
	
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
	
	@FindBy(xpath="//*[@id='chkConfirm']")
	private WebElement Checkbox;

	@FindBy(xpath="//*[@class='RibbonImgBtnWarper' and @id='ImgBtnOK']")
	private WebElement ApproveBtn;

	
	public EA_ContractExtension(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void EA_ContExtension(Map<String,String> hmap) throws InterruptedException, IOException{
		Thread.sleep(1000);
		Employee.click();
		Thread.sleep(2000);
		EmpModule.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		EmpSearch.sendKeys(hmap.get("EmpName"));
		ClientName.sendKeys(hmap.get("Clientname"));
		Searchimg.click();
		Thread.sleep(3000);
		viewicon.click();
		Thread.sleep(1000);
		PlacementTab.click();
		Thread.sleep(1000);
		ExtensionsTab.click();
		payrateedit.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		Payrateeditview.click();
		Thread.sleep(1000);
		PayRateEdit.click();
		PayRate.clear();
		PayRate.sendKeys(hmap.get("RegRate"));
		Thread.sleep(1000);
		OfferLetterFileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		Orientationfileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(3000);
		ProofAddressfileupload.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		String optionText = hmap.get("EA_ContOpt");
		String EA_Option = "//*[@id='IsEAContract'][@value='" + optionText + "']";
		driver.findElement(By.xpath(EA_Option)).click();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);	
		ValidateBtn.click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys("Test");
		} catch (TimeoutException e) {}
		savebtn.click();
		Thread.sleep(1000);
		lib.select(NOshifts, hmap.get("No_shifts"));
		Thread.sleep(500);
		lib.select(Shift, hmap.get("Shift_opt"));
		InternalNotes.sendKeys(hmap.get("Int_Notes"));
		Thread.sleep(500);
		EA_weekendshift.sendKeys(hmap.get("EA_weekendshift"));
		EA_cancellableshift.sendKeys(hmap.get("EA_cnlbeshift"));
		EA_Timeoff.sendKeys(hmap.get("EA_Timeoff"));
		EA_DoubleTime.sendKeys(hmap.get("EA_DT"));
		EA_CallTime.sendKeys(hmap.get("EA_CallTime"));
		EA_WorkSche.sendKeys(hmap.get("EA_WorkSche"));
		EA_OtherNotes.sendKeys(hmap.get("EA_OtherNotes"));
		Save.click();
		Thread.sleep(1000);
		
		String secondWebsiteURL = "https://uatep.acretix.net/lancesoft/Account/Login";
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open(arguments[0], '_blank')", secondWebsiteURL);

		Set<String> windowHandles = driver.getWindowHandles();
		String firstTab = driver.getWindowHandle();
		String secondTab = "";
		for (String handle : windowHandles) {
			if (!handle.equals(firstTab)) {
				secondTab = handle;
				break;
			}}
		driver.switchTo().window(secondTab);
		UserName.sendKeys(hmap.get("Email"));
		Pwd.sendKeys(hmap.get("ConfirmPassword"));
		LoginBtn.click();
		Thread.sleep(1000);
		
		TempCont.click();
		Thread.sleep(1000);
		Sign.click();
		Thread.sleep(2500);
		String option = hmap.get("EA_AcceptOpt");
		String EA_Accept = "//*[@id='IAgree'][@value='" + option + "']";
		driver.findElement(By.xpath(EA_Accept)).click();
		Thread.sleep(1000);	
		if(EADecline.isSelected()) {
			lib.select(Dec_ReasonID, hmap.get("EA_DecOpt"));
			EASubmit.click();
			Thread.sleep(1000);
		}else {						
			IAccept.click();
			Thread.sleep(3000);		
		}
		
		driver.close();
		driver.switchTo().window(firstTab);
		lib.handlingFrame("frmContent");
		Thread.sleep(1000);
		ExtensionsTab.click();
		Thread.sleep(500);
		ViewEACont.click();
		lib.switchOutOfFrame();
		
	}
	
	public void Finance_Approval(Map<String,String> hmap) throws Exception {
		driver.navigate().refresh();
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("EmpName"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(3000);
		ApproveBtn.click();
		Thread.sleep(2000);

		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("EmpName"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("Task1"));
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Checkbox.click();
		Thread.sleep(1000);
		ApproveBtn.click();
		Thread.sleep(2000);

	}
}
