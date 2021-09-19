package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import navigationPages.LoginPage;
import variablesGlobales.VariablesGlobales;
import wrapper.CommonMethods;

public class TC_01 {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	//Instancio mi clase genérica de Login - Login Page Object
	
	LoginPage login = new LoginPage(driver);
	
	@BeforeTest
	
	public void startWebDriver() {
		driver.get(VariablesGlobales.URL_PAGE);
		driver.manage().window().maximize();
	}
	
  @Test
  public void TC_01_CorrectLogin () {
	  login.login(VariablesGlobales.USER_ADMIN, VariablesGlobales.ADMIN_PASS);
  }
  
  @AfterTest
  public void close() {
	  //CommonMethods.takeScreenshot(driver, "TC_01_CorrectLogin");
	  //driver.close();
	  CommonMethods.closeDriver(driver, "TC_01_CorrectLogin");	  
  }
  
}
