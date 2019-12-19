package SeleniumFramework.SeleniumFramework;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import config.PropertiesFile;

import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {
	static String projectPath;
	static String browser;
	static WebDriver driver;


	public static void main(String[] args) {
		// Set path
		projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+ projectPath);
		
		setBrowser();
		setBrowserConfig();
		runTest();
		clean_resources();
		PropertiesFile.writePropertiesFile();
	}
	
	/**
	 * Description: temporary set browser type
	 * @author mkbc3
	 * @date
	 */
	public static void setBrowser() {
		browser = PropertiesFile.readPropertiesFile();
		System.out.println("Browser type: " + browser);
	}
	// 
	/**
	 * Description: select browser according to configuration
	 * @author mkbc3
	 * @date
	 */
	public static void setBrowserConfig() {
		
		if(browser.contains("Firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		if(browser.contains("Chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedrivern/chromedriver.exe");
			driver = new ChromeDriver();
		}

		if(browser.contains("InternetExplorer")) {
			System.setProperty("webdriver.ie.driver", projectPath+"/drivers/iedriver/IEDriverServer.exe");
			driver  = new InternetExplorerDriver();
		}
	}
	
	/**
	 * Description: invoke browser; find element by type; count all elements for this type; wait 3 sec
	 * @author mkbc3
	 * @date
	 */
	public static void runTest() {
		
		driver.get("https://google.com/");
		//---------> Find element by xpath and set keys
		/*WebElement textBox =*/ driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Find input element by xpath");
		//textBox.sendKeys("Find input element by xpath"); 
		//---------->Find all input elements in the page
		List<WebElement>elementList = driver.findElements(By.xpath("//input"));
		int elementCount = elementList.size();
		System.out.println("Element count: "+ elementCount);

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	/**
	 * Description:
	 * @author mkbc3
	 * @date
	 */
	public static void clean_resources() {
		driver.close();
		driver.quit();
	}

}
