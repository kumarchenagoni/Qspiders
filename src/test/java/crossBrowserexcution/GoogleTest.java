package crossBrowserexcution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleTest extends basseclass {
	
	@Test
	public void googleLunchTest() {
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logo = driver.findElement(By.xpath("\"//img[@alt='Google']"));
		if(logo.isDisplayed())
			System.out.println("Google Displayed");
		else
			System.out.println("Google not found");
	}

}
