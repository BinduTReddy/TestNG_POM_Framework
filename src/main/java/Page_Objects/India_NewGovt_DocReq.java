package Page_Objects;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class India_NewGovt_DocReq {

	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;
	
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
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]/img")
	private WebElement Viewlogo;

	@FindBy(xpath="//table/tbody/tr[1]/td[1]/a")
	private WebElement ImgBtnTask;
	
	@FindBy(xpath="//*[@id='PrimeHRID_Display']")
	private WebElement PrimaryHR;
	
	@FindBy(xpath="//*[@id='PrimeAlternateHRID_Display']")
	private WebElement SecondaryHR;
	
	@FindBy(xpath="//*[@class='RibbonImgBtnWarper' and @id='ImgBtnOK']")
	private WebElement ApproveBtn;
	
	@FindBy(xpath="//*[contains(text(),'Admin')]")
	private WebElement AdminBtn;
	
	@FindBy(xpath="//button[contains(text(),'Close')]")
	private WebElement CloseBtn;

	@FindBy(xpath="//*[@class='shm_link002' and @id='583']")
	private WebElement History;

	@FindBy(xpath="//*[@class='shm_link003' and @id='599']")
	private WebElement EmailHistory;

	@FindBy(xpath="//*[@id='txtToMail']")
	private WebElement ToEmail;
	
	@FindBy(xpath="//*[@id='UserName']")
	private WebElement UserName;
	
	@FindBy(xpath="//*[@id='Password']")
	private WebElement Password;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement Login;	
	
	@FindBy(linkText="Documents")
	private WebElement DocumentsTab;
	
	@FindBy(xpath="//*[contains(text(),'Pending Documents')]")
	private WebElement PendingDocuments;

	@FindBy(xpath="//*[@class='t-button t-upload-button']")
	private WebElement choosefile;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//*[@id='DocumentRequestList']/table/tbody/tr[1]/td[5]/a")
	private WebElement GrauityForm;
	
	@FindBy(xpath="//*[@id='DocumentRequestList']/table/tbody/tr[2]/td[5]/a")
	private WebElement EPFO;

	public India_NewGovt_DocReq(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void NewGovtRequest_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("NewGovt_DocText"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("GovtDoc_Task"));
		SearchImg.click();
		Thread.sleep(2000);	
		ImgBtnTask.click();
		lib.switchOutOfFrame();	
		Thread.sleep(1000);
		PrimaryHR.sendKeys(hmap.get("Primary_HR"));
		SecondaryHR.sendKeys(hmap.get("Sec_HR"));
		Thread.sleep(500);
		ApproveBtn.click();
		Thread.sleep(1500);
	}
	
	public void ReqDocument_Process(Map<String,String> hmap) throws Exception {
		
		Thread.sleep(2000);
		lib = new Generic_Methods(driver);
		lib.waitForElementLoad(AdminBtn);
		AdminBtn.click();
		Thread.sleep(1000);
		History.click();
		EmailHistory.click();
		lib.handlingFrame("frmContent");
		ToEmail.click();
		ToEmail.sendKeys(hmap.get("Email"));
		Thread.sleep(1000);
		SearchImg.click();
		Thread.sleep(2000);
		Viewlogo.click();
		Thread.sleep(1500);
		lib.switchOutOfFrame();	
		
		driver.switchTo().parentFrame();
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//*[@id='cpxPopDiv1']//table/tbody/tr[4]/td[2]/div[4]/font/a")).click();
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);	
		String parentWindow= driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}}
		UserName.sendKeys(hmap.get("Email"));
		Thread.sleep(500);
		Password.sendKeys(hmap.get("NewPassword"));
		Login.click();
		Thread.sleep(2500);
		
		DocumentsTab.click();
		Thread.sleep(1000);
		PendingDocuments.click();
		Thread.sleep(2500);	
				
		try {    
			lib.waitForElementLoad(GrauityForm);
			GrauityForm.click();
			Thread.sleep(2000);
			choosefile.click();    
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(2500);
			SaveBtn.click();
			Thread.sleep(1500);
		}catch (NoSuchElementException e) {}
		
		try {    
			lib.waitForElementLoad(EPFO);
			EPFO.click();
			Thread.sleep(2000);
			choosefile.click();    
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(2500);
			SaveBtn.click();
			Thread.sleep(1500);
		}catch (NoSuchElementException e) {}
		
		driver.close();
	
		driver.switchTo().window(parentWindow);
		CloseBtn.click();	
	}
	
	public void UploadedGovtDoc_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("UplDoc_Name"));
		AssignedBy.sendKeys(hmap.get("UplDoc_AssignBy"));
		SearchImg.click();
		Thread.sleep(2000);	
		ImgBtnTask.click();
		lib.switchOutOfFrame();	
		ApproveBtn.click();
		Thread.sleep(1500);
		
		lib.handlingFrame("frmContent");
		AssignedBy.clear();
		AssignedBy.sendKeys(hmap.get("UplDoc_AssignBy"));
		SearchImg.click();
		Thread.sleep(2000);	
		ImgBtnTask.click();
		lib.switchOutOfFrame();	
		ApproveBtn.click();
		Thread.sleep(1500);
	}
}
