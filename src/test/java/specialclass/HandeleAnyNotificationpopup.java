package specialclass;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v114.performance.Performance;

public class HandeleAnyNotificationpopup {
	public static void main(String[] args) {
		HashMap<String, Integer>contextSettings=new HashMap<>();
		HashMap<String, Object>profile=new HashMap<>();
		HashMap<String, Integer>perfermances=new HashMap<>();
		ChromeOptions options=new ChromeOptions();
		contextSettings.put("media-stream",1);
		profile.put("managed-default-context-settings",contextSettings);
		perfermances.put("profile", profile);
		options.setExperimentalOption("preformance", Performance);
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("      ");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
			Thread.sleep(2000);
			Alert al=driver.switchTo().alert();
			System.out.println(al.getText());
			al.accept();
			System.out.println(driver.findElement(By.id("result")).getText());
			driver.quit();
		
		}
	}

		
		
		
	}

}
