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
import Page_Objects.OnBoarding_EmpPortal_Steps;
import Page_Objects.Search_RequirementType;
import Page_Objects.Submit_CandidateandRequirement;
import Page_Objects.Change_OfferStatus;
import Page_Objects.TJCDoc_Approval;
import Page_Objects.TJCDoc_EmpModule;
import Page_Objects.Offer_Accept;
import Page_Objects.BG_Check_Sterling;

@Listeners(ITestListenerClass.class)
public class US_Clinical_Sterling extends BaseClass{

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
	Offer_Accept AcceptOffer;
	OnBoarding_EmpPortal_Steps OnBoardingEmpPortal;
	OnBoarding_OBMod_DashBoard EmpinOnBoardingModule;
	EmpView_EmpModule EmpModule;
	TJCDoc_EmpModule TJCDocument;
	TJCDoc_Approval TJCApp;
	BG_Check_Sterling BGCheck;
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Clinical_NewEmp(String testCaseId) throws Exception
	{
		ExcelTestdata = new ExcelTestData();
		LoginPage=new Login_Page(driver);
		BGCheck=new BG_Check_Sterling(driver);

		String TestData="Test1";
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestData);			

		LoginPage.LoginIntoApp(hmap);	
		BGCheck.OB_BackGroundCheck(hmap);	
	}
}















				

				
		
		
		
		



