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
public class US_Timesheet_Regular extends BaseClass{

	ExcelTestData ExcelTestdata;
	Login_Page LoginPage;
	Regular_TS_Weekly RegularTS;
	Regular_TS_BiWeekly RegularTS1;
	Regular_TSChange_Weekly TsChange;
	
	@Test(dataProvider = "ClinicalTestData",dataProviderClass = TestDataProvider.class)
	public void Timesheet_Regular(String testCaseId) throws Exception
	{
		ExcelTestdata = new ExcelTestData();
		LoginPage=new Login_Page(driver);
		RegularTS=new Regular_TS_Weekly(driver);
		RegularTS1=new Regular_TS_BiWeekly(driver);
		TsChange=new Regular_TSChange_Weekly(driver);

		Map<String,String> hmap = ExcelTestData.readDataToMap(testCaseId);	
		List<String> testCaseIds = ExcelTestData.getAllTestIds();
		String firstTestCaseId = testCaseIds.get(0);
		
		if (testCaseId.equals(firstTestCaseId)) {
		LoginPage.LoginIntoApp(hmap);	
		}
		if (testCaseIds.contains(testCaseId)) {
		RegularTS.Clinical_RegTimesheet(hmap);
		RegularTS.CloseTimesheet();
		}
		
		
//		RegularTS1.Clinical_BIWeeklyRegTimesheet(hmap);
//		RegularTS1.ApproveTimesheet();					
		
		}
	}



















				
		
		
		
		



