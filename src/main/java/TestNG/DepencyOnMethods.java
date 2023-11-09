package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DepencyOnMethods {

	@Test

	private void navigateToApp() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement logo = driver.findElement(By.className("atLogoImg"));

		if (logo.isDisplayed()) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
			driver.close();

		}
	}

	@Test(dependsOnMethods = "navigateToApp")
	public void loinToAPP() {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("username")).sendKeys("admin" + Keys.TAB + "manager" + Keys.ENTER);

		driver.close();
	}

}
