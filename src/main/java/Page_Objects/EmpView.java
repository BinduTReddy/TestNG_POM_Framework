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

public class EmpView {

	WebDriver driver;
	Generic_Methods lib;

	@FindBy(xpath="//*[@class='shm_link001' and @id='26']")
	private WebElement EmpModule;

	@FindBy(xpath="//*[@class='shm_link002' and @id='29']")
	private WebElement EmpSubModule;

	@FindBy(xpath="//*[@id='txtEmployeeSearch']")
	private WebElement EmpNametxtBox;

	@FindBy(xpath="//body[1]/ul[2]/li[1]/a[1]")
	private WebElement EmpNamepopup;
	
	@FindBy(xpath="//*[@id='txtEmailSearch']")
	private WebElement EmailTxt;

	@FindBy(xpath="//*[@id='grdEmployeeList']/div[2]/table/tbody/tr[1]/td[1]/a")
	private WebElement Plusicon;

	@FindBy(xpath="//*[@class='ImgbtnView img']")
	private WebElement Viewicon;
	
	@FindBy(xpath="//*[@id='MailingAddressVerify']/a")
	private WebElement Mailaddress;
	
	@FindBy(xpath="//*[@id='PhysicalAddressVerify']/a")
	private WebElement Physicaladdress;
	
	@FindBy(xpath="//div[@id='ProjectDetail']//table/tbody/tr//span/a")
	private WebElement Placementverify;
	
	@FindBy(xpath="//*[@id='tabStripActiveProjects']/ul/li[1]/a")
	private WebElement ActiveProj;
	
	@FindBy(xpath="//*[@id='tabStripActiveProjects']/ul/li[2]/a")
	private WebElement ActiveProj1;
	
	@FindBy(xpath="//div[@id='tabProject']//a[contains(text(),'Verify')]")
	private WebElement ProjVerify;
	
	public EmpView(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void External_Employee(Map<String,String> hmap) throws Exception {
		EmpModule.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		EmpNametxtBox.sendKeys(hmap.get("EmpID"));
		EmpNametxtBox.sendKeys(Keys.ENTER);
		Thread.sleep(1500);
		Viewicon.click();
		Thread.sleep(1000);	

//		try {
//			lib.waitForElementLoad(Mailaddress);
//			Mailaddress.click();
//			Thread.sleep(1000);
//			driver.switchTo().alert().accept();
//		}catch(TimeoutException e) {}		
//		try {
//			lib.waitForElementLoad(Physicaladdress);
//			Physicaladdress.click();
//			Thread.sleep(1000);
//			driver.switchTo().alert().accept();
//		}catch(TimeoutException e) {}		
//		driver.findElement(By.xpath("//*[@id='tabStripEmployee']/ul/li[1]/a")).click();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='tabStripEmployee']/ul/li[2]/a")).click();
		Thread.sleep(1500);
//		
//		try {
//			lib.waitForElementLoad(ActiveProj);
//			if(ActiveProj.isDisplayed())
//			{
//				ActiveProj.click();
//				Thread.sleep(1000);
//				try {
//					lib.waitForElementLoad(ProjVerify);
//					ProjVerify.click();
//					Thread.sleep(2000);
//					driver.switchTo().alert().accept();
//				}catch(TimeoutException e) {}
//			}
//		}catch(TimeoutException e) {}
//
//		try {
//			lib.waitForElementLoad(ActiveProj1);
//			if(ActiveProj1.isDisplayed()) {
//				ActiveProj1.click();
//				Thread.sleep(1000);
//				try {
//					lib.waitForElementLoad(ProjVerify);
//					ProjVerify.click();
//					Thread.sleep(2000);
//					driver.switchTo().alert().accept();
//				}catch(TimeoutException e) {}		
//			}
//		}catch(TimeoutException e) {}
//
//
		try {
			lib.waitForElementLoad(ProjVerify);
			ProjVerify.click();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
		}catch(TimeoutException e) {}

//		driver.findElement(By.xpath("//*[@id='tabStripEmployee']/ul/li[2]/a")).click();
//		Thread.sleep(1000);
		lib.switchOutOfFrame();
		
	}
	
	
	
}
