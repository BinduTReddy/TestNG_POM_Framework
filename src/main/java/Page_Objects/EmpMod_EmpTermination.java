package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class EmpMod_EmpTermination {
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;
		
	@FindBy(xpath="//a[contains(text(),'Employee Termination')]")
	private WebElement EmpTermination;
	
	@FindBy(xpath="//*[@id='TerminationDate']")
	private WebElement TermDate;
	
	@FindBy(xpath="//*[@id='PaycheckDate']")
	private WebElement PayCheckDate;
	
	@FindBy(xpath="//*[@id='ReasonID']")
	private WebElement ReasonID;
	
	@FindBy(xpath="//*[@id='ExitTypeID']")
	private WebElement ExitType;
	
	@FindBy(xpath="//*[@id='UserReason']")
	private WebElement ReasonNotes;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']//tr[14]/td[2]/div/div/div")
	private WebElement TermSuppDoc;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']//tr[15]/td[2]/div/div/div")
	private WebElement SeperationEmail;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']//tr[16]/td[2]/div/div/div")
	private WebElement NotificationInternalTeam;
	
	@FindBy(xpath="//button[@onclick='return CPXWindow_Save(this);']")
	private WebElement SaveButton;
	
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
	
	public EmpMod_EmpTermination(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void EmployeeTermination_EmpModule(Map<String,String> hmap) throws Exception{
		
		lib = new Generic_Methods(driver);
		EmpTermination.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();
		TermDate.click();
		TermDate.sendKeys(hmap.get("EmpTerm_TermDate"));
		Thread.sleep(500);
		lib.select(ExitType, hmap.get("ExitTypeID"));
		
		String Exittype = hmap.get("ExitTypeID");
		if(Exittype.equals("Voluntary")) {
			lib.select(ReasonID, hmap.get("VoluntaryReason"));
		}else if(Exittype.equals("InVoluntary")) {
			lib.select(ReasonID, hmap.get("InVoluntaryReason"));
		}
		Thread.sleep(500);
		
		String EmpTermHiring =hmap.get("EmpTerm_BlockHiring");
		String BlockHiring = "//*[@id='IsBlockedForRehire'][@value='"+ EmpTermHiring +"']";
		driver.findElement(By.xpath(BlockHiring)).click();	
		Thread.sleep(1000);
		
		ReasonNotes.sendKeys(hmap.get("EmpTerm_Notes"));
		TermSuppDoc.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(2500);
		SeperationEmail.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(2500);
		NotificationInternalTeam.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(2500);
		SaveButton.click();
		Thread.sleep(1000);

	}
	
	public void EmployeeTermination_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(1500);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("EmpTermSearchText"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("Term_TaskTo"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();		
		Thread.sleep(1000);
		ApproveBtn.click();
		
		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("Term_TaskTo1"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();		
		Thread.sleep(1000);
		ApproveBtn.click();
	}
	
	
	
}
