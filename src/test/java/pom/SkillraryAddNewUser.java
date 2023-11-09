package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryAddNewUser {
	
	@FindBy(xpath = "//b[text()='Add New User']")
	private WebElement AddNewPageDisplayed;
	
	@FindBy(id = "email")
	private WebElement enterEmailid;
	
	@FindBy(id = "password")
	private WebElement enterpassword;
	
	@FindBy(id = "firstname")
	private WebElement enterfirstname;
	
	@FindBy(id = "lastname")
	private WebElement enterlastname;
	
	@FindBy(id = "address")
	private WebElement enteraddress;
	
	
	@FindBy(id = "contact")
	private WebElement entercontact;
	
	@FindBy(xpath = "//label[text()='Photo']")
	private WebElement clickonPhoto;
	
	@FindBy(id = "photo")
	private WebElement clickonchoosefile;
	
	@FindBy(xpath = "//button[contains(@class,'btn btn-primary btn-flat')]")
	private WebElement clickonsave;
	
	
	
	public SkillraryAddNewUser(WebDriver driver) {
		PageFactory.initElements(driver,this);
		
	}
	public WebElement getAddNewpageDisplayed() {
		return AddNewPageDisplayed;
	}
	public WebElement getEnterEmailid() {
		return enterEmailid; 
	}
	public WebElement getEnterpassword() {
		return enterpassword;
	}
	public WebElement getEnterfristname() {
		return enterfirstname;
	}
	public WebElement getEnterlastname() {
		return enterlastname;
	}
	public WebElement getEnteraddress() {
		return  enteraddress;
	}
	public WebElement getEntercountNumber() {
		return entercontact;
	}
	public WebElement getClickOnPhoto() {
		return clickonPhoto ;
	}
	public WebElement getClickOnchoosefile() {
		return clickonchoosefile ;
	}
	public WebElement getClickOnsave() {
		return clickonsave ;
	
	}
	 
	
		
	

}
