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

public class StateW4_EmpModule {	
	WebDriver driver;
	Generic_Methods lib;
	Properties  props;
	Read_ConfigProperties_File Readprop;

	@FindBy(xpath="//*[@id='tabStripEmployee']/ul/li[4]")
	private WebElement DocTab;

	@FindBy(xpath="//*[contains(text(),'State W4')]")
	private WebElement StateW4Tab;

	@FindBy(xpath="//*[contains(text(),'New State W4')]")
	private WebElement NewStateW4Tab;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']/table[1]/tbody/tr[1]")
	private WebElement W4getText;

	@FindBy(xpath="//*[@id='EmployeeStateW4_StateW4Year']")
	private WebElement EmpStateW4Year;

	@FindBy(xpath="//*[@name='EmployeeStateW4.intParameter4']")
	private WebElement SWRegAllowancesA;

	@FindBy(xpath="//*[@name='EmployeeStateW4.intParameter5']")
	private WebElement SWRegAllowancesB;
	
	@FindBy(xpath="//*[@id='strCalender']")
	private WebElement SWDateofHire;
	
	@FindBy(xpath="//*[@id='NYStateAmount']")
	private WebElement NoofAllowances;
	
	@FindBy(xpath="//*[@id='W4TotalExempt']")
	private WebElement ClaimDep;
	
	@FindBy(xpath="//*[@id='moneyParameter1']")
	private WebElement NebraskaonePension;
	
	@FindBy(xpath="//*[@id='intParameter6']")
	private WebElement WorkingSpouse;
	
	@FindBy(xpath="//*[@id='W4ExemptPersonal']")
	private WebElement PersonalExemption;
	
	@FindBy(xpath="//*[@id='YonkersStateAmount']")
	private WebElement Allowancesself;
	
	@FindBy(xpath="//*[@id='Totalnumber']")
	private WebElement MNHeadofHousehold;
	
	@FindBy(xpath="//*[@id='intParameter4']")
	private WebElement FilingJointly;
	
	@FindBy(xpath="//*[@id='NYCityAmount']")
	private WebElement ItemizedDed;
	
	@FindBy(xpath="//*[@id='int5']")
	private WebElement Sec1ForSpouse;

	@FindBy(xpath="//*[@id='EmployeeStateW4_WithheldAmount']")
	private WebElement SWAddAmount;
	
	@FindBy(xpath="//*[@id='WithheldAmount']")
	private WebElement WithheldAmt;
	
	@FindBy(xpath="//*[@id='strParam2']")
	private WebElement LegalRes;

	@FindBy(xpath="//*[@id='IsW4CertifiedGeneral']")
	private WebElement SWICertifyGen;

	@FindBy(xpath="//*[@id='IsW4CertifiedCivil']")
	private WebElement SWTaxClaimExp;
	
	@FindBy(xpath="//*[@id='IsRedetermination']")
	private WebElement SWIsRedetermination;

	@FindBy(xpath="//*[@id='EmployeeStateW4_intParameter1']")
	private WebElement SWAllowances;

	@FindBy(xpath="//*[@id='IsW4CertExmptWitholding']")
	private WebElement SWExmptwithholding;

	@FindBy(xpath="//*[@id='EmployeeStateW4_intParameter2']")
	private WebElement NoOfAllowances;
	
	@FindBy(xpath="//*[@id='EmployeeStateW4_intParameter3']")
	private WebElement SWDependents;
	
	@FindBy(xpath="//*[@id='EmployeeStateW4_intParameter4']")
	private WebElement SWAddAllowances;

	@FindBy(xpath="//*[@id='EmployeeStateW4_W4ExemptPersonal']")
	private WebElement SWTtlpersonal;

	@FindBy(xpath="//*[@id='EmployeeStateW4_W4ExemptAgeBlindness']")
	private WebElement SWTotNumClaims;

	@FindBy(xpath="//*[@id='IsBothSpouses']")
	private WebElement ExmpFedandIncomeTax;
	
	@FindBy(xpath="//*[@id='EmployeeStateW4_strParameter2']")
	private WebElement MNResName;

	@FindBy(xpath="//*[@id='EmployeeStateW4_NYStateAmount']")
	private WebElement NYstateAmt;

	@FindBy(xpath="//*[@id='EmployeeStateW4_NYCityAmount']")
	private WebElement NYCityAmt;

	@FindBy(xpath="//*[@id='EmployeeStateW4_YonkersStateAmount']")
	private WebElement YonkerstateAmt;
	
	@FindBy(xpath="//*[@id='EmployeeStateW4_moneyParameter1']")
	private WebElement SWMoneyPar;
	
	@FindBy(xpath="//*[@id='EmployeeStateW4_moneyParameter2']")
	private WebElement SWMoneyParamtr;
	
	@FindBy(xpath="//*[@id='IsMoreJobsOrSpouseWorks']")
	private WebElement SWIsMoreJobsorSpouses;

	@FindBy(xpath="//*[@id='EmployeeStateW4_W4ChildX2000']")
	private WebElement ClaimDependentsChildren;

	@FindBy(xpath="//*[@id='EmployeeStateW4_W4DependentX500']")
	private WebElement ClaimDependents;

	@FindBy(xpath="//*[@id='EmployeeStateW4_W4OtherIncome']")
	private WebElement AdjustmentsOtherincome;

	@FindBy(xpath="//*[@id='EmployeeStateW4_W4Deductions']")
	private WebElement AdjustmentsDeductions;

	@FindBy(xpath="//*[@id='EmployeeStateW4_W4ExtraWithholding']")
	private WebElement AdjustmentsWithHoldings;
	
	@FindBy(xpath="//*[@id='IntParamtxt1']")
	private WebElement GAtxt1;
	
	@FindBy(xpath="//*[@id='IntParamtxt2']")
	private WebElement GAtxt2;

	@FindBy(xpath="//*[@id='IsYoueself']")
	private WebElement NJW4CheckBox;

	@FindBy(xpath="//*[@class='t-button t-upload-button']")
	private WebElement StateW4FileUpload;
	
	@FindBy(xpath="//*[@id='EmployeeStateW4_W4MaritalStatusID']")
	private WebElement SWMaritalID;
	
	@FindBy(xpath="//*[@id='IsMoreJobsOrSpouseWorks']")
	private WebElement SWIsMoreJobs;
	
	@FindBy(xpath="//*[@id='EmployeeStateW4_W4ChildX2000']")
	private WebElement SWchildx2000;
	
	@FindBy(xpath="//*[@id='EmployeeStateW4_W4DependentX500']")
	private WebElement SWchildx500;
	
	@FindBy(xpath="//*[@id='EmployeeStateW4_W4OtherIncome']")
	private WebElement SWOtherIncome;
	
	@FindBy(xpath="//*[@id='EmployeeStateW4_W4Deductions']")
	private WebElement SWDeductions;
	
	@FindBy(xpath="//*[@id='EmployeeStateW4_W4ExtraWithholding']")
	private WebElement SWExtraWithHolding;
	
	@FindBy(xpath="//*[@type='submit']")
	private WebElement SaveBtn;
	
	@FindBy(xpath="//*[@id='IsBothSpouses']")
	private WebElement SWBothSpouses;

	@FindBy(xpath="//*[@id='EmployeeStateW4_strParameter1']")
	private WebElement SWInstructionLetter;

	@FindBy(xpath="//*[@id='EmployeeStateW4_W4TotalExempt']")
	private WebElement SWTotNum;
	
	@FindBy(xpath="//*[@id='gridEmployeeStateW4List']/table/tbody/tr[1]/td/a[1]")
	private WebElement StateW4View;
	
	@FindBy(xpath="//*[@id='intParameter1']")
	private WebElement Sec1Dependent;

	@FindBy(xpath="//*[@id='EmployeeStateW4_W4ExemptPersonal']")
	private WebElement W4ExemptPersonal;

	@FindBy(xpath="//*[@id='EmployeeStateW4_intParameter2']")
	private WebElement MNAllowances;

	@FindBy(xpath="//*[@id='EmployeeStateW4_intParameter6']")
	private WebElement CDIBEnrollmentNum;


	public StateW4_EmpModule(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void StateW4_EmployeeModule(Map<String,String> hmap) throws Exception {
		lib = new Generic_Methods(driver);
		DocTab.click();
		Thread.sleep(1500);
		StateW4Tab.click();
		Thread.sleep(1500);

		NewStateW4Tab.click();
		lib.switchOutOfFrame();
		Thread.sleep(1500);
		WebElement text=W4getText;
		String Location=text.getText();
		System.out.println(Location);
		
		//California
		if (Location.equals("State Name : California"))
		{	
			Thread.sleep(1000);
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));
			String ExpValue=hmap.get("California_WithHoldingStatus");
			String ExmpOpt = "//*[@id='intParameter1']//following::label[normalize-space()='"+ ExpValue +"']/preceding-sibling::input[1]";
			driver.findElement(By.xpath(ExmpOpt)).click();	

			String value = hmap.get("California_FillOption"); 
			if (value.equalsIgnoreCase("Fill 1&2")) {
				SWRegAllowancesA.sendKeys(hmap.get("Est_Deductions_A"));
				SWRegAllowancesB.sendKeys(hmap.get("Est_Deductions_B"));
				SWAddAmount.sendKeys(hmap.get("Additional_Amount"));
			}
			else if(value.equalsIgnoreCase("3")) {
				SWRegAllowancesA.sendKeys(hmap.get("Est_Deductions_A"));
				SWRegAllowancesB.sendKeys(hmap.get("Est_Deductions_B"));
				SWAddAmount.sendKeys(hmap.get("Additional_Amount"));
				SWExmptwithholding.click();
			}
			else if(value.equalsIgnoreCase("4")) {
				SWRegAllowancesA.sendKeys(hmap.get("Est_Deductions_A"));
				SWRegAllowancesB.sendKeys(hmap.get("Est_Deductions_B"));
				SWAddAmount.sendKeys(hmap.get("Additional_Amount"));
				NJW4CheckBox.click();
			}	
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}else if (Location.equals("State Withholdings - GA"))
		{	
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			String value = hmap.get("Georgia_Scenerios"); 
			if (value.equalsIgnoreCase("Data")) {			
			String ExpValue=hmap.get("GA_Maritalstatus");
			String ExmpOpt = "//*[@name='EmployeeStateW4.W4ExemptAgeBlindness'][@value='" + ExpValue + "']";
			driver.findElement(By.xpath(ExmpOpt)).click();	
			
			GAtxt1.sendKeys(hmap.get("GA_MaritalStatus_Num"));
			
			SWAllowances.sendKeys(hmap.get("GA_DepAllowances"));
			SWAddAmount.sendKeys(hmap.get("GA_AddAmt"));	
			NYCityAmt.sendKeys(hmap.get("GA_AddAllowances"));
			
			String ChkBox=hmap.get("GA_StndDedChkBoxOpt");
			String ChkBoxOpt = "//input[@type='checkbox' and contains(following-sibling::text(), '" + ChkBox + "')]";
			driver.findElement(By.xpath(ChkBoxOpt)).click();	
			
			SWMoneyPar.sendKeys(hmap.get("GA_FedEstDed"));
			NYstateAmt.sendKeys(hmap.get("GA_StndDed"));
			YonkerstateAmt.sendKeys(hmap.get("GA_AllowableDed"));
			SWMoneyParamtr.sendKeys(hmap.get("GA_TaxableIncome"));				
			
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			}else {
				lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

				String ExpValue=hmap.get("GA_Maritalstatus");
				String ExmpOpt = "//*[@name='EmployeeStateW4.W4ExemptAgeBlindness'][@value='" + ExpValue + "']";
				driver.findElement(By.xpath(ExmpOpt)).click();	
				
				GAtxt1.sendKeys(hmap.get("GA_MaritalStatus_Num"));
				
				SWAllowances.sendKeys(hmap.get("GA_DepAllowances"));
				SWAddAmount.sendKeys(hmap.get("GA_AddAmt"));	
				NYCityAmt.sendKeys(hmap.get("GA_AddAllowances"));
				
				String ChkBox=hmap.get("GA_StndDedChkBoxOpt");
				String ChkBoxOpt = "//input[@type='checkbox' and contains(following-sibling::text(), '" + ChkBox + "')]";
				driver.findElement(By.xpath(ChkBoxOpt)).click();	
				
				SWMoneyPar.sendKeys(hmap.get("GA_FedEstDed"));
				NYstateAmt.sendKeys(hmap.get("GA_StndDed"));
				YonkerstateAmt.sendKeys(hmap.get("GA_AllowableDed"));
				SWMoneyParamtr.sendKeys(hmap.get("GA_TaxableIncome"));	
				
				SWICertifyGen.click();
				SWTaxClaimExp.click();
				if(SWTaxClaimExp.isSelected()) {
					SWInstructionLetter.sendKeys(hmap.get("GA_StateofRes"));						
				}	
				StateW4FileUpload.click();
				Thread.sleep(1500);
				Runtime.getRuntime().exec(props.getProperty("filepath1"));
				Thread.sleep(3000);
				SaveBtn.click();
			}			
		}
		//Illinois
		else if (Location.equals("State Name : Illinois"))
		{	
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			String value = hmap.get("Georgia_Scenerios"); 
			if (value.equalsIgnoreCase("Data")) 
			{		
			String ChkBox=hmap.get("IL_PerAllowances1");
			String ChkBoxOpt = "//input[@type='checkbox']/following::label[normalize-space() = '" + ChkBox + "']/preceding-sibling::input[@type='checkbox'][1]";
			driver.findElement(By.xpath(ChkBoxOpt)).click();
				
			SWTtlpersonal.sendKeys(hmap.get("IL_Dependents"));
			SWTotNumClaims.sendKeys(hmap.get("IL_TotalNoPerAllowances"));
			
			String ChkBox1=hmap.get("IL_AddAllowances");
			String AddAllowancesOpt = "//label[contains(text(),\""+ ChkBox1 +"\")]/preceding-sibling::input[@type='checkbox'][1]";
			driver.findElement(By.xpath(AddAllowancesOpt)).click();
			
			NYstateAmt.sendKeys(hmap.get("w4Ded"));
			SWAllowances.sendKeys(hmap.get("IL_TotalAddAllowances"));
			SWAddAmount.sendKeys(hmap.get("IL_AddAmt"));
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}else {
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			String ChkBox=hmap.get("IL_PerAllowances");
			String ChkBoxOpt = "//input[@type='checkbox']/following::label[normalize-space() = '" + ChkBox + "']/preceding-sibling::input[@type='checkbox'][1]";
			driver.findElement(By.xpath(ChkBoxOpt)).click();
				
			SWTtlpersonal.sendKeys(hmap.get("IL_Dependents"));
			SWTotNumClaims.sendKeys(hmap.get("IL_TotalNoPerAllowances"));
			
			String ChkBox1=hmap.get("IL_AddAllowances");
			String AddAllowancesOpt = "//label[contains(text(),\""+ ChkBox1 +"\")]/preceding-sibling::input[@type='checkbox'][1]";
			driver.findElement(By.xpath(AddAllowancesOpt)).click();
			
			NYstateAmt.sendKeys(hmap.get("w4Ded"));
			SWAllowances.sendKeys(hmap.get("IL_TotalAddAllowances"));
			SWAddAmount.sendKeys(hmap.get("IL_AddAmt"));
			ExmpFedandIncomeTax.click();
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		}
		else if (Location.equals("State Name : New Jersey"))
		{	
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));
			String ExpValue=hmap.get("NewJersey_WithHoldindStatus");
			String ExmpOpt = "//*[@id='intParameter1'][@value='" + ExpValue + "']";
			driver.findElement(By.xpath(ExmpOpt)).click();									
			Thread.sleep(1000);
			SWInstructionLetter.sendKeys(hmap.get("NJ_InsLetter"));
			SWTotNum.sendKeys(hmap.get("NJ_Allowances"));
			SWAddAmount.sendKeys(hmap.get("NJ_AddAmount"));			

			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}		
		else if (Location.equals("State Name : Virginia"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));
			String value = hmap.get("Virginia_Option"); 
			System.out.println(value);
			if (value.equalsIgnoreCase("Data")) {
				String Allowance=hmap.get("Virginia_ClaimYourself");
				String AllYourself = "//*[@id='IsYoueself'][@value='" + Allowance + "']";
				driver.findElement(By.xpath(AllYourself)).click();	

				String Depexp=hmap.get("VA_ClaimSpouse");
				String OneJob = "//*[@id='IsBothSpouses'][@value='" + Depexp + "']";
				driver.findElement(By.xpath(OneJob)).click();

				SWAllowances.sendKeys(hmap.get("VA_Dependents"));
				SWAddAmount.sendKeys(hmap.get("SWAddAmt"));
				StateW4FileUpload.click();
				Thread.sleep(1500);
				Runtime.getRuntime().exec(props.getProperty("filepath1"));
				Thread.sleep(3000);
				SaveBtn.click();
			}else{
				String Allowance=hmap.get("Virginia_ClaimYourself");
				String AllYourself = "//*[@id='IsYoueself'][@value='" + Allowance + "']";
				driver.findElement(By.xpath(AllYourself)).click();	

				String Depexp=hmap.get("VA_ClaimSpouse");
				String OneJob = "//*[@id='IsBothSpouses'][@value='" + Depexp + "']";
				driver.findElement(By.xpath(OneJob)).click();

				SWAllowances.sendKeys(hmap.get("VA_Dependents"));
				SWAddAmount.sendKeys(hmap.get("SWAddAmt"));

				SWICertifyGen.click();
				SWTaxClaimExp.click();

				StateW4FileUpload.click();
				Thread.sleep(1500);
				Runtime.getRuntime().exec(props.getProperty("filepath1"));
				Thread.sleep(3000);
				SaveBtn.click();	
			}
		}else if (Location.equals("State Name : New York"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			String ExpValue=hmap.get("NewJersey_WithHoldingStatus");
			String ExmpOpt = "//*[@id='intParameter3'][@value='" + ExpValue + "']";
			driver.findElement(By.xpath(ExmpOpt)).click();

			String Radioopt=hmap.get("NY_ResOfNYcity");
			String W4radioBox = "//*[@id='IsResidentNY'][@value='" + Radioopt + "']";
			driver.findElement(By.xpath(W4radioBox)).click();	

			String Radioopt1=hmap.get("NY_ResOfYonkercity");
			String W4radioBox1 = "//*[@id='IsResidentYonkers'][@value='" + Radioopt1 + "']";
			driver.findElement(By.xpath(W4radioBox1)).click();

			SWAllowances.sendKeys(hmap.get("NY_TotalAllowances"));
			NoOfAllowances.sendKeys(hmap.get("NY_Allowances"));				
			NYstateAmt.sendKeys(hmap.get("NY_StateAmt"));
			NYCityAmt.sendKeys(hmap.get("NY_CityAmt"));
			YonkerstateAmt.sendKeys(hmap.get("NY_YonkersAmt"));

			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Maryland
		else if (Location.equals("State Name : Maryland"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));
			
			String MaritalOpt =hmap.get("Maryland_MaritalStatus");
			String MaritalOption = "//*[@id='intParameter1']/following-sibling::label[contains(text(),'"+ MaritalOpt +"')]/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(MaritalOption)).click();
		
			SWIsMoreJobsorSpouses.click();				
			ClaimDependentsChildren.sendKeys(hmap.get("W4x2000"));
			ClaimDependents.sendKeys(hmap.get("W4x500"));	
			AdjustmentsOtherincome.sendKeys(hmap.get("w4Otherinc"));
			AdjustmentsDeductions.sendKeys(hmap.get("w4Ded"));
			AdjustmentsWithHoldings.sendKeys(hmap.get("w4Withholdings"));
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//North Carolina
		else if (Location.equals("State Name : North Carolina"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			String MaritalStatusValue=hmap.get("NorthCarolina_MaritalStatus");
			String ExmpOpt = "//input[@type='radio']/following::label[normalize-space()='" + MaritalStatusValue + "']/preceding-sibling::input[@type='radio']";
			driver.findElement(By.xpath(ExmpOpt)).click();									
			Thread.sleep(1000);
			SWTotNum.sendKeys(hmap.get("NJ_Allowances"));
			SWAddAmount.sendKeys(hmap.get("NJ_AddAmount"));			
			
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Massachusetts
		else if (Location.equals("State Name : Massachusetts"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			String Allowance=hmap.get("Massachusetts_ClaimYourself");
			String ClaimExpSelf = "//label[text()='"+ Allowance +"']/preceding-sibling::input[@id='intParameter1'][@type='radio'][1]";
			driver.findElement(By.xpath(ClaimExpSelf)).click();	
			
			String Depexp=hmap.get("MA_ClaimForSpouse");
			String ClaimexpSpouse = "//label[text()='"+ Depexp +"']/preceding-sibling::input[@id='intParameter2'][@type='radio'][1]";
			driver.findElement(By.xpath(ClaimexpSpouse)).click();

			SWTtlpersonal.sendKeys(hmap.get("MA_Dependents"));
			SWAddAmount.sendKeys(hmap.get("MA_AddWithHoldings"));
			
			String Status=hmap.get("MA_Status");
			String StatusMA = "//td[@class='display-field']//input[@data-val-required='"+ Status +"']";
			driver.findElement(By.xpath(StatusMA)).click();
										
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Ohio
		else if (Location.equals("State Name : Ohio"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			SWInstructionLetter.sendKeys(hmap.get("Ohio_DistOfResidence"));
			NoOfAllowances.sendKeys(hmap.get("OH_SchoolDistNo"));

			String Radioopt=hmap.get("OH_PerExmp_Yourself");
			String W4radioBox = "//*[@id='IsYoueself'][@value='" + Radioopt + "']";
			driver.findElement(By.xpath(W4radioBox)).click();

			String Radioopt1=hmap.get("OH_PerExmp_Spouse");
			String W4radioBox1 = "//*[@id='IsBothSpouses'][@value='" + Radioopt1 + "']";
			driver.findElement(By.xpath(W4radioBox1)).click();
			
			SWTotNum.sendKeys(hmap.get("OH_ExmpDependents"));
			SWAddAmount.sendKeys(hmap.get("OH_AddWithHoldings"));
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Minnesota
		else if (Location.equals("State Name : Minnesota"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));
			String MNStatus=hmap.get("Minnesota_MaritalStatus");
			String MinnesotaMaritalstatus = "//input[@id='EmployeeStateW4_W4MaritalStatusID'][@value='"+ MNStatus +"']";
			driver.findElement(By.xpath(MinnesotaMaritalstatus)).click();
			
			String value = hmap.get("MN_SectionSelection"); 
			if (value.equalsIgnoreCase("Section 1")) 
			{		
			W4ExemptPersonal.sendKeys(hmap.get("MN_Dependents"));
			MNAllowances.sendKeys(hmap.get("MN_Allowances"));
			SWAddAmount.sendKeys(hmap.get("MN_AddWithHoldings"));
			
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
			}else if(value.equalsIgnoreCase("Section 2"))
			{	
			W4ExemptPersonal.sendKeys(hmap.get("MN_Dependents"));
			MNAllowances.sendKeys(hmap.get("MN_Allowances"));
			SWAddAmount.sendKeys(hmap.get("MN_AddWithHoldings"));
						
			String MNExmp=hmap.get("MN_ExmpWithHoldings");
			String MNExmpstatus = "//input[@id='EmployeeStateW4_intParameter4'][@value='"+ MNExmp +"']";
			driver.findElement(By.xpath(MNExmpstatus)).click();
			if(SWInstructionLetter.isEnabled()) {
				SWInstructionLetter.sendKeys("MN");
			}if(MNResName.isEnabled()) {
				MNResName.sendKeys(hmap.get("MN_ResName"));
				CDIBEnrollmentNum.sendKeys(hmap.get("MN_CDIBEnrollmentNumber"));
			}
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		}
		//Arizona
		else if (Location.equals("State Name : Arizona"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));
			String value = hmap.get("Arizona_Scenerios"); 
			if (value.equalsIgnoreCase("Data")) 
			{				
			String AZRate=hmap.get("AZ_WithHoldingsRate");
			String ArizonaRate = "//*[@id='intParameter1']/following-sibling::label[contains(text(),'"+ AZRate +"')]/preceding-sibling::input[@type='radio']";
			driver.findElement(By.xpath(ArizonaRate)).click();				
			SWAddAmount.sendKeys(hmap.get("AZ_AdditionalAmt"));
		}else if(value.equalsIgnoreCase("ChkBox")){
			String AZRate=hmap.get("AZ_WithHoldingsRate");
			String ArizonaRate = "//*[@id='intParameter1']/following-sibling::label[contains(text(),'"+ AZRate +"')]/preceding-sibling::input[@type='radio']";
			driver.findElement(By.xpath(ArizonaRate)).click();				
			SWAddAmount.sendKeys(hmap.get("AZ_AdditionalAmt"));
			SWICertifyGen.click();
		}
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();	
		}
		//Indiana
		else if (Location.equals("State Name : Indiana"))
		{	
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			String ClaimYourself=hmap.get("Indiana_ExmpforYourself");
			String ExmpSelf = "//*[@id='IsYoueself']/following-sibling::label[text()='"+ ClaimYourself +"']/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(ExmpSelf)).click();

			String ClaimSpouse=hmap.get("IN_ExmpforSpouse");
			String ExmpSpouse = "//*[@id='IsBothSpouses']/following-sibling::label[text()='"+ ClaimSpouse +"']/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(ExmpSpouse)).click();

			SWAllowances.sendKeys(hmap.get("IN_Dependents"));
			
			String AddExmp=hmap.get("IN_AdditionalExmp");
			String AdditionalExemption = "//*[@id='IsHeadFamily']/following-sibling::label[normalize-space()=\""+ AddExmp +"\"]/preceding-sibling::input[@type='checkbox'][1]";
			driver.findElement(By.xpath(AdditionalExemption)).click();
			
			NoOfAllowances.sendKeys(hmap.get("IN_ExmpForQualifyingDep"));				
			SWDependents.sendKeys(hmap.get("IN_ExmpForAdoptedQualifyingDep"));
			NYstateAmt.sendKeys(hmap.get("IN_AddStateWithHoldings"));
			NYCityAmt.sendKeys(hmap.get("IN_AddCountryWithHoldings"));
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();			
			}
		//Michigan
		else if (Location.equals("State Name : Michigan"))
		{	
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			String ExpValue=hmap.get("MI_NewEmp");
			String ExmpOpt = "//*[@id='IsNewEmployee'][@value='" + ExpValue + "']";
			driver.findElement(By.xpath(ExmpOpt)).click();					
			if(SWDateofHire.isEnabled()) {
				SWDateofHire.click();
				SWDateofHire.sendKeys(hmap.get("MI_DateofHire"));
				}	
			String value = hmap.get("Michigan_Scenerios"); 
			if (value.equalsIgnoreCase("Data")) 
			{			
				SWTotNum.sendKeys(hmap.get("SWDependents"));
				SWAddAmount.sendKeys(hmap.get("SWAddAmt"));	
			}else if(value.equalsIgnoreCase("ChkBox"))
			{
				SWTotNum.sendKeys(hmap.get("SWDependents"));
				SWAddAmount.sendKeys(hmap.get("SWAddAmt"));	

				String Exmp=hmap.get("MI_ClaimExmp");
				String ClaimExmp = "//td[normalize-space()='"+ Exmp +"']/input[@type='checkbox']";
				driver.findElement(By.xpath(ClaimExmp)).click();	
			}
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Wisconsin
		else if (Location.equals("State Name : Wisconsin"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			String MarStatus=hmap.get("WI_MaritalStatus");
			String MaritalStatus = "//*[@id='intParameter1'][@value='" + MarStatus + "']";
			driver.findElement(By.xpath(MaritalStatus)).click();
			
			String value = hmap.get("Wisconsin_Scenerios"); 
			if (value.equalsIgnoreCase("Data")) {
			String Allowance=hmap.get("WI_ExmpStatus");
			String ExmpStatus = "//*[@type='checkbox']/following-sibling::label[text()='"+ Allowance +"']/preceding-sibling::input[@type='checkbox']";
			driver.findElement(By.xpath(ExmpStatus)).click();
						
			SWTotNum.sendKeys(hmap.get("WI_Dependencies"));
			SWAddAmount.sendKeys(hmap.get("WI_AdditionalAmt"));
			}
			else if (value.equalsIgnoreCase("ChkBox")) {
				String Allowance=hmap.get("WI_ExmpStatus");
				String ExmpStatus = "//*[@type='checkbox']/following-sibling::label[text()='"+ Allowance +"']/preceding-sibling::input[@type='checkbox']";
				driver.findElement(By.xpath(ExmpStatus)).click();
							
				SWTotNum.sendKeys(hmap.get("WI_Dependencies"));
				SWAddAmount.sendKeys(hmap.get("WI_AdditionalAmt"));
				SWICertifyGen.click();
			}
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}	
		//Missouri
		else if (Location.equals("State Name : Missouri"))
		{	
			String MarStatus=hmap.get("Missouri_MaritalStatus");
			String MaritalStatus = "//*[@id='EmployeeStateW4_intParameter1']/following-sibling::label[normalize-space()='"+ MarStatus +"']/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(MaritalStatus)).click();

			SWAddAmount.sendKeys(hmap.get("MO_AddWithHoldings"));
			SWMoneyPar.sendKeys(hmap.get("MO_ReducedWithHoldings"));

			String ExemptValue=hmap.get("MO_ExemptStatus");
			String Exmpstatus = "//*[@id='EmployeeStateW4_intParameter2'][@value='" + ExemptValue + "']";
			driver.findElement(By.xpath(Exmpstatus)).click();
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Connecticut
		else if (Location.equals("State Name : Connecticut"))
		{	
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			String value = hmap.get("Connecticut_scenerio"); 
			if (value.equalsIgnoreCase("Data"))
			{
				String ExpValue=hmap.get("CT_WithHoldingCode");
				String ExmpOpt = "//*[@id='intParameter1']/following-sibling::label[text()='"+ ExpValue +"']/preceding-sibling::input[@type='radio'][1]";
				driver.findElement(By.xpath(ExmpOpt)).click();	
				SWAddAmount.sendKeys(hmap.get("SWAddAmt"));	
			}
			else if (value.equalsIgnoreCase("ChkBox")) 
			{
				String ExpValue=hmap.get("CT_WithHoldingCode");
				String ExmpOpt = "//*[@id='intParameter1']/following-sibling::label[text()='"+ ExpValue +"']/preceding-sibling::input[@type='radio'][1]";
				driver.findElement(By.xpath(ExmpOpt)).click();	
				SWAddAmount.sendKeys(hmap.get("CT_AddWithHoldingAmt"));		
				SWICertifyGen.click();
				if(SWICertifyGen.isSelected()) {
					LegalRes.sendKeys(hmap.get("CT_LegalResidence"));
				}
			}
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Kansas
		else if (Location.equals("State Name : Kansas"))
		{	
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));
			String AllRate=hmap.get("KS_AllowanceRate");
			String AllowanceRate = "//*[@id='IsBothSpouses']/following-sibling::label[text()='"+ AllRate +"']/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(AllowanceRate)).click();
			
			String value = hmap.get("Kansas_Scenerios"); 
			if (value.equalsIgnoreCase("Data")) 
			{						
			String YourselfDep=hmap.get("KS_ClaimYourselfDep");
			String Dependent = "//*[@id='IsYoueself']/following-sibling::label[text()='"+ YourselfDep +"']/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(Dependent)).click();

			String Spousework=hmap.get("KS_ClaimSpouseDep");
			String SpuseDepWork = "//*[@id='IsNewEmployee']/following-sibling::label[text()='"+ Spousework +"']/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(SpuseDepWork)).click();				

			String Head=hmap.get("KS_HeadofHousehold");
			String HeadofHousehold = "//*[@id='IsHeadFamily']/following-sibling::label[text()='"+ Head +"']/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(HeadofHousehold)).click();

			SWTtlpersonal.sendKeys(hmap.get("KS_Dependents"));
			SWAddAmount.sendKeys(hmap.get("KS_AdditionalAmt"));
			}else if (value.equalsIgnoreCase("ChkBox")) 
			{						
			String YourselfDep=hmap.get("KS_ClaimYourselfDep");
			String Dependent = "//*[@id='IsYoueself']/following-sibling::label[text()='"+ YourselfDep +"']/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(Dependent)).click();

			String Spousework=hmap.get("KS_ClaimSpouseDep");
			String SpuseDepWork = "//*[@id='IsNewEmployee']/following-sibling::label[text()='"+ Spousework +"']/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(SpuseDepWork)).click();
			
			String Head=hmap.get("KS_HeadofHousehold");
			String HeadofHousehold = "//*[@id='IsHeadFamily']/following-sibling::label[text()='"+ Head +"']/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(HeadofHousehold)).click();

			SWTtlpersonal.sendKeys(hmap.get("KS_Dependents"));
			SWAddAmount.sendKeys(hmap.get("KS_AdditionalAmt"));
			SWICertifyGen.click();
			}				
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//South Carolina
		else if (Location.equals("State Name : South Carolina"))
		{
			String MarStatus=hmap.get("SouthCarolina_MaritalStatus");
			String AllYourself = "//*[@id='EmployeeStateW4_intParameter3'][@value='"+ MarStatus +"']";
			driver.findElement(By.xpath(AllYourself)).click();	
			
			SWTotNum.sendKeys(hmap.get("SC_Dependents"));
			SWAddAmount.sendKeys(hmap.get("SC_AddAllowances"));
			
			String Exmp=hmap.get("SC_ClaimExmp");
			String ClaimExmp = "//*[@type='checkbox'][@data-val-required='"+ Exmp +"']";
			driver.findElement(By.xpath(ClaimExmp)).click();		
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Kentucky
		else if (Location.equals("State Name : Kentucky"))
		{	
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));
			String ExemptOpt=hmap.get("Kentucky_CheckifExempt");
			String ExemptOption = "//td[normalize-space() = '"+ ExemptOpt +"']/input[@type='checkbox']";
			driver.findElement(By.xpath(ExemptOption)).click();	
			String ExemptOpt1=hmap.get("Kentucky_CheckifExempt1");
			String ExemptOption1 = "//td[normalize-space() = '"+ ExemptOpt1 +"']/input[@type='checkbox']";
			driver.findElement(By.xpath(ExemptOption1)).click();					
			if(SWBothSpouses.isSelected()) {
				SWInstructionLetter.sendKeys(hmap.get("KY_ResidentOf"));
			}		
			SWAddAmount.sendKeys(hmap.get("KY_AdditionalAmt"));
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Oregon
		else if (Location.equals("State Name : Oregon"))
		{
			SWIsRedetermination.click();			
			String Radioopt=hmap.get("Oregon_MaritalStatus");
			String Maritalstatus = "//*[@id='EmployeeStateW4_intParameter3'][@value='"+ Radioopt +"']";
			driver.findElement(By.xpath(Maritalstatus)).click();
			
			SWAllowances.sendKeys(hmap.get("OR_Dependents"));
			SWAddAmount.sendKeys(hmap.get("OR_AddAllowances"));
			SWExmptwithholding.click();
			SWInstructionLetter.sendKeys(hmap.get("OR_ExmpCode"));
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Rhode Island
		else if (Location.equals("State Name : Rhode Island"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			String value = hmap.get("RhodeIsland_Scenerios"); 
			if (value.equalsIgnoreCase("Data")) 
			{	
			String ClaimSelf=hmap.get("RI_YourselfDep");
			String ClaimYourself = "//*[@id='IsYoueself']/following-sibling::label[text()='"+ ClaimSelf +"']/preceding-sibling::input[@type='radio']";
			driver.findElement(By.xpath(ClaimYourself)).click();	
							
			String Spouse=hmap.get("RI_SpouseDep");
			String ClaimSpouse = "//*[@id='IsBothSpouses']/following-sibling::label[text()='"+ Spouse +"']/preceding-sibling::input[@type='radio']";
			driver.findElement(By.xpath(ClaimSpouse)).click();	
			
			SWTtlpersonal.sendKeys(hmap.get("RI_Dependents"));
			SWTotNumClaims.sendKeys(hmap.get("RI_AddAllowances"));
			SWAddAmount.sendKeys(hmap.get("RI_AdditionalAmt"));
			}
			else if (value.equalsIgnoreCase("ChkBox")) 
			{	
			String ClaimSelf=hmap.get("RI_YourselfDep");
			String ClaimYourself = "//*[@id='IsYoueself']/following-sibling::label[text()='"+ ClaimSelf +"']/preceding-sibling::input[@type='radio']";
			driver.findElement(By.xpath(ClaimYourself)).click();	
							
			String Spouse=hmap.get("RI_SpouseDep");
			String ClaimSpouse = "//*[@id='IsBothSpouses']/following-sibling::label[text()='"+ Spouse +"']/preceding-sibling::input[@type='radio']";
			driver.findElement(By.xpath(ClaimSpouse)).click();	
			
			SWTtlpersonal.sendKeys(hmap.get("RI_Dependents"));
			SWTotNumClaims.sendKeys(hmap.get("RI_AddAllowances"));
			SWAddAmount.sendKeys(hmap.get("RI_AdditionalAmt"));		
			SWICertifyGen.click();
			}
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Louisiana
		else if (Location.equals("State Name : Louisiana"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));
			String AllowancesOpt=hmap.get("Louisiana_PersonalAllowances");
			String PerAllowOpt = "//*[@id='intParameter1']/following-sibling::label[normalize-space()='"+ AllowancesOpt +"']/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(PerAllowOpt)).click();	
			SWTotNumClaims.sendKeys(hmap.get("LA_Dependents"));
			SWAddAmount.sendKeys(hmap.get("LA_AddAmt"));
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Alabama
		if (Location.equals("State Name : Alabama"))
		{	
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));

			NJW4CheckBox.click();
			String ExpValue=hmap.get("Alabama_ExmpFilingSeparately");
			String ClaimSeperately = "//*[@id='intParameter1'][@value='" + ExpValue + "']";
			driver.findElement(By.xpath(ClaimSeperately)).click();
			
			String HOFOption=hmap.get("AL_ExmpClaimHeadOfFamily");
			String HeadOfFamily = "//*[@id='EmployeeStateW4_strParameter1'][@value='" + HOFOption + "']";
			driver.findElement(By.xpath(HeadOfFamily)).click();
	
			SWDependents.sendKeys(hmap.get("AL_Dependents"));
			SWAddAmount.sendKeys(hmap.get("AL_AddAmt"));
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Nebraska
		else if (Location.equals("State Name : Nebraska"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));
			String MarStatus=hmap.get("NE_MaritalStatus");
			String MaritalStatus = "//*[@id='EmployeeStateW4_intParameter3']/following-sibling::label[text()='"+ MarStatus +"']/preceding-sibling::input[1]";
			driver.findElement(By.xpath(MaritalStatus)).click();
			
			String value = hmap.get("Nebraska_Scenerios"); 
			if (value.equalsIgnoreCase("Data")) 
			{
			NoofAllowances.sendKeys(hmap.get("NE_NoOfAllowances"));
			SWAddAmount.sendKeys(hmap.get("NE_AddAmt"));
			ClaimDep.sendKeys(hmap.get("NE_ClaimAsDep"));
			NebraskaonePension.sendKeys(hmap.get("NE_MorePension"));
			WorkingSpouse.sendKeys(hmap.get("NE_WorkingSpouse"));
			PersonalExemption.sendKeys(hmap.get("NE_PerExmp"));
			Sec1ForSpouse.sendKeys(hmap.get("NE_HeadofHousehold"));
			}
			else if (value.equalsIgnoreCase("ChkBox")) 
			{	
			NoofAllowances.sendKeys(hmap.get("NE_NoOfAllowances"));	
			SWAddAmount.sendKeys(hmap.get("NE_AddAmt"));
			ClaimDep.sendKeys(hmap.get("NE_ClaimAsDep"));
			NebraskaonePension.sendKeys(hmap.get("NE_MorePension"));
			WorkingSpouse.sendKeys(hmap.get("NE_WorkingSpouse"));
			PersonalExemption.sendKeys(hmap.get("NE_PerExmp"));
			Sec1ForSpouse.sendKeys(hmap.get("NE_HeadofHousehold"));
			SWICertifyGen.click();
			}
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Oklahoma
		else if (Location.equals("State Name : Oklahoma"))
		{
			String Radioopt=hmap.get("Oklahoma_MaritalStatus");
			String Maritalstatus = "//*[@id='EmployeeStateW4_W4MaritalStatusID'][@value='" + Radioopt + "']";
			driver.findElement(By.xpath(Maritalstatus)).click();
			
			String CalimSelfOpt=hmap.get("OK_ClaimSelf");
			String ClaimSelf = "//*[@id='EmployeeStateW4_intParameter1']/following-sibling::label[text()='"+ CalimSelfOpt +"']/preceding-sibling::input[1]";
			driver.findElement(By.xpath(ClaimSelf)).click();
			
			String Spousework=hmap.get("OK_ClaimSpouse");
			String ClaimSpouse = "//*[@id='EmployeeStateW4_intParameter2']/following-sibling::label[text()='"+ Spousework +"']/preceding-sibling::input[1]";
			driver.findElement(By.xpath(ClaimSpouse)).click();
			
			SWDependents.sendKeys(hmap.get("OK_Dependents"));
			SWAddAllowances.sendKeys(hmap.get("OK_AddAllowances"));
			SWAddAmount.sendKeys(hmap.get("OK_AddAmt"));
			SWExmptwithholding.click();
			SWTaxClaimExp.click();
			SWICertifyGen.click();
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Arkansas
		else if (Location.equals("State Name : Arkansas"))
		{		
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));
			String ExpValue=hmap.get("Arkansas_Exmp");
			String ExmpOpt = "//*[@id='intParameter1'][@value='" + ExpValue + "']";
			driver.findElement(By.xpath(ExmpOpt)).click();			
			NoOfAllowances.sendKeys(hmap.get("AK_Dep"));
			SWAddAmount.sendKeys(hmap.get("AK_AddAmt"));
			
			String ITRate=hmap.get("AK_ITRates");
			String ITRates = "//*[@id='IsYoueself'][@value='"+ ITRate +"']";
			driver.findElement(By.xpath(ITRates)).click();	
			
			String MarStatus=hmap.get("AK_Maritalstatus");
			String MaritalStatus = "//*[@id='intParameter3'][@value='"+ MarStatus +"']";
			driver.findElement(By.xpath(MaritalStatus)).click();	
			
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Hawaii
		else if (Location.equals("State Name : Hawaii"))
		{	
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));
			String MarStatus=hmap.get("Hawai_MaritalStatus");
			String ExmpOpt = "//*[@id='intParameter1'][@value='" + MarStatus + "']";
			driver.findElement(By.xpath(ExmpOpt)).click();	
			
			String DisabledPer=hmap.get("HI_DisabledPer");
			String DisPer = "//*[@id='IsBothSpouses'][@value='" + DisabledPer + "']";
			driver.findElement(By.xpath(DisPer)).click();	
			
			String NonResSpouse=hmap.get("HI_MilSpouse");
			String Miltaryspouse = "//*[@id='IsW4CertifiedGeneral'][@value='" + NonResSpouse + "']";
			driver.findElement(By.xpath(Miltaryspouse)).click();	
			
			SWTotNum.sendKeys(hmap.get("HI_Allowances"));
			SWAddAmount.sendKeys(hmap.get("HI_AddAmt"));			
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Delaware,Colorado,New Mexico
		else if (Location.equals("State Name : New Mexico")||Location.equals("State Name : Colorado"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));		
			lib.select(SWMaritalID, hmap.get("W4Maritalstatus"));	
			SWIsMoreJobs.click();
			SWchildx2000.sendKeys(hmap.get("W4x2000"));
			SWchildx500.sendKeys(hmap.get("W4x500"));
			SWOtherIncome.sendKeys(hmap.get("w4Otherinc"));
			SWDeductions.sendKeys(hmap.get("w4Ded"));		
			SWExtraWithHolding.sendKeys(hmap.get("w4Withholdings"));
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//West Virginia
		else if (Location.equals("State Withholdings - WV"))
		{
			String MarStatus=hmap.get("WestVirginia_MarStatus");
			String MaritalStatus = "//*[@id='intParameter1'][@value='" + MarStatus + "']";
			driver.findElement(By.xpath(MaritalStatus)).click();					
			SWTotNumClaims.sendKeys(hmap.get("WV_ExmpClaimed"));
			SWAddAmount.sendKeys(hmap.get("WV_AddAmount"));
			SWICertifyGen.click();
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Vermont
		else if (Location.equals("State Name : Vermont"))
		{
			String MarStatus=hmap.get("Vermont_MarStatus");
			String MaritalStatus = "//*[@id='EmployeeStateW4_intParameter1'][@value='"+ MarStatus +"']";
			driver.findElement(By.xpath(MaritalStatus)).click();
			
			String ExmpSelf=hmap.get("VT_ClaimSelf");
			String ClaimYourself = "//*[@id='IsYoueself'][@value='"+ ExmpSelf +"']";
			driver.findElement(By.xpath(ClaimYourself)).click();
			
			String Filingopt=hmap.get("VT_FilingJointly");
			String FilingJointly = "//*[@id='IsBothSpouses'][@value='"+ Filingopt +"']";
			driver.findElement(By.xpath(FilingJointly)).click();
			
			SWTtlpersonal.sendKeys(hmap.get("VT_Dep"));
			
			String Headopt=hmap.get("VT_HeadHouse");
			String HeadofHousehold = "//*[@id='IsHeadFamily'][@value='"+ Headopt +"']";
			driver.findElement(By.xpath(HeadofHousehold)).click();
			
			SWAddAmount.sendKeys(hmap.get("VT_AddWH"));
			SWICertifyGen.click();
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Idaho
		else if (Location.equals("State Name : Idaho"))
		{	
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));		
			String WHStatus=hmap.get("Idaho_WHStatus");
			String WithHoldStatus = "//*[@id='EmployeeStateW4_intParameter3'][@value='" + WHStatus + "']";
			driver.findElement(By.xpath(WithHoldStatus)).click();
			
			SWAllowances.sendKeys(hmap.get("ID_Allowances"));
			SWAddAmount.sendKeys(hmap.get("ID_AddAmt"));
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		//Montana
		else if (Location.equals("State Name : Montana"))
		{
			lib.select(EmpStateW4Year, hmap.get("StateW4_Year"));		
			Allowancesself.sendKeys(hmap.get("Montana_CalimSelf"));
			ClaimDep.sendKeys(hmap.get("MT_OneJob"));
			FilingJointly.sendKeys(hmap.get("MT_FilingJointly"));
			Sec1ForSpouse.sendKeys(hmap.get("MT_Depts"));
			WorkingSpouse.sendKeys(hmap.get("MT_Household"));
			ItemizedDed.sendKeys(hmap.get("MT_Ded"));		
			WithheldAmt.sendKeys(hmap.get("MT_AddAmt"));

			String RadioBtnOpt=hmap.get("MT_Sec2_ITTax");
			String IT_WithHoldings = "//*[@id='EmployeeStateW4_intParameter3'][@value='"+ RadioBtnOpt +"']";
			driver.findElement(By.xpath(IT_WithHoldings)).click();				
			StateW4FileUpload.click();
			Thread.sleep(1500);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3000);
			SaveBtn.click();
		}
		
		
		lib.handlingFrame("frmContent");
		StateW4View.click();
		Thread.sleep(1500);
		lib.switchOutOfFrame();

	}
}
