package SeleniumFramework.SeleniumFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String projectPath = System.getProperty("user.dir");
		System.out.println("Project path: "+ projectPath);
		System.setProperty("webdriver.gecko.driver", projectPath+"\\drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://selenium.dev/");
	}

}
