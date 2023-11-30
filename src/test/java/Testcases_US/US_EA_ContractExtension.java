package Testcases_US;

import java.util.List;
import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.Regular_TS_BiWeekly;
import Page_Objects.Regular_TS_Weekly;
import Page_Objects.EA_ContractExtension;
import Page_Objects.Login_Page;
import Page_Objects.Regular_TSChange_Weekly;

@Listeners(ITestListenerClass.class)
public class US_EA_ContractExtension extends BaseClass{

	ExcelTestData ExcelTestdata;
	Login_Page LoginPage;
	Regular_TS_Weekly RegularTS;
	Regular_TS_BiWeekly RegularTS1;
	Regular_TSChange_Weekly TsChange;
	EA_ContractExtension EA_Extension;
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void EA_Extension(String testData) throws Exception
	{
		ExcelTestdata = new ExcelTestData();
		LoginPage=new Login_Page(driver);
		RegularTS=new Regular_TS_Weekly(driver);
		RegularTS1=new Regular_TS_BiWeekly(driver);
		TsChange=new Regular_TSChange_Weekly(driver);
		EA_Extension = new EA_ContractExtension(driver);

//		Map<String,String> hmap = ExcelTestData.readDataToMap(testData);	
//		List<String> testCaseIds = ExcelTestData.getAllTestIds();
//		String firstTestCaseId = testCaseIds.get(0);
		
		String TestId="Doc_Resume";
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
			
		LoginPage.LoginIntoApp(hmap);
		EA_Extension.EA_ContExtension(hmap);
		EA_Extension.Finance_Approval(hmap);
		
//		if (testCaseId.equals(firstTestCaseId)) {
//		LoginPage.LoginIntoApp(hmap);	
//		}
//		if (testCaseIds.contains(testCaseId)) {
//		EA_Extension.EA_ContExtension(hmap);
//		EA_Extension.Finance_Approval(hmap);
//		}
		
		
		
		
		
		
		
		
//		RegularTS1.Clinical_BIWeeklyRegTimesheet(hmap);
//		RegularTS1.ApproveTimesheet();					
		
		}
	}



















				
		
		
		
		



