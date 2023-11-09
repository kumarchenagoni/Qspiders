package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryWelcomePage {
	@FindBy(xpath = "//h3[text()='SkillRary Demo APP']")
	private WebElement VerifyWElcomepageDisplayed;
	
	@FindBy(xpath = "//a[text()='LOGIN']")
	private WebElement ClickOnLoginButton;

	 
	public SkillraryWelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSkillrarytext() {
		return VerifyWElcomepageDisplayed;
	}
	public WebElement getClikOnLoginButton(){
		return ClickOnLoginButton;
		
	}


}
