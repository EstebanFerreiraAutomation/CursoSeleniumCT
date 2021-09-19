package ar.com.mercadolibre.navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	public MainPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="nav-menu-categories-link")
	private WebElement categoriasOptn;
	
	@FindBy(xpath="/html/body/header/div/div[2]/ul/li[2]/nav/section[1]/ul[2]/li/a")
	private WebElement tecnologiaOptn;
	
	@FindBy(xpath="/html/body/header/div/div[2]/ul/li[2]/nav/section[2]/div/div/article[6]/h2/a")
	private WebElement tvOptn;
	
}
