package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class EmpMod_NewPlacement {
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;
	
	@FindBy(xpath="//*[@id='tabStripEmployee']/ul/li[2]/a")
	private WebElement PlacementTab;

	@FindBy(xpath="//*[@id='ProjectList']/div/a")
	private WebElement PlusPlacementBtn;
	
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
	
	@FindBy(xpath="//*[@id='ClientID_Display']")
	private WebElement ClientName;
	
	@FindBy(xpath="/html/body/ul[1]/li")
	private WebElement ClientPopup;
	
	@FindBy(xpath="//input[@id='Project_ReferenceNo']")
	private WebElement PORefNum;
	
	@FindBy(xpath="//*[@id='Project_DomainTypeID']")
	private WebElement DomainType;
	
	@FindBy(xpath="//*[@id='Project_JobTitle']")
	private WebElement ProjJobTitle;
	
	@FindBy(xpath="/html/body/ul[5]/li[1]")
	private WebElement JobTitlePopup;
	
	@FindBy(xpath="//*[@id='Project_PlacementTypeID']")
	private WebElement PlacementType;
	
	@FindBy(xpath="//*[@id='Project_OBClassificationID']")
	private WebElement OBJobID;
	
	@FindBy(xpath="//*[@id='Project_StartDate']")
	private WebElement Proj_startDate;
	
	@FindBy(xpath="//*[@id='Project_ScheduledEndDate']")
	private WebElement Proj_EndDate;
	
	@FindBy(xpath="//*[@id='Project_InvoiceMethodID']")
	private WebElement InvMethodID;
	
	@FindBy(xpath="//*[@id='Project_InvoiceFlagID']")
	private WebElement InvFlag;
	
	@FindBy(xpath="//*[@id='Project_InvoiceFrequencyID']")
	private WebElement InvFrequency;
	
	@FindBy(xpath="//*[@id='Project_TimesheetTemplateID']")
	private WebElement TSTempID;
	
	@FindBy(xpath="//*[@id='Project_TimesheetFrequencyID']")
	private WebElement TSFreq;
	
	@FindBy(xpath="//*[@id='ProjectBillRate_BillTypeID']")
	private WebElement BillrateType;
	
	@FindBy(xpath="//*[@id='ProjectBillRate_BillRate']")
	private WebElement Billrate;
	
	@FindBy(xpath="//*[@id='ProjectBillRate_OTBillRate']")
	private WebElement OTBillrate;
	
	@FindBy(xpath="//*[@id='ProjectBillRate_DTBillRate']")
	private WebElement DTBillrate;
	
	@FindBy(xpath="//*[@id='ProjectBillRate_HolidayBR']")
	private WebElement HolidayBillrate;
	
	@FindBy(xpath="//*[@id='ProjectBillRate_TatoBR']")
	private WebElement TATOBillrate;
	
	@FindBy(xpath="//*[@id='ProjectBillRate_TravelTimeBR']")
	private WebElement  TravelBillrate;
	
	@FindBy(xpath="//*[@id='ProjectBillRate_OncallBR']")
	private WebElement OncallBillrate;
	
	@FindBy(xpath="//*[@id='ProjectBillRate_CallBackBR']")
	private WebElement CallbackBillrate;
	
	@FindBy(xpath="//*[@id='ProjectBillRate_ChargeBR']")
	private WebElement ChargeBillrate;
	
	@FindBy(xpath="//*[@id='ProjectBillRate_OrientationBR']")
	private WebElement OrientationBillrate;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_PaymentTypeID']")
	private WebElement PayrateType;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_PayRate']")
	private WebElement Payrate;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_OTRate']")
	private WebElement OTPayrate;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_DTRate']")
	private WebElement DTPayrate;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_HolidayPR']")
	private WebElement HolidayPayrate;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_TatoPR']")
	private WebElement TATOPayrate;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_TravelTimePR']")
	private WebElement TravelPayrate;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_OncallPR']")
	private WebElement OncallPayrate;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_CallBackPR']")
	private WebElement CallbackPayrate;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_ChargePR']")
	private WebElement ChargePayrate;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_OrientationPR']")
	private WebElement OrientationPayrate;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_PerDiemTypeID']")
	private WebElement PerDiemType;
	
	@FindBy(xpath="//*[@id='ProjectPayRate_PerDiem']")
	private WebElement PerDiem;
	
	@FindBy(xpath="//*[@id='Project_StandardHours']")
	private WebElement StandHrs;
	
	@FindBy(xpath="//*[@id='Project_MinGuarantHours']")
	private WebElement MinGuaredHrs;
	
	@FindBy(xpath="//*[@id='Project_NoofShifts']")
	private WebElement NoOfShifts;
	
	@FindBy(xpath="//*[@id='ProjectData_PayJoiningID']")
	private WebElement JoiningBonusID;
	
	@FindBy(xpath="//*[@id='Project_TravelBonus']")
	private WebElement JoiningBonus;
	
	@FindBy(xpath="//*[@id='Project_Address1']")
	private WebElement WorkLocAdd;
	
	@FindBy(xpath="//*[@id='Project_City']")
	private WebElement WorkLocCity;
	
	@FindBy(xpath="//*[@id='Project_CountryID']")
	private WebElement WorkLocCountry;
	
	@FindBy(xpath="//*[@id='Project_StateID']")
	private WebElement WorkLocState;
	
	@FindBy(xpath="//*[@id='Project_ZipCode']")
	private WebElement WorkLocZipCode;
	
	@FindBy(xpath="//*[@id='Project_BillingContact1']")
	private WebElement BillingContact;
	
	@FindBy(xpath="//*[@id='Project_ClientPaymentTerms']")
	private WebElement ClientPayment;
	
	@FindBy(xpath="//*[contains(text(),'Tax/Comm/Misc')]")
	private WebElement TaxTab;
	
	@FindBy(xpath="//input[@id='ProjectData_StateTaxApply'][@value='True']")
	private WebElement StateTaxApply;
	
	@FindBy(xpath="//*[@id='ProjectData_StateTaxTypeID']")
	private WebElement StateTaxType;
	
	@FindBy(xpath="//*[@id='tabPrjOtherDetails']//tr[17]//td[2]/div/div/div")
	private WebElement WorksheetDoc;
	
	@FindBy(xpath="//*[@id='tabPrjOtherDetails']//tr[18]//td[2]/div/div/div")
	private WebElement PODoc;
	
	@FindBy(xpath="//*[@id='Project_VMSRefID']")
	private WebElement VMSRefId;
	
	@FindBy(xpath="//button[@onclick='return CPXWindow_Save(this);']")
	private WebElement SaveButton;
	
	@FindBy(xpath="//a[contains(text(),'Placement Off-Boarding')]")
	private WebElement PlacementOffBoarding;
	
	@FindBy(xpath="//*[contains(text(),'Offboard this project')]")
	private WebElement OffBoardProj;
	
	@FindBy(xpath="//*[@id='EmployeeOffBoard_OffBoardDate']")
	private WebElement OffBoardDate;
	
	@FindBy(xpath="//*[@id='EmployeeOffBoard_ReasonID']")
	private WebElement OffBoardReasonID;
	
	@FindBy(xpath="//*[@id='EmployeeOffBoard_StatusID']")
	private WebElement OffBoardStatusID;
	
	@FindBy(xpath="//*[@id='EmployeeOffBoard_Notes']")
	private WebElement OffBoardNotes;
	
	@FindBy(xpath="//*[@class='t-button t-upload-button']")
	private WebElement UploadBtn;
	
	@FindBy(xpath="//*[contains(text(),'Emp. Status')]")
	private WebElement EmpStatusTab;
	
	@FindBy(xpath="//*[contains(text(),'Change Status')]")
	private WebElement ChangeStatusBtn;
	
	@FindBy(xpath="//*[@id='EmployeeStatus_StatusID']")
	private WebElement EmpStatus_StatusID;
	
	@FindBy(xpath="//*[@id='EmployeeStatus_UserReason']")
	private WebElement EmpStatus_ChangeReason;
		
	public EmpMod_NewPlacement(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void NewPlacement_EmpModule(Map<String,String> hmap) throws Exception{
		
		lib = new Generic_Methods(driver);
		PlacementTab.click();
		PlusPlacementBtn.click();
		lib.switchOutOfFrame();
		Thread.sleep(1500);
		ClientName.sendKeys(hmap.get("Clientname"));
		ClientPopup.click();
			
		String InvOpt =hmap.get("InvoiceOpt");
		String POInvoice = "//input[@id='Project_AddPONumberToInvoice']/following-sibling::label[text()='"+ InvOpt +"']/preceding-sibling::input[@type='radio'][1]";
		driver.findElement(By.xpath(POInvoice)).click();	
		Thread.sleep(1000);
		PORefNum.sendKeys(hmap.get("PO_RefNum"));;
		lib.select(DomainType, hmap.get("DomainTypeID"));
		ProjJobTitle.sendKeys(hmap.get("Domain_JobTitle"));
		JobTitlePopup.click();
		lib.select(PlacementType, hmap.get("Placement_Type"));
		lib.select(OBJobID, hmap.get("OB_JobClassID"));
		Proj_startDate.click();
		Proj_startDate.sendKeys(hmap.get("startDate"));
		Proj_EndDate.click();
		Proj_EndDate.sendKeys(hmap.get("ScheduledEnddate"));
		lib.select(InvMethodID, hmap.get("InvoiceMethodID"));
		lib.select(InvFlag, hmap.get("InvoiceflagType"));
		lib.select(InvFrequency, hmap.get("Invoicefreq"));
		Thread.sleep(500);
		lib.select(TSTempID, hmap.get("TSTemp"));
		lib.select(TSFreq, hmap.get("TSFreq"));
		
		String OBOption = hmap.get("OB_JobClassID");
		if(OBOption.equals("Clinical - Patient Facing")) {
			lib.select(BillrateType, hmap.get("BRType"));
			Billrate.sendKeys(hmap.get("BillRate"));
			HolidayBillrate.sendKeys(hmap.get("Holbillrate"));
			OncallBillrate.sendKeys(hmap.get("Oncallrate"));
			CallbackBillrate.sendKeys(hmap.get("callbackrate"));
			ChargeBillrate.sendKeys(hmap.get("chargerate"));
			OrientationBillrate.sendKeys(hmap.get("orientBr"));
			Thread.sleep(1000);
			lib.select(PayrateType, hmap.get("PRType"));
			Payrate.sendKeys(hmap.get("PayRate"));
			HolidayPayrate.sendKeys(hmap.get("Holidaypr"));
			OncallPayrate.sendKeys(hmap.get("OncallPr"));
			CallbackPayrate.sendKeys(hmap.get("callbackpr"));
			ChargePayrate.sendKeys(hmap.get("Chargepr"));
			OrientationPayrate.sendKeys(hmap.get("orientPr"));	
			lib.select(NoOfShifts, hmap.get("Shifts"));
		}else {
			lib.select(BillrateType, hmap.get("BRType"));
			Billrate.sendKeys(hmap.get("BillRate"));
			HolidayBillrate.sendKeys(hmap.get("Holbillrate"));
			TATOBillrate.sendKeys(hmap.get("TatoBR"));
			TravelBillrate.sendKeys(hmap.get("TravelBR"));
			Thread.sleep(1000);
			lib.select(PayrateType, hmap.get("PRType"));
			Payrate.sendKeys(hmap.get("PayRate"));
			HolidayPayrate.sendKeys(hmap.get("Holidaypr"));
			TATOPayrate.sendKeys(hmap.get("TatoPR"));
			TravelPayrate.sendKeys(hmap.get("TravelPR"));
		}
		lib.select(PerDiemType, hmap.get("PerdiemType"));
		PerDiem.sendKeys(hmap.get("Perdiem"));
		StandHrs.sendKeys(hmap.get("StndHrs"));
		MinGuaredHrs.sendKeys(hmap.get("GuaranteedHrs"));
		
		JoiningBonusID.sendKeys(hmap.get("Joiningdropdown"));
		JoiningBonus.sendKeys(hmap.get("JoiningBonus"));
		
		Thread.sleep(1000);
		WorkLocAdd.sendKeys(hmap.get("WL_Address"));
		WorkLocCity.sendKeys(hmap.get("WL_City"));
		lib.select(WorkLocCountry, hmap.get("WL_Country"));
		lib.select(WorkLocState, hmap.get("WL_State"));
		WorkLocZipCode.sendKeys(hmap.get("WL_Zipcode"));
		Thread.sleep(1000);
		
		BillingContact.sendKeys(hmap.get("Billing_Cont"));
		lib.select(ClientPayment, hmap.get("Clientpayterm"));
		TaxTab.click();
		Thread.sleep(1000);
		String stateTaxOpt =hmap.get("StateTaxOpt");
		String StateTax = "//input[@id='ProjectData_StateTaxApply']/following-sibling::label[text()='"+ stateTaxOpt +"']/preceding-sibling::input[@type='radio'][1]";
		driver.findElement(By.xpath(StateTax)).click();	
		Thread.sleep(500);
		if(StateTaxApply.isSelected()) {
			lib.select(StateTaxType, hmap.get("StateTaxType"));	
		}
		
		WorksheetDoc.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(2000);
		PODoc.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(2000);
		
		VMSRefId.sendKeys(hmap.get("VMS_RefID"));
		Thread.sleep(500);
		SaveButton.click();
		Thread.sleep(1000);
	}
	
	public void NewPlacement_Approval(Map<String,String> hmap) throws Exception {
		
		Thread.sleep(2000);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("NewPlacementText"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("TaskAppTo"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();		
		Thread.sleep(1000);
		ApproveBtn.click();
		
		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("TaskAppTo1"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();	
		Thread.sleep(1000);
		ApproveBtn.click();
	}
	
	public void Placement_OffBoarding(Map<String,String> hmap) throws Exception 
	{	
		lib = new Generic_Methods(driver);
		PlacementOffBoarding.click();
		lib.switchOutOfFrame();
		Thread.sleep(1500);
		OffBoardProj.click();
		Thread.sleep(1000);
		try {
			driver.switchTo().alert().accept();
		}catch(NoAlertPresentException e) {}
		OffBoardDate.click();
		OffBoardDate.sendKeys(hmap.get("Plac_OffBoard"));
		Thread.sleep(1000);
		lib.select(OffBoardReasonID, hmap.get("OffBoard_Reason"));
		Thread.sleep(1000);
		lib.select(OffBoardStatusID, hmap.get("OffBoard_status"));		
		OffBoardNotes.sendKeys(hmap.get("OffBoard_Notes"));
		UploadBtn.click();
		Thread.sleep(1000);
		Runtime.getRuntime().exec(props.getProperty("filepath"));
		Thread.sleep(2000);
		SaveButton.click();
		Thread.sleep(1000);		
	}
	
	public void OffBoarding_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(1500);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("OffBoardTextSearch"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("OffBoardTaskTo"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();		
		Thread.sleep(1000);
		ApproveBtn.click();
		
		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("OffBoardTaskTo1"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();		
		Thread.sleep(1000);
		ApproveBtn.click();
	}
	
	
	public void ChangeStatus_EmpModule(Map<String,String> hmap) throws Exception {		
		lib = new Generic_Methods(driver);
		EmpStatusTab.click();
		Thread.sleep(1000);
		ChangeStatusBtn.click();
		lib.switchOutOfFrame();
		Thread.sleep(1000);
		lib.select(EmpStatus_StatusID, hmap.get("EmpChange_Status"));
		Thread.sleep(1000);
		EmpStatus_ChangeReason.sendKeys(hmap.get("EmpStatus_Desc"));
		SaveButton.click();
		Thread.sleep(1000);		
	}
	
	public void ChangeStatus_EmpMod_Approval(Map<String,String> hmap) throws Exception {
		Thread.sleep(1500);
		MgmtBtn.click();
		Thread.sleep(1000);
		Workflowmenu.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Searchbyword.sendKeys(hmap.get("ChangeStatus_Search"));
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		Taskto.sendKeys(hmap.get("TaskAppBy"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();		
		Thread.sleep(1000);
		ApproveBtn.click();
		
		lib.handlingFrame("frmContent");
		Taskto.clear();
		Taskto.sendKeys(hmap.get("TaskAppBy1"));
		SearchImg.click();
		Thread.sleep(2000);
		ImgBtnTask.click();
		lib.switchOutOfFrame();		
		Thread.sleep(1000);
		ApproveBtn.click();
	}
}
