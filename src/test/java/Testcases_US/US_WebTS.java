package Testcases_US;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.Login_Page;
import Page_Objects.Web_Timesheet;

@Listeners(ITestListenerClass.class)
public class US_WebTS extends BaseClass{

	ExcelTestData ExcelTestdata;
	Web_Timesheet WebTimesheet;
	Login_Page LoginPage;

	String TestId="Test1";	
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void Web_TS(String testCaseId) throws Exception
	{
		ExcelTestdata = new ExcelTestData();
		WebTimesheet = new Web_Timesheet(driver);
		LoginPage=new Login_Page(driver);
		
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);	
		
		LoginPage.LoginIntoApp(hmap);
		WebTimesheet.US_WebTS_EmpPortal(hmap);
		WebTimesheet.US_ReSubmitTS(hmap);
		
		WebTimesheet.US_DeleteTimesheet(hmap);		
		WebTimesheet.US_WebTSChange_CPX(hmap);	
	}
	
	
	
}	
		
		
		



