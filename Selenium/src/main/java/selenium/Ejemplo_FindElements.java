package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo_FindElements {

	public static void main(String[] args) throws InterruptedException {		
		
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); //Inicializa el navegador en la web especificada
		driver.manage().window().maximize();		
		
		WebElement txtBoxUsername = driver.findElement(By.id("txtUsername"));
		WebElement txtBoxPass = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));		
		
		txtBoxUsername.sendKeys("Admin");
		Thread.sleep(500); 
		txtBoxPass.sendKeys("admin123");
		Thread.sleep(500);
		btnLogin.click();
		Thread.sleep(500);
		
		List<WebElement> firstLevelMenu = driver.findElements(By.className("firstLevelMenu"));
				
				String primerMenu = firstLevelMenu.get(0).getText();
				String segundoMenu = firstLevelMenu.get(1).getText();
				
				System.out.println(primerMenu);
				System.out.println(segundoMenu);
				
				for(int i = 0; i < firstLevelMenu.size(); i++) {
					System.out.println("Los menus son: " + firstLevelMenu.get(i).getText());
				}	
	}

}
