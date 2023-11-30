package Testcases_US;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.BG_Check_Sterling;
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
import Page_Objects.StateW4_EmpModule;
import Page_Objects.StateW4_EmployeePortal;
import Page_Objects.Submit_CandidateandRequirement;
import Page_Objects.Change_OfferStatus;
import Page_Objects.EmpMod_EmpTermination;
import Page_Objects.EmpMod_NewEmployee;
import Page_Objects.EmpMod_NewPlacement;
import Page_Objects.Regular_TS_BiWeekly;
import Page_Objects.Regular_TS_Weekly;

@Listeners(ITestListenerClass.class)
public class US_CreateNewEmp_EmpModule extends BaseClass{

	BaseClass base;
	ExcelTestData ExcelTestdata;
	Login_Page LoginPage;
	EmpMod_NewEmployee CreateEmpFromEmpMod;
	EmpView_EmpModule EmpModule;
	EmpMod_NewPlacement NewPlacement;
	EmpMod_EmpTermination EmpTermination;
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Clinical_NewEmp(String testData) throws Exception
	{
		ExcelTestdata = new ExcelTestData();
		LoginPage=new Login_Page(driver);
		CreateEmpFromEmpMod=new EmpMod_NewEmployee(driver);
		EmpModule=new EmpView_EmpModule(driver);
		NewPlacement=new EmpMod_NewPlacement(driver);
		EmpTermination=new EmpMod_EmpTermination(driver);
		
		String TestId="Test1";
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
	
		LoginPage.LoginIntoApp(hmap);	
//		CreateEmpFromEmpMod.Emp_EmpModule(hmap);
//		CreateEmpFromEmpMod.NewEmp_Approval(hmap);
		EmpModule.External_Employee(hmap);
		
//		NewPlacement.NewPlacement_EmpModule(hmap);
//		NewPlacement.NewPlacement_Approval(hmap);
		
		NewPlacement.Placement_OffBoarding(hmap);
		NewPlacement.ChangeStatus_EmpModule(hmap);
		NewPlacement.ChangeStatus_EmpMod_Approval(hmap);
		
//		EmpTermination.EmployeeTermination_EmpModule(hmap);
//		EmpTermination.EmployeeTermination_Approval(hmap);
		
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




