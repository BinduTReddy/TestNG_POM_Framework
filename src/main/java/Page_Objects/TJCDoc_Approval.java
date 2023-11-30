package Page_Objects;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class TJCDoc_Approval {

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

	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]")
	private WebElement ImgBtnTask;

	@FindBy(xpath="//div[@id='ImgBtnOK']")
	private WebElement ApproveBtn;

	@FindBy(xpath="/html/body/ul[1]/li/a")
	private WebElement WordPopup;

	@FindBy(xpath="//*[contains(@class, 'RibbonImgBtnWarper')][@id='ImgBtnOK']")
	private WebElement Complete;

	@FindBy(xpath="//*[@value='+ Request For Documents']")
	private WebElement ReqForDoc;

	@FindBy(xpath="//*[@id='DocStatusID']")
	private WebElement JCApp;

	@FindBy(xpath="//*[@id='DocStatusID'][@value='3084']")
	private WebElement JCAppwithExp;

	@FindBy(xpath="//*[@id='DocStatusID'][@value='3085']")
	private WebElement JCRej;

	@FindBy(xpath="//*[@id='DueDate']")
	private WebElement JCAppExpDueDate;

	@FindBy(xpath="//button[contains(text(),'Save')]")
	private WebElement saveBtn;

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

	@FindBy(xpath="//*[@id='tabStripOBStatus']/ul/li[3]/a")
	private WebElement JCDoc;
	
	@FindBy(xpath="//*[@id='Document_DisplayName']")
	private WebElement DocDisplayName;
	
	@FindBy(xpath="//*[contains(text(),'Document Type')]//following-sibling::td")
	private WebElement DocumentType;

	@FindBy(xpath="//*[@id='Document_ValidFromDate']")
	private WebElement ValidFrom;

	@FindBy(xpath="//*[@id='Document_ValidTillDate']")
	private WebElement ValidTill;

	@FindBy(xpath="//*[@id='trAttachment']/td//following-sibling::td/div/div/div")
	private WebElement Upload;

	@FindBy(xpath="//*[@id='OBMiscDocument_DocRefNumber']")
	private WebElement UniqueID;

	@FindBy(xpath="//*[@id='SourceID']")
	private WebElement DocSourceid;

	@FindBy(xpath="//*[@id='IsJCRequest'][@value='True']")
	private WebElement RequestExp;

	@FindBy(xpath="//*[@id='JCDocSupport']/td[2]/div/div/div")
	private WebElement JCSuppDoc;

	@FindBy(xpath="//*[@id='DueDate']")
	private WebElement DueDate;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//div/button[2]")
	private WebElement OBDocSave;
	
	@FindBy(xpath="//*[contains(text(),'OK')]")
	private WebElement OkBtn;

	@FindBy(xpath="//*[@id='ReasonID']")
	private WebElement ReasonID;

	@FindBy(xpath="//*[@id='Notes']")
	private WebElement Notes;

	@FindBy(xpath="//*[@value='+ Request For Documents']")
	private WebElement ReqDoc;

	@FindBy(xpath="//*[@id='btnJCOwner']")
	private WebElement JCOwner;

	@FindBy(xpath="//*[@id='JCOwnerID']")
	private WebElement JCOwnerID;

	@FindBy(xpath="//*[@onclick='return CPXWindow_Save(this);']")
	private WebElement JCOwnerSave;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']/table[1]/tbody/tr/td[2]/table[1]/tbody/tr/td[2]/h4/span")
	private WebElement DocName;

	public TJCDoc_Approval(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void EmpModule_TJC_Approval(Map<String,String> hmap) throws Exception {		
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("SrchByWord"));
		WordPopup.click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("TaskJCApp"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();	
		ApproveBtn.click();
		Thread.sleep(1500);
	}

	public void OBModule_TJC_Approval(Map<String,String> hmap) throws Exception
	{	
		driver.navigate().refresh();	
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("JCDocApproval"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();	
		Thread.sleep(3000);

		try {
			lib.waitForElementLoad(JCOwner);
			JCOwner.click();
			Thread.sleep(1000);
			lib.select(JCOwnerID, hmap.get("JC_Owner"));
			JCOwnerSave.click();

			lib.handlingFrame("frmContent");
			AssignedBy.clear();
			AssignedBy.sendKeys(hmap.get("Assignedby"));
			SearchImg.click();
			Thread.sleep(2000);
			ImgBtnTask.click();
			Thread.sleep(1000);
			lib.switchOutOfFrame();	
			Thread.sleep(1500);
		}catch(TimeoutException e) {}
	
//		try {
//			lib.waitForElementLoad(ReqDoc);
//			ReqDoc.click();
//			Thread.sleep(1500);
//			String DocName =hmap.get("ReqForDoc");	
//			String DocName1 =hmap.get("ReqForDoc1");
//			boolean nextPageAvailable = true;
//			while (nextPageAvailable) {
//				List<WebElement> rowsDocName = driver.findElements(By.xpath("//tr[td/a[text()='" + DocName + "']]"));
//				List<WebElement> rowsDocName1 = driver.findElements(By.xpath("//tr[td/a[text()='" + DocName1 + "']]"));
//				for (WebElement row : rowsDocName) {
//					WebElement checkbox = row.findElement(By.xpath(".//td/input[@type='checkbox']"));
//					checkbox.click();
//				}
//				for (WebElement row : rowsDocName1) {
//					WebElement checkbox = row.findElement(By.xpath(".//td/input[@type='checkbox']"));
//					checkbox.click();
//				}
//				WebElement nextButton = driver.findElement(By.xpath("//div[@id='grdJCDocSelect']//span[contains(@class, 't-icon t-arrow-next') and contains(text(), 'next')]"));
//				nextPageAvailable = nextButton.isEnabled();
//				if (nextPageAvailable) {
//					nextButton.click();
//				}
//			}
//			saveBtn.click();
//		} catch (TimeoutException e) {}
		
		List<WebElement> OBStatus = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[4]"));						
		List<WebElement> JCStatus = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[5]"));						
		List<WebElement> reviewButtons = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[6]/a/img"));

		  int loopBound = Math.min(OBStatus.size(), Math.min(JCStatus.size(), reviewButtons.size()));
		    for (int i = 0; i < loopBound; i++) {
		    	WebElement StatusOB = OBStatus.get(i);
		        WebElement StatusJC = JCStatus.get(i);
		        WebElement reviewButton = reviewButtons.get(i);
		
			if (StatusOB.getText().contains("Approved")&&StatusJC.getText().contains("Pending")||StatusJC.getText().contains("Exception")){
				if (reviewButton.isDisplayed()) {
					Thread.sleep(500);
					reviewButton.click();
					Thread.sleep(1500);			   
					try {
						lib.waitForElementLoad(JCApp);
						String JCDocName = DocName.getText();

						if(JCDocName.equals("Core l")||JCDocName.equals("Employment Verification (7 Years)")||JCDocName.equals("COVID Vaccine"))
						{
							String optionText1 = hmap.get("JCApproval2");
							String JCApproval = "//*[@id='DocStatusID'][@value='" + optionText1 + "']";
							driver.findElement(By.xpath(JCApproval)).click();
							Thread.sleep(1000);			
						}
						else if(JCDocName.equals("Flu Vaccine")||JCDocName.equals("Education Verification")||JCDocName.equals("Reference Checks"))
						{
							String optionText2 = hmap.get("JCApproval1");
							String JCApproval = "//*[@id='DocStatusID'][@value='" + optionText2 + "']";
							driver.findElement(By.xpath(JCApproval)).click();
							Thread.sleep(1000);			
						}
						else {
							String optionText = hmap.get("JCApproval");
							String JCApproval = "//*[@id='DocStatusID'][@value='" + optionText + "']";
							driver.findElement(By.xpath(JCApproval)).click();
							Thread.sleep(1000);			
						}

						if(JCAppwithExp.isSelected())
						{	
							String optionText1 =hmap.get("ExpDuedate");
							long serialNumber = Long.parseLong(optionText1);
							Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
							Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
							DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
							String DueDate = dateFormat.format(documentDate);   
							JCAppExpDueDate.click();
							Thread.sleep(1000);
							JCAppExpDueDate.sendKeys(DueDate);
							Thread.sleep(1500);
							Notes.sendKeys(hmap.get("Notes"));
						}

						if(JCRej.isSelected())
						{	
							Notes.click();
							Notes.sendKeys(hmap.get("Notes"));
						}
						saveBtn.click();
						Thread.sleep(2000);					
					}catch(TimeoutException e) {}
				}}				
		}

		WebElement element = driver.findElement(By.xpath("//div[contains(@class, 'RibbonImgBtnWarperGrayBg')] | //div[contains(@class, 'RibbonImgBtnWarper')]"));
		if (element.getAttribute("class").equals("RibbonImgBtnWarper")) {
			element.click();
			Thread.sleep(1000);
		}
		else {
			driver.navigate().refresh();
			lib = new Generic_Methods(driver);
			Thread.sleep(1000);
			OnBoarding.click();
			Thread.sleep(1000);
			lib.handlingFrame("frmContent");
			Thread.sleep(2000);
			CandName.sendKeys(hmap.get("EmpName"));
			Thread.sleep(1000);
			CandPopup.click();
			Thread.sleep(1000);
			ClientName.sendKeys(hmap.get("Clientname"));
			ClientName.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			viewlogo.click();
			Thread.sleep(1000);
			lib.switchOutOfFrame();
			Thread.sleep(5000);
			JCDoc.click();
			Thread.sleep(1500);

			List<WebElement> ReqDocUpl = driver.findElements(By.xpath("//*[@width='90%']//a[@class='button']"));
			for (WebElement UplBtnToClick : ReqDocUpl) {
				UplBtnToClick.click();
				Thread.sleep(2000);
				try {
					lib.waitForElementLoad(DocDisplayName);
					DocDisplayName.sendKeys(hmap.get("DocumentName"));
				}catch(TimeoutException e) {}
				
				try {
					lib.waitForElementLoad(ValidFrom);
					String optionText1 =hmap.get("DocValidFrom");
					if (optionText1 != null && !optionText1.isEmpty()) {
						long serialNumber = Long.parseLong(optionText1);
						Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
						Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						String formattedDate = dateFormat.format(documentDate);
						System.out.println(formattedDate);
						ValidFrom.click();
						ValidFrom.sendKeys(formattedDate);
					}
				}catch(TimeoutException e) {}
				try {
					lib.waitForElementLoad(ValidTill);
					String optionText1 =hmap.get("DocValidTill");
					if (optionText1 != null && !optionText1.isEmpty()) {
						long serialNumber = Long.parseLong(optionText1);
						Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
						Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						String TillDate = dateFormat.format(documentDate);   
						ValidTill.click();
						ValidTill.sendKeys(TillDate);}
				} catch (TimeoutException e) {}
				
				Upload.click();
				Thread.sleep(1000);
				Runtime.getRuntime().exec(props.getProperty("filepath2"));
				Thread.sleep(3000);
				try {
					lib.waitForElementLoad(UniqueID);
					UniqueID.sendKeys(hmap.get("DocUniqueId"));
					Thread.sleep(500);
				}catch(TimeoutException e) {}
						
				lib.select(DocSourceid,hmap.get("DocumentSourceid"));
				try {
					lib.waitForElementLoad(RequestExp);
					String optionText2 =hmap.get("ReqExp");
					String ViewEmpPortal = "//*[@id='IsJCRequest'][@value='" + optionText2 + "']";
					driver.findElement(By.xpath(ViewEmpPortal)).click();	
					if(RequestExp.isSelected()){
						JCSuppDoc.click();
						Thread.sleep(1000);
						Runtime.getRuntime().exec(props.getProperty("filepath3"));
						Thread.sleep(2500);

						String optionText1 =hmap.get("ExpDuedate");
						long serialNumber = Long.parseLong(optionText1);
						Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
						Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						String Duedate = dateFormat.format(documentDate);   
						DueDate.click();
						DueDate.sendKeys(Duedate);

						lib.select(ReasonID, hmap.get("Reason"));
						Thread.sleep(1500);
						Notes.sendKeys(hmap.get("Notes"));
					}
				}catch(TimeoutException e) {}
				OBDocSave.click();
				Thread.sleep(1000);	
				try {
					lib.waitForElementLoad(OkBtn);
					OkBtn.click();
					Thread.sleep(500);
				}catch(TimeoutException e) {}		
			}								

			List<WebElement> OBJCRej = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[6]//a/img"));						
			for (WebElement elementToClick : OBJCRej) {
				Thread.sleep(1000);
				elementToClick.click();
				Thread.sleep(2000);
				
				try {
					lib.waitForElementLoad(DocDisplayName);
					DocDisplayName.sendKeys(hmap.get("DocumentName"));
				}catch(TimeoutException e) {}
				
				try {
					lib.waitForElementLoad(ValidFrom);
					String optionText1 =hmap.get("DocValidFrom");
					if (optionText1 != null && !optionText1.isEmpty()) {
						long serialNumber = Long.parseLong(optionText1);
						Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
						Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						String formattedDate = dateFormat.format(documentDate);
						System.out.println(formattedDate);
						ValidFrom.click();
						ValidFrom.sendKeys(formattedDate);
					}
				}catch(TimeoutException e) {}
				try {
					lib.waitForElementLoad(ValidTill);
					String optionText1 =hmap.get("DocValidTill");
					if (optionText1 != null && !optionText1.isEmpty()) {
						long serialNumber = Long.parseLong(optionText1);
						Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
						Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						String TillDate = dateFormat.format(documentDate);   
						ValidTill.click();
						ValidTill.sendKeys(TillDate);}
				} catch (TimeoutException e) {}
				Upload.click();
				Thread.sleep(1000);
				Runtime.getRuntime().exec(props.getProperty("filepath1"));
				Thread.sleep(3000);
				try {
					lib.waitForElementLoad(UniqueID);
					UniqueID.sendKeys(hmap.get("DocUniqueId"));
					Thread.sleep(500);
				}catch(TimeoutException e) {}
								
				lib.select(DocSourceid,hmap.get("DocumentSourceid"));
				try {
					lib.waitForElementLoad(RequestExp);
					String optionText2 =hmap.get("ReqExp");
					String ViewEmpPortal = "//*[@id='IsJCRequest'][@value='" + optionText2 + "']";
					driver.findElement(By.xpath(ViewEmpPortal)).click();	
					
					if(RequestExp.isSelected())
					{
						JCSuppDoc.click();
						Thread.sleep(1000);
						Runtime.getRuntime().exec(props.getProperty("filepath3"));
						Thread.sleep(2500);

						String optionText1 =hmap.get("ExpDuedate");
						long serialNumber = Long.parseLong(optionText1);
						Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
						Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						String Duedate = dateFormat.format(documentDate);   
						DueDate.click();
						DueDate.sendKeys(Duedate);

						lib.select(ReasonID, hmap.get("Reason"));
						Thread.sleep(1500);
						Notes.sendKeys(hmap.get("Notes"));
					}
				}catch(TimeoutException e) {}
				OBDocSave.click();
				Thread.sleep(1000);
				try {
					lib.waitForElementLoad(OkBtn);
					OkBtn.click();
					Thread.sleep(500);
				}catch(TimeoutException e) {}	
			}								
		
		driver.navigate().refresh();	
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("JCDocApproval"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();	
		Thread.sleep(3000);

		List<WebElement> OBStatus1 = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[4]"));						
		List<WebElement> JCStatus1 = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[5]"));						
		List<WebElement> reviewButtons1 = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[6]/a/img"));

		for (int i = 0; i < OBStatus1.size(); i++) {
			WebElement StatusOB = OBStatus1.get(i);
			WebElement StatusJC = JCStatus1.get(i);
			WebElement reviewButton = reviewButtons1.get(i);

			if (StatusOB.getText().contains("Approved")&&StatusJC.getText().contains("Pending")) {
				if (reviewButton.isDisplayed()) {
					Thread.sleep(1000);
					reviewButton.click();
					Thread.sleep(1500);		   
					try {
						lib.waitForElementLoad(JCApp);
						String optionText = hmap.get("JCApproval");
						String JCApproval = "//*[@id='DocStatusID'][@value='" + optionText + "']";
						driver.findElement(By.xpath(JCApproval)).click();
						Thread.sleep(1000);	
						saveBtn.click();
						Thread.sleep(2000);	
					}catch(TimeoutException e) {}
				}}
		}
		Thread.sleep(1000);
		WebElement AppBtn = driver.findElement(By.xpath("//div[contains(@class, 'RibbonImgBtnWarper')]"));
		if (AppBtn.getAttribute("class").equals("RibbonImgBtnWarper")) {
			ApproveBtn.click();
			Thread.sleep(1000);
		}
		}
	}


	public void OBMod_TJC_SecondApp(Map<String,String> hmap) throws Exception
	{	
		driver.navigate().refresh();	
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("JCDocApproval"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();	
		Thread.sleep(3000);

		List<WebElement> OBStatus = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[4]"));						
		List<WebElement> JCStatus = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[5]"));						
		List<WebElement> reviewButtons = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[6]/a/img"));

		int size = OBStatus.size();
		if (size == JCStatus.size() && size == reviewButtons.size()) {
			for (int i = 0; i < size; i++) {
				WebElement StatusOB = OBStatus.get(i);
				WebElement StatusJC = JCStatus.get(i);
				WebElement reviewButton = reviewButtons.get(i);

				if (StatusOB.getText().contains("Approved")&&StatusJC.getText().contains("Pending")){
					if (reviewButton.isDisplayed()) {
						Thread.sleep(1000);
						reviewButton.click();
						Thread.sleep(1500);			   
						try {
							lib.waitForElementLoad(JCApp);	
							String optionText = hmap.get("JCApproval1");
							String JCApproval = "//*[@id='DocStatusID'][@value='" + optionText + "']";
							driver.findElement(By.xpath(JCApproval)).click();
							Thread.sleep(1000);			

							if(JCAppwithExp.isSelected())
							{	
								String optionText1 =hmap.get("ExpDuedate");
								long serialNumber = Long.parseLong(optionText1);
								Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
								Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
								DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
								String DueDate = dateFormat.format(documentDate);   
								JCAppExpDueDate.click();
								Thread.sleep(1000);
								JCAppExpDueDate.sendKeys(DueDate);
								Thread.sleep(1500);
								Notes.sendKeys(hmap.get("Notes"));
							}

							if(JCRej.isSelected())
							{	
								Notes.click();
								Notes.sendKeys(hmap.get("Notes"));
							}
							saveBtn.click();
							Thread.sleep(2000);					
						}catch(TimeoutException e) {}
					}}				
			}
		}

		WebElement element = driver.findElement(By.xpath("//div[contains(@class, 'RibbonImgBtnWarperGrayBg')] | //div[contains(@class, 'RibbonImgBtnWarper')]"));
		if (element.getAttribute("class").equals("RibbonImgBtnWarper")) {
			element.click();
			Thread.sleep(1000);
		}
		else {
			driver.navigate().refresh();
			lib = new Generic_Methods(driver);
			Thread.sleep(1000);
			OnBoarding.click();
			Thread.sleep(1000);
			lib.handlingFrame("frmContent");
			Thread.sleep(2000);
			CandName.sendKeys(hmap.get("EmpName"));
			Thread.sleep(1000);
			CandPopup.click();
			Thread.sleep(1000);
			ClientName.sendKeys(hmap.get("Clientname"));
			ClientName.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			viewlogo.click();
			Thread.sleep(1000);
			lib.switchOutOfFrame();
			Thread.sleep(6000);
			JCDoc.click();
			Thread.sleep(1500);

			List<WebElement> ReqDocUpl = driver.findElements(By.xpath("//*[@width='90%']//a[@class='button']"));
			for (WebElement UplBtnToClick : ReqDocUpl) {
				UplBtnToClick.click();
				Thread.sleep(2000);
				try {
					lib.waitForElementLoad(ValidFrom);
					String optionText1 =hmap.get("DocValidFrom");
					if (optionText1 != null && !optionText1.isEmpty()) {
						long serialNumber = Long.parseLong(optionText1);
						Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
						Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						String formattedDate = dateFormat.format(documentDate);
						System.out.println(formattedDate);
						ValidFrom.click();
						ValidFrom.sendKeys(formattedDate);
					}
				}catch(TimeoutException e) {}
				try {
					lib.waitForElementLoad(ValidTill);
					String optionText1 =hmap.get("DocValidTill");
					if (optionText1 != null && !optionText1.isEmpty()) {
						long serialNumber = Long.parseLong(optionText1);
						Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
						Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						String TillDate = dateFormat.format(documentDate);   
						ValidTill.click();
						ValidTill.sendKeys(TillDate);}
				} catch (TimeoutException e) {}
				Upload.click();
				Thread.sleep(1000);
				Runtime.getRuntime().exec(props.getProperty("filepath2"));
				Thread.sleep(2500);
				try {
					lib.waitForElementLoad(UniqueID);
					UniqueID.sendKeys(hmap.get("DocUniqueId"));
				}catch(TimeoutException e) {}
								
				lib.select(DocSourceid,hmap.get("DocumentSourceid"));
				try {
					lib.waitForElementLoad(RequestExp);
					String optionText2 =hmap.get("ReqExp");
					String ViewEmpPortal = "//*[@id='IsJCRequest'][@value='" + optionText2 + "']";
					driver.findElement(By.xpath(ViewEmpPortal)).click();	
					if(RequestExp.isSelected()){
						JCSuppDoc.click();
						Thread.sleep(1000);
						Runtime.getRuntime().exec(props.getProperty("filepath1"));
						Thread.sleep(2500);

						String optionText1 =hmap.get("ExpDuedate");
						long serialNumber = Long.parseLong(optionText1);
						Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
						Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						String Duedate = dateFormat.format(documentDate);   
						DueDate.click();
						DueDate.sendKeys(Duedate);

						lib.select(ReasonID, hmap.get("Reason"));
						Thread.sleep(1500);
						Notes.sendKeys(hmap.get("Notes"));
					}
				}catch(TimeoutException e) {}
				OBDocSave.click();
				Thread.sleep(2000);
				try {
					driver.switchTo().alert().accept();
				} catch (NoAlertPresentException e) {}
			}								

			List<WebElement> OBJCRej = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[6]//a/img"));						
			for (WebElement elementToClick : OBJCRej) {
				Thread.sleep(1000);
				elementToClick.click();
				Thread.sleep(2000);
				
//				String DocTypeName = DocumentType.getText();
//				if(DocTypeName.equals("Drug Test")||DocTypeName.equals("Education Verification")||DocTypeName.equals("Employment Verification (7 Years)")||
//						DocTypeName.equals("FACIS 3")||DocTypeName.equals("Fingerprinting")||DocTypeName.equals("National Sex Offender")||
//						DocTypeName.equals("OFAC")||DocTypeName.equals("OIG ")||DocTypeName.equals("Other Background releted documents")||
//						DocTypeName.equals("Reference Checks")||DocTypeName.equals("SAM"))
//				{	
//					try {
//					lib.waitForElementLoad(UnderCriminalCheck);
//					UnderCriminalCheck.click();
//				}catch(TimeoutException e) {}
				
				try {
					lib.waitForElementLoad(ValidFrom);
					String optionText1 =hmap.get("DocValidFrom");
					if (optionText1 != null && !optionText1.isEmpty()) {
						long serialNumber = Long.parseLong(optionText1);
						Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
						Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						String formattedDate = dateFormat.format(documentDate);
						System.out.println(formattedDate);
						ValidFrom.click();
						ValidFrom.sendKeys(formattedDate);
					}
				}catch(TimeoutException e) {}
				try {
					lib.waitForElementLoad(ValidTill);
					String optionText1 =hmap.get("DocValidTill");
					if (optionText1 != null && !optionText1.isEmpty()) {
						long serialNumber = Long.parseLong(optionText1);
						Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
						Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						String TillDate = dateFormat.format(documentDate);   
						ValidTill.click();
						ValidTill.sendKeys(TillDate);}
				} catch (TimeoutException e) {}
				
				Upload.click();
				Thread.sleep(1000);
				Runtime.getRuntime().exec(props.getProperty("filepath1"));
				Thread.sleep(2000);
				try {
					lib.waitForElementLoad(UniqueID);
					UniqueID.sendKeys(hmap.get("DocUniqueId"));
				}catch(TimeoutException e) {}
				
				lib.select(DocSourceid,hmap.get("DocumentSourceid"));
				try {
					lib.waitForElementLoad(RequestExp);
					String optionText2 =hmap.get("ReqExp");
					String ViewEmpPortal = "//*[@id='IsJCRequest'][@value='" + optionText2 + "']";
					driver.findElement(By.xpath(ViewEmpPortal)).click();	
					if(RequestExp.isSelected()){
						JCSuppDoc.click();
						Thread.sleep(1000);
						Runtime.getRuntime().exec(props.getProperty("filepath1"));
						Thread.sleep(2500);

						String optionText1 =hmap.get("ExpDuedate");
						long serialNumber = Long.parseLong(optionText1);
						Date baseDate = new SimpleDateFormat("MM/dd/yyyy").parse("01/01/1900");
						Date documentDate = new Date(TimeUnit.DAYS.toMillis(serialNumber-2) + baseDate.getTime());
						DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
						String Duedate = dateFormat.format(documentDate);   
						DueDate.click();
						DueDate.sendKeys(Duedate);

						lib.select(ReasonID, hmap.get("Reason"));
						Thread.sleep(1500);
						Notes.sendKeys(hmap.get("Notes"));
					}
				}catch(TimeoutException e) {}
				OBDocSave.click();
				Thread.sleep(2000);
				try {
					driver.switchTo().alert().accept();
				} catch (NoAlertPresentException e) {}
			}								
		
		driver.navigate().refresh();	
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();		
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("JCDocApproval"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		Thread.sleep(2000);
		lib.switchOutOfFrame();	
		Thread.sleep(3000);

		List<WebElement> OBStatus1 = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[4]"));						
		List<WebElement> JCStatus1 = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[5]"));						
		List<WebElement> reviewButtons1 = driver.findElements(By.xpath("//table[contains(@style, 'border-collapse: collapse')]/tbody/tr//td[6]/a/img"));

		for (int i = 0; i < OBStatus1.size(); i++) {
			WebElement StatusOB = OBStatus1.get(i);
			WebElement StatusJC = JCStatus1.get(i);
			WebElement reviewButton = reviewButtons1.get(i);

			if (StatusOB.getText().contains("Approved")&&StatusJC.getText().contains("Pending")) {
				if (reviewButton.isDisplayed()) {
					Thread.sleep(1000);
					reviewButton.click();
					Thread.sleep(1500);			   
					try {
						lib.waitForElementLoad(JCApp);
						String optionText = hmap.get("JCApproval");
						String JCApproval = "//*[@id='DocStatusID'][@value='" + optionText + "']";
						driver.findElement(By.xpath(JCApproval)).click();
						Thread.sleep(1000);	
						saveBtn.click();
						Thread.sleep(2000);	
					}catch(TimeoutException e) {}
				}}
		}

		WebElement AppBtn = driver.findElement(By.xpath("//div[contains(@class, 'RibbonImgBtnWarper')]"));
		if (AppBtn.getAttribute("class").equals("RibbonImgBtnWarper")) {
			ApproveBtn.click();
			Thread.sleep(1000);
		}
	}
	}
}






