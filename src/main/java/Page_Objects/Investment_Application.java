package Page_Objects;

import java.io.IOException;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class Investment_Application {

	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath="//a[contains(text(),'My Profile')]")
	private WebElement ProfileTab;

	@FindBy(xpath="//b[contains(text(),'Investment Declaration')]")
	private WebElement InvestmentApp;

	@FindBy(xpath="//*[@value='Start Investment Declaration']")
	private WebElement StartInvtApp;

	@FindBy(xpath="//button[contains(text(),'Continue')]")
	private WebElement Continue;

	@FindBy(xpath="//*[@id='AnnualRentReceived']")
	private WebElement AnnualRentRec;

	@FindBy(xpath="//*[@id='HouseGovtTax']")
	private WebElement HouseGovtTax;

	@FindBy(xpath="//*[@id='LoanInterest']")
	private WebElement LoanInterest;

	@FindBy(xpath="//*[@id='IncomeOtherThanSalary']")
	private WebElement IncomeOtherThanSalary;

	@FindBy(xpath="//*[@id='EducationExcemption']")
	private WebElement EducationEmp;

	@FindBy(xpath="//*[@id='DeclareAmount1']")
	private WebElement CCD_NationalPensionScheme;

	@FindBy(xpath="//*[@id='DeclareAmount2']")
	private WebElement CCC_PF_LIC;

	@FindBy(xpath="//*[@id='DeclareAmount3']")
	private WebElement LifeInsurance;

	@FindBy(xpath="//*[@id='DeclareAmount4']")
	private WebElement PPF;

	@FindBy(xpath="//*[@id='DeclareAmount5']")
	private WebElement NSC_Deposits;

	@FindBy(xpath="//*[@id='DeclareAmount6']")
	private WebElement NHB_DepositScheme;

	@FindBy(xpath="//*[@id='DeclareAmount7']")
	private WebElement NSC_INTEREST;

	@FindBy(xpath="//*[@id='DeclareAmount8']")
	private WebElement ULIP;

	@FindBy(xpath="//*[@id='DeclareAmount9']")
	private WebElement Housing_Loan_Repayment;

	@FindBy(xpath="//*[@id='DeclareAmount10']")
	private WebElement ELSS;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[11].DeclareAmount']")
	private WebElement UTI_Pension_Plan;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[12].DeclareAmount']")
	private WebElement FD;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[13].DeclareAmount']")
	private WebElement Sukanya_Samridhi_Scheme;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[14].DeclareAmount']")
	private WebElement CCD_contribute_NPS;

	@FindBy(xpath="//*[@name='Noteslist[0].Comment']")
	private WebElement Comment_Notes;

	@FindBy(xpath="//*[@id='DeclareAmount24']")
	private WebElement Nat_Defence_Fund;

	@FindBy(xpath="//*[@id='DeclareAmount25']")
	private WebElement PM_Relief_Fund;

	@FindBy(xpath="//*[@id='DeclareAmount26']")
	private WebElement CM_Relief_Fund;

	@FindBy(xpath="//*[@id='DeclareAmount27']")
	private WebElement Nat_Children_Fund;

	@FindBy(xpath="//*[@id='DeclareAmount28']")
	private WebElement Swatch_Bharath_Kosh;

	@FindBy(xpath="//*[@id='DeclareAmount29']")
	private WebElement Clean_Ganga_Fund;

	@FindBy(xpath="//*[@id='DeclareAmount30']")
	private WebElement DrugAbuse_Fund;

	@FindBy(xpath="//*[@id='DeclareAmount31']")
	private WebElement Donation_Renovation;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[31].DeclareAmount']")
	private WebElement Donation_CharitableTrust;

	@FindBy(xpath="//*[@name='Noteslist[1].Comment']")
	private WebElement Donation_CmtNotes;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[10].DeclareAmount']")
	private WebElement Education_Fees;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[15].DeclareAmount']")
	private WebElement Self_80D;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[16].DeclareAmount']")
	private WebElement Parent_80D;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[17].DeclareAmount']")
	private WebElement Dept_80DD;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[18].DeclareAmount']")
	private WebElement SpecDiseases_80DDB;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[19].DeclareAmount']")
	private WebElement Interest_80E;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[20].DeclareAmount']")
	private WebElement Deduction_80U;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[21].DeclareAmount']")
	private WebElement Donation_80GGC;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[22].DeclareAmount']")
	private WebElement Interest_80EEB;

	@FindBy(xpath="//*[@name='Noteslist[2].Comment']")
	private WebElement Notes_Chapter;

	@FindBy(xpath="//*[@value='ADD']")
	private WebElement ADDBtn;

	@FindBy(xpath="//*[@id='LandlordInfo_OwnerName']")
	private WebElement LandlordName;

	@FindBy(xpath="//*[@id='LandlordInfo_OwnerPanCard']")
	private WebElement LandlordPAN_Num;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//button[contains(text(),'Save')]")
	private WebElement SaveLandlordDetails;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//tr[4]/td[2]/input")
	private WebElement AddressText;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//tr[6]/td[2]/input")
	private WebElement CityText;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//tr[7]/td[2]/select")
	private WebElement Country;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//tr[8]/td[2]/select")
	private WebElement State;
	
	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv2']//tr[9]/td[2]/input")
	private WebElement Zipcode;
	
	@FindBy(xpath="//*[@name='InvestmentSectionItemList[32].DeclareAmount']")
	private WebElement RentAmount;

	@FindBy(xpath="//*[@name='InvestmentSectionItemList[32].LandlordPAN']")
	private WebElement LandlordPAN_No;

	@FindBy(xpath="//*[contains(text(),'Copy Rent Amount, LandLord Name and LandLord PAN of First Row')]/following-sibling::input")
	private WebElement Copy_CheckBox;

	@FindBy(xpath="//*[@name='Noteslist[3].Comment']")
	private WebElement Rent_CommentNotes;

	@FindBy(xpath="//*[@onclick='return CPXWindow_Save(this);']")
	private WebElement SaveBtn;

	@FindBy(xpath="//*[@id='HomeLoanInfo_PropValueActual']")
	private WebElement PropertyValue;

	@FindBy(xpath="//*[@id='HomeLoanInfo_LoanActual']")
	private WebElement LoanActual;

	@FindBy(xpath="//*[@id='HomeLoanInfo_LoanTakenOn']")
	private WebElement LoanTakenOn;

	@FindBy(xpath="//*[@id='HomeLoanInfo_PossessionDate']")
	private WebElement LoanPossesionDate;

	@FindBy(xpath="//*[@id='HomeLoanInfo_NameOfLender']")
	private WebElement NameofLender;

	@FindBy(xpath="//*[@id='Address1']")
	private WebElement LenderAddress;
	
	@FindBy(xpath="//*[@id='City']")
	private WebElement LenderCity;
	
	@FindBy(xpath="//*[@id='CountryID']")
	private WebElement Lendercountry;
	
	@FindBy(xpath="//*[@id='StateID']")
	private WebElement LenderState;
	
	@FindBy(xpath="//*[@id='ZipCode']")
	private WebElement LenderZipcode;
	
	@FindBy(xpath="//*[@id='HomeLoanInfo_LenderPan']")
	private WebElement LenderPAN;

	@FindBy(xpath="//*[@id='InvestmentDeclaration_AnnualRentReceived']")
	private WebElement AnnualRentReceived;

	@FindBy(xpath="//*[@id='InvestmentDeclaration_HouseGovtTax']")
	private WebElement HouseTax;

	@FindBy(xpath="//*[@id='InvestmentDeclaration_InterestPaidOnLoan']")
	private WebElement InterestPaidOnLoan;

	@FindBy(xpath="//*[@id='InvestmentDeclaration_OtherIncome']")
	private WebElement OtherIncome;

	@FindBy(xpath="//*[@id='InvestmentDeclaration_OtherRelief']")
	private WebElement Relief_Sec89;

	@FindBy(xpath="//*[@id='InvestmentDeclaration_EduExemptionForChildren']")
	private WebElement EduExmp_children;

	@FindBy(xpath="//*[@class='t-button t-upload-button']")
	private WebElement FileUpload;

	@FindBy(xpath="//*[@name='Noteslist[4].Comment']")
	private WebElement Other_CommentNotes;

	@FindBy(xpath="//*[@class='shm_link001'][@id='150']")
	private WebElement Mgmt;

	@FindBy(xpath="//*[@class='shm_link002'][@id='468']")
	private WebElement workflows;

	@FindBy(xpath="//*[@id='txtInitiatedMgmtSearch']")
	private WebElement SearchByword;

	@FindBy(xpath="//*[@id='txtAssignedTo']")
	private WebElement AssignedBy;

	@FindBy(xpath="//*[@id='txtMgmtTask']")
	private WebElement TaskTo;

	@FindBy(xpath="//*[@id='tabMgmtInProgress']//table/tbody/tr/td[7]/a")
	private WebElement SearchBtn;

	@FindBy(xpath="//table/tbody/tr[1]/td[1]/a")
	private WebElement ImgView;

	@FindBy(xpath="//*[@id='ImgBtnOK']")
	private WebElement ApproveBtn;
	
	@FindBy(xpath="//a[contains(text(),'80C')]")
	private WebElement C80_Tab;
	
	@FindBy(xpath="//a[contains(text(),'80G')]")
	private WebElement G80_Tab;
	
	@FindBy(xpath="//a[contains(text(),'Chapter VIA')]")
	private WebElement ChapterVIA;
	
	@FindBy(xpath="//a[contains(text(),'Rent')]")
	private WebElement RentTab;
	
	@FindBy(xpath="//a[contains(text(),'Other details')]")
	private WebElement OtherdetailsTab;
	
	public Investment_Application(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void Investment_App(Map<String,String> hmap) throws Exception 
	{		
		lib = new Generic_Methods(driver);
		ProfileTab.click();
		Thread.sleep(1000);
		lib.handlingFrame("frmContent");
		Thread.sleep(1500);
		InvestmentApp.click();
		Thread.sleep(1000);
		StartInvtApp.click();
		lib.switchOutOfFrame();
		Thread.sleep(500);

		String TaxReg_Opt=hmap.get("TaxRegime_Type");
		String TaxType = "//td[normalize-space()='"+ TaxReg_Opt +"']//preceding-sibling::input[1]";
		driver.findElement(By.xpath(TaxType)).click();
		Continue.click();
		Thread.sleep(2000);

		if(TaxReg_Opt.equals("New Tax Regime")) {
			AnnualRentRec.sendKeys(hmap.get("New_AnnualRent_Rec"));
			HouseGovtTax.sendKeys(hmap.get("New_HouseTax"));
			LoanInterest.sendKeys(hmap.get("New_IntAmt"));
			IncomeOtherThanSalary.sendKeys(hmap.get("New_IncomeSalary"));
			EducationEmp.sendKeys(hmap.get("New_EduExmp"));
			Thread.sleep(500);
			FileUpload.click();
			Thread.sleep(1000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			Thread.sleep(1500);
		}
		else if(TaxReg_Opt.equals("Old Tax Regime")) {

			String Dec_Type=hmap.get("Declaration_Type");
			String DeclarationType = "//a[contains(text(),'"+ Dec_Type +"')]";

			if(Dec_Type.equals("80C")) {
				driver.findElement(By.xpath(DeclarationType)).click();
				Thread.sleep(500);
				CCD_NationalPensionScheme.sendKeys(hmap.get("80CCD"));
				CCC_PF_LIC.sendKeys(hmap.get("80CCC"));
				LifeInsurance.sendKeys(hmap.get("Life_Insurance"));
				PPF.sendKeys(hmap.get("PPF"));
				NSC_Deposits.sendKeys(hmap.get("NSC_VIII_ISSUE"));
				Thread.sleep(500);
				NHB_DepositScheme.sendKeys(hmap.get("NHB_DEP_SCH"));
				NSC_INTEREST.sendKeys(hmap.get("NSC_INT"));
				ULIP.sendKeys(hmap.get("ULIP"));
				Thread.sleep(500);
				Housing_Loan_Repayment.sendKeys(hmap.get("Housing_Loan_Repayment"));
				ELSS.sendKeys(hmap.get("ELSS"));
				UTI_Pension_Plan.sendKeys(hmap.get("UTI_Pension_Plan"));
				FD.sendKeys(hmap.get("FD"));
				Sukanya_Samridhi_Scheme.sendKeys(hmap.get("Sukanya_Samridhi _Sch"));
				CCD_contribute_NPS.sendKeys(hmap.get("80_CCD(1B)"));
				Thread.sleep(500);
				Comment_Notes.sendKeys(hmap.get("80C_comments"));
			}
			else if(Dec_Type.equals("80G")) {
				driver.findElement(By.xpath(DeclarationType)).click();
				Thread.sleep(500);
				Nat_Defence_Fund.sendKeys(hmap.get("Nat_Def_Fund"));
				PM_Relief_Fund.sendKeys(hmap.get("PM_Relief_Fund"));
				CM_Relief_Fund.sendKeys(hmap.get("CM_Relief_Fund"));
				Thread.sleep(500);
				Nat_Children_Fund.sendKeys(hmap.get("Nat_Children_Fund"));
				Swatch_Bharath_Kosh.sendKeys(hmap.get("Swatch_Bharath_Kosh"));
				Clean_Ganga_Fund.sendKeys(hmap.get("Clean_Ganga_Fund"));
				Thread.sleep(500);
				DrugAbuse_Fund.sendKeys(hmap.get("DrugAbuse_Fund"));
				Donation_Renovation.sendKeys(hmap.get("Don_Renovation"));
				Donation_CharitableTrust.sendKeys(hmap.get("Don_CharitableTrust"));
				Donation_CmtNotes.sendKeys(hmap.get("Don_CmtNotes"));
				Thread.sleep(500);
			}
			else if(Dec_Type.equals("Chapter VIA")) {
				driver.findElement(By.xpath(DeclarationType)).click();
				Thread.sleep(500);
				Education_Fees.sendKeys(hmap.get("Education_Fees"));
				Self_80D.sendKeys(hmap.get("Self_80D"));
				Parent_80D.sendKeys(hmap.get("Parent_80D"));
				Thread.sleep(500);
				Dept_80DD.sendKeys(hmap.get("Dept_80DD"));
				SpecDiseases_80DDB.sendKeys(hmap.get("MedicalAuth_80DDB"));
				Interest_80E.sendKeys(hmap.get("Int_80E"));
				Thread.sleep(500);
				Deduction_80U.sendKeys(hmap.get("Ded_80U"));
				Donation_80GGC.sendKeys(hmap.get("Don_80GGC"));
				Thread.sleep(500);
				Interest_80EEB.sendKeys(hmap.get("Int_80EEB"));
				Notes_Chapter.sendKeys(hmap.get("Notes_Chapter"));
				Thread.sleep(500);
			}
			else if(Dec_Type.equals("Rent")) {
				driver.findElement(By.xpath(DeclarationType)).click();
				ADDBtn.click();
				Thread.sleep(1000);
				LandlordName.sendKeys(hmap.get("Landlord_Name"));
				LandlordPAN_Num.sendKeys(hmap.get("Landlord_PAN"));
				Thread.sleep(500);
				AddressText.sendKeys(hmap.get("Landlord_Add"));
				CityText.sendKeys(hmap.get("Landlord_City"));
				lib.select(Country,hmap.get("Landlord_Country"));
				lib.select(State,hmap.get("Landlord_State"));
				Zipcode.sendKeys(hmap.get("Landlord_Zipcode"));				
				Thread.sleep(500);
				SaveLandlordDetails.click();
				Thread.sleep(1000);
				RentAmount.sendKeys(hmap.get("Rent_Amt"));
				LandlordPAN_No.sendKeys(hmap.get("Landlord_PAN"));
				Thread.sleep(500);
				Copy_CheckBox.click();
				Thread.sleep(500);
				Rent_CommentNotes.sendKeys(hmap.get("Rent_CmtNotes"));
			}
			else if(Dec_Type.equals("Other details")) {	
				driver.findElement(By.xpath(DeclarationType)).click();
				PropertyValue.sendKeys(hmap.get("Prop_Value"));
				LoanActual.sendKeys(hmap.get("Loan_Act"));
				LoanTakenOn.click();
				LoanTakenOn.sendKeys(hmap.get("Loan_TakenOn"));
				LoanPossesionDate.click();
				LoanPossesionDate.sendKeys(hmap.get("Loan_PossesionDate"));
				NameofLender.sendKeys(hmap.get("NameofLender"));
				LenderAddress.sendKeys(hmap.get("LenderAddress"));
				LenderCity.sendKeys(hmap.get("LenderCity"));
				Lendercountry.sendKeys(hmap.get("Lendercountry"));
				LenderState.sendKeys(hmap.get("LenderState"));
				LenderZipcode.sendKeys(hmap.get("LenderZipcode"));
				Thread.sleep(500);
				LenderPAN.sendKeys(hmap.get("LenderPAN"));
				Thread.sleep(500);
				AnnualRentReceived.sendKeys(hmap.get("AnnualRent_Rec"));
				HouseTax.sendKeys(hmap.get("HouseTax"));
				InterestPaidOnLoan.sendKeys(hmap.get("Int_PaidOnLoan"));
				Thread.sleep(500);
				OtherIncome.sendKeys(hmap.get("Other_Inc"));
				Relief_Sec89.sendKeys(hmap.get("Rel_Sec89"));
				EduExmp_children.sendKeys(hmap.get("EduExmp_child"));
				Thread.sleep(500);
				FileUpload.click();
				Thread.sleep(1000);
				Runtime.getRuntime().exec(props.getProperty("filepath1"));
				Thread.sleep(3000);
				Other_CommentNotes.sendKeys(hmap.get("Other_Notes"));	
			}
			else if(Dec_Type.equals("All Tabs")) {	
				C80_Tab.click();
				Thread.sleep(500);
				CCD_NationalPensionScheme.sendKeys(hmap.get("80CCD"));
				CCC_PF_LIC.sendKeys(hmap.get("80CCC"));
				LifeInsurance.sendKeys(hmap.get("Life_Insurance"));
				PPF.sendKeys(hmap.get("PPF"));
				NSC_Deposits.sendKeys(hmap.get("NSC_VIII_ISSUE"));
				Thread.sleep(500);
				NHB_DepositScheme.sendKeys(hmap.get("NHB_DEP_SCH"));
				NSC_INTEREST.sendKeys(hmap.get("NSC_INT"));
				ULIP.sendKeys(hmap.get("ULIP"));
				Thread.sleep(500);
				Housing_Loan_Repayment.sendKeys(hmap.get("Housing_Loan_Repayment"));
				ELSS.sendKeys(hmap.get("ELSS"));
				UTI_Pension_Plan.sendKeys(hmap.get("UTI_Pension_Plan"));
				FD.sendKeys(hmap.get("FD"));
				Sukanya_Samridhi_Scheme.sendKeys(hmap.get("Sukanya_Samridhi _Sch"));
				CCD_contribute_NPS.sendKeys(hmap.get("80_CCD(1B)"));
				Thread.sleep(500);
				Comment_Notes.sendKeys(hmap.get("80C_comments"));
				
				Thread.sleep(500);
				G80_Tab.click();
				Nat_Defence_Fund.sendKeys(hmap.get("Nat_Def_Fund"));
				PM_Relief_Fund.sendKeys(hmap.get("PM_Relief_Fund"));
				CM_Relief_Fund.sendKeys(hmap.get("CM_Relief_Fund"));
				Thread.sleep(500);
				Nat_Children_Fund.sendKeys(hmap.get("Nat_Children_Fund"));
				Swatch_Bharath_Kosh.sendKeys(hmap.get("Swatch_Bharath_Kosh"));
				Clean_Ganga_Fund.sendKeys(hmap.get("Clean_Ganga_Fund"));
				Thread.sleep(500);
				DrugAbuse_Fund.sendKeys(hmap.get("DrugAbuse_Fund"));
				Donation_Renovation.sendKeys(hmap.get("Don_Renovation"));
				Donation_CharitableTrust.sendKeys(hmap.get("Don_CharitableTrust"));
				Donation_CmtNotes.sendKeys(hmap.get("Don_CmtNotes"));
			
				Thread.sleep(500);
				ChapterVIA.click();
				Education_Fees.sendKeys(hmap.get("Education_Fees"));
				Self_80D.sendKeys(hmap.get("Self_80D"));
				Parent_80D.sendKeys(hmap.get("Parent_80D"));
				Thread.sleep(500);
				Dept_80DD.sendKeys(hmap.get("Dept_80DD"));
				SpecDiseases_80DDB.sendKeys(hmap.get("MedicalAuth_80DDB"));
				Interest_80E.sendKeys(hmap.get("Int_80E"));
				Thread.sleep(500);
				Deduction_80U.sendKeys(hmap.get("Ded_80U"));
				Donation_80GGC.sendKeys(hmap.get("Don_80GGC"));
				Thread.sleep(500);
				Interest_80EEB.sendKeys(hmap.get("Int_80EEB"));
				Notes_Chapter.sendKeys(hmap.get("Notes_Chapter"));
				Thread.sleep(500);
				
				RentTab.click();
				Thread.sleep(500);
				ADDBtn.click();
				Thread.sleep(3000);
				LandlordName.sendKeys(hmap.get("Landlord_Name"));
				LandlordPAN_Num.sendKeys(hmap.get("Landlord_PAN"));
				Thread.sleep(500);
				AddressText.sendKeys(hmap.get("Landlord_Add"));
				CityText.sendKeys(hmap.get("Landlord_City"));
				Country.sendKeys(hmap.get("Landlord_Country"));
				State.sendKeys(hmap.get("Landlord_State"));
				Zipcode.sendKeys(hmap.get("Landlord_Zipcode"));		
				Thread.sleep(500);
				SaveLandlordDetails.click();
				Thread.sleep(1000);
				RentAmount.sendKeys(hmap.get("Rent_Amt"));
				LandlordPAN_No.sendKeys(hmap.get("Landlord_PAN"));
				Thread.sleep(500);
				Copy_CheckBox.click();
				Thread.sleep(500);
				Rent_CommentNotes.sendKeys(hmap.get("Rent_CmtNotes"));
				Thread.sleep(500);
				
				OtherdetailsTab.click();
				Thread.sleep(500);
				PropertyValue.sendKeys(hmap.get("Prop_Value"));
				LoanActual.sendKeys(hmap.get("Loan_Act"));
				LoanTakenOn.click();
				LoanTakenOn.sendKeys(hmap.get("Loan_TakenOn"));
				LoanPossesionDate.click();
				LoanPossesionDate.sendKeys(hmap.get("Loan_PossesionDate"));
				NameofLender.sendKeys(hmap.get("NameofLender"));
				LenderAddress.sendKeys(hmap.get("LenderAddress"));
				LenderCity.sendKeys(hmap.get("LenderCity"));
				lib.select(Lendercountry,hmap.get("Lendercountry"));
				lib.select(LenderState,hmap.get("LenderState"));
				LenderZipcode.sendKeys(hmap.get("LenderZipcode"));
				Thread.sleep(500);
				LenderPAN.sendKeys(hmap.get("LenderPAN"));
				Thread.sleep(500);
				AnnualRentReceived.sendKeys(hmap.get("AnnualRent_Rec"));
				HouseTax.sendKeys(hmap.get("HouseTax"));
				InterestPaidOnLoan.sendKeys(hmap.get("Int_PaidOnLoan"));
				Thread.sleep(500);
				OtherIncome.sendKeys(hmap.get("Other_Inc"));
				Relief_Sec89.sendKeys(hmap.get("Rel_Sec89"));
				EduExmp_children.sendKeys(hmap.get("EduExmp_child"));
				Thread.sleep(500);
				FileUpload.click();
				Thread.sleep(1000);
				Runtime.getRuntime().exec(props.getProperty("filepath1"));
				Thread.sleep(3000);
				Other_CommentNotes.sendKeys(hmap.get("Other_Notes"));	
			}
			SaveBtn.click();
			Thread.sleep(1500);
		}	
	}
	
	public void Invt_Declaration_Approval(Map<String,String> hmap) throws InterruptedException, IOException{
		Thread.sleep(1500);
		Mgmt.click();
		Thread.sleep(2000);
		workflows.click();
		lib = new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		Thread.sleep(1000);
		SearchByword.sendKeys(hmap.get("InvtDec_search"));
		driver.findElement(By.xpath("/html/body/ul[1]/li/a")).click();
		AssignedBy.sendKeys(hmap.get("Assignedby"));
		TaskTo.sendKeys(hmap.get("Invt_TaskTo"));
		SearchBtn.click();
		Thread.sleep(1500);
		ImgView.click();
		lib.switchOutOfFrame();
		Thread.sleep(1500);
		ApproveBtn.click();
		Thread.sleep(1500);
	}
	
}
