package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RifazPage {

	@FindBy(id="username")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(id="inputPassword")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	private WebElement signinbtn;

	public WebElement getSigninbtn() {
		return signinbtn;
		
	}
	
	
	
	
}
