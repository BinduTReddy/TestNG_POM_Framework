package TestCases_UK;

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
import Page_Objects.Approval_Screens;
import Page_Objects.Submit_NewCandidate;
import Page_Objects.Submit_NewClient;
import Page_Objects.Submit_NewRequirement;
import Page_Objects.OnBoarding_OBMod_DashBoard;
import Page_Objects.OnBoarding_EmpPortal_Steps;
import Page_Objects.Search_RequirementType;
import Page_Objects.Submit_CandidateandRequirement;
import Page_Objects.Change_OfferStatus;
import Page_Objects.DirectHire_Process;
import Page_Objects.Regular_TS_Weekly;

@Listeners(ITestListenerClass.class)
public class UK_DirectHire_Employee extends BaseClass{

	Login_Page LoginPage;
	Submit_NewClient ClientPage;
	Submit_NewRequirement ReqPage;
	Search_RequirementType SearchReq;
	Submit_NewCandidate CandidatePage;
	DirectHire_Process DirectHireEmp;
		
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
		ReqPage.Req_Approval(hmap);	
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
//		CandidatePage.Select_ExistingCandidate(hmap);
	}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Create_DirectHire(String testData) throws Exception
	{
		DirectHireEmp=new DirectHire_Process(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		DirectHireEmp.Create_DirectHire(hmap);
		}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void DirectHire_Approval(String testData) throws Exception
	{
		DirectHireEmp=new DirectHire_Process(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		DirectHireEmp.DirectHireApproval(hmap);		
		}
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void ViewEmp_DH_Module(String testData) throws Exception
	{
		DirectHireEmp=new DirectHire_Process(driver);
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		DirectHireEmp.SearchEmployee_DirectHireModule(hmap);
		}
	
	}	
		




