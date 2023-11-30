package Testcases_ECQR;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.Login_Page;
import Page_Objects.Approval_Screens;
import Page_Objects.DirectHire_Process;
import Page_Objects.Submit_NewCandidate;
import Page_Objects.Submit_NewClient;
import Page_Objects.Submit_NewRequirement;
import Page_Objects.Search_RequirementType;
import Page_Objects.Submit_CandidateandRequirement;
import Page_Objects.Change_OfferStatus;

@Listeners(ITestListenerClass.class)
public class ECQR_DH_RegEmp extends BaseClass{

	BaseClass base;
	ExcelTestData ExcelTestdata;

	Login_Page LoginPage;
	Submit_NewClient ClientPage;
	Submit_NewRequirement ReqPage;
	Search_RequirementType SearchReq;
	Submit_NewCandidate CandidatePage;
	Submit_CandidateandRequirement SubmitCandandReq;
	Change_OfferStatus Submitstatus;
	Approval_Screens ManagerRecHRApproval;
	DirectHire_Process DirectHireEmp;

	String TestId="Test1";
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void LoginPage(String testData) throws Exception
	{
		LoginPage=new Login_Page(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		LoginPage.LoginIntoApp(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NewClient(String testData) throws Exception
	{
		ClientPage=new Submit_NewClient(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
//		ClientPage.Client(hmap);
//		ClientPage.ClientApproval(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void NewRequirement(String testData) throws Exception
	{
		ReqPage = new Submit_NewRequirement(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
//		ReqPage.Create_NewRequirement(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void SearchRequirement(String testData) throws Exception
	{
		SearchReq = new Search_RequirementType(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		SearchReq.Search_Requirement(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void AddNewCandidate(String testData) throws Exception
	{
		CandidatePage=new Submit_NewCandidate(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
//		CandidatePage.Add_NewCandidate(hmap);
//		CandidatePage.Select_ExistingCandidate(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void SubmitCandAndReq(String testData) throws Exception
	{
		SubmitCandandReq=new Submit_CandidateandRequirement(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
//		SubmitCandandReq.Submit_Candidate(hmap);
//		SubmitCandandReq.Submit_Requirement(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OfferRequest(String testData) throws Exception
	{
		Submitstatus=new Change_OfferStatus(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
//		Submitstatus.Select_Candidate();
//		Submitstatus.Update_OfferRequest(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void OfferAccept(String testData) throws Exception
	{
		Submitstatus=new Change_OfferStatus(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
//		Submitstatus.Select_Candidate();
//		Submitstatus.NonClinical_OfferAccept(hmap);
	}

	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Create_DirectHire(String testData) throws Exception
	{
		DirectHireEmp=new DirectHire_Process(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
//		DirectHireEmp.Create_DirectHire(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void ViewEmp_DH_Module(String testData) throws Exception
	{
		DirectHireEmp=new DirectHire_Process(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		DirectHireEmp.SearchEmployee_DirectHireModule(hmap);
		}
	
	
}


