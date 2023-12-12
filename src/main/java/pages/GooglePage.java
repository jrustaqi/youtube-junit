package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import util.BrowserFactory;

public class GooglePage {

	WebDriver driver;
	
	public GooglePage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//textarea[@class='gLFyf']") WebElement GOOGLE_SEARCH_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "(//input[@class='gNO89b'])[1]") WebElement GOOGLE_SEARCH_BUTTON_ELEMENT;
	
	public void insertYouTubeUrl(String url){
		GOOGLE_SEARCH_BOX_ELEMENT.sendKeys(url);
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickGoogleSearchButton() {
		GOOGLE_SEARCH_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	 public String getPageTitle() {
		  return driver.getTitle();
		 }
}
