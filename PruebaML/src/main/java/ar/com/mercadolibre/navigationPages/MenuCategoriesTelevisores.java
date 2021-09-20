package ar.com.mercadolibre.navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
