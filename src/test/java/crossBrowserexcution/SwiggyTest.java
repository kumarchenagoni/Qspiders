package crossBrowserexcution;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SwiggyTest extends basseclass {
	@Test
	public void googleLunchTest() {
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logo = driver.findElement(By.xpath("//*[name()='svg']"));
		if(logo.isDisplayed())
			System.out.println("Swiggy pass");
		else
			System.out.println("swiggy fail");
	}

}
