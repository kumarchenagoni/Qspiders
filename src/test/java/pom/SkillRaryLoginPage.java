package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillRaryLoginPage {
	@FindBy(xpath ="//h3[text()='Login']" )
	private WebElement LoginPage;
	
	@FindBy(id = "email")
	private WebElement EmailTextField;
	
	@FindBy(id = "password")
	private WebElement PasswordTextFiled;
	
	@FindBy(name = "login")
	private WebElement LoginButton;
	
	public SkillRaryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public WebElement Loginpage() {
		return LoginPage;
	}
	public void setEmailText(String email) {
		EmailTextField.sendKeys(email);
			
	}
	public void setPasswordText( String password) {
		PasswordTextFiled.sendKeys(password);
		
	}
	public void clickLoginButton() {
		LoginButton.click();
		
		
	}
	

}
