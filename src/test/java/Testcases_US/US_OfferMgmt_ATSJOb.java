package Testcases_US;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.Offer_Accept;
import Page_Objects.OnBoarding_EmpPortal_Steps;
import Page_Objects.OnBoarding_OBMod_DashBoard;
import Page_Objects.Login_Page;
import Page_Objects.OfferMgt_ClientsAndWorkLoc;
import Page_Objects.OfferMgt_JobsandCands;
import Page_Objects.OfferMgt_NewOffer;
import Page_Objects.TJCDoc_Approval;
import Page_Objects.TJCDoc_EmpModule;

@Listeners(ITestListenerClass.class)
public class US_OfferMgmt_ATSJOb extends BaseClass{

	ExcelTestData ExcelTestdata;
	Login_Page LoginPage;
	OfferMgt_ClientsAndWorkLoc OfferMgmtNewClient;
	OfferMgt_JobsandCands OfferMgmtJobsAndCand;
	OfferMgt_NewOffer OfferMgmtOffers;
	Offer_Accept AcceptOffer;
	OnBoarding_EmpPortal_Steps OnBoardingEmpPortal;
	OnBoarding_OBMod_DashBoard EmpinOnBoardingModule;
	TJCDoc_EmpModule TJCDocument;
	TJCDoc_Approval TJCApp;
		
	@Test(dataProvider = "ClinicalTestData",dataProviderClass = TestDataProvider.class)
	public void Clinical_NewEmp(String testCaseId) throws Exception
	{
		ExcelTestdata = new ExcelTestData();
		LoginPage=new Login_Page(driver);
		OfferMgmtNewClient=new OfferMgt_ClientsAndWorkLoc(driver);
		OfferMgmtJobsAndCand=new OfferMgt_JobsandCands(driver);
		OfferMgmtOffers=new OfferMgt_NewOffer(driver);
		AcceptOffer=new Offer_Accept(driver);
		OnBoardingEmpPortal=new OnBoarding_EmpPortal_Steps(driver);
		EmpinOnBoardingModule=new OnBoarding_OBMod_DashBoard(driver);
		TJCDocument=new TJCDoc_EmpModule(driver);
		TJCApp=new TJCDoc_Approval(driver);
		
		Map<String,String> hmap = ExcelTestData.readDataToMap(testCaseId);
		List<String> testCaseIds = ExcelTestData.getAllTestIds();
		
		String firstTestCaseId = testCaseIds.get(0);
		String lastTestCaseId = testCaseIds.get(testCaseIds.size() - 1);
		
		if (testCaseId.equals(firstTestCaseId))
		{
		LoginPage.LoginIntoApp(hmap);	
		
		OfferMgmtOffers.OfferMgmt_ATSWizard(hmap);

		OfferMgmtOffers.NewOffer_RecMgrApproval(hmap);
		OfferMgmtOffers.NewOffer_MgrApproval(hmap);
		OfferMgmtOffers.OfferMgmtEA_EmailHistory(hmap);
		OnBoardingEmpPortal.EmpPortalLink_EmailHistory(hmap);
		OnBoardingEmpPortal.EmpPor_OBProcess(hmap);		
		TJCDocument.OB_TJC_DocTab(hmap);
		}		
		if (testCaseIds.contains(testCaseId)) {
	    TJCDocument.OB_TJC_Documents(hmap); 
		}		
		if (testCaseId.equals(lastTestCaseId)) {
		EmpinOnBoardingModule.OnBoarding_NewEmp(hmap);
		TJCApp.OBModule_TJC_Approval(hmap);			
		}
	}
		
		
	}

				
		
		
		
		



