package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginPageTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		ActitimeLoginPage loginpage=new ActitimeLoginPage(driver);
		if (loginpage.getlogo().isDisplayed()) {
			System.out.println("logo Displayed");	
		}
		else {

				System.out.println("logo IsNotDisplayed");
				loginpage.setUsername("admin");
				loginpage.setPassword("manager");
				loginpage.ClickLoginButton();
				loginpage.ClickkeepMeLogginButton();
				loginpage.ClickFOngotPasswordLink();
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				try {
					wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
					System.out.println("test passed");
				} catch (Exception e) {
					System.out.println("Test failed");
				}
				driver.quit();
			}
			
		}
	}


