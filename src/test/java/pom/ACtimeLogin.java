package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ACtimeLogin {
	//Declaration
	@FindBy(className = "atLogoImg")
	private WebElement logo;
	@FindBy(className = "username")
    private WebElement usernameTF;
	@FindBy(className =   "pwd")
	private WebElement passwordTF;
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement logiButton;
	@FindBy(id = "loginButton")
	private WebElement KeepMeLoggedIncheackbox;
	@FindBy(partialLinkText = "Forgot your password?")
	private WebElement forgotpasswordLink;
	
	//Initialization
	public ACtimeLogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//utilization
	public WebElement getlogo() {
		return logo;
		
	}
	public void setUsername(String username) {
		usernameTF.sendKeys(username);
		
	}
	public void setPassword(String password) {
		passwordTF.sendKeys(password);
}
	public void clickloginButton(){
		logiButton.click();
	}
	public void clickeeploggedcheackBox() {
		KeepMeLoggedIncheackbox.click();
		
	}
	public void clickforgotpassword() {
		forgotpasswordLink.click();
		
	}
	
}