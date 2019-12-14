package SeleniumFramework.SeleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+ projectPath);
	//	System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedrivern/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.dev/");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		driver.quit();
	}

}
