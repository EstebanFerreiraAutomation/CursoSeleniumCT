package ejercicioAsserts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ejercicioAsserts {
  @Test
  public void TC_NombreCompleto() throws InterruptedException {
	  String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); //Inicializa el navegador en la web especificada
		driver.manage().window().maximize();
		
		//1. Login
		
		WebElement txtBoxUsername = driver.findElement(By.id("txtUsername"));
		WebElement txtBoxPass = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));		
		
		txtBoxUsername.sendKeys("Admin");
		Thread.sleep(500);
		txtBoxPass.sendKeys("admin123");
		Thread.sleep(500);
		btnLogin.click();
		Thread.sleep(500);
		
		//2. Click en Directory
		
		WebElement directoryBtn = driver.findElement(By.id("menu_directory_viewDirectory"));
		directoryBtn.click();
		Thread.sleep(500);
		
		//3. Buscar por Name, Job Title, Location
		
		WebElement txtBxName = driver.findElement(By.id("searchDirectory_emp_name_empName"));
		txtBxName.sendKeys("Nathan");
		Thread.sleep(500);
		
		Select jobTitleDrpDwnBtn = new Select (driver.findElement(By.id("searchDirectory_job_title")));
		jobTitleDrpDwnBtn.selectByVisibleText("Sales Representative");
		Thread.sleep(500);
		
		Select locationDrpDwnBtn = new Select (driver.findElement(By.id("searchDirectory_location")));
		locationDrpDwnBtn.selectByVisibleText("  United States");
		
		Thread.sleep(500);
		
		WebElement btnSearch = driver.findElement(By.id("searchBtn"));
		btnSearch.click();
		
		String shownName = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")).getText();
		String expectedName = "Nathan Elliot";		
		
		assertEquals(shownName, expectedName);
		
		driver.quit();
  }
}
