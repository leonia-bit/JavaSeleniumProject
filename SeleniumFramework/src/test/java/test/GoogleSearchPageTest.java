package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageObjects;

public class GoogleSearchPageTest {
	
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearchTest();
	}
	
	public static void googleSearchTest() {
		/*
		 * init chrome web driver
		 */
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedrivern/chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageObjects pageObject = new GoogleSearchPageObjects(driver);
		
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
        pageObject.setTextInSerchBox("LUKOY stock price");
        
		pageObject.clickSearchButton();
		
		//driver.close();
		
		
		
	                                             
		
		
	}
}
