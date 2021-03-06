package pruebaEntrevista;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	private WebDriver driver;
	
	public Base (WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection () {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		return driver;
	}
	
	public WebElement findElement (By locator) {
		return driver.findElement(locator);
	}
	
	public WebElement findElements (By locator) {
		return driver.findElement(locator);		
	}
	
	public String getText (WebElement element) {
		return element.getText();
	}
	
	public String getText (By locator) {
		return driver.findElement(locator).getText();		
	}
	
	public void type (String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click (By locator) {
		driver.findElement(locator).click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed(); 
		}catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}			
	}
	
	public void visiting (String url) {
		driver.get(url);
	}
}
