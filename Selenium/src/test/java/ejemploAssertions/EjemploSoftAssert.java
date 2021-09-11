package ejemploAssertions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class EjemploSoftAssert {
	
	SoftAssert softA = new SoftAssert();
	
  @Test
  public void softAssertEjemploSel() {
	  String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); //Inicializa el navegador en la web especificada
		driver.manage().window().maximize();
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		String badTitle = "Orange HRM";
		
		softA.assertEquals(actualTitle, expectedTitle);
		softA.assertNotEquals(actualTitle, badTitle);
		softA.assertAll();
		
		driver.close();
		
  }
}
