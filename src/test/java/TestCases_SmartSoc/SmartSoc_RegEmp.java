package TestCases_SmartSoc;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.EmpView_EmpModule;
import Page_Objects.Login_Page;
import Page_Objects.Approval_Screens;
import Page_Objects.Submit_NewCandidate;
import Page_Objects.Submit_NewClient;
import Page_Objects.Submit_NewRequirement;
import Page_Objects.OnBoarding_OBMod_DashBoard;
import Page_Objects.OnBoarding_EmpPortal_Steps;
import Page_Objects.Search_RequirementType;
import Page_Objects.SmartSoc_Doc_Sign;
import Page_Objects.Offer_Accept;

@Listeners(ITestListenerClass.class)
public class SmartSoc_RegEmp extends BaseClass{
	
	Login_Page LoginPage;
	Submit_NewClient ClientPage;
	Submit_NewRequirement ReqPage;
	Search_RequirementType SearchReq;
	Submit_NewCandidate CandidatePage;
	Approval_Screens ManagerRecHRApproval;
	Offer_Accept AcceptOffer;
	OnBoarding_EmpPortal_Steps OnBoardingEmpPortal;
	OnBoarding_OBMod_DashBoard EmpinOnBoardingModule;
	EmpView_EmpModule EmpModule;
	SmartSoc_Doc_Sign DocSign;
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Employee(String testData) throws Exception
	{
		LoginPage=new Login_Page(driver);
		ClientPage=new Submit_NewClient(driver);
		ReqPage = new Submit_NewRequirement(driver);
		SearchReq = new Search_RequirementType(driver);
		CandidatePage=new Submit_NewCandidate(driver);
		ManagerRecHRApproval=new Approval_Screens(driver);
		AcceptOffer=new Offer_Accept(driver);
		OnBoardingEmpPortal=new OnBoarding_EmpPortal_Steps(driver);
		EmpinOnBoardingModule=new OnBoarding_OBMod_DashBoard(driver);
		ManagerRecHRApproval=new Approval_Screens(driver);
		EmpModule=new EmpView_EmpModule(driver);
		DocSign=new SmartSoc_Doc_Sign(driver);
		
		String TestId = "Test1";
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		
		LoginPage.LoginIntoApp(hmap);
//		ClientPage.Client(hmap);
//		ReqPage.Create_NewRequirement(hmap);
		SearchReq.Search_Requirement(hmap);
		CandidatePage.Add_NewCandidate(hmap);
		CandidatePage.India_SubmitNewCandidate(hmap);
		ManagerRecHRApproval.Onboarding_RecManagerApproval(hmap);
		AcceptOffer.India_Accept_Offer(hmap);
		ManagerRecHRApproval.Onboarding_ManagerApproval(hmap);		
		OnBoardingEmpPortal.EmpPortalLink_EmailHistory(hmap);
		OnBoardingEmpPortal.India_EmpPor_OBProcess(hmap);
		EmpinOnBoardingModule.OnBoarding_NewEmp(hmap);
		ManagerRecHRApproval.VP_Approval(hmap);
		DocSign.Doc_ToSign(hmap);
		ManagerRecHRApproval.SmartSoc_Approval(hmap);
		ManagerRecHRApproval.CreateEmployee_Approval(hmap);
		EmpModule.External_Employee(hmap);
	}
}	

