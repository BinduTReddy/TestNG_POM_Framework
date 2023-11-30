package Page_Objects;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Reusable_Methods.Generic_Methods;

public class DocNotMatched_AppScreen {

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

	@FindBy(xpath="//table/tbody/tr[1]/td[1]/a")
	private WebElement ImgBtnTask;

	@FindBy(xpath="//*[@class='RibbonImgBtnWarper' and @id='ImgBtnOK']")
	private WebElement ApproveBtn;

	@FindBy(xpath="//*[@id='ImgBtnOK']")
	private WebElement Complete;

	public DocNotMatched_AppScreen(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void DocumentNotMatched(Map<String,String> hmap) throws Exception {

		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys("Document Not Matched");
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();	
		Thread.sleep(1500);
		
		
	            driver.findElement(By.id("NewObject_EmployeeDocument_ValidationNotes")).sendKeys("Test");
	            ApproveBtn.click();
	    		Thread.sleep(2000);
            
	        }		
	}
	

