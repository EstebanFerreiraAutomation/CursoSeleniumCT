package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjemploLoginForm {

	public static void main(String[] args) throws InterruptedException {
		
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.applitools.com/"); //Inicializa el navegador en la web especificada
		driver.manage().window().maximize(); //maximiza ventana
		
		WebElement txtBoxUsrName = driver.findElement(By.id("username"));
		WebElement txtBoxPass = driver.findElement(By.id("password"));
		WebElement btnSignIn = driver.findElement(By.xpath("//*[@id=\"log-in\"]"));
		
		txtBoxUsrName.sendKeys("UnUser");
		Thread.sleep(2000);
		txtBoxPass.sendKeys("UnPass");
		Thread.sleep(2000);
		btnSignIn.click();
		Thread.sleep(2000);
		driver.quit();
		

	}

}
