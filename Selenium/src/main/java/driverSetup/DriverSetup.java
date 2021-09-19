package driverSetup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup {
	public static WebDriver setupDriver () {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath); //Establece propiedad del .exe
		WebDriver driver = new ChromeDriver(); //Inicializo el driver, instancio
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Implicit global
		return driver; //Puedo utilizar el driver en cualquier test case del proyecto
	}
}
