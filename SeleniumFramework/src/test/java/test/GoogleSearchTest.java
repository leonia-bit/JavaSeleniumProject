package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSerch();
	}
	/**
	 * Description: insert text to search in input field and lick search button
	 * @author mkbc3
	 * @date
	 */
	public static void googleSerch() {
		/*
		 * init chrome web driver
		 */
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+ projectPath);
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedrivern/chromedriver.exe");
		driver = new ChromeDriver();
		
		/*
		 * goto google.com site
		 */
		driver.get("https://google.com");
		
		/*
		 * return search  text_box element
		 */
		WebElement element = GoogleSearchPage.textbox_search(driver);
		
		/*
		 * insert test to text_box search element
		 */
		 element.sendKeys("java keywords description");
		 /*
		  * Click to search button.
		  */
         element.submit();
         
        /*
         * wait 3 seconds 
         */
     	try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}				
		/*
		 * close browser
		 */
		driver.close();	
		driver.quit();
		System.out.println("Test Comleted Successfully!!!");
		
	}
}
