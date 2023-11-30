package Testcases_US;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.EmpView_EmpModule;
import Page_Objects.Initiatate_OnBoarding;
import Page_Objects.Login_Page;
import Page_Objects.Approval_Screens;
import Page_Objects.Submit_NewCandidate;
import Page_Objects.Submit_NewClient;
import Page_Objects.Submit_NewRequirement;
import Page_Objects.OnBoarding_OBMod_DashBoard;
import Page_Objects.OnBoarding_EmpPortal_Steps;
import Page_Objects.Search_RequirementType;
import Page_Objects.Submit_CandidateandRequirement;
import Page_Objects.Change_OfferStatus;
import Page_Objects.Regular_TS_BiWeekly;
import Page_Objects.Regular_TS_Weekly;

@Listeners(ITestListenerClass.class)
public class US_NonClinical_SubmitExistingEmp extends BaseClass{

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
	OnBoarding_OBMod_DashBoard EmpinOnBoardingModule;
	EmpView_EmpModule EmpModule;
	Regular_TS_Weekly RegularTS;
	Regular_TS_BiWeekly RegularTS1;
		
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Clinical_NewEmp(String testData) throws Exception
	{
		ExcelTestdata = new ExcelTestData();
		LoginPage=new Login_Page(driver);
		ClientPage=new Submit_NewClient(driver);
		ReqPage = new Submit_NewRequirement(driver);
		SearchReq = new Search_RequirementType(driver);
		CandidatePage=new Submit_NewCandidate(driver);
		SubmitCandandReq=new Submit_CandidateandRequirement(driver);
		Submitstatus=new Change_OfferStatus(driver);
		IntOnboarding=new Initiatate_OnBoarding(driver);
		ManagerRecHRApproval=new Approval_Screens(driver);
		OnBoardingEmpPortal=new OnBoarding_EmpPortal_Steps(driver);
		EmpinOnBoardingModule=new OnBoarding_OBMod_DashBoard(driver);
		EmpModule=new EmpView_EmpModule(driver);
		RegularTS=new Regular_TS_Weekly(driver);
		RegularTS1=new Regular_TS_BiWeekly(driver);
		
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);

		LoginPage.LoginIntoApp(hmap);
		ClientPage.Client(hmap);
		ClientPage.ClientApproval(hmap);	
		ReqPage.Create_NewRequirement(hmap);
		SearchReq.Search_Requirement(hmap);
		CandidatePage.Select_ExistingCandidate(hmap);
		SubmitCandandReq.Submit_Requirement(hmap);
		Submitstatus.Select_Candidate();
		Submitstatus.Update_OfferRequest(hmap);
		Submitstatus.Select_Candidate();
		Submitstatus.Clinical_OfferAccept(hmap);
		IntOnboarding.InitiateOnboarding(hmap);
		ManagerRecHRApproval.US_Onboarding_RecManagerApproval(hmap);
		ManagerRecHRApproval.US_Onboarding_ManagerApproval(hmap);
		OnBoardingEmpPortal.EmpPortalLink_EmailHistory(hmap);
		OnBoardingEmpPortal.EmpPor_OBProcess(hmap);
		EmpinOnBoardingModule.OnBoarding_NewEmp(hmap);
		ManagerRecHRApproval.HRPayroll_Approval(hmap);
		ManagerRecHRApproval.CreateEmployee_Approval(hmap);
		EmpModule.External_Employee(hmap);
		RegularTS.NonClinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();
	}
}
	






















/*
	@Test(priority=0,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NewClient(String testData) throws Exception
	{
		ClientPage=new Submit_NewClient(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		ClientPage.Client(hmap);
		ClientPage.ClientApproval(hmap);
	}

	@Test(priority=1,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NewRequirement(String testData) throws Exception
	{
		ReqPage = new Submit_NewRequirement(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		ReqPage.Create_NewRequirement(hmap);
	}
	
	@Test(priority=2,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void SearchRequirement(String testData) throws Exception
	{
		SearchReq = new Search_RequirementType(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		SearchReq.Search_Requirement(hmap);
	}
	
	@Test(priority=3,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void AddNewCandidate(String testData) throws Exception
	{
		CandidatePage=new Submit_NewCandidate(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		CandidatePage.Add_NewCandidate(hmap);
	}
	
	@Test(priority=4,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void SubmitCandAndReq(String testData) throws Exception
	{
		SubmitCandandReq=new Submit_CandidateandRequirement(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		SubmitCandandReq.Submit_Candidate(hmap);
		SubmitCandandReq.Submit_Requirement(hmap);
	}
	
	@Test(priority=5,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OfferRequest(String testData) throws Exception
	{
		Submitstatus=new Change_OfferStatus(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		Submitstatus.Select_Candidate();
		Submitstatus.Update_OfferRequest(hmap);
	}
	
	@Test(priority=6,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OfferAccept(String testData) throws Exception
	{
		Submitstatus=new Change_OfferStatus(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		Submitstatus.Select_Candidate();
		Submitstatus.Clinical_OfferAccept(hmap);
	}
	
	@Test(priority=7,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void InititaiteOnBoarding(String testData) throws Exception
	{
		IntOnboarding=new Initiatate_OnBoarding(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		IntOnboarding.InitiateOnboarding(hmap);
	}
	
	@Test(priority=8,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void ManagerRecApproval(String testData) throws Exception
	{
		ManagerRecHRApproval=new Approval_Screens(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		ManagerRecHRApproval.Onboarding_RecManagerApproval(hmap);
	}
	
	@Test(priority=9,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OnBoarding_EmpPortal(String testData) throws Exception
	{
		OnBoardingEmpPortal=new OnBoarding_EmpPortal_Steps(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		OnBoardingEmpPortal.EmpPortalLink_EmailHistory(hmap);
		OnBoardingEmpPortal.EmpPor_OBProcess(hmap);	
	}
	
	@Test(priority=10,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OnBoardingModule(String testData) throws Exception
	{
		EmpinOnBoardingModule=new OnBoarding_OBMod_DashBoard(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		EmpinOnBoardingModule.OnBoarding_NewEmp(hmap);
	}
	
	@Test(priority=11,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void RecHR_WorkflowApproval(String testData) throws Exception
	{
		ManagerRecHRApproval=new Approval_Screens(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		ManagerRecHRApproval.HRPayroll_Approval(hmap);
		ManagerRecHRApproval.CreateEmployee_Approval(hmap);
	}
	
	@Test(priority=12,dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Employee_EmpModule(String testData) throws Exception
	{
		EmpModule=new EmpView_EmpModule(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);
		EmpModule.Emp_EmpModule(hmap);
	}
	}
*/




