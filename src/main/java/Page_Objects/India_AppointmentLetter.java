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

public class India_AppointmentLetter {

	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;
	
	
	@FindBy(xpath="//*[@class='shm_link001' and @id='380']")
	private WebElement OnBoarding;

	@FindBy(xpath="//*[@class='shm_link002 shm_highLight_2Tier' and @id='381']")
	private WebElement Dashboard;

	@FindBy(xpath="//*[@id='txtCandidateName']")
	private WebElement CandName;

	@FindBy(xpath="//html/body/ul[1]/li/a")
	private WebElement CandPopup;

	@FindBy(xpath="//*[@id='txtClientName']")
	private WebElement ClientName;

	@FindBy(xpath="//html/body/ul[2]/li/a")
	private WebElement ClientPopup;

	@FindBy(xpath="//*[@class=' ImgbtnView  img']")
	private WebElement viewlogo;
	
	@FindBy(xpath="//*[@value='+ Appointment Letter']")
	private WebElement AppointmentLetter;
	
	@FindBy(xpath="//*[contains(text(),'Cancel')]")
	private WebElement CancelBtn;
	
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
	
	@FindBy(xpath="//*[contains(text(),'Pending Documents')]")
	private WebElement PendingDocuments;

	@FindBy(xpath="//*[@id='DocumentRequestList']/table/tbody/tr/td[contains(text(),'Appointment Letter')]//following-sibling::td[4]/a")
	private WebElement AppontmentLetterSign;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//*[@id='btnContinue']")
	private WebElement AgreeBtn;

	public India_AppointmentLetter(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}


	public void AppointmentLetter_Process(Map<String,String> hmap) throws Exception {
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		lib = new Generic_Methods(driver);
		OnBoarding.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		Thread.sleep(2000);
		CandName.sendKeys(hmap.get("EmpName"));
		Thread.sleep(1000);
		ClientName.sendKeys(hmap.get("Clientname"));
		ClientName.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		viewlogo.click();
		lib.switchOutOfFrame();
		Thread.sleep(1000);		
		js.executeScript("arguments[0].scrollIntoView();", AppointmentLetter);
		AppointmentLetter.click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Dashboard.click();
		Thread.sleep(1500);
		js.executeScript("arguments[0].scrollIntoView();", CancelBtn);
		CancelBtn.click();
		
		Thread.sleep(1000);
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
		driver.findElement(By.linkText("CLICK HERE")).click();
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
		
		PendingDocuments.click();
		Thread.sleep(2500);	
		
		AppontmentLetterSign.click();
		Thread.sleep(2000);	
		AgreeBtn.click();
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(parentWindow);
		CloseBtn.click();	
	}
	
	
}
