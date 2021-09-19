package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage (WebDriver driver) {
		PageFactory.initElements(driver, this); //Inicializamos Page Objects con Page Factory
												//Con this le estamos que es en esta misma clase donde 
												// se van a inicializar los webelements
	}
	
	//Login Page Object / WebElements
	
	@FindBy(id="txtUsername")
	private WebElement userNameTxt;
	
	@FindBy(id="txtPassword")
	private WebElement passwordTxt;
	
	@FindBy(id="btnLogin")
	private WebElement btnLogin;
	
	@FindBy(id="spanMessage")
	private WebElement spanMsg;
	
	
	//Hago un método login genérico para que me sirva para todas las web con login que
	//matcheen con esta. Si no se puede modificar lo que falta/sobra.
	
	public void login (String user, String password) {
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
	}
	
	public boolean loginIncorrect (String user, String password) {
		userNameTxt.sendKeys(user);
		passwordTxt.sendKeys(password);
		btnLogin.click();
		
		boolean errorMsg = spanMsg.getText().contains("Invalid credentials");
		
		return errorMsg;
	} 
	
}
