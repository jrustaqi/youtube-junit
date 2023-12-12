package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pages.BasePage;
import pages.GooglePage;
import util.BrowserFactory;

public class GoogleTest extends BasePage{
	
	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToEnterUtubeUrl() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);
		googlePage.insertYouTubeUrl("https://www.youtube.com/");
		takeScreenshot(driver);
		
		googlePage.clickGoogleSearchButton();
		
		//BrowserFactory.tearDown();
	}
}
