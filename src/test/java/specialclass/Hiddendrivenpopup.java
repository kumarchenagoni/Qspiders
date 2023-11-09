package specialclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendrivenpopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.yatra.com/");
		Thread.sleep(3000);
	driver.findElement(By.id("BE_flight_origin_city")).click();
	driver.findElement(By.id("01/11/2023"));
	Thread.sleep(2000);
		driver.quit();
	}

}
