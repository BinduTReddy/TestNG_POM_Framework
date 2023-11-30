package TestCases_India;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.Offer_Accept;
import Page_Objects.EmpView_EmpModule;
import Page_Objects.Initiatate_OnBoarding;
import Page_Objects.Login_Page;
import Page_Objects.India_NewGovt_DocReq;
import Page_Objects.Approval_Screens;
import Page_Objects.Submit_NewCandidate;
import Page_Objects.Submit_NewClient;
import Page_Objects.Submit_NewRequirement;
import Page_Objects.India_Welcome_Induction_Email;
import Page_Objects.OnBoarding_OBMod_DashBoard;
import Page_Objects.Regular_Invoice;
import Page_Objects.OnBoarding_EmpPortal_Steps;
import Page_Objects.Search_RequirementType;
import Page_Objects.Submit_CandidateandRequirement;
import Page_Objects.Change_OfferStatus;
import Page_Objects.Edit_BillPayRate;
import Page_Objects.Regular_TS_Weekly;
import Page_Objects.RunPayroll_Module;

@Listeners(ITestListenerClass.class)
public class India_OnBench_Cand extends BaseClass{

	Login_Page LoginPage;
	Submit_NewClient ClientPage;
	Submit_NewRequirement ReqPage;
	Search_RequirementType SearchReq;
	Submit_NewCandidate CandidatePage;
	Submit_CandidateandRequirement SubmitCandandReq;
	Change_OfferStatus Submitstatus;
	Initiatate_OnBoarding IntOnboarding;
	Offer_Accept AcceptOffer;
	Approval_Screens ManagerRecHRApproval;
	OnBoarding_EmpPortal_Steps OnBoardingEmpPortal;
	OnBoarding_OBMod_DashBoard EmpinOnBoardingModule;
	EmpView_EmpModule EmpModule;
	India_Welcome_Induction_Email WelcomeEmail;
	India_NewGovt_DocReq GovtDocReq;
	Edit_BillPayRate Edit_BillPayrate;
	Regular_TS_Weekly RegularTS;
	Regular_Invoice RegInvoice;
	RunPayroll_Module Runpayroll;
		
	String TestId = "Test1";
	
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
		CandidatePage.Select_OnBenchCandidate(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Submit_NewCand(String testData) throws Exception
	{
		CandidatePage=new Submit_NewCandidate(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		CandidatePage.India_SubmitNewCandidate(hmap);
		}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void RecManager_Approval(String testData) throws Exception
	{
		ManagerRecHRApproval=new Approval_Screens(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		ManagerRecHRApproval.Onboarding_RecManagerApproval(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Manager_Approval(String testData) throws Exception
	{
		ManagerRecHRApproval=new Approval_Screens(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		ManagerRecHRApproval.Onboarding_ManagerApproval(hmap);
	}
			
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OB_EmpPortal(String testData) throws Exception
	{
		OnBoardingEmpPortal=new OnBoarding_EmpPortal_Steps(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		OnBoardingEmpPortal.EmpPortalLink_EmailHistory(hmap);
		OnBoardingEmpPortal.India_EmpPor_OBProcess(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OB_EmpModule_Page(String testData) throws Exception
	{
		EmpinOnBoardingModule=new OnBoarding_OBMod_DashBoard(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		EmpinOnBoardingModule.OnBoarding_NewEmp(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Accept_Offer(String testData) throws Exception
	{
		AcceptOffer=new Offer_Accept(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		AcceptOffer.India_Accept_Offer(hmap);
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
	public void Welcome_InductionEmail(String testData) throws Exception
	{
		WelcomeEmail=new India_Welcome_Induction_Email(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		WelcomeEmail.WelcomeEmail_Approval(hmap);	
		WelcomeEmail.WelcomeEmail_Process(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NewGovt_DocRequest(String testData) throws Exception
	{
		GovtDocReq=new India_NewGovt_DocReq(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		GovtDocReq.NewGovtRequest_Approval(hmap);	
		GovtDocReq.ReqDocument_Process(hmap);
		GovtDocReq.UploadedGovtDoc_Approval(hmap);
	}
		
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void ExternalEmpView_Page(String testData) throws Exception
	{
		EmpModule=new EmpView_EmpModule(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		EmpModule.External_Employee(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void BillPayRateChange(String testData) throws Exception
	{
		Edit_BillPayrate=new Edit_BillPayRate(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		Edit_BillPayrate.India_BillPayRate_Edit(hmap);
		Edit_BillPayrate.India_Finance_Approval(hmap);	
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Regular_Timesheet(String testData) throws Exception
	{
		RegularTS=new Regular_TS_Weekly(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		RegularTS.India_RegTimesheet(hmap);	
		RegularTS.CloseTimesheet();
	}
	
}	
		




