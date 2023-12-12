package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GoogleSearchPage {

	WebDriver driver;

	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h3[contains(text(), 'YouTube: Home')]")WebElement UTUBE_URL_IN_GOOGLE_SEARCH_PAGE_ELEMENT;

	public void clickUtubeUrlInGoogleSearchPage() {
		UTUBE_URL_IN_GOOGLE_SEARCH_PAGE_ELEMENT.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}
}
