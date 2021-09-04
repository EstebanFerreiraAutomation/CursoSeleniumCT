package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EjemploOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); //Inicializa el navegador en la web especificada
		driver.manage().window().maximize(); //maximiza ventana
		
		//Obteniendo objetos/webelements
		
		WebElement txtBoxUsername = driver.findElement(By.id("txtUsername"));
		WebElement txtBoxPass = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));		
		
		//Login
		
		txtBoxUsername.sendKeys("Admin");
		Thread.sleep(2000); //Igual a ui.pause en WindowTester
		txtBoxPass.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(4000);
		
		//Obtengo webelements de 2da página
		WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"welcome\"]"));
		WebElement btnLogout = driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a"));
		dropDown.click();
		Thread.sleep(2000);
		btnLogout.click();
		Thread.sleep(2000);
		
		driver.quit();
	}

}
