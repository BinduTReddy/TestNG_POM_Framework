package Testcases_US;

import java.util.List;
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
import Page_Objects.Regular_TS_Weekly;
import Page_Objects.Regular_Invoice;
import Page_Objects.Regular_TS_BiWeekly;
import Page_Objects.RunPayroll_Module;
import Page_Objects.OnBoarding_EmpPortal_Steps;
import Page_Objects.Search_RequirementType;
import Page_Objects.Submit_CandidateandRequirement;
import Page_Objects.Change_OfferStatus;
import Page_Objects.Edit_BillPayRate;
import Page_Objects.TJCDoc_Approval;
import Page_Objects.TJCDoc_EmpModule;
import Page_Objects.Offer_Accept;
import Page_Objects.BG_Check_Sterling;

@Listeners(ITestListenerClass.class)
public class US_Clinical_JC extends BaseClass{

	ExcelTestData ExcelTestdata;
	Submit_NewClient ClientPage;
	Login_Page LoginPage;
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
	Edit_BillPayRate Edit_BillPayrate;
	TJCDoc_EmpModule TJCDocument;
	TJCDoc_Approval TJCApp;
	BG_Check_Sterling BGCheck;
	Regular_TS_Weekly RegularTS;
	Regular_TS_BiWeekly RegularTS1;
	Regular_Invoice RegInvoice;
	RunPayroll_Module Runpayroll;

	@Test(dataProvider = "ClinicalTestData",dataProviderClass = TestDataProvider.class)
	public void Clinical_JC_Emp(String testCaseId) throws Exception
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
		AcceptOffer=new Offer_Accept(driver);
		BGCheck=new BG_Check_Sterling(driver);
		OnBoardingEmpPortal=new OnBoarding_EmpPortal_Steps(driver);
		EmpinOnBoardingModule=new OnBoarding_OBMod_DashBoard(driver);
		EmpModule=new EmpView_EmpModule(driver);
		Edit_BillPayrate=new Edit_BillPayRate(driver);
		TJCDocument=new TJCDoc_EmpModule(driver);
		TJCApp=new TJCDoc_Approval(driver);
		RegularTS=new Regular_TS_Weekly(driver);
		RegularTS1=new Regular_TS_BiWeekly(driver);
		BGCheck=new BG_Check_Sterling(driver);
		RegInvoice=new Regular_Invoice(driver);
		Runpayroll=new RunPayroll_Module(driver);
		
		Map<String,String> hmap = ExcelTestData.readDataToMap(testCaseId);	
		List<String> testCaseIds = ExcelTestData.getAllTestIds();
		
		String firstTestCaseId = testCaseIds.get(0);
		String lastTestCaseId = testCaseIds.get(testCaseIds.size() - 1);		
		
		if (testCaseId.equals(firstTestCaseId)) {
			LoginPage.LoginIntoApp(hmap);	
//			ClientPage.Client(hmap);
//			ClientPage.ClientApproval(hmap);	
//			ReqPage.Create_NewRequirement(hmap);
			SearchReq.Search_Requirement(hmap);
			CandidatePage.Add_NewCandidate(hmap);
			SubmitCandandReq.Submit_Candidate(hmap);
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
			TJCDocument.OB_TJC_DocTab(hmap);
		}		
		if (testCaseIds.contains(testCaseId)) {
			TJCDocument.OB_TJC_Documents(hmap); 
		}		
		if (testCaseId.equals(lastTestCaseId)) {
			BGCheck.OB_BackGroundCheck(hmap);	
			EmpinOnBoardingModule.OnBoarding_NewEmp(hmap);
			TJCApp.OBModule_TJC_Approval(hmap);
			ManagerRecHRApproval.HRPayroll_Approval(hmap);
			ManagerRecHRApproval.CreateEmployee_Approval(hmap);
			EmpModule.External_Employee(hmap);
			Edit_BillPayrate.Clinical_BillPayEdit(hmap);
			Edit_BillPayrate.Finance_Approval(hmap);
			RegularTS.Clinical_RegTimesheet(hmap);	
			RegularTS.CloseTimesheet();
			RegularTS.Reg_TSReport(hmap);
			RegInvoice.Reg_SaveInvoice(hmap);	
			RegInvoice.RegInvoice_Approval(hmap);
			Runpayroll.Run_PayRoll(hmap);
			
		}
	}
}








