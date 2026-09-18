package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Projects_Page {
	
	public Projects_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//span[contains(text(),'Create Project')]")
	private WebElement CreateProjectBttn;

	public WebElement getCreateProjectBttn() {
		return CreateProjectBttn;
	}
	
	

}
