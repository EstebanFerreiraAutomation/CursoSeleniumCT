package ar.com.mercadolibre.navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LastTVPage {

	public LastTVPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="price-tag-fraction")
	private WebElement price;
	
}
