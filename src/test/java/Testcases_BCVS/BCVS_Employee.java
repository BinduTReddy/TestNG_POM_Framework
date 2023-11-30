package Testcases_BCVS;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.Login_Page;
import Page_Objects.Approval_Screens;
import Page_Objects.BG_Check_Sterling;
import Page_Objects.EmpView_EmpModule;
import Page_Objects.Initiatate_OnBoarding;
import Page_Objects.Submit_NewCandidate;
import Page_Objects.Submit_NewClient;
import Page_Objects.Submit_NewRequirement;
import Page_Objects.OnBoarding_EmpPortal_Steps;
import Page_Objects.OnBoarding_OBMod_DashBoard;
import Page_Objects.Regular_TS_Weekly;
import Page_Objects.Regular_Invoice;
import Page_Objects.Search_RequirementType;
import Page_Objects.Submit_CandidateandRequirement;
import Page_Objects.Change_OfferStatus;

@Listeners(ITestListenerClass.class)
public class BCVS_Employee extends BaseClass{

	BaseClass base;
	ExcelTestData ExcelTestdata;
	Login_Page LoginPage;
	Submit_NewClient ClientPage;
	Submit_NewRequirement ReqPage;
	Search_RequirementType SearchReq;
	Submit_NewCandidate CandidatePage;
	Submit_CandidateandRequirement SubmitCandandReq;
	Change_OfferStatus Submitstatus;
	Initiatate_OnBoarding IntOnboarding;
	Approval_Screens ManagerRecHRApproval;
	OnBoarding_EmpPortal_Steps OnBoardingEmpPortal;
	BG_Check_Sterling BGCheck;
	OnBoarding_OBMod_DashBoard EmpinOnBoardingModule;
	EmpView_EmpModule EmpModule;
	Regular_TS_Weekly RegularTS;
	Regular_Invoice RegInvoice;

	String TestId="Test1";
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void LoginPage(String testData) throws Exception
	{
		LoginPage=new Login_Page(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		LoginPage.LoginIntoApp(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void ClientPage(String testData) throws Exception
	{
		ClientPage=new Submit_NewClient(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		ClientPage.Client(hmap);
		ClientPage.ClientApproval(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void RequirementPage(String testData) throws Exception
	{
		ReqPage = new Submit_NewRequirement(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		ReqPage.Create_NewRequirement(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void SearchReqPage(String testData) throws Exception
	{
		SearchReq = new Search_RequirementType(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		SearchReq.Search_Requirement(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void CandidatePage(String testData) throws Exception
	{
		CandidatePage=new Submit_NewCandidate(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		CandidatePage.Add_NewCandidate(hmap);
	}
		
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void SubmitCandAndReq(String testData) throws Exception
	{
		SubmitCandandReq=new Submit_CandidateandRequirement(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		SubmitCandandReq.Submit_Candidate(hmap);
		SubmitCandandReq.Submit_Requirement(hmap);		
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Submit_OfferRequested_Page(String testData) throws Exception
	{
		Submitstatus=new Change_OfferStatus(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		Submitstatus.Select_Candidate();
		Submitstatus.Update_OfferRequest(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Submit_OfferAccepted_Page(String testData) throws Exception
	{
		Submitstatus=new Change_OfferStatus(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		Submitstatus.Select_Candidate();
		Submitstatus.NonClinical_OfferAccept(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void InititiateOB_Page(String testData) throws Exception
	{
		IntOnboarding=new Initiatate_OnBoarding(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		IntOnboarding.InitiateOnboarding(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void RecApproval_Page(String testData) throws Exception
	{
		ManagerRecHRApproval=new Approval_Screens(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		ManagerRecHRApproval.US_Onboarding_RecManagerApproval(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void ManagerApproval_Page(String testData) throws Exception
	{
		ManagerRecHRApproval=new Approval_Screens(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		ManagerRecHRApproval.US_Onboarding_ManagerApproval(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OBEmpPortal_Page(String testData) throws Exception
	{
		OnBoardingEmpPortal=new OnBoarding_EmpPortal_Steps(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		OnBoardingEmpPortal.EmpPortalLink_EmailHistory(hmap);
		OnBoardingEmpPortal.EmpPor_OBProcess(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void BackGroundCheck_Sterling(String testData) throws Exception
	{
		BGCheck=new BG_Check_Sterling(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		BGCheck.OB_BackGroundCheck(hmap);	
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OB_EmpModule_Page(String testData) throws Exception
	{
		EmpinOnBoardingModule=new OnBoarding_OBMod_DashBoard(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		EmpinOnBoardingModule.OnBoarding_NewEmp(hmap);	
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void HRApproval_Page(String testData) throws Exception
	{
		ManagerRecHRApproval=new Approval_Screens(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		ManagerRecHRApproval.HRPayroll_Approval(hmap);	
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void CreateEmp_Page(String testData) throws Exception
	{
		ManagerRecHRApproval=new Approval_Screens(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		ManagerRecHRApproval.CreateEmployee_Approval(hmap);	
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void ExternalEmpView_Page(String testData) throws Exception
	{
		EmpModule=new EmpView_EmpModule(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		EmpModule.External_Employee(hmap);	
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Regular_Timesheet(String testData) throws Exception
	{
		RegularTS=new Regular_TS_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		RegularTS.NonClinical_RegTimesheet(hmap);	
		RegularTS.CloseTimesheet();
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Regular_Invoice(String testData) throws Exception
	{
		RegInvoice=new Regular_Invoice(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		RegInvoice.Reg_SaveInvoice(hmap);		
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Regular_InvoiceApproval(String testData) throws Exception
	{
		RegInvoice=new Regular_Invoice(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		RegInvoice.RegInvoice_Approval(hmap);	
	}
	
}


