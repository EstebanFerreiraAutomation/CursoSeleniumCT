package ejemploAssertions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EjemploHardAssert {
  @Test
  public void TC_VerificarTituloPagina() {
	  String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); //Inicializa el navegador en la web especificada
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		
		assertEquals(actualTitle, expectedTitle);
  }
}
