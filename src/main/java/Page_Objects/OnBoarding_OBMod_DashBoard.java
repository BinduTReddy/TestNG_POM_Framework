package Page_Objects;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class OnBoarding_OBMod_DashBoard {

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

	@FindBy(xpath="//a[contains(text(),'Edit')]")
	private WebElement EditBtn;

	@FindBy(xpath="//tbody/tr[3]/td[2]/div[1]/div[1]/div[1]")
	private WebElement PurchaseBtn;

	@FindBy(xpath="//tbody/tr[4]/td[2]/div[1]/div[1]/div[1]")
	private WebElement WorksheetBtn;

	@FindBy(xpath="//tbody/tr[5]/td[2]/div[1]/div[1]/div[1]")
	private List<WebElement> EVeifyBtn;

	@FindBy(xpath="//tbody/tr[6]/td[2]/div[1]/div[1]/div[1]")
	private List<WebElement> ProofofAdd;

	@FindBy(xpath="//tbody/tr[7]/td[2]/div[1]/div[1]/div[1]")
	private List<WebElement> Orientation;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement SaveBtn;

	@FindBy(xpath="//table//tr[td[contains(text(),'Background Check')]]/td[3]/div/a/img")
	private WebElement BackGroundCheck;

	@FindBy(xpath="//*[@id='OB_BackgroundCheck_StatusID']")
	private WebElement BackgroundStatus;

	@FindBy(xpath="//table//tr[td[contains(text(),'Drug Test')]]/td[3]/div/a/img")
	private WebElement Drugtest;

	@FindBy(xpath="//*[@id='OB_DrugTest_StatusID']")
	private WebElement Drugteststatus;

	@FindBy(xpath="//*[@id='tabStripOBStatus']/ul/li[2]/a")
	private  WebElement Summaraytab;

	@FindBy(xpath="//*[@id='tabStripOBStatus']/ul/li[1]/a")
	private WebElement Dashboardtab;

	@FindBy(xpath="//*[@id='tdOBStepsApproval']/a/img")
	private WebElement OnboardingstepreviewBtn;

	@FindBy(xpath="//button[contains(text(),'Verified')]")
	private WebElement VerifiedBtn;

	@FindBy(xpath="//input[@id='VerifyDoc']")
	private WebElement VerifySignature;

	@FindBy(xpath="//button[contains(text(),'Approve')]")
	private WebElement ApproveBtn;
	
	@FindBy(xpath="//a[@id='aOB_VerifyCompleted']")
	private WebElement ReviewCompleted;
	
	@FindBy(xpath="//*[contains(text(),'Force Complete')]")
	private WebElement ForceCompleted;
	
	@FindBy(xpath="/html/body/div[11]/div[1]")
	private WebElement Doctab;
	
	@FindBy(xpath="//*[@value='+ Add Doc']")
	private WebElement AddDocBtn;
	
	@FindBy(xpath="//td[text()='Equipement Policy']/following-sibling::td[@class='t-last']/input[@type='checkbox']")
	private WebElement Equipment;
	
	@FindBy(xpath="//td[text()='Pending Background Check - Consent']/following-sibling::td[@class='t-last']/input[@type='checkbox']")
	private WebElement BGCheckDoc;
	
	@FindBy(xpath="//*[@id='OB_Consultant_Asset_AssetCost']")
	private WebElement AssetCost;
	
	@FindBy(xpath="//*[@id='OB_Consultant_Asset_TrackingNo']")
	private WebElement Trackingid;
	
	@FindBy(xpath="//*[@type='submit'][contains(text(),'Save')]")
	private WebElement EquipSave;
	
	@FindBy(xpath="//*[@type='button'][contains(text(),'Save')]")
	private WebElement AddDocsave;
	
	@FindBy(xpath="//*[@type='button'][contains(text(),'Cancel')]")
	private WebElement AddDocCancel;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[3]/td/a/img")
	private WebElement UploadDoc1;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[4]/td/a/img")
	private WebElement UploadDoc2;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[5]/td/a/img")
	private WebElement UploadDoc3;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[3]/td[5]/a/img")
	private WebElement ApproveBtn1;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[4]/td[5]/a/img")
	private WebElement ApproveBtn2;
	
	@FindBy(xpath="//*[@id='tabOBDashboard']//table[5]/tbody/tr[5]/td[5]/a/img")
	private WebElement ApproveBtn3;
	
	@FindBy(xpath="//*[@class='t-widget t-upload']/div/div")
	private WebElement fileUpload;
	
	@FindBy(xpath="//*[@id='aOB_IsForceable']")
	private WebElement Forcecomplete;
	
	public OnBoarding_OBMod_DashBoard(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}


	public void OnBoarding_NewEmp(Map<String,String> hmap) throws Exception{
		driver.navigate().refresh();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		lib = new Generic_Methods(driver);
		OnBoarding.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		Thread.sleep(2000);
		CandName.sendKeys(hmap.get("EmpName"));
		//CandPopup.click();
		Thread.sleep(1000);
		ClientName.sendKeys(hmap.get("Clientname"));
		ClientName.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		viewlogo.click();
		lib.switchOutOfFrame();
		Thread.sleep(3000);		
		EditBtn.click();
		Thread.sleep(2000);
		PurchaseBtn.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(2000);
		WorksheetBtn.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath1"));
		Thread.sleep(2000);		
		if (EVeifyBtn.size() > 0) {
			EVeifyBtn.get(0).click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath"));
			Thread.sleep(2000);
		}
		if (ProofofAdd.size() > 0) {
			ProofofAdd.get(0).click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(2000);
		}
		if (Orientation.size() > 0) {
			Orientation.get(0).click();
			Thread.sleep(2000);
			Runtime.getRuntime().exec(props.getProperty("filepath"));
			Thread.sleep(3000);
		}
		SaveBtn.click();
		Thread.sleep(2000);
		Summaraytab.click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, 600)");	
		Dashboardtab.click();
		Thread.sleep(2000);
	
		try {
			lib.waitForElementLoad(BackGroundCheck);
			BackGroundCheck.click();
			lib.select(BackgroundStatus,hmap.get("BackGroundStatus"));
			SaveBtn.click();
		} catch (TimeoutException e) {}
		try {
			lib.waitForElementLoad(Drugtest);
			Drugtest.click();
			lib.select(Drugteststatus,hmap.get("DrugStatus"));
			SaveBtn.click();
		} catch (TimeoutException e) {}

		Thread.sleep(1500);
		OnboardingstepreviewBtn.click();
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", VerifiedBtn);
		VerifiedBtn.click();	
		Thread.sleep(2000);

		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		for (int i = 1; i < rows.size(); i++) {
		    rows = driver.findElements(By.xpath("//*[@id='tabOBDashboard']/div[4]/table[5]/tbody/tr")); 
		    Thread.sleep(1000);
		    WebElement row = rows.get(i);
		    try {
		    WebElement uploadButton = row.findElement(By.xpath(".//td[5]//a/img"));
		    if (uploadButton.isDisplayed()) {
		        uploadButton.click();
		        Thread.sleep(1000);
				VerifySignature.click();
				 Thread.sleep(1000);
				ApproveBtn.click();
				Thread.sleep(1000);
		    }
		}catch (NoSuchElementException e) {}
	}
				
//		try {
//			js.executeScript("arguments[0].scrollIntoView();", AddDocBtn);
//			AddDocBtn.click();
//			Thread.sleep(1000);
//			String optionText =hmap.get("AddDoc1");
//			Thread.sleep(1000);
//			String Equipmentopt = "//td[text()='"+ optionText +"']/following-sibling::td[@class='t-last']/input[@type='checkbox']";
//			driver.findElement(By.xpath(Equipmentopt)).click();
//			if(Equipment.isSelected()) {
//				String option =hmap.get("AssetType");
//				String Equip = "//*[@type='checkbox'][normalize-space(following-sibling::text())='" + option + "']";
//				driver.findElement(By.xpath(Equip)).click();
//				String option1 =hmap.get("AssetType1");
//				String Equipment1 = "//*[@type='checkbox'][normalize-space(following-sibling::text())='" + option1 + "']";
//				driver.findElement(By.xpath(Equipment1)).click();			
//				AssetCost.click();
//				AssetCost.sendKeys(hmap.get("Assetcost"));
//				Trackingid.sendKeys(hmap.get("TrackingId"));
//				EquipSave.click();
//				Thread.sleep(2000);
//			}else {}}
//			catch(TimeoutException e) {}
//			try {
//				lib.waitForElementLoad(AddDocBtn);
//				js.executeScript("arguments[0].scrollIntoView();", AddDocBtn);
//				AddDocBtn.click();
//			}catch(TimeoutException e) {}
//			try {
//				lib.waitForElementLoad(AddDocsave);			
//				String optionText1 =hmap.get("AddDoc2");
//				String xpathExpression1 = "//td[text()='" + optionText1 + "']/following-sibling::td[@class='t-last']/input[@type='checkbox']";
//				List<WebElement> ChkBox1=driver.findElements(By.xpath(xpathExpression1));
//				if (!ChkBox1.isEmpty()) {
//					ChkBox1.get(0).click();
//				}				
//				String optionText2 =hmap.get("AddDoc3");
//				String xpathExpression2 = "//td[text()='" + optionText2 + "']/following-sibling::td[@class='t-last']/input[@type='checkbox']";
//				List<WebElement> ChkBox2=driver.findElements(By.xpath(xpathExpression2));
//				if (!ChkBox2.isEmpty()) {
//					ChkBox2.get(0).click();
//				}				
//				List<WebElement> checkboxes = driver.findElements(By.xpath("//div[@id='grdAddDocSelect']//tbody/tr/td[@class]/input"));	
//				boolean isAnyCheckboxSelected = false;
//				for (WebElement checkbox : checkboxes) {
//				    if (checkbox.isSelected()) {
//				        isAnyCheckboxSelected = true;
//				        break;
//				    }
//				}
//				if (!isAnyCheckboxSelected) {
//			    	Thread.sleep(1000);
//			    	driver.findElement(By.xpath("//*[@type='button'][contains(text(),'Cancel')]")).click();				    	
//			    }
//				 else {
//				    	Thread.sleep(1500);
//				    	driver.findElement(By.xpath("//*[@type='button'][contains(text(),'Save')]")).click();			    	
//			    }
//			}catch(TimeoutException e) {}			
//			Summaraytab.click();
//			Thread.sleep(2000);
//			Dashboardtab.click();
//			Thread.sleep(2000);			
//		try {
//			lib.waitForElementLoad(UploadDoc1);
//			js.executeScript("arguments[0].scrollIntoView();", UploadDoc1);
//			UploadDoc1.click();
//			Thread.sleep(1000);
//			fileUpload.click();
//			Thread.sleep(1000);
//			Runtime.getRuntime().exec(props.getProperty("filepath1"));
//			Thread.sleep(2000);
//			SaveBtn.click();
//			Thread.sleep(2000);
//		} catch (TimeoutException e) {}	
//		try {
//			lib.waitForElementLoad(UploadDoc2);
//			js.executeScript("arguments[0].scrollIntoView();", UploadDoc2);
//			UploadDoc2.click();
//			Thread.sleep(1000);
//			fileUpload.click();
//			Thread.sleep(1000);
//			Runtime.getRuntime().exec(props.getProperty("filepath1"));
//			Thread.sleep(2000);
//			SaveBtn.click();
//			Thread.sleep(2000);
//			ApproveBtn2.click();
//			Thread.sleep(1000);
//			VerifySignature.click();
//			ApproveBtn.click();
//			Thread.sleep(1000);
//		} catch (TimeoutException e) {}	
//		try {
//			lib.waitForElementLoad(UploadDoc3);
//			js.executeScript("arguments[0].scrollIntoView();", UploadDoc3);
//			UploadDoc3.click();
//			Thread.sleep(1000);
//			fileUpload.click();
//			Thread.sleep(1000);
//			Runtime.getRuntime().exec(props.getProperty("filepath1"));
//			Thread.sleep(2000);
//			SaveBtn.click();
//			Thread.sleep(2000);
//			ApproveBtn3.click();
//			Thread.sleep(1000);
//			VerifySignature.click();
//			ApproveBtn.click();
//			Thread.sleep(1000);
//		} catch (TimeoutException e) {}	
//		
		Thread.sleep(1000);
		try {
			lib.waitForElementLoad(ReviewCompleted);
			ReviewCompleted.click();
			Thread.sleep(1500);
		}catch(TimeoutException e){}
		
		try {
			lib.waitForElementLoad(ForceCompleted);
			ForceCompleted.click();
			Thread.sleep(1500);
			driver.switchTo().alert().accept();
		}catch(TimeoutException e){}	

	}
	}
