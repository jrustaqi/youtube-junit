package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import pages.BasePage;
import pages.GooglePage;
import pages.GoogleSearchPage;
import pages.YouTubePage;
import util.BrowserFactory;

public class YouTubeTest extends BasePage{

	WebDriver driver;

	@Test
	public void userShouldBeAbleToSearchSomethingInUtubeSearchBox() throws InterruptedException {

		driver = BrowserFactory.init();

		GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);
		googlePage.insertYouTubeUrl("https://www.youtube.com/");
		googlePage.clickGoogleSearchButton();

		GoogleSearchPage googleSearchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
		googleSearchPage.clickUtubeUrlInGoogleSearchPage();
		
		String expectedTitle = "YouTube";
		String actualTitle = googlePage.getPageTitle();
		Assert.assertEquals("Page title texts are not matching!", expectedTitle, actualTitle);
		
		YouTubePage youtTubePage = PageFactory.initElements(driver, YouTubePage.class);
		youtTubePage.userShouldBeAbleToTypeInYouTubeSearchBox("Tom and Jerry cartoon");
		youtTubePage.ClickYouTubeSearchButton();
		takeScreenshot(driver);	
		
		// BrowserFactory.tearDown();
	}
}
