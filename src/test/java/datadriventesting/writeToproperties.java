package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class writeToproperties {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getData("url"));
		Long time = Long.parseLong(getData("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.findElement(By.id("username")).sendKeys(getData("user1"));
		driver.findElement(By.name("pwd")).sendKeys(getData("pwd1"));
		driver.findElement(By.id("")).click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(time));
		try {
			wait.until(ExpectedConditions.titleContains("Enter time-Track"));
			System.out.println("Test password");
		} catch (Exception e) {
			System.out.println("Test failed");
		}
		driver.quit();
		
		}

	private static String getData(String string) {
		
		FileInputStream fis= null;
		try {
			fis = new FileInputStream("./src/test/resources/data.properties");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties property = new Properties();
		try {
			property.load(fis);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return property.getProperty(string);
		
	}



}
