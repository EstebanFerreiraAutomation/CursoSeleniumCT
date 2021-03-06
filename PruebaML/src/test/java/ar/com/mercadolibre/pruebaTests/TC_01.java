package ar.com.mercadolibre.pruebaTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ar.com.mercadolibre.globalVariables.GlobalVariables;
import ar.com.mercadolibre.navigationPages.LastTVPage;
import ar.com.mercadolibre.navigationPages.MainPage;
import ar.com.mercadolibre.navigationPages.MenuCategoriesTelevisores;
import driverSetup.DriverSetup;
import wrapper.CommonMethods;

public class TC_01 {
	
	WebDriver driver = DriverSetup.setupDriver();
	
	MainPage main = new MainPage(driver);
	MenuCategoriesTelevisores tvs = new MenuCategoriesTelevisores(driver);
	LastTVPage last = new LastTVPage(driver);
	
  @BeforeTest
	
  public void startWebDriver() {
		driver.get(GlobalVariables.URL_PAGE);
		driver.manage().window().maximize();
	}
	
  @Test
  public void TC_01_SelectLastTV() throws InterruptedException {
	  main.moveToCategorias(driver);
	  main.moveToTecnologia(driver);
	  main.selectTVOptn();	  
	  Thread.sleep(500);
	  tvs.orderBy();
	  tvs.selectMenorPrecio();
	  tvs.selectLastTV();
	  last.getPrice();
	  
	  String expectTest = last.getPrice();
	  System.out.println(expectTest);
	  
boolean expectedPrice = last.getPrice().equals("29.999");	  
	  
	  Assert.assertTrue(expectedPrice);
  }
  
  @AfterTest
  
  public void close() {
	  CommonMethods.closeDriver(driver, "TC_01_SelectLastTV");
	  }
}
