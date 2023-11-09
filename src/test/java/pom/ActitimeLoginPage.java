package pom;


import org.openqa.selenium.WebDriver;
import org.openqa. selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {

		//Declaration
		@FindBy(className = "atLogoImg")
		private WebElement logo;
		
		@FindBy(id = "username")
		private WebElement usernameTF;
		
		@FindBy(name = "pwd")
		private WebElement passwordTF;
		
		@FindBy(id = "keepLoggedInCheckBox")
		private WebElement keepLOggedIncheckBox;
		
		@FindBy(id = "loginButton")
		private WebElement loginButton;
		
		@FindBy(id = "toPasswordRecoveryPageLink")
		private WebElement forgotPasswordLink;
		
		//Initialization
		public ActitimeLoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
			//Utilization
		public WebElement getlogo() {
			return logo;
			
		}

		public void setUsername(String username) {
	usernameTF.sendKeys(username);
}
		public void setPassword(String Password) {
	usernameTF.sendKeys(Password);

}
		public void ClickLoginButton() {
	loginButton.click();
}
		public void ClickkeepMeLogginButton() {
	keepLOggedIncheckBox.click();
}
		public void ClickFOngotPasswordLink() {
	forgotPasswordLink.click();


}


			
		}



