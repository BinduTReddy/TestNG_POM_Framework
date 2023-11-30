package Base_Programs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import java.io.*;
import java.util.*;

public class BaseClass{

	public static WebDriver driver;
	Read_ConfigProperties_File Readprop;

	@BeforeClass	
	public void openBrowser() throws IOException
	{
		Readprop = new Read_ConfigProperties_File();
		Properties props = Readprop.getproperties();

		System.setProperty("webdriver.chrome.driver",props.getProperty("chromepath"));
		ChromeOptions options = new ChromeOptions();
		options.addArguments("force-device-scale-factor=0.9");	
		driver = new ChromeDriver(options);

//		System.setProperty("webdriver.edge.driver",props.getProperty("EdgeDriverpath"));
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("force-device-scale-factor=0.9");
//		WebDriver driver = new EdgeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@AfterClass
	public void CloseBrowser() {
		//driver.quit();
	}	



}
