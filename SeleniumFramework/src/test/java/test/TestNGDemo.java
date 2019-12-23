package test;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedrivern/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void googleSerch() {
		/*
		 * Maximize bwowser window
		 */
		driver.manage().window().maximize();
		/*
		 * Open browser 
		 */
		driver.get("https://google.com");

		/*
		 * find input element by name
		 */
		WebElement element  = driver.findElement(By.name("q"));

		/*
		 * enter text to search textbox
		 */
		element.sendKeys("Junior QA Looking for position!!!");
		/*
		 * click on submit
		 */
		element.submit();

	}
	@AfterTest
	public void tearDownTest() {

		/*
		 * close browser
		 */
		driver.close();
		driver.quit();
		System.out.println("Test Comleted Successfully!!!");	

	}
}
