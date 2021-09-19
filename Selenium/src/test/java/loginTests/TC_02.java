package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import navigationPages.LoginPage;
import variablesGlobales.VariablesGlobales;

public class TC_02 {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//Instancio mi clase genérica de Login - Login Page Object
	
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	
	public void startWebDriver() {
		driver.get(VariablesGlobales.URL_PAGE);
		driver.manage().window().maximize();
	}
	
  @Test
  public void TC_02_IncorrectLogin () {
	  boolean msgError = login.loginIncorrect("SuperUser", "superuser123");
	  Assert.assertTrue(msgError);
  }
  
  @AfterTest
  public void closeDriver() {
	  driver.close();
  }
}