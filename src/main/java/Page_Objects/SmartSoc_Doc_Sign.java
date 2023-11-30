package Page_Objects;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class SmartSoc_Doc_Sign {
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath="//*[contains(text(),'Admin')]")
	private WebElement AdminBtn;

	@FindBy(xpath="//*[@class='shm_link002' and @id='583']")
	private WebElement History;

	@FindBy(xpath="//*[@class='shm_link003' and @id='599']")
	private WebElement EmailHistory;

	@FindBy(xpath="//*[@id='txtToMail']")
	private WebElement ToEmail;

	@FindBy(xpath="//*[@id='ddlCategory']")
	private WebElement Category;

	@FindBy(xpath="//*[@class='ImgbtnSearch img']")
	private WebElement SearchImg;

	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]/img")
	private WebElement Viewlogo;

	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]/img")
	private WebElement ImgBtnTask;

	@FindBy(xpath="//*[@id='cpxPopDiv1']/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td[2]/div[2]")
	private WebElement SignDocs;
	
	@FindBy(xpath="//*[@id='UserName']")
	private WebElement userName;
	
	@FindBy(xpath="//*[@id='Password']")
	private WebElement Pwd;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement Login;
	
	@FindBy(xpath="//table/tbody/tr[2]/td[2]/button")
	private WebElement Esign1;
	
	@FindBy(xpath="//table/tbody/tr[3]/td[2]/button")
	private WebElement Esign2;
	
	@FindBy(xpath="//table/tbody/tr[4]/td[2]/button")
	private WebElement Esign3;
	
	@FindBy(xpath="//button[@onclick='CPXWindow_Close(this);']")
	private WebElement close;
	
	public SmartSoc_Doc_Sign(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}
	
	public void Doc_ToSign(Map<String,String> hmap) throws Exception 
	{
		driver.navigate().refresh();
		Thread.sleep(3000);
		lib = new Generic_Methods(driver);
		AdminBtn.click();
		Thread.sleep(2000);
		History.click();
		EmailHistory.click();
		lib.handlingFrame("frmContent");
		Thread.sleep(2000);
		ToEmail.click();
		ToEmail.sendKeys(hmap.get("Email"));
		Thread.sleep(1000);
		lib.select(Category,hmap.get("category1"));
		SearchImg.click();
		Thread.sleep(1000);
		Viewlogo.click();
		lib.switchOutOfFrame();
						
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).build().perform();
		driver.findElement(By.xpath("//*[@id='cpxPopDiv1']/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td[2]/div[4]/font/a")).click();
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);

		String parentWindow= driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		userName.sendKeys(hmap.get("EMail"));
		Thread.sleep(1000);
		Pwd.sendKeys(hmap.get("ConfirmPassword"));
		Thread.sleep(1000);
		Login.click();
		Thread.sleep(2000);
		
		List<WebElement> ClickTosign = driver.findElements(By.xpath("//tbody/tr"));
		for (int i = 2; i < ClickTosign.size(); i++) {
			ClickTosign = driver.findElements(By.xpath("//td[2]")); 
			WebElement row = ClickTosign.get(i);
			try {
				WebElement uploadButton = row.findElement(By.xpath(".//button[1]"));
				if (uploadButton.isDisplayed()) {
					uploadButton.click();
					Thread.sleep(1500); }	   
			}catch (NoSuchElementException e) {}
		}

		driver.close();
		Thread.sleep(1500);
		close.click();
		Thread.sleep(1000);
	}
	
}
