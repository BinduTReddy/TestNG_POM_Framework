package TestCases_Canada;
	
	import java.util.Map;

	import org.testng.annotations.Listeners;
	import org.testng.annotations.Test;

	import Base_Programs.BaseClass;
	import Base_Programs.ExcelTestData;
	import Base_Programs.ITestListenerClass;
	import DataProvider.TestDataProvider;
	import Page_Objects.Approval_Screens;
	import Page_Objects.DirectHire_Process;
	import Page_Objects.Submit_NewCandidate;
	import Page_Objects.Submit_NewClient;
	import Page_Objects.Submit_NewRequirement;
	import Page_Objects.Search_RequirementType;
	import Page_Objects.Submit_CandidateandRequirement;
	import Page_Objects.Change_OfferStatus;

	@Listeners(ITestListenerClass.class)
	public class Canada_DH_SubmitExistingEmp extends BaseClass {
		
		Submit_NewClient ClientPage;
		Submit_NewRequirement ReqPage;
		Search_RequirementType SearchReq;
		Submit_NewCandidate CandidatePage;
		Submit_CandidateandRequirement SubmitCandandReq;
		Change_OfferStatus Submitstatus;
		DirectHire_Process NewEmpDH;
		Approval_Screens ManagerRecHRApproval;
	
		@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
		public void Employee(String testData) throws Exception
		{
			ClientPage=new Submit_NewClient(driver);
			ReqPage = new Submit_NewRequirement(driver);
			SearchReq = new Search_RequirementType(driver);
			CandidatePage=new Submit_NewCandidate(driver);
			SubmitCandandReq=new Submit_CandidateandRequirement(driver);
			Submitstatus=new Change_OfferStatus(driver);
			NewEmpDH=new DirectHire_Process(driver);
			ManagerRecHRApproval=new Approval_Screens(driver);
		
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
			Submitstatus.NonClinical_OfferAccept(hmap);
			NewEmpDH.Create_DirectHire(hmap);
			NewEmpDH.SearchEmployee_DirectHireModule(hmap);
		}

	}	
			
		






