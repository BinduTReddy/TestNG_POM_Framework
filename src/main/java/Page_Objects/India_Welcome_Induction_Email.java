package Page_Objects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Reusable_Methods.Generic_Methods;

public class India_Welcome_Induction_Email {

	WebDriver driver;
	Generic_Methods lib;
	
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
	
	@FindBy(xpath="//*[@id='PrimeHRID_Display']")
	private WebElement PrimaryHR;
	
	@FindBy(xpath="//*[@id='PrimeAlternateHRID_Display']")
	private WebElement SecondaryHR;
	
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


	public India_Welcome_Induction_Email(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void WelcomeEmail_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("WelcomeSrchText"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("WelcomeEmail_TaskTo"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();	
		Thread.sleep(1000);
		PrimaryHR.sendKeys(hmap.get("Primary_HR"));
		SecondaryHR.sendKeys(hmap.get("Sec_HR"));
		ApproveBtn.click();
		Thread.sleep(1500);
	}
	
	public void WelcomeEmail_Process(Map<String,String> hmap) throws Exception {
		
		Thread.sleep(3000);
		lib = new Generic_Methods(driver);
		AdminBtn.click();
		Thread.sleep(1000);
		History.click();
		EmailHistory.click();
		lib.handlingFrame("frmContent");
		Thread.sleep(1000);
		ToEmail.click();
		ToEmail.sendKeys(hmap.get("Email"));
		SearchImg.click();
		Thread.sleep(3000);
		Viewlogo.click();
		Thread.sleep(3000);
		lib.switchOutOfFrame();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", CloseBtn);
		CloseBtn.click();
	}
	
}
