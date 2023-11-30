package Testcases_US;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.Edit_PayratePerDiem_Scenerios;
import Page_Objects.EmpView_EmpModule;
import Page_Objects.Initiatate_OnBoarding;
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
import Page_Objects.Offer_Accept;

@Listeners(ITestListenerClass.class)
public class US_Clinical_SubmitExistingEmp extends BaseClass{

	ExcelTestData ExcelTestdata;
	Submit_NewClient ClientPage;
	Submit_NewRequirement ReqPage;
	Search_RequirementType SearchReq;
	Submit_NewCandidate CandidatePage;
	Submit_CandidateandRequirement SubmitCandandReq;
	Change_OfferStatus Submitstatus;
	Initiatate_OnBoarding IntOnboarding;
	Approval_Screens ManagerRecHRApproval;
	Offer_Accept AcceptOffer;
	OnBoarding_EmpPortal_Steps OnBoardingEmpPortal;
	OnBoarding_OBMod_DashBoard EmpinOnBoardingModule;
	EmpView_EmpModule EmpModule;
	Edit_PayratePerDiem_Scenerios EditpayRate;
	Regular_TS_Weekly RegularTS;
	Regular_TS_BiWeekly RegularTS1;
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Clinical_NewEmp(String testData) throws Exception
	{
		ExcelTestdata = new ExcelTestData();
		ClientPage=new Submit_NewClient(driver);
		ReqPage = new Submit_NewRequirement(driver);
		SearchReq = new Search_RequirementType(driver);
		CandidatePage=new Submit_NewCandidate(driver);
		SubmitCandandReq=new Submit_CandidateandRequirement(driver);
		Submitstatus=new Change_OfferStatus(driver);
		IntOnboarding=new Initiatate_OnBoarding(driver);
		ManagerRecHRApproval=new Approval_Screens(driver);
		AcceptOffer=new Offer_Accept(driver);
		OnBoardingEmpPortal=new OnBoarding_EmpPortal_Steps(driver);
		EmpinOnBoardingModule=new OnBoarding_OBMod_DashBoard(driver);
		EmpModule=new EmpView_EmpModule(driver);
		EditpayRate=new Edit_PayratePerDiem_Scenerios(driver);
		RegularTS=new Regular_TS_Weekly(driver);
		RegularTS1=new Regular_TS_BiWeekly(driver);

		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);

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
		AcceptOffer.Accept_offer(hmap);
		ManagerRecHRApproval.US_Onboarding_ManagerApproval(hmap);
		OnBoardingEmpPortal.EmpPortalLink_EmailHistory(hmap);
		OnBoardingEmpPortal.EmpPor_OBProcess(hmap);
		EmpinOnBoardingModule.OnBoarding_NewEmp(hmap);
		ManagerRecHRApproval.HRPayroll_Approval(hmap);
		ManagerRecHRApproval.CreateEmployee_Approval(hmap);
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.ApproveTimesheet();	
	}
}




//	EditpayRate.Edit_payRate(hmap);
//	EditpayRate.Finance_Approval(hmap);
//	EditpayRate.Edit_PerDiem(hmap);
//	RegularTS.Clinical_RegTimesheet(hmap);
//	RegularTS.ApproveTimesheet();	
//	RegularTS1.Clinical_BIWeeklyRegTimesheet(hmap);
//	RegularTS1.ApproveTimesheet();	

	
	
	
	
	
	
	
	
	
