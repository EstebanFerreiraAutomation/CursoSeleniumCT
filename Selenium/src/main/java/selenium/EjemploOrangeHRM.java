package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EjemploOrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		String exePath = "./driver/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/"); //Inicializa el navegador en la web especificada
		driver.manage().window().maximize(); //maximiza ventana
		
		//Obteniendo objetos/webelements
		
		WebElement txtBoxUsername = driver.findElement(By.id("txtUsername"));
		WebElement txtBoxPass = driver.findElement(By.id("txtPassword"));
		WebElement btnLogin = driver.findElement(By.id("btnLogin"));		
		
		//Login
		
		txtBoxUsername.sendKeys("Admin");
		Thread.sleep(2000); //Igual a ui.pause en WindowTester
		txtBoxPass.sendKeys("admin123");
		Thread.sleep(2000);
		btnLogin.click();
		Thread.sleep(4000);
		
		String title = driver.getTitle();
		System.out.println("***TITULO*** " + title);
		
		String urlActual = driver.getCurrentUrl();
		System.out.println("***URL*** " + urlActual);
		
		//Métodos de navegación
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(500);		
		
		//Click en 'Assign Leave'
		
		WebElement assignLeavebtn = driver.findElement(By.className("quickLinkText"));
		assignLeavebtn.click();
		
		//Enviar texto a Employee name
		WebElement employeeNameTxtBox = driver.findElement(By.name("assignleave[txtEmployee][empName]"));		
		employeeNameTxtBox.sendKeys("Esteban");
		Thread.sleep(2000);

		//Borrar texto
		employeeNameTxtBox.clear();
		
		//Verificar web element desplegado en pantalla
		boolean assignBtn = driver.findElement(By.id("assignBtn")).isDisplayed();
		if (assignBtn) {
			System.out.println("El botón Assign está desplegado");
		}
		
		//Obtener texto
		String welcomeMsj = driver.findElement(By.id("welcome")).getText();
		System.out.println("El mensaje es " + welcomeMsj);
		
		boolean msj = welcomeMsj.contains("Paul");
		if (msj) {
			System.out.println("El mensaje contiene el nombre de Paul");			
		}else {
			System.out.println("El mensaje no contiene el nombre de Paul");
		}
		
		//Ejemplo dropdown
		Select leaveTypeDrpDwn = new Select(driver.findElement(By.id("assignleave_txtLeaveType")));
		leaveTypeDrpDwn.selectByVisibleText("CAN - Vacation");
		Thread.sleep(2000);
		leaveTypeDrpDwn.selectByValue("5");
		
		
		//Logoff
//		Select welcomeDrpDwnBtn = new Select(driver.findElement(By.xpath("//*[@id=\"welcome\"]")));
//		welcomeDrpDwnBtn.click();
//		Thread.sleep(2000);
//		WebElement btnLogout = driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[3]/a"));
//		btnLogout.click();
//		Thread.sleep(2000);		
		
		// Cerrar navegador
		driver.close(); //Cierra la ventana actual que el webdriver está usando
		driver.quit(); //Cierra todas las ventanas de la ejecución actual
	}

}
