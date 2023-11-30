package Page_Objects;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base_Programs.Read_ConfigProperties_File;
import Reusable_Methods.Generic_Methods;

public class OnBoarding_EmpPortal_Steps {
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

	@FindBy(xpath="//tbody/tr[1]/td[1]/a[1]")
	private WebElement Viewlogo;

	@FindBy(xpath="//*[@id='cpxPopDiv1']/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td[2]")
	private WebElement GetUserPwd;

	@FindBy(xpath="//*[@id='cpxPopDiv1']/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td[2]/div[2]/div/font/a")
	private WebElement GetUsrPwdLink;

	@FindBy(xpath="//*[@id='cpxPopDiv1']/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td[2]/div[2]/p/a")
	private WebElement GetUsrPwdLink1;

	@FindBy(xpath="//*[@id='UserName']")
	private WebElement UserName;

	@FindBy(xpath="//*[@id='Password']")
	private WebElement Password;

	@FindBy(xpath="//*[@type='submit']")
	private WebElement Login;

	@FindBy(xpath="//*[@id='NewPassword']")
	private WebElement Newpwd;

	@FindBy(xpath="//*[@id='ConfirmPassword']")
	private WebElement Confirmpwd;

	@FindBy(xpath="//*[@id='btnContinue']")
	private WebElement Continue;

	@FindBy(xpath="//input[@id='UserName']")
	private WebElement userNameTxtBox;

	@FindBy(xpath="//input[@id='Password']")
	private WebElement pwdTxtBox;

	@FindBy(xpath="//input[@value='logon']")
	private WebElement loginBtn;

	@FindBy(xpath="//*[@class='text-button-continue']/a")
	private WebElement ContBtn;

	@FindBy(xpath="//*[@id='vm_SSNDetail_IsRehire'][@value='True']")
	private WebElement RehireEmp;

	@FindBy(xpath="//*[@id='vm_SSNDetail_DoYouHaveSSN']")
	private WebElement SSNBtn;

	@FindBy(xpath="//*[@id='vm_SSNDetail_DOB']")
	private WebElement SSNDOB;

	@FindBy(xpath="//*[@name='SaveAndContinue']")
	private WebElement SaveandContinue;

	@FindBy(xpath="//*[contains(text(),'Skip this step')]")
	private WebElement Skipthisstep;

	@FindBy(xpath="//*[@id='vm_SSNDetail_SSN']")
	private List<WebElement> SSNnumber;

	@FindBy(xpath="//*[@id='vm_SSNDetail_SSN']")
	private WebElement SSNNumber;

	@FindBy(xpath="//*[@id='vm_SSNDetail_ConfirmSSN']")
	private WebElement ConfirmSSN;

	@FindBy(xpath="//*[@id='vm_SSNDetail_MaritalStatusID']")
	private WebElement MaritalStatus;

	@FindBy(xpath="//*[@id='vm_SSNDetail_IhaveVerifiedMySSN']")
	private WebElement VerificationBtn;

	@FindBy(xpath="//*[@id='vm_SSNDetail_IhaveVerifiedMySIN']")
	private WebElement SINVerBtn;

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

	@FindBy(xpath="//*[@class='RibbonImgBtnWarper' and @id='ImgBtnOK']")
	private WebElement ApproveBtn;

	@FindBy(xpath="//*[@id='vm_AddressInfo_IsSamePhysical' and @value='True']")
	private WebElement MailingAddress;

	@FindBy(xpath="//*[@name='vm_EmergencyContact.FirstName']")
	private WebElement EmergencyFName;

	@FindBy(xpath="//*[@name='vm_EmergencyContact.LastName']")
	private WebElement EmergencyLName;

	@FindBy(xpath="//*[@name='vm_EmergencyContact.RelationshipID']")
	private WebElement Relationship;

	@FindBy(xpath="//*[@id='vm_EmergencyContact_MobilePhone']")
	private WebElement EmergencyMobileNo;

	@FindBy(xpath="//a[contains(text(),'Skip this step')]")
	private WebElement SkipstepBtn;

	@FindBy(xpath="//*[@class='text-button-continue']/a")
	private WebElement IntroContBtn;

	@FindBy(xpath="//*[@id='vm_SSNDetail_PanCardNo']")
	private WebElement PanCardNumber;

	@FindBy(xpath="//*[@id='vm_SSNDetail_GenderStatusID']")
	private WebElement GenderStatus;

	@FindBy(xpath="//*[@id='vm_SSNDetail_UANNo']")
	private WebElement UANNumber;

	@FindBy(xpath="//*[@id='vm_SSNDetail_NationalityID']")
	private WebElement Nationality;
	
	@FindBy(xpath="//*[@id='vm_SSNDetail_ReligionID']")
	private WebElement Religion;
	
	@FindBy(xpath="//*[@id='vm_SSNDetail_VoterID']")
	private WebElement VoterID;
	
	@FindBy(xpath="//*[@id='vm_SSNDetail_BloodGroupID']")
	private WebElement BloodGroup;
	
	@FindBy(xpath="//*[@id='vm_SSNDetail_WeddingDate']")
	private WebElement WeddingDate;
	
	@FindBy(xpath="//*[@id='vm_SSNDetail_IhaveVerifiedMyAadhar']")
	private WebElement Declarationcheckbox;

	@FindBy(xpath="//*[@id='vm_SSNDetail_IhaveVerifiedNINO']")
	private WebElement NinoDeclaration;

	@FindBy(xpath="//*[@class='regular ImgbtnAdd']")
	private WebElement AddEducation;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_SchoolOrCollegeName']")
	private WebElement InstituteName;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_UniversityID']")
	private WebElement University;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_DegreeID']")
	private WebElement Degree;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_StartPeriodMonth']")
	private WebElement InstituteStartMonth;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_StartPeriodYear']")
	private WebElement InstituteStartYear;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_EndPeriodMonth']")
	private WebElement InstituteEndMonth;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_EndPeriodYear']")
	private WebElement InstituteEndYear;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_City']")
	private WebElement InstituteCity;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_CountryID']")
	private WebElement InstituteCountry;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_StateID']")
	private WebElement collegeState;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_WereYouFullTime'][@value='True']")
	private WebElement fulltimeradioBtn;

	@FindBy(xpath="//*[@id='vm_CollegeInfo_DidYouGraduate'][@value='True']")
	private WebElement DidyouGraduate;

	@FindBy(xpath="//*[@id='CustomFormcpxPopDiv1']/table[2]/tbody/tr/td/div/button[2]")
	private WebElement Save;

	@FindBy(xpath="//*[@id='vm_Agreement_DoYouAgreeAgreement'][@value='True']")
	private WebElement VmAgreement;

	@FindBy(xpath="//*[@id='vm_INDeposit_IBANCode']")
	private WebElement IBANcode;

	@FindBy(xpath="//*[@id='vm_INDeposit_First_RoutingNumber']")
	private WebElement Sortcode;

	@FindBy(xpath="//*[@id='vm_INDeposit_PayCardRoutingNo']")
	private WebElement SSC;

	@FindBy(xpath="//*[@id='vm_INDeposit_IsBankAccountAvailable'][@value='True']")
	private WebElement BankAcc;

	@FindBy(xpath="//*[@id='vm_INDeposit_BankID']")
	private WebElement BankName;

	@FindBy(xpath="//*[@id='vm_INDeposit_First_FinancialInstitution']")
	private WebElement UKBankName;

	@FindBy(xpath="//*[@id='vm_INDeposit_First_AccountNumber']")
	private WebElement AccountNumber;

	@FindBy(xpath="//*[@id='vm_INDeposit_First_RoutingNumber']")
	private WebElement RoutingNumber;

	@FindBy(xpath="//*[@id='vm_INDeposit_First_AccountTypeID']")
	private WebElement AxisAccountType;

	@FindBy(xpath="//*[@id='vm_INDeposit_IsSalaryAccount'][@value='True']")
	private WebElement NewSalaryAcc;

	@FindBy(xpath="//*[@id='tblTwoCloums']//tbody/tr/td[2]/div/div/div")
	private WebElement SelectCheck;

	@FindBy(xpath="//*[@id='vm_EEOC_GenderID']")
	private WebElement Gender;

	@FindBy(xpath="//*[@id='vm_EEOC_RaceOrEthnicityID']")
	private WebElement Ethnicity;

	@FindBy(xpath="//*[@id='vm_VeteranStatus_ArmedForcesServiceMedal']")
	private WebElement VeteranStatus;

	@FindBy(xpath="//a[contains(text(),'Add Family')]")
	private WebElement AddFamily;

	@FindBy(xpath="//*[@id='vm_Dependent_DependentTypeID']")
	private WebElement Relation;

	@FindBy(xpath="//*[@id='vm_Dependent_FirstName']")
	private WebElement FirstName;

	@FindBy(xpath="//*[@id='vm_Dependent_LastName']")
	private WebElement LastName;

	@FindBy(xpath="//*[@id='vm_Dependent_DateOfBirth']")
	private WebElement DOB;

	@FindBy(xpath="//*[@id='vm_Dependent_GenderID']")
	private WebElement GenderID;

	@FindBy(xpath="//*[@id='vm_BackgroundCheck_DoYouAgreeBackgroundCheck'][@value='True']")
	private WebElement Backgroundtest;

	@FindBy(xpath="//*[@id='vm_DrugTest_DoYouAgreeDrugTest'][@value='True']")
	private List<WebElement> Drugtest;

	@FindBy(xpath="//*[@id='vm_OfferLetter_DoYouAcceptOfferLetter' and @value='True']")
	private WebElement offerletter;

	@FindBy(xpath="//*[@id='vm_RulesAndPolicies_HandBookIAgree' and @value='True']")
	private WebElement HandbookBtn;

	@FindBy(xpath="//*[@id='vm_RulesAndPolicies_PayrollScheduleIAgree' and @value='True']")
	private WebElement payrollbtn;

	@FindBy(xpath="//*[@id='vm_ConfidentialityAgreement_DoYouConfidentialityAgreement'][@value='True']")
	private WebElement ConfAgreement;

	@FindBy(xpath="//*[@id='vm_CellphoneTexting_IsCellPhoneTexting'][@value='True']")
	private WebElement CellphoneAgree;
	
	@FindBy(xpath="//*[@id='vm_I9EligibilityInstructions_IsPreparer'][@value='True']")
	private WebElement I9IsPreparer;
	
	@FindBy(xpath="//*[@id='vm_I9EligibilityInstructions_FirstName']")
	private WebElement I9InstFirstName;
	
	@FindBy(xpath="//*[@id='vm_I9EligibilityInstructions_LastName']")
	private WebElement I9InstLastName;
	
	@FindBy(xpath="//*[@id='vm_I9EligibilityInstructions_Address1']")
	private WebElement I9InstAddress;
	
	@FindBy(xpath="//*[@id='vm_I9EligibilityInstructions_StateID']")
	private WebElement I9InstStateID;
	
	@FindBy(xpath="//*[@id='vm_I9EligibilityInstructions_City']")
	private WebElement I9InstCity;
	
	@FindBy(xpath="//*[@id='vm_I9EligibilityInstructions_Zipcode']")
	private WebElement I9InstZipcode;
	
	@FindBy(xpath="//*[@id='vm_I9EligibilityInstructions_ImmigStatusID'][@value='416']")
	private WebElement I9ImmigStatus_opt3;
	
	@FindBy(xpath="//input[@name='vm_I9EligibilityInstructions.ImmigDocNO']")
	private WebElement I9ImmigDocNo;
	
	@FindBy(xpath="//*[@id='vm_I9EligibilityInstructions_ImmigStatusID'][@value='417']")
	private WebElement I9ImmigStatus_opt4;
	
	@FindBy(xpath="//input[@id='vm_I9EligibilityInstructions_ImmigExpiryOn']")
	private WebElement I9ExpiryOn;
	
	@FindBy(xpath="//input[@name='vm_I9EligibilityInstructions.ImmigDocNK']")
	private WebElement I9Immig_USCISNumber;

	@FindBy(xpath="//*[@name='vm_I9EligibilityInstructions.I9Eligibility'][@value='True']")
	private WebElement I9Eligibility;

	@FindBy(xpath="//*[@id='vm_I9Documents_ListAorBC'][@value='True']")
	private WebElement I9DocEntry;

	@FindBy(xpath="//*[@id='vm_I9Documents_ListA1DocumentTypeID']")
	private WebElement DocTitle;

	@FindBy(xpath="//*[@id='vm_I9Documents_ListA1IssuedBy']")
	private WebElement DocIssuedBy;

	@FindBy(xpath="//*[@id='vm_I9Documents_ListA1DocumentNo']")
	private WebElement I9DocNo;

	@FindBy(xpath="//*[@id='vm_I9Documents_ListA1ValidTillDate']")
	private WebElement ValidDate;

	@FindBy(xpath="//*[@id='tblListA']/tbody/tr[6]/td/table/tbody/tr/td[2]/div/div/div")
	private WebElement DocUpload;

	@FindBy(xpath="//*[@id='vm_Agreement_DoYouAgreeAgreement'][@value='True']")
	private WebElement vmagreement;

	@FindBy(xpath="//*[@id='vm_W4Withholdings_MaritalStatusID']")
	private WebElement W4Maritalstatus;

	@FindBy(xpath="//*[@id='vm_W4Withholdings_ChildX2000']")
	private WebElement W4Depx2000;

	@FindBy(xpath="//*[@id='vm_W4Withholdings_DependentX500']")
	private WebElement W4Depx500;

	@FindBy(xpath="//*[@id='vm_W4Withholdings_OtherIncome']")
	private WebElement W4Otherincome;

	@FindBy(xpath="//*[@id='vm_W4Withholdings_OtherAdjustments']")
	private WebElement W4Deductions;

	@FindBy(xpath="//*[@id='vm_W4Withholdings_ExtraWithholding']")
	private WebElement W4extraWithHoldings;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_MaritalStatusID']")
	private WebElement W4Maritalstatus1;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_ExtraWithholding']")
	private WebElement SWExtraWithHolding;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_IsMoreJobsOrSpouseWorks']")
	private WebElement SWIsMoreJobsorSpouses;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_ChildX2000']")
	private WebElement ClaimDependentsChildren;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_DependentX500']")
	private WebElement ClaimDependents;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_OtherIncome']")
	private WebElement AdjustmentsOtherincome;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_Deductions']")
	private WebElement AdjustmentsDeductions;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_ExtraWithholding']")
	private WebElement AdjustmentsWithHoldings;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_moneyParameter1']")
	private WebElement SWMoneyPar;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_moneyParameter2']")
	private WebElement SWMoneyParamtr;

	@FindBy(xpath="//*[@id='vm_W4Withholdings_ItemizedDeductions']")
	private WebElement W4ItemizedDed;

	@FindBy(xpath="//*[@id='vm_W4Withholdings_MoneyParameter5']")
	private WebElement W4MoneyParameters;

	@FindBy(xpath="//*[@id='vm_W4Withholdings_IAgreeAllowances']")
	private WebElement W4IAgreeCheckbox;



	@FindBy(xpath="//*[@id='vm_StateWithholdings_intParameter1'][@value='1']")
	private WebElement fillingStatusradioBtn;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_intParameter2'][@value='0']")
	private WebElement SWSpousework;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_intParameter3'][@value='1']")
	private WebElement MaritalStatusradioBtn;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_MaritalStatusID'][@value='1']")
	private WebElement SWMaritalstatus;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_IsYoueself']")
	private WebElement NJW4CheckBox;

	@FindBy(xpath="//*[@class='ALNonExemptRdoBtn2']")
	private WebElement ALRdoBtn;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_AdditionalAmount']")
	private WebElement SWAddAmount;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_TotalPersonal']")
	private WebElement SWTtlpersonal;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_intParameter4']")
	private WebElement SWAddAllowances;

	@FindBy(xpath="//*[@name='vm_StateWithholdings.intParameter4']")
	private WebElement SWRegAllowancesA;

	@FindBy(xpath="//*[@name='vm_StateWithholdings.intParameter5']")
	private WebElement SWRegAllowancesB;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_intParameter5']")
	private WebElement SWHeadofhousehold;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_intParameter6']")
	private WebElement SWClaimdep;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_intParameter1']")
	private WebElement SWAllowances;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_intParameter3']")
	private WebElement SWDependents;

	@FindBy(xpath="//*[@id='intParameter1']")
	private WebElement Sec1Dependent;

	@FindBy(xpath="//*[@id='intParameter6']")
	private WebElement WorkingSpouse;

	@FindBy(xpath="//*[@id='TotalPersonal']")
	private WebElement PersonalExemption;

	@FindBy(xpath="//*[@id='TotalAgeBlindness']")
	private WebElement NoofDependents;

	@FindBy(xpath="//*[@id='Totalnumber']")
	private WebElement MNHeadofHousehold;

	@FindBy(xpath="//*[@id='moneyParameter1']")
	private WebElement NebraskaonePension;

	@FindBy(xpath="//*[@id='intParameter3']")
	private WebElement Sec1SingleandOneJob;

	@FindBy(xpath="//*[@id='intParameter5']")
	private WebElement Sec1ForSpouse;

	@FindBy(xpath="//*[@id='IntParamtxt1']")
	private WebElement GAtxt1;

	@FindBy(xpath="//*[@name='IntParamtxt1']")
	private WebElement GATxt1;

	@FindBy(xpath="//*[@id='IntParamtxt2']")
	private WebElement GAtxt2;

	@FindBy(xpath="//*[@id='IntParamtxt3']")
	private WebElement GAtxt3;

	@FindBy(xpath="//*[@id='IntParamtxt4']")
	private WebElement GAtxt4;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_IsW4CertExmptWitholding']")
	private WebElement SWExmptwithholding;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_ICertifyCivilRelief']")
	private WebElement SWTaxClaimExp;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_strParameter1']")
	private WebElement SWInstructionLetter;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_strParameter2']")
	private WebElement MNResName;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_intParameter2']")
	private WebElement NoOfAllowances;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_intParameter6']")
	private WebElement CDIBEnrollmentNum;

	@FindBy(xpath="//*[@id='content']//div[3]/input")
	private WebElement Sec1ExpMin;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_NYStateAmount']")
	private WebElement NYstateAmt;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_NYCityAmount']")
	private WebElement NYCityAmt;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_YonkersStateAmount']")
	private WebElement YonkerstateAmt;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_Totalnumber']")
	private WebElement SWTotNum;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_TotalAgeBlindness']")
	private WebElement SWTotNumClaims;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_ICertifyGeneral'][@value='true']")
	private WebElement SWICertifyGen;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_IsBothSpouses']")
	private WebElement SWBothSpouses;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_IsNewEmployee'][@value='true']")
	private WebElement SWNewEmp;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_IsResidentNY'][@value='true']")
	private WebElement SWResNY;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_IsBothSpouses']")
	private WebElement ExmpFedandIncomeTax;

	@FindBy(xpath="//*[@id='IntParamtxt2']")
	private WebElement SWMaritalTextNo;

	@FindBy(xpath="//*[@id='strCalender']")
	private WebElement SWDateofHire;

	@FindBy(xpath="//*[@id='strParam2']")
	private WebElement LegalRes;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_IsRedetermination'][@value='true']")
	private WebElement SWIsRedetermination;

	@FindBy(xpath="//*[@id='YonkersStateAmount']")
	private WebElement Allowancesself;

	@FindBy(xpath="//*[@id='intParameter4']")
	private WebElement FilingJointly;

	@FindBy(xpath="//*[@id='NYCityAmount']")
	private WebElement ItemizedDed;

	@FindBy(xpath="//*[@id='content']/table/tbody/tr[1]/td/table/tbody/tr/td[2]")
	private WebElement MethodPaymentText;

	@FindBy(xpath="//*[@id='vm_Deposit_NumberOfAccounts']")
	private WebElement NoofBankAcc;

	@FindBy(xpath="//*[@id='vm_Deposit_First_FinancialInstitution']")
	private WebElement FinancialInstitution;

	@FindBy(xpath="//*[@id='vm_Deposit_First_FinancialInstitution_Confirm']")
	private WebElement ConfirmFinancialInstitution;

	@FindBy(xpath="//*[@id='vm_Deposit_First_AccountNumber']")
	private WebElement AccountNo;

	@FindBy(xpath="//*[@id='vm_Deposit_First_AccountNumber_Confirm']")
	private WebElement ConfirmAccountNo;

	@FindBy(xpath="//*[@id='vm_Deposit_First_RoutingNumber']")
	private WebElement RoutingNo;

	@FindBy(xpath="//*[@id='vm_Deposit_First_RoutingNumber_Confirm']")
	private WebElement ConfirmRoutingNo;

	@FindBy(xpath="//*[@id='vm_Deposit_First_AccountTypeID']")
	private WebElement AccountType;

	@FindBy(xpath="//*[@id='vm_Deposit_First_AccountTypeID_Confirm']")
	private WebElement ConfirmAccountType;

	@FindBy(xpath="//*[@id='vm_Deposit_HasVoidedCheck' and @value='True']")
	private WebElement VoidedCheck;

	@FindBy(xpath="//*[@id='tblAcc1']//tbody/tr/td[2]/div/div/div")
	private WebElement FileUpload;

	@FindBy(xpath="//*[@id='vm_Deposit_PayCard_FinancialInstitution']")
	private WebElement PayCardFinInst;

	@FindBy(xpath="//*[@id='vm_Deposit_PayCard_FinancialInstitution_Confirm']")
	private WebElement PaycardConfirmFinInst;

	@FindBy(xpath="//*[@id='vm_Deposit_PayCard_AccountNumber']")
	private WebElement PayCardAccountNo;

	@FindBy(xpath="//*[@id='vm_Deposit_PayCard_AccountNumber_Confirm']")
	private WebElement PayCardConfirmAccountNo;

	@FindBy(xpath="//*[@id='vm_Deposit_PayCard_RoutingNumber']")
	private WebElement PayCardRoutingNo;

	@FindBy(xpath="//*[@id='vm_Deposit_PayCard_RoutingNumber_Confirm']")
	private WebElement PayCardConfirmRoutingNo;

	@FindBy(xpath="//*[@id='vm_401K_Is401Selected'][@value='1']")
	private WebElement VmSelect;

	@FindBy(xpath="//*[@id='vm_401K_K401Amount']")
	private WebElement vmAmount;

	@FindBy(xpath="//*[@id='vm_401K_IsManagedAccount'][@value='1']")
	private WebElement VmManagedAcc;

	@FindBy(xpath="//*[@id='vm_MealAndRestBreak_DoYouAcceptMealAndRestBreak'][@value='true']")
	private WebElement MealandRest;

	@FindBy(xpath="//*[@id='vm_MealBreakWaiver_DoYouAcceptMealBreakWaiver'][@value='True']")
	private WebElement MealWaiver;

	@FindBy(xpath="//*[@id='vm_EmployeeBond_DoYouAcceptEmployeeBond']")
	private WebElement EmpBond;

	@FindBy(xpath="//*[@id='IConfirm' and @value='True']")
	private WebElement ConfirmProcessBtn;

	@FindBy(xpath="//*[@id='vm_401K_IAgree']")
	private WebElement Agree401k;
	
	@FindBy(xpath="//*[@id='vm_SafetyPolicy_DoYouAcceptSafetyPolicy'][@value='True']")
	private WebElement SafetyPolicy;

	@FindBy(xpath="//*[@id='vm_HealthGuidelines_DoYouAcceptGuidelines'][@value='True']")
	private WebElement HealthCareGuide;

	@FindBy(xpath="//*[@name='Submit']")
	private WebElement submitBtn;

	@FindBy(xpath="//*[@class='text-button-continue']")
	private WebElement ContinueBtn;

	@FindBy(xpath="//*[@id='contentAcceptance']//table[2]/tbody/tr[4]/td[2]/a")
	private WebElement SignForms;

	@FindBy(xpath="//*[@id='vm_ESignAgree_IAgree']")
	private WebElement ESignIAgree;

	@FindBy(xpath="//*[@id='vm_ESignAgree_UserName']")
	private WebElement EsignUserName;

	@FindBy(xpath="//*[@id='vm_ESignAgree_Password']")
	private WebElement EsignPwd;

	@FindBy(xpath="//*[@id='vm_ESignAgree_SSN']")
	private WebElement EsignSSN;

	@FindBy(xpath="//*[@name='btnSign']")
	private WebElement ClickToSign;

	@FindBy(xpath="//tbody/tr[2]/td[2]/button[1]")
	private WebElement ClickToSign1;

	@FindBy(xpath="//tbody/tr[3]/td[2]/button[1]")
	private WebElement ClickToSign2;

	@FindBy(xpath="//tbody/tr[4]/td[2]/button[1]")
	private WebElement ClickToSign3;

	@FindBy(xpath="//tbody/tr[5]/td[2]/button[1]")
	private WebElement ClickToSign4;

	@FindBy(xpath="//*[contains(text(),'Continue')]")
	private WebElement Cont;

	@FindBy(xpath="//*[@onclick='CPXWindow_Close(this);']")
	private WebElement close;

	@FindBy(xpath="//a[contains(text(),'Sign Off')]")
	private WebElement Signoff;

	@FindBy(xpath="//*[@id='onClickNext1']")
	private WebElement ContProcess;

	@FindBy(xpath="//*[contains(text(),'StateW4')]")
	private WebElement StateW4Text;

	@FindBy(xpath="//*[@id='contentAcceptance']//table[2]//tbody/tr[2]/td[3]/a")
	private WebElement SignedstateW4;

	@FindBy(xpath="//*[@id='contentAcceptance']//table[2]//tbody/tr[3]/td[3]/a")
	private WebElement SignedW4;

	@FindBy(xpath="//*[@id='cpxPopDiv1']//table/tbody/tr[3]/td[2]")
	private WebElement choosefile;

	@FindBy(xpath="//*[@onclick='return onUpload()']")
	private WebElement UploadBtn;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_AdditionalAmount']")
	private WebElement VMBasicPerAmount;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_NYStateAmount']")
	private WebElement VMstateamount;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_NYCityAmount']")
	private WebElement VMAgeAmount;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_YonkersStateAmount']")
	private WebElement VMPensionamount;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_ChildX2000']")
	private WebElement VMTuition;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_DependentX500']")
	private WebElement VMDisability;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_OtherIncome']")
	private WebElement VMSpouseamount;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_EligibleDependentAmount']")
	private WebElement VMdependent;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_moneyParameter1']")
	private WebElement VmMoneyPartner;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_CareGiverAmount']")
	private WebElement VMcaregiver;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_ClaimAmount']")
	private WebElement VMClaimAmount;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_IsBothSpouses']")
	private WebElement LessthanTotalclaim;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_Deductions']")
	private WebElement VMDeductions;

	@FindBy(xpath="//*[@id='vm_StateWithholdings_ICertifyGeneral']")
	private WebElement ICertify;

	@FindBy(xpath="//*[@id='content']//table/tbody/tr/td[2]/div")
	private WebElement AddPrevEmp;

	@FindBy(xpath="//*[@id='vm_ConsultantEmployers_EmployerName']")
	private WebElement EmpName;

	@FindBy(xpath="//*[@id='vm_ConsultantEmployers_BusinessTypeID']")
	private WebElement BusinessType;

	@FindBy(xpath="//*[@id='vm_ConsultantEmployers_Address1']")
	private WebElement EmpAdd;

	@FindBy(xpath="//*[@id='vm_ConsultantEmployers_City']")
	private WebElement EmpCity;

	@FindBy(xpath="//*[@id='vm_ConsultantEmployers_CountryID']")
	private WebElement EmpCountry;

	@FindBy(xpath="//*[@id='vm_ConsultantEmployers_StateID']")
	private WebElement EmpState;

	@FindBy(xpath="//*[@id='vm_ConsultantEmployers_ZipCode']")
	private WebElement EmpZipcode;

	@FindBy(xpath="//*[@id='vm_ConsultantEmployers_WorkStartDate']")
	private WebElement WorkStartdate;

	@FindBy(xpath="//*[@id='vm_ConsultantEmployers_WorkEndDate']")
	private WebElement Workenddate;

	@FindBy(xpath="//*[@id='vm_ConsultantEmployers_JobTitle']")
	private WebElement EmpJobTitle;

	@FindBy(xpath="//*[@id='content']/table/tbody/tr[1]//table/tbody/tr/td[2]")
	private WebElement W4getText;


	public OnBoarding_EmpPortal_Steps(WebDriver driver) throws IOException {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		Readprop = new Read_ConfigProperties_File();
		props = Readprop.getproperties();
	}

	public void EmpPortalLink_EmailHistory(Map<String,String> hmap) throws Exception 
	{
		//driver.navigate().refresh();
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

		lib.select(Category,hmap.get("category"));
		SearchImg.click();
		Thread.sleep(1000);
		Viewlogo.click();
		lib.switchOutOfFrame();
	}

	public void EmpPor_OBProcess(Map<String,String> hmap) throws Exception
	{
		lib = new Generic_Methods(driver);
		driver.switchTo().parentFrame();
		String str = GetUserPwd.getText();
		String un = str.split("User ID : ")[1].split("Password:")[0];
		String pwd = str.split("Password:")[1].substring(1,7);
		System.out.println(pwd);

		try {
			lib.waitForElementLoad(GetUsrPwdLink);
			Actions a=new Actions(driver);
			a.keyDown(Keys.CONTROL).build().perform();
			GetUsrPwdLink.click();
			a.keyUp(Keys.CONTROL).build().perform();
		} catch (TimeoutException e) {}		
		try {
			lib.waitForElementLoad(GetUsrPwdLink1);
			Actions a=new Actions(driver);
			a.keyDown(Keys.CONTROL).build().perform();
			GetUsrPwdLink1.click();
			a.keyUp(Keys.CONTROL).build().perform();
		} catch (TimeoutException e) {}

		String parentWindow= driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}}

		UserName.sendKeys(un);
		Password.sendKeys(pwd);
		Login.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Newpwd.sendKeys(hmap.get("NewPassword"));
		Confirmpwd.sendKeys(hmap.get("ConfirmPassword"));
		Continue.click();
		Thread.sleep(1000);

		try {
			lib.waitForElementLoad(SSNDOB);	
			SSNDOB.click();
			SSNDOB.sendKeys(hmap.get("vm_DOB"));
			lib.select(MaritalStatus,hmap.get("Maritalstatus"));		
			SSNNumber.sendKeys(hmap.get("SSN"));
			ConfirmSSN.sendKeys(hmap.get("confirmSSN"));
		}catch(TimeoutException e) {}		
		try {
			lib.waitForElementLoad(VerificationBtn);
			VerificationBtn.click();
		} catch (TimeoutException e) {}

		try {
			lib.waitForElementLoad(RehireEmp);					
			if(RehireEmp.isDisplayed()) {				
				String ReHire_Opt=hmap.get("ReHireOpt");
				String ReHire = "//*[@id='vm_SSNDetail_IsRehire'][@value='" + ReHire_Opt + "']";
				driver.findElement(By.xpath(ReHire)).click();	
				SaveandContinue.click();
				Thread.sleep(1000);

				((JavascriptExecutor) driver).executeScript("window.open();");		    
				Thread.sleep(1000);
				driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
				driver.get(hmap.get("url"));
				Thread.sleep(2000);
				MgmtBtn.click();
				Thread.sleep(1000);
				Workflowmenu.click();
				lib = new Generic_Methods(driver);
				lib.handlingFrame("frmContent");
				Searchbyword.sendKeys(hmap.get("ReHire_Text"));
				Taskto.sendKeys(hmap.get("ReHire_Task"));
				SearchImg.click();
				Thread.sleep(2000);
				ImgBtnTask.click();
				lib.switchOutOfFrame();	
				ApproveBtn.click();
				Thread.sleep(1500);
				driver.close();
				driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
				Thread.sleep(2000);
				driver.navigate().refresh();
				Thread.sleep(1500);	
				driver.findElement(By.xpath("//*[@id='mnuLinkStep01']")).click();
				Thread.sleep(1000);
			}
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(SINVerBtn);
			SINVerBtn.click();
		} catch (TimeoutException e) {}
		SaveandContinue.click();
		Thread.sleep(1000);

		MailingAddress.click();
		SaveandContinue.click();
		Thread.sleep(1000);

		EmergencyFName.sendKeys(hmap.get("FName"));
		EmergencyLName.sendKeys(hmap.get("LName"));
		lib.select(Relationship,hmap.get("Relationship"));
		EmergencyMobileNo.click();
		EmergencyMobileNo.sendKeys(hmap.get("EmerMobileNo"));
		SaveandContinue.click();
		Thread.sleep(1000);

		try {
			lib.waitForElementLoad(AddEducation);
			AddEducation.click();
			Thread.sleep(2000);
			InstituteName.sendKeys(hmap.get("Institutename"));
			lib.select(Degree,hmap.get("degree"));
			
			lib.select(InstituteStartMonth,hmap.get("InstituteStartmonth"));
			lib.select(InstituteStartYear,hmap.get("InstituteStartYear"));
			Thread.sleep(1000);
			lib.select(InstituteEndMonth,hmap.get("InstituteEndMonth"));
			lib.select(InstituteEndYear,hmap.get("InstituteEndYear"));
			Thread.sleep(1000);
			InstituteCity.sendKeys(hmap.get("InstituteCity"));
			lib.select(InstituteCountry,hmap.get("InstituteCountry"));
			lib.select(collegeState,hmap.get("collegeState"));
			fulltimeradioBtn.click();
			DidyouGraduate.click();
			Save.click();	
			Thread.sleep(3000);
			ContBtn.click();
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(AddPrevEmp);
			AddPrevEmp.click();
			Thread.sleep(1000);
			EmpName.sendKeys(hmap.get("EmployerName"));
			lib.select(BusinessType,hmap.get("Businesstype"));
			EmpAdd.sendKeys(hmap.get("EmpAddress"));
			EmpCity.sendKeys(hmap.get("Empcity"));
			EmpCountry.sendKeys(hmap.get("EmpCountry"));
			Thread.sleep(1000);
			EmpState.sendKeys(hmap.get("Empstate"));
			EmpZipcode.sendKeys(hmap.get("Empzipcode"));
			WorkStartdate.click();
			WorkStartdate.sendKeys(hmap.get("Workstartdate"));
			Workenddate.click();
			Workenddate.sendKeys(hmap.get("WorkEnddate"));
			EmpJobTitle.sendKeys(hmap.get("EmpJobtitle"));
			Save.click();
			Thread.sleep(2000);
			ContBtn.click();
		}catch(TimeoutException e) {}	

		try {
			lib.waitForElementLoad(Gender);
			lib.select(Gender,hmap.get("gender"));
			lib.select(Ethnicity,hmap.get("ethnicity"));
			SaveandContinue.click();
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(VeteranStatus);
			lib.select(VeteranStatus,hmap.get("Veteranstatus"));
			SaveandContinue.click();
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(Backgroundtest);
			Backgroundtest.click();
			SaveandContinue.click();
		} catch (TimeoutException e) {}		

		if (Drugtest.size() > 0) {
			Drugtest.get(0).click();
			SaveandContinue.click();}

		try {
			lib.waitForElementLoad(offerletter);
			js.executeScript("arguments[0].scrollIntoView();", offerletter);
			offerletter.click();
			SaveandContinue.click();
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(vmagreement);
			vmagreement.click();
			SaveandContinue.click();			
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(HandbookBtn);
			HandbookBtn.click();
			payrollbtn.click();
			SaveandContinue.click();
		}catch(TimeoutException e) {}

		//		try {
		//			lib.waitForElementLoad(ConfAgreement);
		//			ConfAgreement.click();
		//			SaveandContinue.click();
		//		}catch(TimeoutException e) {}
		//		try {
		//			lib.waitForElementLoad(CellphoneAgree);
		//			CellphoneAgree.click();
		//			SaveandContinue.click();
		//		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(I9Eligibility);	
			String I9TransCert =hmap.get("I9TransCert");
			String I9TranslatorCert = "//*[@id='vm_I9EligibilityInstructions_IsPreparer']/following-sibling::label[text()='"+ I9TransCert +"']/preceding::input[@type='radio'][1]";
			driver.findElement(By.xpath(I9TranslatorCert)).click();	
			if(I9IsPreparer.isSelected()) {
				I9InstFirstName.sendKeys(hmap.get("I9_FirstName"));
				I9InstLastName.sendKeys(hmap.get("I9_LastName"));
				I9InstAddress.sendKeys(hmap.get("I9_Address"));
				lib.select(I9InstStateID, hmap.get("I9_StateID"));
				I9InstCity.sendKeys(hmap.get("I9_City"));
				I9InstZipcode.sendKeys(hmap.get("I9_ZipCode"));
				
				String I9Status =hmap.get("I9_ImmigStatus");
				String I9ImmigStatus = "//input[@id='vm_I9EligibilityInstructions_ImmigStatusID']/following::label[normalize-space() = '"+ I9Status +"']/preceding::input[@type='radio'][1]";
				driver.findElement(By.xpath(I9ImmigStatus)).click();
			
				if(I9ImmigStatus_opt3.isSelected()) {
					I9ImmigDocNo.sendKeys(hmap.get("I9_USCISNo"));
				}else if(I9ImmigStatus_opt4.isSelected()) {
					I9ExpiryOn.click();
					I9ExpiryOn.sendKeys(hmap.get("I9_ExpiryOn"));
					I9Immig_USCISNumber.sendKeys(hmap.get("I9_USCISNo"));
				}
			}
			I9Eligibility.click();
			SaveandContinue.click();
		} catch (TimeoutException e) {}	
		
		try {
			lib.waitForElementLoad(I9DocEntry);
			I9DocEntry.click();
			lib.select(DocTitle,hmap.get("DocumentTitle"));
			DocIssuedBy.sendKeys(hmap.get("IssuedBy"));
			I9DocNo.sendKeys(hmap.get("DocNo"));
			ValidDate.click();
			ValidDate.sendKeys(hmap.get("ExpDate"));
			DocUpload.click();
			Thread.sleep(1000);
			Runtime.getRuntime().exec(props.getProperty("filepath1"));
			Thread.sleep(3500);
			SaveandContinue.click();
			Thread.sleep(1000);		
		} catch (TimeoutException e) {}

		try {
			lib.waitForElementLoad(W4Maritalstatus);
			lib.select(W4Maritalstatus,hmap.get("W4Maritalstatus"));
			String Checkopt =hmap.get("W4MulJobs");
			String W4ChkBox = "//*[@id='vm_W4Withholdings_IsMoreJobsOrSpouseWorks'][@value='" + Checkopt + "']";
			driver.findElement(By.xpath(W4ChkBox)).click();
			W4Depx2000.sendKeys(hmap.get("W4x2000"));
			W4Depx500.sendKeys(hmap.get("W4x500"));	
			W4Otherincome.sendKeys(hmap.get("w4Otherinc"));
			W4extraWithHoldings.sendKeys(hmap.get("w4Withholdings"));
			W4ItemizedDed.sendKeys(hmap.get("w4Ded"));
			W4MoneyParameters.sendKeys(hmap.get("w4Moneypar"));
			W4Deductions.sendKeys(hmap.get("w4Ded"));
			js.executeScript("arguments[0].scrollIntoView();", W4IAgreeCheckbox);
			W4IAgreeCheckbox.click();
			SaveandContinue.click();
		} catch (TimeoutException e) {}

		try {
			lib.waitForElementLoad(W4getText);
			WebElement text=W4getText;
			String Location=text.getText();
			System.out.println(Location);			
			//Alabama
			if (Location.equals("State Withholdings - AL"))
			{			
				NJW4CheckBox.click();
				String ExpValue=hmap.get("Alabama_ExmpFilingSeparately");
				String ClaimSeperately = "//*[@id='vm_StateWithholdings_intParameter1'][@value='" + ExpValue + "']";
				driver.findElement(By.xpath(ClaimSeperately)).click();

				String HOFOption=hmap.get("AL_ExmpClaimHeadOfFamily");
				String HeadOfFamily = "//*[@id='vm_StateWithholdings_strParameter1'][@value='" + HOFOption + "']";
				driver.findElement(By.xpath(HeadOfFamily)).click();

				SWDependents.sendKeys(hmap.get("AL_Dependents"));
				SWAddAmount.sendKeys(hmap.get("AL_AddAmt"));
				SaveandContinue.click();
			}
			//Arizona
			else if (Location.equals("State Withholdings - AZ"))
			{
				String value = hmap.get("MN_SectionSelection"); 
				if (value.equalsIgnoreCase("Data")) 
				{				
					String AZRate=hmap.get("AZ_WithHoldingsRate");
					String ArizonaRate = "//*[@id='vm_StateWithholdings_intParameter1']/following-sibling::label[contains(text(),'"+ AZRate +"')]";
					driver.findElement(By.xpath(ArizonaRate)).click();				
					SWAddAmount.sendKeys(hmap.get("AZ_AdditionalAmt"));
					SaveandContinue.click();
				}else {
					String AZRate=hmap.get("AZ_WithHoldingsRate");
					String ArizonaRate = "//*[@id='vm_StateWithholdings_intParameter1']/following-sibling::label[contains(text(),'"+ AZRate +"')]";
					driver.findElement(By.xpath(ArizonaRate)).click();				
					SWAddAmount.sendKeys(hmap.get("AZ_AdditionalAmt"));
					SWICertifyGen.click();
					SaveandContinue.click();
				}}
			//Arkansas
			else if (Location.equals("State Withholdings - AR"))
			{				
				String ExpValue=hmap.get("Arkansas_Exmp");
				String ExmpOpt = "//*[@id='vm_StateWithholdings_intParameter1'][@value='" + ExpValue + "']";
				driver.findElement(By.xpath(ExmpOpt)).click();			
				NoOfAllowances.sendKeys(hmap.get("AK_Dep"));
				SWAddAmount.sendKeys(hmap.get("AK_AddAmt"));

				String ITRate=hmap.get("AK_ITRates");
				String ITRates = "//*[@id='vm_StateWithholdings_IsYoueself'][@value='"+ ITRate +"']";
				driver.findElement(By.xpath(ITRates)).click();	

				String MarStatus=hmap.get("AK_Maritalstatus");
				String MaritalStatus = "//*[@id='vm_StateWithholdings_intParameter3'][@value='"+ MarStatus +"']";
				driver.findElement(By.xpath(MaritalStatus)).click();	

				SaveandContinue.click();
			}
			//California
			else if (Location.equals("State Withholdings - CA"))
			{				
				String ExpValue=hmap.get("California_WithHoldingStatus");
				String ExmpOpt = "//*[@id='vm_StateWithholdings_intParameter1']//following::label[normalize-space()='"+ ExpValue +"']/preceding-sibling::input[1]";
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
					driver.switchTo().alert().accept();	
				}
				else if(value.equalsIgnoreCase("4")) {
					SWRegAllowancesA.sendKeys(hmap.get("Est_Deductions_A"));
					SWRegAllowancesB.sendKeys(hmap.get("Est_Deductions_B"));
					SWAddAmount.sendKeys(hmap.get("Additional_Amount"));
					NJW4CheckBox.click();
					driver.switchTo().alert().accept();	
				}				
				SaveandContinue.click();
			}

			//Delaware,Colorado,New Mexico
			else if (Location.equals("State Withholdings - NM")||Location.equals("State Withholdings - CO")||Location.equals("State Withholdings - DE"))
			{					
				SWExtraWithHolding.sendKeys(hmap.get("w4Withholdings"));
				SaveandContinue.click();
			}
			//Connecticut
			else if (Location.equals("State Withholdings - CT"))
			{	
				String value = hmap.get("Connecticut_scenerio"); 
				if (value.equalsIgnoreCase("Data"))
				{
					String ExpValue=hmap.get("CT_WithHoldingCode");
					String ExmpOpt = "//*[@id='vm_StateWithholdings_intParameter1']/following-sibling::label[text()='"+ ExpValue +"']/preceding-sibling::input[@type='radio'][1]";
					driver.findElement(By.xpath(ExmpOpt)).click();	
					SWAddAmount.sendKeys(hmap.get("SWAddAmt"));	
				}
				else if (value.equalsIgnoreCase("ChkBox")) 
				{
					String ExpValue=hmap.get("CT_WithHoldingCode");
					String ExmpOpt = "//*[@id='vm_StateWithholdings_intParameter1']/following-sibling::label[text()='"+ ExpValue +"']/preceding-sibling::input[@type='radio'][1]";
					driver.findElement(By.xpath(ExmpOpt)).click();	
					SWAddAmount.sendKeys(hmap.get("CT_AddWithHoldingAmt"));		
					SWICertifyGen.click();
					if(SWICertifyGen.isSelected()) {
						LegalRes.sendKeys(hmap.get("CT_LegalResidence"));
					}
				}
				SaveandContinue.click();
			}
			//D.C
			else if (Location.equals("State Withholdings - DC"))
			{	
				String TaxFilingOpt=hmap.get("DC_TaxFilingStatus");
				String TaxFilingStatus = "//*[@id='vm_StateWithholdings_intParameter1']/following-sibling::label[normalize-space()='"+ TaxFilingOpt +"']/preceding-sibling::input[@type='radio'][1]";
				driver.findElement(By.xpath(TaxFilingStatus)).click();	

				SWAddAmount.sendKeys(hmap.get("DC_AddAmt"));

				String ExpValue=hmap.get("DC_WithHoldingAllow");
				String WithHoldingAllowance = "//*[@type='checkbox']/following-sibling::label[normalize-space()=\""+ ExpValue +"\"]/preceding-sibling::input[@type='checkbox'][1]";
				driver.findElement(By.xpath(WithHoldingAllowance)).click();	
				String ExpValue1=hmap.get("DC_WithHoldingAllow1");
				String WithHoldingAllowance1 = "//*[@type='checkbox']/following-sibling::label[normalize-space()=\""+ ExpValue1 +"\"]/preceding-sibling::input[@type='checkbox'][1]";
				driver.findElement(By.xpath(WithHoldingAllowance1)).click();	

				SWTtlpersonal.sendKeys(hmap.get("DC_Dependents"));
				NYstateAmt.sendKeys(hmap.get("DC_ItemizedDed"));
				SWExmptwithholding.click();

				String ClaimExmp=hmap.get("DC_ClaimExmp_FullTime");
				String ClaimExmpFullTime = "//*[@id='vm_StateWithholdings_intParameter3']/following-sibling::label[normalize-space()='"+ ClaimExmp +"']/preceding-sibling::input[@type='radio'][1]";
				driver.findElement(By.xpath(ClaimExmpFullTime)).click();	

				String Dist=hmap.get("DC_StateOfColumbia");
				String DistOfColumbia = "//*[@id='vm_StateWithholdings_intParameter2']/following-sibling::label[normalize-space()='"+ Dist +"']/preceding-sibling::input[@type='radio'][1]";
				driver.findElement(By.xpath(DistOfColumbia)).click();	
				SWInstructionLetter.sendKeys(hmap.get("DC_StateOfDomicile"));	
				SaveandContinue.click();
			}
			//Georgia
			else if (Location.equals("State Withholdings - GA"))
			{	
				String value = hmap.get("Georgia_Scenerios"); 
				if (value.equalsIgnoreCase("Data")) {			
					String ExpValue=hmap.get("GA_Maritalstatus");
					String ExmpOpt = "//*[@name='vm_StateWithholdings.TotalAgeBlindness'][@value='" + ExpValue + "']";
					driver.findElement(By.xpath(ExmpOpt)).click();	

					GATxt1.sendKeys(hmap.get("GA_MaritalStatus_Num"));

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
					SaveandContinue.click();
				}else {
					String ExpValue=hmap.get("GA_Maritalstatus");
					String ExmpOpt = "//*[@name='vm_StateWithholdings.TotalAgeBlindness'][@value='" + ExpValue + "']";
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
					SaveandContinue.click();
				}
			}
			//Hawaii
			else if (Location.equals("State Withholdings - HI"))
			{	
				String MarStatus=hmap.get("Hawai_MaritalStatus");
				String ExmpOpt = "//*[@id='vm_StateWithholdings_intParameter1'][@value='" + MarStatus + "']";
				driver.findElement(By.xpath(ExmpOpt)).click();	

				String DisabledPer=hmap.get("HI_DisabledPer");
				String DisPer = "//*[@id='vm_StateWithholdings_IsBothSpouses'][@value='" + DisabledPer + "']";
				driver.findElement(By.xpath(DisPer)).click();	

				String NonResSpouse=hmap.get("HI_MilSpouse");
				String Miltaryspouse = "//*[@id='vm_StateWithholdings_ICertifyGeneral'][@value='" + NonResSpouse + "']";
				driver.findElement(By.xpath(Miltaryspouse)).click();	

				SWTotNum.sendKeys(hmap.get("HI_Allowances"));
				SWAddAmount.sendKeys(hmap.get("HI_AddAmt"));			
				SaveandContinue.click();
			}
			//Idaho
			else if (Location.equals("State Withholdings - ID"))
			{	
				String WHStatus=hmap.get("Idaho_WHStatus");
				String WithHoldStatus = "//*[@id='vm_StateWithholdings_intParameter3'][@value='" + WHStatus + "']";
				driver.findElement(By.xpath(WithHoldStatus)).click();

				SWAllowances.sendKeys(hmap.get("ID_Allowances"));
				SWAddAmount.sendKeys(hmap.get("ID_AddAmt"));
				SaveandContinue.click();
			}
			//Illinois
			else if (Location.equals("State Withholdings - IL"))
			{	
				String value = hmap.get("Georgia_Scenerios"); 
				if (value.equalsIgnoreCase("Data")) 
				{		
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
					SaveandContinue.click();
				}else {
					String ChkBox=hmap.get("IL_PerAllowances");
					String ChkBoxOpt = "//input[@type='checkbox']/following::label[normalize-space() = '" + ChkBox + "']/preceding-sibling::input[@type='checkbox'][1]";
					driver.findElement(By.xpath(ChkBoxOpt)).click();

					SWTtlpersonal.sendKeys(hmap.get("IL_Dependents"));
					SWTotNumClaims.sendKeys(hmap.get("StateExmDep"));
					NYstateAmt.sendKeys(hmap.get("IL_TotalNoPerAllowances"));

					String ChkBox1=hmap.get("IL_AddAllowances");
					String AddAllowancesOpt = "//label[contains(text(),\""+ ChkBox1 +"\")]/preceding-sibling::input[@type='checkbox'][1]";
					driver.findElement(By.xpath(AddAllowancesOpt)).click();

					NYstateAmt.sendKeys(hmap.get("w4Ded"));
					SWAllowances.sendKeys(hmap.get("IL_TotalAddAllowances"));
					SWAddAmount.sendKeys(hmap.get("IL_AddAmt"));
					ExmpFedandIncomeTax.click();
					SaveandContinue.click();
				}
			}
			//Indiana
			else if (Location.equals("State Withholdings - IN"))
			{	
				String ClaimYourself=hmap.get("Indiana_ExmpforYourself");
				String ExmpSelf = "//*[@id='vm_StateWithholdings_IsYoueself']/following-sibling::label[text()='"+ ClaimYourself +"']/preceding-sibling::input[@type='radio'][1]";
				driver.findElement(By.xpath(ExmpSelf)).click();

				String ClaimSpouse=hmap.get("IN_ExmpforSpouse");
				String ExmpSpouse = "//*[@id='vm_StateWithholdings_IsBothSpouses']/following-sibling::label[text()='"+ ClaimSpouse +"']/preceding-sibling::input[@type='radio'][1]";
				driver.findElement(By.xpath(ExmpSpouse)).click();

				SWAllowances.sendKeys(hmap.get("IN_Dependents"));

				String AddExmp=hmap.get("IN_AdditionalExmp");
				String AdditionalExemption = "//*[@id='vm_StateWithholdings_IsHeadFamily']/following-sibling::label[normalize-space()=\""+ AddExmp +"\"]/preceding-sibling::input[@type='checkbox'][1]";
				driver.findElement(By.xpath(AdditionalExemption)).click();

				NoOfAllowances.sendKeys(hmap.get("IN_ExmpForQualifyingDep"));				
				SWDependents.sendKeys(hmap.get("IN_ExmpForAdoptedQualifyingDep"));
				NYstateAmt.sendKeys(hmap.get("IN_AddStateWithHoldings"));
				NYCityAmt.sendKeys(hmap.get("IN_AddCountryWithHoldings"));
				SaveandContinue.click();		
			}
			//Iowa
			else if (Location.equals("State Withholdings - IA"))
			{	
				String MarStatus=hmap.get("Iowa_MaritalStatus");
				String HeadofHouse = "//*[@id='vm_StateWithholdings_IsHeadFamily']/following-sibling::label[text()='"+ MarStatus +"']/preceding-sibling::input[1]";
				driver.findElement(By.xpath(HeadofHouse)).click();

				SWExmptwithholding.click();
				if(SWExmptwithholding.isSelected()) {
					SWDependents.sendKeys(hmap.get("StateW4_Year"));
				}
				SWTaxClaimExp.click();
				SWInstructionLetter.sendKeys(hmap.get("IA_StateDomicile"));
				SWTtlpersonal.sendKeys(hmap.get("IA_PerAllowances"));
				SWTotNumClaims.sendKeys(hmap.get("IA_Dependents"));			
				SWAddAllowances.sendKeys(hmap.get("IA_ItemizedDed"));
				SWAllowances.sendKeys(hmap.get("IA_AdjToIncome"));
				NoOfAllowances.sendKeys(hmap.get("IA_ChildAndDep"));
				SWAddAmount.sendKeys(hmap.get("IA_AddAmt"));
				SaveandContinue.click();
			}
			//Kansas
			else if (Location.equals("State Withholdings - KS"))
			{	
				String AllRate=hmap.get("KS_AllowanceRate");
				String AllowanceRate = "//*[@id='vm_StateWithholdings_IsBothSpouses']/following-sibling::label[text()='"+ AllRate +"']/preceding-sibling::input[@type='radio']";
				driver.findElement(By.xpath(AllowanceRate)).click();

				String value = hmap.get("Kansas_Scenerios"); 
				if (value.equalsIgnoreCase("Data")) 
				{						
					String YourselfDep=hmap.get("KS_ClaimYourselfDep");
					String Dependent = "//*[@id='vm_StateWithholdings_IsYoueself']/following-sibling::label[text()='"+ YourselfDep +"']/preceding-sibling::input[@type='radio']";
					driver.findElement(By.xpath(Dependent)).click();

					String Spousework=hmap.get("KS_ClaimSpouseDep");
					String SpuseDepWork = "//*[@id='vm_StateWithholdings_IsNewEmployee']/following-sibling::label[text()='"+ Spousework +"']/preceding-sibling::input[@type='radio']";
					driver.findElement(By.xpath(SpuseDepWork)).click();				

					String Head=hmap.get("KS_HeadofHousehold");
					String HeadofHousehold = "//*[@id='vm_StateWithholdings_IsHeadFamily']/following-sibling::label[text()='"+ Head +"']/preceding-sibling::input[@type='radio']";
					driver.findElement(By.xpath(HeadofHousehold)).click();

					SWTtlpersonal.sendKeys(hmap.get("KS_Dependents"));
					SWAddAmount.sendKeys(hmap.get("KS_AdditionalAmt"));
				}else if (value.equalsIgnoreCase("ChkBox")) 
				{						
					String YourselfDep=hmap.get("KS_ClaimYourselfDep");
					String Dependent = "//*[@id='vm_StateWithholdings_IsYoueself']/following-sibling::label[text()='"+ YourselfDep +"']/preceding-sibling::input[@type='radio']";
					driver.findElement(By.xpath(Dependent)).click();

					String Spousework=hmap.get("KS_ClaimSpouseDep");
					String SpuseDepWork = "//*[@id='vm_StateWithholdings_IsNewEmployee']/following-sibling::label[text()='"+ Spousework +"']/preceding-sibling::input[@type='radio']";
					driver.findElement(By.xpath(SpuseDepWork)).click();

					String Head=hmap.get("KS_HeadofHousehold");
					String HeadofHousehold = "//*[@id='vm_StateWithholdings_IsHeadFamily']/following-sibling::label[text()='"+ Head +"']/preceding-sibling::input[@type='radio']";
					driver.findElement(By.xpath(HeadofHousehold)).click();

					SWTtlpersonal.sendKeys(hmap.get("KS_Dependents"));
					SWAddAmount.sendKeys(hmap.get("KS_AdditionalAmt"));
					SWICertifyGen.click();
				}				
				SaveandContinue.click();
			}
			//Kentucky
			else if (Location.equals("State Withholdings - KY"))
			{	
				String ExemptOpt=hmap.get("Kentucky_CheckifExempt");
				String ExemptOption = "//td[normalize-space() = '"+ ExemptOpt +"']/input[@type='checkbox']";
				driver.findElement(By.xpath(ExemptOption)).click();	
				String ExemptOpt1=hmap.get("Kentucky_CheckifExempt");
				String ExemptOption1 = "//td[normalize-space() = '"+ ExemptOpt1 +"']/input[@type='checkbox']";
				driver.findElement(By.xpath(ExemptOption1)).click();					
				if(SWBothSpouses.isSelected()) {
					SWInstructionLetter.sendKeys(hmap.get("KY_ResidentOf"));
				}		
				SWAddAmount.sendKeys(hmap.get("KY_AdditionalAmt"));
				SaveandContinue.click();
			}
			//Louisiana
			else if (Location.equals("State Withholdings - LA"))
			{
				String AllowancesOpt=hmap.get("Louisiana_PersonalAllowances");
				String PerAllowOpt = "//*[@id='vm_StateWithholdings_intParameter1']/following-sibling::label[normalize-space()='"+ AllowancesOpt +"']/preceding-sibling::input[@type='radio'][1]";
				driver.findElement(By.xpath(PerAllowOpt)).click();	
				SWTotNumClaims.sendKeys(hmap.get("LA_Dependents"));
				SWAddAmount.sendKeys(hmap.get("LA_AddAmt"));
				SaveandContinue.click();
			}
			//Maine
			else if (Location.equals("State Withholdings - ME"))
			{
				String MarStatus=hmap.get("Maine_MaritalStatus");
				String MaritalStatus = "//*[@id='vm_StateWithholdings_intParameter1'][@value='" + MarStatus + "']";
				driver.findElement(By.xpath(MaritalStatus)).click();	

				SWAddAmount.sendKeys(hmap.get("ME_AddAmt"));

				String ExpValue=hmap.get("ME_ClaimExempt");
				String ClaimedExmp = "//*[@id='vm_StateWithholdings_IsBothSpouses']/following-sibling::label[text()='"+ ExpValue +"']/preceding-sibling::input[1]";
				driver.findElement(By.xpath(ClaimedExmp)).click();

				String Federal=hmap.get("ME_Cmpd_Federal");
				String Completedfederal = "//*[@id='vm_StateWithholdings_IsYoueself']/following-sibling::label[text()='"+ Federal +"']/preceding-sibling::input[1]";
				driver.findElement(By.xpath(Completedfederal)).click();

				String MemValue=hmap.get("ME_SpouseMemofMilitary");
				String MemOfMilitary = "//*[@id='vm_StateWithholdings_IsResidentNY']/following-sibling::label[text()='"+ MemValue +"']/preceding-sibling::input[1]";
				driver.findElement(By.xpath(MemOfMilitary)).click();

				SWClaimdep.sendKeys(hmap.get("ME_ClaimYouselfDep"));
				SWAddAllowances.sendKeys(hmap.get("ME_ClaimSpouseDep"));	
				SWHeadofhousehold.sendKeys(hmap.get("ME_HeadHousehold"));
				SWDependents.sendKeys(hmap.get("ME_otherDep"));
				SWTotNum.click();
				SaveandContinue.click();
			}
			//Maryland
			else if (Location.equals("State Withholdings - MD"))
			{
				String MaritalOpt =hmap.get("Maryland_MaritalStatus");
				String MaritalOption = "//*[@id='vm_StateWithholdings_intParameter1']/following-sibling::label[contains(text(),'"+ MaritalOpt +"')]/preceding-sibling::input[@type='radio'][1]";
				driver.findElement(By.xpath(MaritalOption)).click();

				SWIsMoreJobsorSpouses.click();				
				ClaimDependentsChildren.sendKeys(hmap.get("W4x2000"));
				ClaimDependents.sendKeys(hmap.get("W4x500"));	
				AdjustmentsOtherincome.sendKeys(hmap.get("w4Otherinc"));
				AdjustmentsDeductions.sendKeys(hmap.get("w4Ded"));
				AdjustmentsWithHoldings.sendKeys(hmap.get("w4Withholdings"));
				SaveandContinue.click();
			}
			//Massachusetts
			else if (Location.equals("State Withholdings - MA"))
			{
				String Allowance=hmap.get("Massachusetts_ClaimYourself");
				String ClaimExpSelf = "//label[text()='"+ Allowance +"']/preceding-sibling::input[@id='vm_StateWithholdings_intParameter1'][@type='radio'][1]";
				driver.findElement(By.xpath(ClaimExpSelf)).click();	

				String Depexp=hmap.get("MA_ClaimForSpouse");
				String ClaimexpSpouse = "//label[text()='"+ Depexp +"']/preceding-sibling::input[@id='vm_StateWithholdings_intParameter2'][@type='radio'][1]";
				driver.findElement(By.xpath(ClaimexpSpouse)).click();

				SWTtlpersonal.sendKeys(hmap.get("MA_Dependents"));
				SWAddAmount.sendKeys(hmap.get("MA_AddWithHoldings"));

				String Status=hmap.get("MA_Status");
				String StatusMA = "//td[@class='display-field']//input[@data-val-required='"+ Status +"']";
				driver.findElement(By.xpath(StatusMA)).click();

				SaveandContinue.click();
			}
			//Michigan
			else if (Location.equals("State Withholdings - MI"))
			{	
				String ExpValue=hmap.get("MI_NewEmp");
				String ExmpOpt = "//*[@id='vm_StateWithholdings_IsNewEmployee'][@value='" + ExpValue + "']";
				driver.findElement(By.xpath(ExmpOpt)).click();					
				if(SWDateofHire.isEnabled()) {
					SWDateofHire.click();
					SWDateofHire.sendKeys(hmap.get("MI_DateofHire"));}	

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
				SaveandContinue.click();
			}
			//Minnesota
			else if (Location.equals("State Withholdings - MN"))
			{
				String MNStatus=hmap.get("Minnesota_MaritalStatus");
				String MinnesotaMaritalstatus = "//input[@id='vm_StateWithholdings_MaritalStatusID'][@value='"+ MNStatus +"']";
				driver.findElement(By.xpath(MinnesotaMaritalstatus)).click();

				String value = hmap.get("MN_SectionSelection"); 
				if (value.equalsIgnoreCase("Section 1")) 
				{						
					Sec1Dependent.sendKeys(hmap.get("MN_Dependent"));
					Sec1SingleandOneJob.sendKeys(hmap.get("MN_Dependent"));
					Sec1ForSpouse.sendKeys(hmap.get("MN_1forSpouse0forWorkingspouse"));
					NoofDependents.sendKeys(hmap.get("MN_Dependents"));;
					MNHeadofHousehold.sendKeys(hmap.get("MN_HeadofHousehold"));
					SWAddAmount.sendKeys(hmap.get("MN_AddWithHoldings"));
					SaveandContinue.click();
				}else if(value.equalsIgnoreCase("Section 2"))
				{
					Sec1Dependent.sendKeys(hmap.get("MN_Dependent"));
					Sec1SingleandOneJob.sendKeys(hmap.get("MN_Dependent"));
					Sec1ForSpouse.sendKeys(hmap.get("MN_1forSpouse0forWorkingspouse"));
					NoofDependents.sendKeys(hmap.get("MN_Dependents"));
					MNHeadofHousehold.sendKeys(hmap.get("MN_HeadofHousehold"));

					String MNExmp=hmap.get("MN_ExmpWithHoldings");
					String MNExmpstatus = "//input[@id='vm_StateWithholdings_intParameter4'][@value='"+ MNExmp +"']";
					driver.findElement(By.xpath(MNExmpstatus)).click();
					if(SWInstructionLetter.isEnabled()) {
						SWInstructionLetter.sendKeys("MN");
					}if(MNResName.isEnabled()) {
						MNResName.sendKeys(hmap.get("MN_ResName"));
						CDIBEnrollmentNum.sendKeys(hmap.get("MN_CDIBEnrollmentNumber"));
					}
				}
			}
			//Mississippi
			else if (Location.equals("State Withholdings - MS"))
			{
				String SpouseEmp=hmap.get("MS_SpouseEmp");
				String IsSpouseEmp = "//*[@id='vm_StateWithholdings_IsBothSpouses']/following-sibling::label[text()='"+ SpouseEmp +"']/preceding-sibling::input[1]";
				driver.findElement(By.xpath(IsSpouseEmp)).click();	

				SWAllowances.sendKeys(hmap.get("MS_Dep"));				
				SWAddAmount.sendKeys(hmap.get("MS_AddAmt"));	
				SWICertifyGen.click();
				SaveandContinue.click();
			}
			//Missouri
			else if (Location.equals("State Withholdings - MO"))
			{	
				String MarStatus=hmap.get("Missouri_MaritalStatus");
				String MaritalStatus = "//*[@id='vm_StateWithholdings_intParameter1']/following-sibling::label[text()='"+ MarStatus +"']/preceding-sibling::input[@type='radio'][1]";
				driver.findElement(By.xpath(MaritalStatus)).click();

				SWAddAmount.sendKeys(hmap.get("MO_AddWithHoldings"));
				SWMoneyPar.sendKeys(hmap.get("MO_ReducedWithHoldings"));

				String ExemptValue=hmap.get("MO_ExemptStatus");
				String Exmpstatus = "//*[@id='vm_StateWithholdings_intParameter2'][@value='" + ExemptValue + "']";
				driver.findElement(By.xpath(Exmpstatus)).click();
				SaveandContinue.click();
			}
			//Montana
			else if (Location.equals("State Withholdings - MT"))
			{
				Allowancesself.sendKeys(hmap.get("Montana_CalimSelf"));
				MNHeadofHousehold.sendKeys(hmap.get("MT_OneJob"));
				FilingJointly.sendKeys(hmap.get("MT_FilingJointly"));
				Sec1ForSpouse.sendKeys(hmap.get("MT_Depts"));
				WorkingSpouse.sendKeys(hmap.get("MT_Household"));
				ItemizedDed.sendKeys(hmap.get("MT_Ded"));		
				SWAddAmount.sendKeys(hmap.get("MT_AddAmt"));

				String RadioBtnOpt=hmap.get("MT_Sec2_ITTax");
				String IT_WithHoldings = "//*[@id='vm_StateWithholdings_intParameter3'][@value='"+ RadioBtnOpt +"']";
				driver.findElement(By.xpath(IT_WithHoldings)).click();				
				SaveandContinue.click();
			}
			//Nebraska
			else if (Location.equals("State Withholdings - NE"))
			{
				String MarStatus=hmap.get("NE_MaritalStatus");
				String MaritalStatus = "//*[@id='vm_StateWithholdings_intParameter3']/following-sibling::label[text()='"+ MarStatus +"']/preceding-sibling::input[1]";
				driver.findElement(By.xpath(MaritalStatus)).click();

				String value = hmap.get("Nebraska_Scenerios"); 
				if (value.equalsIgnoreCase("Data")) 
				{	
					SWAddAmount.sendKeys(hmap.get("NE_AddAmt"));
					MNHeadofHousehold.sendKeys(hmap.get("NE_ClaimAsDep"));
					NebraskaonePension.sendKeys(hmap.get("NE_MorePension"));
					WorkingSpouse.sendKeys(hmap.get("NE_WorkingSpouse"));
					PersonalExemption.sendKeys(hmap.get("NE_PerExmp"));
					Sec1ForSpouse.sendKeys(hmap.get("NE_HeadofHousehold"));
				}
				else if (value.equalsIgnoreCase("ChkBox")) 
				{	
					SWAddAmount.sendKeys(hmap.get("NE_AddAmt"));
					MNHeadofHousehold.sendKeys(hmap.get("NE_ClaimAsDep"));
					NebraskaonePension.sendKeys(hmap.get("NE_MorePension"));
					WorkingSpouse.sendKeys(hmap.get("NE_WorkingSpouse"));
					PersonalExemption.sendKeys(hmap.get("NE_PerExmp"));
					Sec1ForSpouse.sendKeys(hmap.get("NE_HeadofHousehold"));
					SWICertifyGen.click();
				}
				SaveandContinue.click();
			}
			//New Jersey
			else if (Location.equals("State Withholdings - NJ"))
			{
				String ExpValue=hmap.get("NewJersey_WithHoldingStatus");
				String ExmpOpt = "//*[@id='vm_StateWithholdings_intParameter1'][@value='" + ExpValue + "']";
				driver.findElement(By.xpath(ExmpOpt)).click();									
				Thread.sleep(1000);
				SWInstructionLetter.sendKeys(hmap.get("NJ_InsLetter"));
				SWTotNum.sendKeys(hmap.get("NJ_Allowances"));
				SWAddAmount.sendKeys(hmap.get("NJ_AddAmount"));			
				SaveandContinue.click();
			}
			//North Carolina
			else if (Location.equals("State Withholdings - NC"))
			{
				String MaritalStatusValue=hmap.get("NorthCarolina_MaritalStatus");
				String ExmpOpt = "//input[@type='radio']/following::label[normalize-space()='" + MaritalStatusValue + "']/preceding-sibling::input[@type='radio']";
				driver.findElement(By.xpath(ExmpOpt)).click();									
				Thread.sleep(1000);
				SWTotNum.sendKeys(hmap.get("NJ_Allowances"));
				SWAddAmount.sendKeys(hmap.get("NJ_AddAmount"));			
				SaveandContinue.click();
			}
			//New York
			else if (Location.equals("State Withholdings - NY"))
			{
				String ExpValue=hmap.get("NewJersey_WithHoldingStatus");
				String ExmpOpt = "//*[@id='vm_StateWithholdings_intParameter3'][@value='" + ExpValue + "']";
				driver.findElement(By.xpath(ExmpOpt)).click();

				String Radioopt=hmap.get("NY_ResOfNYcity");
				String W4radioBox = "//*[@id='vm_StateWithholdings_IsResidentNY'][@value='" + Radioopt + "']";
				driver.findElement(By.xpath(W4radioBox)).click();	

				String Radioopt1=hmap.get("NY_ResOfYonkercity");
				String W4radioBox1 = "//*[@id='vm_StateWithholdings_IsResidentYonkers'][@value='" + Radioopt1 + "']";
				driver.findElement(By.xpath(W4radioBox1)).click();

				SWAllowances.sendKeys(hmap.get("NY_TotalAllowances"));
				NoOfAllowances.sendKeys(hmap.get("NY_Allowances"));				
				NYstateAmt.sendKeys(hmap.get("NY_StateAmt"));
				NYCityAmt.sendKeys(hmap.get("NY_CityAmt"));
				YonkerstateAmt.sendKeys(hmap.get("NY_YonkersAmt"));;
				SaveandContinue.click();
			}
			//Ohio
			else if (Location.equals("State Withholdings - OH"))
			{
				SWInstructionLetter.sendKeys(hmap.get("Ohio_DistOfResidence"));
				NoOfAllowances.sendKeys(hmap.get("OH_SchoolDistNo"));

				String Radioopt=hmap.get("OH_PerExmp_Yourself");
				String W4radioBox = "//*[@id='vm_StateWithholdings_IsYoueself'][@value='" + Radioopt + "']";
				driver.findElement(By.xpath(W4radioBox)).click();

				String Radioopt1=hmap.get("OH_PerExmp_Spouse");
				String W4radioBox1 = "//*[@id='vm_StateWithholdings_IsBothSpouses'][@value='" + Radioopt1 + "']";
				driver.findElement(By.xpath(W4radioBox1)).click();

				SWTotNum.sendKeys(hmap.get("OH_ExmpDependents"));
				SWAddAmount.sendKeys(hmap.get("OH_AddWithHoldings"));
				SaveandContinue.click();
			}
			//Oklahoma
			else if (Location.equals("State Withholdings - OK"))
			{
				String Radioopt=hmap.get("Oklahoma_MaritalStatus");
				String Maritalstatus = "//*[@id='vm_StateWithholdings_MaritalStatusID'][@value='" + Radioopt + "']";
				driver.findElement(By.xpath(Maritalstatus)).click();

				String CalimSelfOpt=hmap.get("OK_ClaimSelf");
				String ClaimSelf = "//*[@id='vm_StateWithholdings_intParameter1']/following-sibling::label[text()='"+ CalimSelfOpt +"']/preceding-sibling::input[1]";
				driver.findElement(By.xpath(ClaimSelf)).click();

				String Spousework=hmap.get("OK_ClaimSpouse");
				String ClaimSpouse = "//*[@id='vm_StateWithholdings_intParameter2']/following-sibling::label[text()='"+ Spousework +"']/preceding-sibling::input[1]";
				driver.findElement(By.xpath(ClaimSpouse)).click();

				SWDependents.sendKeys(hmap.get("OK_Dependents"));
				SWAddAllowances.sendKeys(hmap.get("OK_AddAllowances"));
				SWAddAmount.sendKeys(hmap.get("OK_AddAmt"));
				SWExmptwithholding.click();
				SWTaxClaimExp.click();
				SWICertifyGen.click();
				SaveandContinue.click();
			}
			//Oregon
			else if (Location.equals("State Withholdings - OR"))
			{
				SWIsRedetermination.click();			
				String Radioopt=hmap.get("Oregon_MaritalStatus");
				String Maritalstatus = "//*[@id='vm_StateWithholdings_intParameter3'][@value='"+ Radioopt +"']";
				driver.findElement(By.xpath(Maritalstatus)).click();

				SWAllowances.sendKeys(hmap.get("OR_Dependents"));
				SWAddAmount.sendKeys(hmap.get("OR_AddAllowances"));
				SWExmptwithholding.click();
				SWInstructionLetter.sendKeys(hmap.get("OR_ExmpCode"));
				SaveandContinue.click();
			}
			//Rhode Island
			else if (Location.equals("State Withholdings - RI"))
			{
				String value = hmap.get("RhodeIsland_Scenerios"); 
				if (value.equalsIgnoreCase("Data")) 
				{	
					String ClaimSelf=hmap.get("RI_YourselfDep");
					String ClaimYourself = "//*[@id='vm_StateWithholdings_IsYoueself']/following-sibling::label[text()='"+ ClaimSelf +"']/preceding-sibling::input[@type='radio']";
					driver.findElement(By.xpath(ClaimYourself)).click();	

					String Spouse=hmap.get("RI_SpouseDep");
					String ClaimSpouse = "//*[@id='vm_StateWithholdings_IsBothSpouses']/following-sibling::label[text()='"+ Spouse +"']/preceding-sibling::input[@type='radio']";
					driver.findElement(By.xpath(ClaimSpouse)).click();	

					SWTtlpersonal.sendKeys(hmap.get("RI_Dependents"));
					SWTotNumClaims.sendKeys(hmap.get("RI_AddAllowances"));
					SWAddAmount.sendKeys(hmap.get("RI_AdditionalAmt"));
				}
				else if (value.equalsIgnoreCase("ChkBox")) 
				{	
					String ClaimSelf=hmap.get("RI_YourselfDep");
					String ClaimYourself = "//*[@id='vm_StateWithholdings_IsYoueself']/following-sibling::label[text()='"+ ClaimSelf +"']/preceding-sibling::input[@type='radio']";
					driver.findElement(By.xpath(ClaimYourself)).click();	

					String Spouse=hmap.get("RI_SpouseDep");
					String ClaimSpouse = "//*[@id='vm_StateWithholdings_IsBothSpouses']/following-sibling::label[text()='"+ Spouse +"']/preceding-sibling::input[@type='radio']";
					driver.findElement(By.xpath(ClaimSpouse)).click();	

					SWTtlpersonal.sendKeys(hmap.get("RI_Dependents"));
					SWTotNumClaims.sendKeys(hmap.get("RI_AddAllowances"));
					SWAddAmount.sendKeys(hmap.get("RI_AdditionalAmt"));		
					SWICertifyGen.click();
				}
				SaveandContinue.click();
			}
			//South Carolina
			else if (Location.equals("State Withholdings - SC"))
			{
				String MarStatus=hmap.get("SouthCarolina_MaritalStatus");
				String AllYourself = "//*[@id='vm_StateWithholdings_intParameter3'][@value='"+ MarStatus +"']";
				driver.findElement(By.xpath(AllYourself)).click();	

				SWTotNum.sendKeys(hmap.get("SC_Dependents"));
				SWAddAmount.sendKeys(hmap.get("SC_AddAllowances"));

				String Exmp=hmap.get("SC_ClaimExmp");
				String ClaimExmp = "//*[@type='checkbox'][@data-val-required='"+ Exmp +"']";
				driver.findElement(By.xpath(ClaimExmp)).click();		
				SaveandContinue.click();
			}
			//Vermont
			else if (Location.equals("State Withholdings - VT"))
			{
				String MarStatus=hmap.get("Vermont_MarStatus");
				String MaritalStatus = "//*[@id='vm_StateWithholdings_intParameter1'][@value='"+ MarStatus +"']";
				driver.findElement(By.xpath(MaritalStatus)).click();

				String ExmpSelf=hmap.get("VT_ClaimSelf");
				String ClaimYourself = "//*[@id='vm_StateWithholdings_IsYoueself'][@value='"+ ExmpSelf +"']";
				driver.findElement(By.xpath(ClaimYourself)).click();

				String Filingopt=hmap.get("VT_FilingJointly");
				String FilingJointly = "//*[@id='vm_StateWithholdings_IsBothSpouses'][@value='"+ Filingopt +"']";
				driver.findElement(By.xpath(FilingJointly)).click();

				SWTtlpersonal.sendKeys(hmap.get("VT_Dep"));;

				String Headopt=hmap.get("VT_HeadHouse");
				String HeadofHousehold = "//*[@id='vm_StateWithholdings_IsHeadFamily'][@value='"+ Headopt +"']";
				driver.findElement(By.xpath(HeadofHousehold)).click();

				SWAddAmount.sendKeys(hmap.get("VT_AddWH"));
				SWICertifyGen.click();
				SaveandContinue.click();
			}
			//Virginia
			else if (Location.equals("State Withholdings - VA"))
			{
				String value = hmap.get("Virginia_Option"); 
				if (value.equalsIgnoreCase("Data")) {
					String Allowance=hmap.get("Virginia_ClaimYourself");
					String AllYourself = "//*[@id='vm_StateWithholdings_IsYoueself'][@value='" + Allowance + "']";
					driver.findElement(By.xpath(AllYourself)).click();	

					String Depexp=hmap.get("VA_ClaimSpouse");
					String OneJob = "//*[@id='vm_StateWithholdings_IsBothSpouses'][@value='" + Depexp + "']";
					driver.findElement(By.xpath(OneJob)).click();

					SWAllowances.sendKeys(hmap.get("VA_Dependents"));
					SWAddAmount.sendKeys(hmap.get("VA_AddAmount"));
					SaveandContinue.click();
				}else{
					String Allowance=hmap.get("Virginia_ClaimYourself");
					String AllYourself = "//*[@id='vm_StateWithholdings_IsYoueself'][@value='" + Allowance + "']";
					driver.findElement(By.xpath(AllYourself)).click();	

					String Depexp=hmap.get("VA_ClaimSpouse");
					String OneJob = "//*[@id='vm_StateWithholdings_IsBothSpouses'][@value='" + Depexp + "']";
					driver.findElement(By.xpath(OneJob)).click();

					SWAllowances.sendKeys(hmap.get("VA_Dependents"));
					SWAddAmount.sendKeys(hmap.get("VA_AddAmount"));

					SWICertifyGen.click();
					SWTaxClaimExp.click();
					SaveandContinue.click();			
				}
			}
			//West Virginia
			else if (Location.equals("State Withholdings - WV"))
			{
				String MarStatus=hmap.get("WestVirginia_MarStatus");
				String MaritalStatus = "//*[@id='vm_StateWithholdings_intParameter1'][@value='" + MarStatus + "']";
				driver.findElement(By.xpath(MaritalStatus)).click();					
				SWTotNumClaims.sendKeys(hmap.get("WV_ExmpClaimed"));
				SWAddAmount.sendKeys(hmap.get("WV_AddAmount"));
				SWICertifyGen.click();
				SaveandContinue.click();
			}
			//Wisconsin
			else if (Location.equals("State Withholdings - WI"))
			{
				String MarStatus=hmap.get("WI_MaritalStatus");
				String MaritalStatus = "//*[@id='vm_StateWithholdings_intParameter1'][@value='" + MarStatus + "']";
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
				SaveandContinue.click();
			}		
		}
		catch(TimeoutException e) {}

		try {	
			lib.waitForElementLoad(MethodPaymentText);	
			String PayOpt=hmap.get("PayOptionID");
			String PayOption = "//*[@id='vm_Deposit_PayOptionID']/following::label[normalize-space()='"+ PayOpt +"']/preceding-sibling::input[@type='radio'][1]";
			driver.findElement(By.xpath(PayOption)).click();

			if(PayOpt.equals("Direct Deposit To Bank")) {
				js.executeScript("arguments[0].scrollIntoView();", NoofBankAcc);
				lib.select(NoofBankAcc,hmap.get("BankAccounts"));
				FinancialInstitution.sendKeys(hmap.get("financialInstitution"));
				ConfirmFinancialInstitution.sendKeys(hmap.get("ConfirmfinancialInstitution"));
				AccountNo.sendKeys(hmap.get("AccountNo"));
				Thread.sleep(1000);
				ConfirmAccountNo.sendKeys(hmap.get("ConfirmAccountNo"));
				RoutingNo.sendKeys(hmap.get("RoutingNo"));
				ConfirmRoutingNo.sendKeys(hmap.get("ConfRoutingNo"));
				lib.select(AccountType,hmap.get("AccType"));
				lib.select(ConfirmAccountType,hmap.get("ConfAccType"));
				VoidedCheck.click();
				Thread.sleep(1000);
				FileUpload.click();
				Thread.sleep(1500);
				Runtime.getRuntime().exec(props.getProperty("filepath1"));
				Thread.sleep(3000);
			}else if(PayOpt.equals(" Pay Card ()")) {
				PayCardFinInst.sendKeys(hmap.get("financialInstitution"));
				PaycardConfirmFinInst.sendKeys(hmap.get("ConfirmfinancialInstitution"));
				PayCardAccountNo.sendKeys(hmap.get("AccountNo"));
				Thread.sleep(1000);
				PayCardConfirmAccountNo.sendKeys(hmap.get("ConfirmAccountNo"));
				PayCardRoutingNo.sendKeys(hmap.get("RoutingNo"));
				PayCardConfirmRoutingNo.sendKeys(hmap.get("ConfRoutingNo"));
			}else if(PayOpt.equals("Pay by Check send to below address")){
			}
			SaveandContinue.click();
		}catch(TimeoutException e) {}

		//		try {
		//			lib.waitForElementLoad(VmSelect);
		//			VmSelect.click();
		//			vmAmount.sendKeys(hmap.get("VmAmount"));
		//			VmManagedAcc.click();
		//			SaveandContinue.click();
		//		}catch(TimeoutException e) {}
		//		try {
		//			lib.waitForElementLoad(HealthCareGuide);
		//			HealthCareGuide.click();
		//			SaveandContinue.click();
		//		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(Agree401k);
			Agree401k.click();
			SaveandContinue.click();
		}catch(TimeoutException e) {}

		//		try {
		//			lib.waitForElementLoad(MealandRest);
		//			MealandRest.click();
		//			SaveandContinue.click();
		//			Thread.sleep(1000);
		//			MealWaiver.click();
		//			SaveandContinue.click();
		//		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(VMBasicPerAmount);
			VMBasicPerAmount.sendKeys(hmap.get("VMBasicPerAmount"));
			VMstateamount.sendKeys(hmap.get("VmstateAmount"));
			VMAgeAmount.sendKeys(hmap.get("VMAgeAmount"));
			VMPensionamount.sendKeys(hmap.get("VMPensionamount"));
			VMTuition.sendKeys(hmap.get("VMTuition"));
			VMDisability.sendKeys(hmap.get("VMDisability"));
			VMSpouseamount.sendKeys(hmap.get("VMSpouseamount"));
			VMdependent.sendKeys(hmap.get("Vmdependent"));
			VmMoneyPartner.sendKeys(hmap.get("VmMoneyPartner"));
			VMcaregiver.sendKeys(hmap.get("Vmcaregiver"));
			VMClaimAmount.sendKeys(hmap.get("VMClaimAmount"));
			LessthanTotalclaim.click();
			VMDeductions.sendKeys(hmap.get("VMDeductions"));
			ICertify.click();
			SaveandContinue.click();
		}catch(TimeoutException e) {}
		
		try {
			lib.waitForElementLoad(SafetyPolicy);
			SafetyPolicy.click();
			SaveandContinue.click();
		}catch(TimeoutException e) {}

		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView();", ConfirmProcessBtn);
		ConfirmProcessBtn.click();
		submitBtn.click();
		Thread.sleep(1000);

		try {
			lib.waitForElementLoad(SignForms);
			SignForms.click();
		}catch(TimeoutException e) {}

		ESignIAgree.click();
		EsignUserName.sendKeys(hmap.get("EsignEmail"));
		EsignPwd.sendKeys(hmap.get("EsignNewPassword"));
		EsignSSN.click();
		EsignSSN.sendKeys(hmap.get("EsignSSN"));	
		ClickToSign.click();
		Thread.sleep(1500);

		try {
			lib.waitForElementLoad(StateW4Text);
			StateW4Text.click();
			Thread.sleep(4000);
			driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
			driver.close();
			driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
		}catch(TimeoutException e) {}

		List<WebElement> ClickTosign = driver.findElements(By.xpath("//tbody/tr"));
		for (int i = 1; i < ClickTosign.size(); i++) {
			ClickTosign = driver.findElements(By.xpath("//*[@id='contentAcceptance']//td[2]")); 
			WebElement row = ClickTosign.get(i);
			try {
				WebElement uploadButton = row.findElement(By.xpath(".//button[1]"));
				if (uploadButton.isDisplayed()) {
					uploadButton.click();
					Thread.sleep(1500); }	   
			}catch (NoSuchElementException e) {}
		}
		try {
			lib.waitForElementLoad(SignedstateW4);
			SignedstateW4.click();
			Thread.sleep(3000);
			SignedW4.click();
			Thread.sleep(3000);
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(Cont);
			Cont.click();
		} catch (TimeoutException e) {}

		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		for (int i = 3; i < rows.size(); i++) {
			rows = driver.findElements(By.xpath("//*[@id='topPage']/table[2]//table//tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr")); 
			WebElement row = rows.get(i);
			try {
				WebElement uploadButton = row.findElement(By.xpath(".//td[1]/a/img[@alt='Click here to upload']"));
				if (uploadButton.isDisplayed()) {
					uploadButton.click();
					Thread.sleep(1000);
					choosefile.click();
					Thread.sleep(1000);
					Runtime.getRuntime().exec(props.getProperty("filepath1"));
					Thread.sleep(2000);
					UploadBtn.click();
				}
			}catch (NoSuchElementException e) {}
		}
		try {
			lib.waitForElementLoad(ContProcess);
			ContProcess.click();
		}catch(TimeoutException e) {}

		Signoff.click();
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(parentWindow);
		close.click();
	}



	public void India_EmpPor_OBProcess(Map<String,String> hmap) throws Exception
	{
		lib = new Generic_Methods(driver);
		driver.switchTo().parentFrame();
		String str = GetUserPwd.getText();
		String un = str.split("User ID : ")[1].split("Password:")[0];
		String pwd = str.split("Password:")[1].substring(1,7);
		System.out.println(pwd);

		try {
			lib.waitForElementLoad(GetUsrPwdLink1);
			Actions a=new Actions(driver);
			a.keyDown(Keys.CONTROL).build().perform();
			GetUsrPwdLink1.click();
			a.keyUp(Keys.CONTROL).build().perform();
		} catch (TimeoutException e) {}

		String parentWindow= driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		while(it.hasNext()) {
			String childWindow = it.next();
			if(!parentWindow.equals(childWindow)) {
				driver.switchTo().window(childWindow);
			}}

		UserName.sendKeys(un);
		Password.sendKeys(pwd);
		Login.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Newpwd.sendKeys(hmap.get("NewPassword"));
		Confirmpwd.sendKeys(hmap.get("ConfirmPassword"));
		Continue.click();
		Thread.sleep(1000);

		try {
			lib.waitForElementLoad(IntroContBtn);
			IntroContBtn.click();
			Thread.sleep(1500);
			lib.select(GenderStatus, hmap.get("Gender"));
			PanCardNumber.sendKeys(hmap.get("PanCard"));
			UANNumber.sendKeys(hmap.get("UANNumber"));	
			lib.select(MaritalStatus,hmap.get("Maritalstatus"));
			Thread.sleep(500);
			lib.select(Nationality, hmap.get("Nationality"));
			lib.select(Religion, hmap.get("Religion"));
			VoterID.sendKeys(hmap.get("VoterID"));
			lib.select(BloodGroup, hmap.get("Bloodgroup"));
			WeddingDate.click();
			WeddingDate.sendKeys(hmap.get("WeddingDate"));
			
			if(RehireEmp.isDisplayed()) {				
				String ReHire_Opt=hmap.get("ReHireOpt");
				String ReHire = "//*[@id='vm_SSNDetail_IsRehire'][@value='" + ReHire_Opt + "']";
				driver.findElement(By.xpath(ReHire)).click();	
				SaveandContinue.click();
				Thread.sleep(1000);

				((JavascriptExecutor) driver).executeScript("window.open();");		    
				Thread.sleep(1000);
				driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
				driver.get(hmap.get("url"));
				Thread.sleep(2000);
				try {
					lib.waitForElementLoad(userNameTxtBox);
					userNameTxtBox.sendKeys(hmap.get("UserName"));
					pwdTxtBox.sendKeys(hmap.get("Password"));
					Thread.sleep(1000); 
					loginBtn.click(); 
				}catch(TimeoutException e) {}
					
				MgmtBtn.click();
				Thread.sleep(1000);
				Workflowmenu.click();
				lib = new Generic_Methods(driver);
				lib.handlingFrame("frmContent");
				Searchbyword.sendKeys(hmap.get("ReHire_Text"));
				Taskto.sendKeys(hmap.get("ReHire_Task"));
				SearchImg.click();
				Thread.sleep(2000);
				ImgBtnTask.click();
				lib.switchOutOfFrame();	
				ApproveBtn.click();
				Thread.sleep(1500);
				driver.close();
				driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
				Thread.sleep(2000);
				
				driver.navigate().refresh();
				Thread.sleep(1000);	
				driver.findElement(By.xpath("//a[contains(text(),'Personal Information')]")).click();
				Thread.sleep(1500);
			}
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(Declarationcheckbox);
			Declarationcheckbox.click();
			SaveandContinue.click();
			Thread.sleep(1000);	
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(SSNNumber); 
			//SSNNumber.clear();
			Thread.sleep(500);
			SSNNumber.sendKeys(hmap.get("SSN"));
			//ConfirmSSN.clear();
			Thread.sleep(500);
			ConfirmSSN.sendKeys(hmap.get("confirmSSN"));
			SSNDOB.click();
			SSNDOB.sendKeys(hmap.get("vm_DOB"));
			lib.select(MaritalStatus,hmap.get("Maritalstatus"));

			if(RehireEmp.isDisplayed()) {				
				String ReHire_Opt=hmap.get("ReHireOpt");
				String ReHire = "//*[@id='vm_SSNDetail_IsRehire'][@value='" + ReHire_Opt + "']";
				driver.findElement(By.xpath(ReHire)).click();	
				Thread.sleep(1000);
				SaveandContinue.click();
				
				((JavascriptExecutor) driver).executeScript("window.open();");		    
				Thread.sleep(1000);
				driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
				driver.get(hmap.get("url"));
				Thread.sleep(2000);
				MgmtBtn.click();
				Thread.sleep(1000);
				Workflowmenu.click();
				lib = new Generic_Methods(driver);
				lib.handlingFrame("frmContent");
				Searchbyword.sendKeys(hmap.get("ReHire_Text"));
				Taskto.sendKeys(hmap.get("ReHire_Task"));
				SearchImg.click();
				Thread.sleep(2000);
				ImgBtnTask.click();
				lib.switchOutOfFrame();	
				ApproveBtn.click();
				Thread.sleep(1500);
				driver.close();
				driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
				Thread.sleep(1000);
				driver.navigate().refresh();
				Thread.sleep(2000);	
				driver.findElement(By.xpath("//a[contains(text(),'Personal Information')]")).click();
				Thread.sleep(1500);
			}	
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(NinoDeclaration);
			NinoDeclaration.click();
			SaveandContinue.click();
			Thread.sleep(1000);	
		}catch(TimeoutException e) {}


		MailingAddress.click();
		SaveandContinue.click();
		Thread.sleep(1000);

		EmergencyFName.sendKeys(hmap.get("F_Name"));
		EmergencyLName.sendKeys(hmap.get("L_Name"));
		lib.select(Relationship,hmap.get("Relationship"));
		EmergencyMobileNo.click();
		EmergencyMobileNo.sendKeys(hmap.get("EmerMobileNo"));
		SaveandContinue.click();
		Thread.sleep(1000);

		try {
			lib.waitForElementLoad(AddEducation);
			AddEducation.click();
			Thread.sleep(2000);
			InstituteName.sendKeys(hmap.get("Institutename"));
			lib.select(University, hmap.get("university"));
			lib.select(Degree,hmap.get("degree"));
			lib.select(InstituteStartMonth,hmap.get("InstituteStartmonth"));
			lib.select(InstituteStartYear,hmap.get("InstituteStartYear"));
			lib.select(InstituteEndMonth,hmap.get("InstituteEndMonth"));
			lib.select(InstituteEndYear,hmap.get("InstituteEndYear"));
			InstituteCity.sendKeys(hmap.get("InstituteCity"));
			lib.select(InstituteCountry,hmap.get("InstituteCountry"));
			Thread.sleep(1000);
			lib.select(collegeState,hmap.get("collegeState"));
			fulltimeradioBtn.click();
			DidyouGraduate.click();
			Save.click();	
			Thread.sleep(3000);
			ContBtn.click();
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(AddPrevEmp);
			AddPrevEmp.click();
			Thread.sleep(1000);
			EmpName.sendKeys(hmap.get("EmployerName"));
			lib.select(BusinessType,hmap.get("Businesstype"));
			EmpAdd.sendKeys(hmap.get("EmpAddress"));
			EmpCity.sendKeys(hmap.get("Empcity"));
			EmpCountry.sendKeys(hmap.get("EmpCountry"));
			Thread.sleep(500);
			EmpState.sendKeys(hmap.get("Empstate"));
			EmpZipcode.sendKeys(hmap.get("Empzipcode"));
			WorkStartdate.click();
			WorkStartdate.sendKeys(hmap.get("Workstartdate"));
			Workenddate.click();
			Workenddate.sendKeys(hmap.get("WorkEnddate"));
			EmpJobTitle.sendKeys(hmap.get("EmpJobtitle"));
			Save.click();
			Thread.sleep(2000);
			ContBtn.click();
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(Backgroundtest);
			Backgroundtest.click();
			SaveandContinue.click();
		} catch (TimeoutException e) {}

		if (Drugtest.size() > 0) {
			Drugtest.get(0).click();
			SaveandContinue.click();
		} 

		try {
			lib.waitForElementLoad(vmagreement);
			vmagreement.click();
			SaveandContinue.click();			
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(HandbookBtn);
			HandbookBtn.click();
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(payrollbtn);
			payrollbtn.click();
			SaveandContinue.click();
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(AccountNumber);
			AccountNumber.sendKeys(hmap.get("AccountNo"));
			UKBankName.sendKeys(hmap.get("BankName"));
			IBANcode.sendKeys(hmap.get("IBANCode"));
			Sortcode.sendKeys(hmap.get("SortCode"));
			Thread.sleep(1000);
			SaveandContinue.click();
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(BankAcc);
			String BankOpt = hmap.get("BankOption");
			String BankOption = "//*[@id='vm_INDeposit_IsBankAccountAvailable'][@value='" + BankOpt + "']";
			Thread.sleep(1000);
			driver.findElement(By.xpath(BankOption)).click();	
			Thread.sleep(500);
			if(BankAcc.isSelected()) {
				lib.select(BankName, hmap.get("BankName"));
				AccountNumber.sendKeys(hmap.get("AccountNo"));
				RoutingNumber.sendKeys(hmap.get("IFSCCode")); 
				lib.select(AxisAccountType,hmap.get("AccountType"));
				Thread.sleep(1500);
				SelectCheck.click();
				Thread.sleep(1500);
				Runtime.getRuntime().exec(props.getProperty("filepath"));
				Thread.sleep(3000);
			}else{
				NewSalaryAcc.click();}
			SaveandContinue.click();
			Thread.sleep(1000);
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(AddFamily);
			AddFamily.click();
			Thread.sleep(1000);
			lib.select(Relation,hmap.get("RelationType")); 
			FirstName.sendKeys(hmap.get("FirstName"));
			LastName.sendKeys(hmap.get("LastName"));
			DOB.click();
			DOB.sendKeys(hmap.get("DateofBirth"));
			lib.select(GenderID,hmap.get("Gender")); 
			Thread.sleep(1000);
			Save.click();
			Thread.sleep(3000);
			ContBtn.click();
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(EmpBond);			
			String option =hmap.get("Empbond");
			String EmpBond = "//input[@id='vm_EmployeeBond_DoYouAcceptEmployeeBond'][@value='" + option + "'][ancestor::td[@class='editor-field']]";
			driver.findElement(By.xpath(EmpBond)).click();
			SaveandContinue.click();
			Thread.sleep(2000);
		}catch(TimeoutException e) {}

		js.executeScript("arguments[0].scrollIntoView();", ConfirmProcessBtn);
		ConfirmProcessBtn.click();
		Thread.sleep(1000);
		submitBtn.click();

		try {
			lib.waitForElementLoad(ClickToSign1);
			ClickToSign1.click();
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(ClickToSign2);
			ClickToSign2.click();
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(ClickToSign3);
			ClickToSign3.click();
		}catch(TimeoutException e) {}
		try {
			lib.waitForElementLoad(ClickToSign4);
			ClickToSign4.click();
		}catch(TimeoutException e) {}

		try {
			lib.waitForElementLoad(Cont);
			Cont.click();
		} catch (TimeoutException e) {}

		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		for (int i = 1; i < rows.size(); i++) {
			rows = driver.findElements(By.xpath("//*[@id='topPage']/table[2]//table//tr[1]/td/table/tbody/tr[2]/td/table/tbody/tr")); 
			WebElement row = rows.get(i);
			try {
				WebElement uploadButton = row.findElement(By.xpath(".//td[1]/a/img[@alt='Click here to upload']"));
				if (uploadButton.isDisplayed()) {
					uploadButton.click();
					Thread.sleep(1000);
					choosefile.click();
					Thread.sleep(1000);
					Runtime.getRuntime().exec(props.getProperty("filepath1"));
					Thread.sleep(2000);
					UploadBtn.click();
					Thread.sleep(1000);
				}
			}catch (NoSuchElementException e) {}
		}
		try {
			lib.waitForElementLoad(ContProcess);
			ContProcess.click();
		}catch(TimeoutException e) {}

		Signoff.click();
		Thread.sleep(1000);
		driver.close();
		driver.switchTo().window(parentWindow);
		close.click();
	}



}

