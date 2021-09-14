package pruebaEntrevista;

import static org.testng.Assert.assertNotEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestPrueba {
@Test
	public void f () throws InterruptedException {	
		
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.mercadolibre.com.ar");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement categoriasOptn = driver.findElement(By.className("nav-menu-categories-link"));
		actions.moveToElement(categoriasOptn).perform();
		Thread.sleep(500);
		
		WebElement tecnologiaOptn = driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[2]/nav/section[1]/ul[2]/li/a"));
		actions.moveToElement(tecnologiaOptn).perform();
		Thread.sleep(500);
		
		WebElement televisoresOptn = driver.findElement(By.xpath("/html/body/header/div/div[2]/ul/li[2]/nav/section[2]/div/div/article[6]/h2/a"));
		televisoresOptn.click();
		Thread.sleep(500);
		
		WebElement orderByDrpBtn = driver.findElement(By.className("andes-dropdown__trigger"));
		orderByDrpBtn.click();
		Thread.sleep(500);
		
		WebElement menorPrecio = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/div[1]/div/div/div/div[2]/div/div/div/ul/li[2]/a/div/div"));
		menorPrecio.click();
		Thread.sleep(500);
		
		WebElement ultimoElementoBox = driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/ol/li[50]/div/div/div[1]/a/div/div/div/div/div/img"));		
		ultimoElementoBox.click();
		Thread.sleep(500);		
		
		WebElement price = driver.findElement(By.className("price-tag-fraction"));
		
		String showedPrice = price.getText();
		System.out.println("***PRECIO*** " + showedPrice);
		String expectedPrice = "29.999";
		
		assertNotEquals(showedPrice, expectedPrice);
		//assertEquals(showedPrice, expectedPrice);		

		Thread.sleep(5000);
		driver.quit();
	}

}
