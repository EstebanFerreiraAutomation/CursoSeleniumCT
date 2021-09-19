package loginTests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driverSetup.DriverSetup;
import navigationPages.DashboardPage;
import navigationPages.DirectoryPage;
import navigationPages.LoginPage;
import variablesGlobales.VariablesGlobales;
import wrapper.CommonMethods;

public class TC_04 {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	LoginPage login = new LoginPage(driver);
	DashboardPage dashboard = new DashboardPage(driver);
	DirectoryPage directory = new DirectoryPage(driver);
	
	@BeforeTest
	
	public void startWebDriver() {
		driver.get(VariablesGlobales.URL_PAGE);
		driver.manage().window().maximize();		
	}	
	
  @Test
  public void TC_04_correctData() {
	  login.login(VariablesGlobales.USER_ADMIN, VariablesGlobales.ADMIN_PASS);
	  dashboard.changeToDirectory();
	  directory.writeName("Nathan");
	  directory.selectJobTitle("Sales Representative");
	  directory.selectLocation("  United States");
	  directory.search();
	  directory.getShownName();
	  
	  boolean expectedName = directory.getShownName().equals("Nathan Elliot");	  
	  
	  Assert.assertTrue(expectedName);
  }
  
  @AfterTest
  public void close() {
  CommonMethods.closeDriver(driver, "TC_04_correctData");
  }
}
