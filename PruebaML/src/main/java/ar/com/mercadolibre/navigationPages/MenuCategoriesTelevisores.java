package ar.com.mercadolibre.navigationPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import ar.com.mercadolibre.driverSetup.DriverSetup;

public class MenuCategoriesTelevisores {
	
	public MenuCategoriesTelevisores (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(className = "andes-dropdown__trigger")
	private WebElement orderByDrpBtn;
	
	@FindBy(xpath="//*[@id=\"root-app\"]/div/div[1]/section/div[1]/div/div/div/div[2]/div/div/div/ul/li[2]/a/div/div")
	private WebElement menorPrecioBtn;
	
	@FindBy(xpath="//*[@id=\"root-app\"]/div/div[1]/section/ol/li[50]/div/div/div[1]/a/div/div/div/div/div/img")
	private WebElement ultimoElementoImg;
	
	public void orderBy() {		
		orderByDrpBtn.click();		
		
	}
	
	public void selectMenorPrecio() {		
		menorPrecioBtn.click();
	}
	
	public void selectLastTV() {
		ultimoElementoImg.click();
	}
}
