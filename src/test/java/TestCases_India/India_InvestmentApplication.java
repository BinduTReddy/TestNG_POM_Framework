package TestCases_India;

import java.util.Map;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base_Programs.BaseClass;
import Base_Programs.ExcelTestData;
import Base_Programs.ITestListenerClass;
import DataProvider.TestDataProvider;
import Page_Objects.Investment_Application;
import Page_Objects.Login_Page;

@Listeners(ITestListenerClass.class)
public class India_InvestmentApplication extends BaseClass{

	BaseClass base;
	ExcelTestData ExcelTestdata;
	Login_Page LoginPage;
	Investment_Application InvestmentApp;

	String TestId="Test1";
	
	@Test(dataProvider = "TestData",dataProviderClass = TestDataProvider.class)
	public void LoginPage(String testData) throws Exception
	{
		LoginPage=new Login_Page(driver);
		InvestmentApp=new Investment_Application(driver);
		
		Map<String,String> hmap = ExcelTestData.readDataToMap(TestId);
		
		LoginPage.LoginIntoApp(hmap);
		InvestmentApp.Investment_App(hmap);
		InvestmentApp.Invt_Declaration_Approval(hmap);
		
	}
	
}


