package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleSearchPageObjects {
	
	WebDriver driver = null;	
	
	By textbox_search = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input");
	//By button_search = By.name("btnK");
	
	By button_search = By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]");
	
	public GoogleSearchPageObjects(WebDriver driver){
		this.driver = driver;
	}
	public void setTextInSerchBox(String text) {
		WebElement element = driver.findElement(textbox_search);
		element.sendKeys(text);
		
	}
	public void clickSearchButton() {
		
		driver.findElement(button_search).sendKeys(Keys.RETURN);
		
	}
}
