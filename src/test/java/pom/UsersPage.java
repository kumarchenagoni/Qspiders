package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage {
	@FindBy(xpath = "//span[text()='Users']")
	private WebElement newUserpageDisplayed;
	
	@FindBy(xpath = "//a[text() ='New' ]")
	private WebElement clicknewbutton;
	
	public UsersPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getusers() {
		 return newUserpageDisplayed;	
		
	}
	public WebElement getNewbutton() {
		return clicknewbutton;
	}
	

}
