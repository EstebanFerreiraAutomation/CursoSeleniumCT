package wrapper;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods {
	
	public static void takeScreenshot (WebDriver driver, String testCaseName) {
		//Toma el sreenshot de la página sin formato
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Establece ruta de guardado de screenshot
		String screenshotPath = "./test-output/ExcutionResults";
		
		try {
			//Creamos/sobreescribimos el folder usando la ruta especificada de la variable "screenshotPath"
			FileHandler.createDir(new File (screenshotPath));
			//copiar screenshot a la ruta creada
			FileHandler.copy(scrFile, new File(screenshotPath + File.separator + testCaseName + ".png"));
		} catch (IOException e) {			
			e.printStackTrace();
		}		
		
		}
	
	public static void closeDriver (WebDriver driver, String testCaseName) {
		takeScreenshot(driver, testCaseName);
		driver.close();
	}
		
	public static void moveTo (WebDriver driver, WebElement element) {
		new Actions(driver).moveToElement(element).perform();
	}

}
