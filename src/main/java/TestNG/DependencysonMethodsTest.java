package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependencysonMethodsTest {
	WebDriver driver;
	@Test
	public void navigateToApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test(dependsOnMethods = "navigateToApp")
	public void loginToApp() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("admin"+Keys.TAB+"manager"+Keys.ENTER);
		Thread.sleep(3000);
		driver.quit();
	}

}
