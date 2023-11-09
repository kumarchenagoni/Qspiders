package datadriventesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLIoginUsinigProperties {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("url");
		long time = Long.parseLong("time");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.findElement(By.id("")).sendKeys(args);
		driver.findElement(By.name("")).sendKeys(args);
		driver.findElement(By.id("")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
		try {
			wait.until(ExpectedConditions.titleContains("Enter Time-Track"));
			System.out.println("Test passed");
		}catch (Exception e) {
			System.out.println("Test failed");
		}
		driver.quit();
	}

}
