package Testcases_US;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.EmpView_EmpModule;
import Page_Objects.Login_Page;
import Page_Objects.StateW4_EmpModule;
import Page_Objects.StateW4_EmployeePortal;

@Listeners(ITestListenerClass.class)
public class US_StateW4_EmpModule extends BaseClass{
	
	BaseClass base;
	ExcelTestData ExcelTestdata;
	Login_Page LoginPage;
	EmpView_EmpModule EmpModule;
	StateW4_EmpModule NewStateW4EmpModule;
	StateW4_EmployeePortal NewStateW4EmpPortal;

	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Clinical_NewEmp(String testData) throws Exception
	{
		ExcelTestdata = new ExcelTestData();
		LoginPage = new Login_Page(driver);
		EmpModule=new EmpView_EmpModule(driver);
		NewStateW4EmpModule=new StateW4_EmpModule(driver);
		NewStateW4EmpPortal=new StateW4_EmployeePortal(driver);

		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);

		LoginPage.LoginIntoApp(hmap);
		EmpModule.External_Employee(hmap);
		NewStateW4EmpModule.StateW4_EmployeeModule(hmap);		
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




