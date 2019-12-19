package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGoogleSearch {
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
		WebDriver driver = new ChromeDriver();
		
		/*
		 * goto google.com site
		 */
		driver.get("https://google.com");
		
		/*
		 * enter text to search textbox
		 */
		WebElement element  = driver.findElement(By.name("q"));
		
		/*
		 * click on submit
		 */
		 element.sendKeys("selenium browser automation");
         element.submit();
         
        /*
         * wait 3 sec
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
