package Page_Objects;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Reusable_Methods.Generic_Methods;

public class Search_RequirementType {

	WebDriver driver;
	Generic_Methods lib;

	@FindBy(xpath = "//*[text()='Sales']")
	private WebElement sales;

	@FindBy(xpath="//*[text()='Requirement']")
	private WebElement reqLink;

	@FindBy(xpath="//a[@href='#tabRequirement' and contains(text(),'Requirement')]")
	private WebElement reqLink2;

	@FindBy(xpath="//*[@id='AutoCompleteClientName']")
	private WebElement ClientName;

	@FindBy(xpath="//*[@id='RequirementCategoryID']")
	private WebElement ReqCategoryId;
	
	@FindBy(xpath="//*[@id='RequirementSubCategoryID']")
	private WebElement ReqSubCat;
	
	@FindBy(xpath="//*[@id='AutoCompleteReqTitle']")
	private WebElement ReqTitle;
	
	@FindBy(xpath="//*[@id='AutoCompleteReqNumber']")
	private WebElement Clientreq;
	
	@FindBy(xpath = "//td[@id='tdchkbox']/input[@type='checkbox']")
	private WebElement checkbox;

	@FindBy(xpath="//*[@class='t-button t-state-default'][1]")
	private WebElement Search;
	
	public Search_RequirementType(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void Search_Requirement(Map<String,String> hmap) throws Exception {
//		driver.navigate().refresh();
		Thread.sleep(1000);
		sales.click();
		reqLink.click();
		lib=new Generic_Methods(driver);
		lib.handlingFrame("frmContent");
		reqLink2.click();
		Thread.sleep(1000);
		ClientName.sendKeys(hmap.get("Clientname"));
		ClientName.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		ReqTitle.sendKeys(hmap.get("RequirementTitle"));              
		ReqTitle.sendKeys(Keys.TAB);
		//Clientreq.sendKeys(hmap.get("ClientReqNo"));
		lib.select(ReqCategoryId, hmap.get("Reqcategory"));
		Thread.sleep(1000);
		lib.select(ReqSubCat,hmap.get("ReqSubcategory"));
		Thread.sleep(1000);

		String optionText =hmap.get("ReqStatus");
		String xpathExpression = "//td[@id='tdchkbox']/input[@type='checkbox'][normalize-space(following-sibling::text())='" + optionText + "']";
		driver.findElement(By.xpath(xpathExpression)).click();
		
		String optText =hmap.get("RequirementType");
		String chkbox = "//td[@id='tdchkboxReqType']/input[@type='checkbox'][normalize-space(following-sibling::text())='" + optText + "']";
		driver.findElement(By.xpath(chkbox)).click();
		Thread.sleep(1000);
		Search.click();
		lib.switchOutOfFrame();
	}
}
