package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="username")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}
	
	@FindBy(id="inputPassword")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	public void userLogin(String un,String pwd)
	{
		username.clear();
		username.sendKeys(un);
		password.clear();
		password.sendKeys(pwd);
		login.click();
		
	}

}
