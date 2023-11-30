package Page_Objects;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class EmpMod_RelievingLetter {
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;
		
	@FindBy(xpath="//a[contains(text(),'Issue Relieving Letter')]")
	private WebElement RelievingLetter;
	
	@FindBy(xpath="//input[@id='txtEmployeeNameSearch']")
	private WebElement EmpNameSearch;
	
	@FindBy(xpath="/html/body/ul/li/a")
	private WebElement EmpNamePopup;
	
	@FindBy(xpath="//input[@id='ResignationDate']")
	private WebElement ResignationDate;
	
	@FindBy(xpath="//input[@id='IssueDate']")
	private WebElement IssueDate;
	
	@FindBy(xpath="//button[@onclick='return CPXWindow_Save(this);']")
	private WebElement SaveButton;
	
	@FindBy(xpath="//*[@id='txtInitiatedMgmtSearch']")
	private WebElement Searchbyword;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchImg;
	
	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]/img")
	private WebElement Viewlogo;

	@FindBy(xpath="//table/tbody/tr[1]/td[1]/a")
	private WebElement ImgBtnTask;
	
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
	
	@FindBy(xpath="//*[@id='DocumentRequestList']/table/tbody/tr/td[contains(text(),'Relieving Letter')]//following-sibling::td[4]/a")
	private WebElement RelievingLetSign;
	
	@FindBy(xpath="//input[@id='btnContinue']")
	private WebElement IAgreeBtn;
	
	public EmpMod_RelievingLetter(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void RelievingLetter_EmpModule(Map<String,String> hmap) throws Exception{
		
		lib = new Generic_Methods(driver);
		RelievingLetter.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		EmpNameSearch.click();
		EmpNameSearch.sendKeys(hmap.get("EmpName"));
		Thread.sleep(500);
		EmpNamePopup.click();
		SearchImg.click();
		Thread.sleep(1000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		ResignationDate.click();
		Thread.sleep(300);
		ResignationDate.sendKeys(hmap.get("ResignDate"));
		Thread.sleep(500);
		IssueDate.click();
		IssueDate.sendKeys(hmap.get("IssueDate"));		
		Thread.sleep(1000);
		SaveButton.click();
		Thread.sleep(1500);
	}
	
	public void RelievingLetter_Process(Map<String,String> hmap) throws Exception {
		
		lib = new Generic_Methods(driver);
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
		lib.switchOutOfFrame();	
				
		String secondWebsiteURL = "https://uatep.acretix.net/lancesoft-india/account/login";
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
		Thread.sleep(500);
		Password.sendKeys(hmap.get("NewPassword"));
		Login.click();
		Thread.sleep(2500);
		
		PendingDocuments.click();
		Thread.sleep(1000);
		RelievingLetSign.click();
		Thread.sleep(3000);
		IAgreeBtn.click();
		Thread.sleep(2000);
		driver.close();
		driver.switchTo().window(firstTab);
		
		
		
	}
	
	
	
}
