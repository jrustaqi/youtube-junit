package tests;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import pages.BasePage;
import pages.GooglePage;
import pages.GoogleSearchPage;
import util.BrowserFactory;

public class GoogleSearchTest extends BasePage {

WebDriver driver;
	
	@Test
	public void userShouldBeAbleToClickOnUtubeUrl() throws InterruptedException {
		
		driver = BrowserFactory.init();
		
		GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);
		googlePage.insertYouTubeUrl("https://www.youtube.com/");
		googlePage.clickGoogleSearchButton();
		
		GoogleSearchPage googleSearchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
		
		String expectedTitle = "https://www.youtube.com/ - Google Search";
		String actualTitle = googlePage.getPageTitle();
		Assert.assertEquals("Page title texts are not matching!", expectedTitle, actualTitle);
		takeScreenshot(driver);
		
		googleSearchPage.clickUtubeUrlInGoogleSearchPage();
		
		//BrowserFactory.tearDown();
	}
	

}
