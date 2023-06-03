package POMRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	//@FindBys({@FindBy(id="Username"), @FindBy(name="username")})
	
	//FindBys will act as OR operator
	//FindAll will act as AND operator
	@FindBy(id = "username")
	public WebElement usernameTextField;
	
	@FindBy(name = "pwd")
	public WebElement passwordTextField;
	
	@FindBy(xpath = "//div[text()='Login ']")
	public WebElement loginButton;

	public void loginAction(String username, String password) {
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	

}
