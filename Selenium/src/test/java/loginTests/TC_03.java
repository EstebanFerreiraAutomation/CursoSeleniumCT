package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import navigationPages.DashboardPage;
import navigationPages.LoginPage;
import variablesGlobales.VariablesGlobales;

public class TC_03 {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);
	
	@BeforeTest
	
	public void startWebDriver() {
		driver.get(VariablesGlobales.URL_PAGE);
		driver.manage().window().maximize();
	}
	
  @Test
  public void TC_03_Logout() {
	  login.login(VariablesGlobales.USER_ADMIN, VariablesGlobales.ADMIN_PASS);
	  dashboard.logout();
  }
  
  @AfterTest
  public void closeDriver() {
	  driver.close();
	  }
}
