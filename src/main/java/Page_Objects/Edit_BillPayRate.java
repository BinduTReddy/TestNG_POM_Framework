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

public class Edit_BillPayRate {
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
	
	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[3]/select")
	private WebElement BillCurrType;
	
	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[4]/input")
	private WebElement Reg_BillRate;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[3]/input")
	private WebElement BillRate;
	
	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[4]/input")
	private WebElement BillHoliday;
	
	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[5]/input")
	private WebElement BillTATO;
	
	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[6]/input")
	private WebElement BillTravelTime;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[7]/input")
	private WebElement BillOrientation;
	
	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[4]/input")
	private WebElement BillOnCall;
	
	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[5]/input")
	private WebElement BillCallback;
	
	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[6]/input")
	private WebElement BillCharge;

	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[7]/input")
	private WebElement Clinical_BillHoliday;
	
	@FindBy(xpath="//table[@id='tblChangedBillRate']//tr[last()]/td[8]/input")
	private WebElement Clinical_BillOrientation;
		
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']//table[2]//table/tbody/tr[3]/td[2]/div/div/div")
	private WebElement POFileupload;
		
	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[2]/select")
	private WebElement PaymentType;
	
	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[4]/select")
	private WebElement PayCurrType;
	
	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[5]/input")
	private WebElement Reg_PayRate;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[4]/input")
	private WebElement PayRate;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[5]/input")
	private WebElement PayHoliday;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[6]/input")
	private WebElement PayTATO;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[7]/input")
	private WebElement PayTravelTime;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[8]/input")
	private WebElement PayOrientation;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[5]/input")
	private WebElement PayOncall;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[6]/input")
	private WebElement PayCallback;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[7]/input")
	private WebElement PayCharge;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[8]/input")
	private WebElement Clinical_PayHoliday;
	
	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[9]/input")
	private WebElement Clinical_PayOrientation;
	
	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[12]/select")
	private WebElement Clinical_PerDiemType;
	
	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[13]/input")
	private WebElement Clinical_PerDiem;
	
	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[11]/select")
	private WebElement PerDiemType;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[12]/input")
	private WebElement PerDiem;
	
	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[8]/select")
	private WebElement Can_PerDiemType;

	@FindBy(xpath="//table[@id='tblChangedPayRate']//tr[last()]/td[9]/input")
	private WebElement Can_PerDiem;

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
	
	public Edit_BillPayRate(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void NonClinical_BillPayEdit(Map<String,String> hmap) throws InterruptedException, IOException{
		lib = new Generic_Methods(driver);
		Thread.sleep(1000);
		PlacementTab.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(2000);
		payrateedit.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		Payrateeditview.click();
		Thread.sleep(1000);
		Both.click();
		Thread.sleep(3000);
		BillRate.clear();
		BillRate.sendKeys(hmap.get("Edit_BillRate"));
		BillHoliday.clear();
		BillHoliday.sendKeys(hmap.get("Holbillrate"));
		BillTATO.sendKeys(hmap.get("TatoBR"));
		BillTravelTime.clear();
		BillTravelTime.click();
		BillTravelTime.sendKeys(hmap.get("TravelBR"));
		BillOrientation.clear();
		BillOrientation.click();
		BillOrientation.sendKeys(hmap.get("OrientBR"));
		Thread.sleep(500);
		POFileupload.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", PaymentType);
		
		lib.select(PaymentType,hmap.get("PRType"));	
		PayRate.clear();
		PayRate.sendKeys(hmap.get("Edit_PayRate"));
		PayHoliday.clear();
		PayHoliday.sendKeys(hmap.get("Holidaypr"));
		lib.waitForElementLoad(PayTATO);
		PayTATO.clear();
		PayTATO.sendKeys(hmap.get("TatoPR"));
		PayTravelTime.clear();
		PayTravelTime.click();
		PayTravelTime.sendKeys(hmap.get("TravelPR"));
		PayOrientation.clear();
		PayOrientation.click();
		PayOrientation.sendKeys(hmap.get("OrientPR"));
		Thread.sleep(1000);
		lib.select(PerDiemType,hmap.get("PerdiemType"));
		PerDiem.sendKeys(hmap.get("Perdiem"));
		Thread.sleep(500);
		OfferLetterFileupload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		Orientationfileupload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		ProofAddressfileupload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);	
		ValidateBtn.click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys("Test");
		} catch (TimeoutException e) {}
		savebtn.click();
		Thread.sleep(2000);
	}
	
	public void Clinical_BillPayEdit(Map<String,String> hmap) throws InterruptedException, IOException{
		lib = new Generic_Methods(driver);
		Thread.sleep(1000);
		PlacementTab.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(2000);
		payrateedit.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		Payrateeditview.click();
		Thread.sleep(1000);
		Both.click();
		Thread.sleep(3000);
		BillRate.clear();
		BillRate.sendKeys(hmap.get("Edit_BillRate"));
		BillOnCall.clear();
		BillOnCall.sendKeys(hmap.get("Oncallrate"));
		BillCallback.clear();
		BillCallback.click();
		BillCallback.sendKeys(hmap.get("callbackrate"));
		BillCharge.clear();
		BillCharge.click();
		BillCharge.sendKeys(hmap.get("chargerate"));
		Clinical_BillHoliday.clear();
		Clinical_BillHoliday.click();
		Clinical_BillHoliday.sendKeys(hmap.get("Holbillrate"));
		Clinical_BillOrientation.clear();
		Clinical_BillOrientation.click();
		Clinical_BillOrientation.sendKeys(hmap.get("OrientBR"));
		Thread.sleep(500);
		POFileupload.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		
		js.executeScript("arguments[0].scrollIntoView();", PaymentType);
		lib.select(PaymentType,hmap.get("PRType"));	
		PayRate.clear();
		PayRate.sendKeys(hmap.get("Edit_PayRate"));
		PayOncall.clear();
		PayOncall.click();
		PayOncall.sendKeys(hmap.get("OncallPr"));
		PayCallback.clear();
		PayCallback.click();
		PayCallback.sendKeys(hmap.get("callbackpr"));
		PayCharge.clear();
		PayCharge.click();
		PayCharge.sendKeys(hmap.get("Chargepr"));
		Clinical_PayHoliday.clear();
		Clinical_PayHoliday.click();
		Clinical_PayHoliday.sendKeys(hmap.get("Holidaypr"));
		Clinical_PayOrientation.clear();
		Clinical_PayOrientation.click();
		Clinical_PayOrientation.sendKeys(hmap.get("OrientPR"));
		Thread.sleep(1000);
		lib.select(Clinical_PerDiemType,hmap.get("PerdiemType"));
		Clinical_PerDiem.sendKeys(hmap.get("Perdiem"));
		Thread.sleep(500);
		OfferLetterFileupload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		Orientationfileupload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		ProofAddressfileupload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);	
		ValidateBtn.click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys("Test");
		} catch (TimeoutException e) {}
		savebtn.click();
		Thread.sleep(2000);
	}
		
	public void India_BillPayRate_Edit(Map<String,String> hmap) throws InterruptedException, IOException{
		lib = new Generic_Methods(driver);
		Thread.sleep(1000);
		PlacementTab.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(2000);
		payrateedit.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		Payrateeditview.click();
		Thread.sleep(1000);
		Both.click();
		Thread.sleep(3000);
		BillRate.clear();
		BillRate.sendKeys(hmap.get("Edit_BillRate"));
		POFileupload.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", PaymentType);
		
		lib.select(PaymentType,hmap.get("PRType"));	
		PayRate.clear();
		PayRate.sendKeys(hmap.get("Edit_PayRate"));
		Thread.sleep(1000);
		OfferLetterFileupload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		ProofAddressfileupload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);	
		ValidateBtn.click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys("Test");
		} catch (TimeoutException e) {}
		savebtn.click();
		Thread.sleep(2000);
	}
	
	
	public void UK_BillPayRate(Map<String,String> hmap) throws InterruptedException, IOException{
		lib = new Generic_Methods(driver);
		Thread.sleep(1000);
		PlacementTab.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(2000);
		payrateedit.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		Payrateeditview.click();
		Thread.sleep(1000);
		Both.click();
		Thread.sleep(3000);
		lib.select(BillCurrType, hmap.get("BillCurr"));
		Reg_BillRate.clear();
		Reg_BillRate.sendKeys(hmap.get("Edit_BillRate"));
		POFileupload.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", PaymentType);
		
		lib.select(PaymentType,hmap.get("PayRateType"));
		Thread.sleep(500);
		lib.select(PayCurrType, hmap.get("PayCurr"));
		Reg_PayRate.clear();
		Reg_PayRate.sendKeys(hmap.get("Edit_PayRate"));
		Thread.sleep(1000);
		OfferLetterFileupload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		ProofAddressfileupload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);	
		ValidateBtn.click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys("Test");
		} catch (TimeoutException e) {}
		savebtn.click();
		Thread.sleep(2000);
	}
	
	public void Canada_BillPayRateChange(Map<String,String> hmap) throws InterruptedException, IOException{
		lib = new Generic_Methods(driver);
		Thread.sleep(1000);
		PlacementTab.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 200);");
		Thread.sleep(2000);
		payrateedit.click();
		lib.switchOutOfFrame();
		Thread.sleep(2000);
		Payrateeditview.click();
		Thread.sleep(1000);
		Both.click();
		Thread.sleep(3000);
		BillRate.clear();
		BillRate.sendKeys(hmap.get("Edit_BillRate"));
		BillHoliday.clear();
		BillHoliday.sendKeys(hmap.get("Holbillrate"));	
		Thread.sleep(500);
		POFileupload.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();", PaymentType);
		
		lib.select(PaymentType,hmap.get("PRType"));	
		PayRate.clear();
		PayRate.sendKeys(hmap.get("Edit_PayRate"));
		PayHoliday.clear();
		PayHoliday.sendKeys(hmap.get("Holidaypr"));
		Thread.sleep(500);
		lib.select(Can_PerDiemType,hmap.get("PerdiemType"));
		Can_PerDiem.sendKeys(hmap.get("Perdiem"));
		Thread.sleep(500);
		OfferLetterFileupload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);
		ProofAddressfileupload.click();
		Thread.sleep(1500);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(3000);	
		ValidateBtn.click();
		try {
			WebDriverWait wait = new WebDriverWait(driver, 10);
			WebElement exceptionNotes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ExceptionNotes")));
			exceptionNotes.sendKeys("Test");
		} catch (TimeoutException e) {}
		savebtn.click();
		Thread.sleep(2000);
	}
	
	public void Finance_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(4000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("EmpName"));
		driver.findElement(By.xpath("/html/body/ul[1]/li/a")).click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(3000);
		ApproveBtn.click();
		Thread.sleep(4000);

		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("EmpName"));
		driver.findElement(By.xpath("/html/body/ul[1]/li/a")).click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("Task1"));
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Checkbox.click();
		Thread.sleep(1000);
		ApproveBtn.click();
		Thread.sleep(2000);

		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("Task2"));
		SearchImg.click();
		Thread.sleep(1000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Checkbox.click();
		Thread.sleep(2000);
		ApproveBtn.click();
		Thread.sleep(2000);
		
	}

	public void UK_Finance_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(4000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("EmpName"));
		driver.findElement(By.xpath("/html/body/ul[1]/li/a")).click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(3000);
		ApproveBtn.click();
		Thread.sleep(4000);

		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("EmpName"));
		driver.findElement(By.xpath("/html/body/ul[1]/li/a")).click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("Task1"));
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Checkbox.click();
		Thread.sleep(1000);
		ApproveBtn.click();
		Thread.sleep(2000);

		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("Task2"));
		SearchImg.click();
		Thread.sleep(1000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Checkbox.click();
		Thread.sleep(2000);
		ApproveBtn.click();
		Thread.sleep(2000);
		
		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("Task2"));
		SearchImg.click();
		Thread.sleep(1000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Checkbox.click();
		Thread.sleep(2000);
		ApproveBtn.click();
		Thread.sleep(2000);
		
	}
	
	public void India_Finance_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(4000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("EmpName"));
		driver.findElement(By.xpath("/html/body/ul[1]/li/a")).click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Thread.sleep(3000);
		ApproveBtn.click();
		Thread.sleep(4000);

		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("EmpName"));
		driver.findElement(By.xpath("/html/body/ul[1]/li/a")).click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("Task1"));
		SearchImg.click();
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Checkbox.click();
		Thread.sleep(1000);
		ApproveBtn.click();
		Thread.sleep(2000);

		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("Task2"));
		SearchImg.click();
		Thread.sleep(1000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Checkbox.click();
		Thread.sleep(2000);
		ApproveBtn.click();
		Thread.sleep(2000);
		
		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("Task3"));
		SearchImg.click();
		Thread.sleep(1000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();
		Checkbox.click();
		Thread.sleep(2000);
		ApproveBtn.click();
		Thread.sleep(2000);

	}
}
