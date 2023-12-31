package Reusable_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generic_Methods {
	WebDriver driver;

	public Generic_Methods(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void select(WebElement element,String textToSelect) {
		Select sel = new Select(element);
		sel.selectByVisibleText(textToSelect);
	}

	public void waitForElementLoad(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,00);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void handlingFrame(String frameID) {
		driver.switchTo().frame(frameID);
	}

	public void switchOutOfFrame() {
		driver.switchTo().defaultContent();
	}


}



