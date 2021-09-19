package navigationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DirectoryPage {
	public DirectoryPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="searchDirectory_emp_name_empName")
	private WebElement txtboxName;
	
	@FindBy(id="searchDirectory_job_title")
	private WebElement jobTitleDrpDwnBtn;
	
	@FindBy(id="searchDirectory_location")
	private WebElement locationDrpDwnBtn;
	
	@FindBy(id="searchBtn")
	private WebElement searchBtn;
	
	@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr[2]/td[2]/ul/li[1]/b")
	private WebElement resultName;
	
	@FindBy(id="welcome")
	private WebElement welcomeDrpDwn;
	
	@FindBy(xpath="//*[@id=\'welcome-menu\']/ul/li[3]/a")
	private WebElement logoutBtn;
	
	public void writeName (String name) {
		txtboxName.sendKeys(name);
	}
	
	public void selectJobTitle (String jobtitle) {
		Select selectJobTitle = new Select (jobTitleDrpDwnBtn);
		selectJobTitle.selectByVisibleText(jobtitle);
	}
	
	public void selectLocation (String location) {
		Select selectLocation = new Select (locationDrpDwnBtn);
		selectLocation.selectByVisibleText(location);
	}
	
	public void search () {
		searchBtn.click();
	}
	
	public String getShownName() {
		String shownName;
		shownName = resultName.getText();
		return shownName;
	}
	
	public void logout () {
		welcomeDrpDwn.click();
		logoutBtn.click();
	}
}

	
