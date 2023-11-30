package Base_Programs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTestData {
	static Properties  props;
	static Read_ConfigProperties_File Readprop;

	public static Map<String,String> readDataToMap(String testcaseID) throws IOException
	{
		Map<String,String> testData=new HashMap<String,String>();

		try {
			Readprop = new Read_ConfigProperties_File();
			props = Readprop.getproperties();
			FileInputStream fis = new FileInputStream(props.getProperty("TestDataPath"));
			Workbook wb = new XSSFWorkbook(fis);
			Sheet sheet = wb.getSheet("TestCaseSheet");
			int lastRowNum = sheet.getLastRowNum();

			int testMatchedRow = getRowNumberOfTestCase(sheet, lastRowNum, testcaseID);
			int totalColms = sheet.getRow(testMatchedRow).getLastCellNum();

			for(int curCol =0;curCol<=totalColms;curCol++)
			{
				sheet.getRow(0);
				sheet.getRow(0).getCell(curCol, Row.CREATE_NULL_AS_BLANK);
				sheet.getRow(0).getCell(curCol).setCellType(Cell.CELL_TYPE_STRING);
				String key = sheet.getRow(0).getCell(curCol).getStringCellValue();

				sheet.getRow(0);
				sheet.getRow(testMatchedRow).getCell(curCol, Row.CREATE_NULL_AS_BLANK);
				sheet.getRow(testMatchedRow).getCell(curCol).setCellType(Cell.CELL_TYPE_STRING);
				String value = sheet.getRow(testMatchedRow).getCell(curCol).getStringCellValue();
				testData.put(key, value);
			}
			//	System.out.println("Map Data Siza:"+testData.size());
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return testData;
	}

	public static int getRowNumberOfTestCase(Sheet sheet, int lastRowNum, String testcaseID) {
		int curRow = 1;
		try {
			for(curRow =1; curRow<=lastRowNum;curRow++)
			{
				if(sheet.getRow(curRow).getCell(0).getStringCellValue().equals(testcaseID))
					break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return curRow;
	}

	
	public static List<String> getAllTestIds() throws IOException {
	    List<String> testIds = new ArrayList<>();	    
	    try {
	        Readprop = new Read_ConfigProperties_File();
	        props = Readprop.getproperties();
	        FileInputStream fis = new FileInputStream(props.getProperty("TestDataPath"));
	        Workbook wb = new XSSFWorkbook(fis);
	        Sheet sheet = wb.getSheet("TestCaseSheet");
	        int lastRowNum = sheet.getLastRowNum();
	        
	        for (int curRow = 1; curRow <= lastRowNum; curRow++) {
	            Row row = sheet.getRow(curRow);
	            if (row != null) {
	                Cell cell = row.getCell(0);
	                if (cell != null) {
	                    String testCaseId = cell.getStringCellValue();
	                    testIds.add(testCaseId);
	                }
	            }
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    
	    return testIds;
	}


	}








