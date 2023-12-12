package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class YouTubePage {

	WebDriver driver;

	public YouTubePage(WebDriver driver) {
		
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='search']") WebElement YOUTUBE_SEARCH_BOX_ELEMENT;
	@FindBy(how = How.XPATH, using = "(//yt-icon-shape[@class='style-scope yt-icon'])[9]")WebElement YOUTUBE_SEARCH_BUTTON_ELEMENT;

	public void userShouldBeAbleToTypeInYouTubeSearchBox(String something) {
		YOUTUBE_SEARCH_BOX_ELEMENT.sendKeys(something);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void ClickYouTubeSearchButton() {
		YOUTUBE_SEARCH_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

}
