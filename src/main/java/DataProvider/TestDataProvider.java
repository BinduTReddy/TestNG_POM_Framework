package DataProvider;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;

import Base_Programs.ExcelTestData;

public class TestDataProvider {

	public Map<String,String> testData = new HashMap<String,String>();
	
	@DataProvider(name = "TestData")
	public static Object[][] TestData() throws IOException {		
	    return new Object[][] {	  	       
	    	{"testData"}
	};
}


	//US_Clinical process
	 @DataProvider(name = "ClinicalTestData")
	    public static Object[][] Test_Data() throws IOException {
	        List<String> testIds = ExcelTestData.getAllTestIds();
	        Object[][] testData = new Object[testIds.size()][1];
	        for (int i = 0; i < testIds.size(); i++) {
	           testData[i][0] = testIds.get(i);             
	            	}
	        return testData;
	    }
	}
