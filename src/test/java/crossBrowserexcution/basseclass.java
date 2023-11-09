package crossBrowserexcution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


public class basseclass {
	
	WebDriver driver;
	@Parameters("BROWSER")
	@BeforeClass
	public void classConfig(String browser) {
		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();
			System.out.println(browser);
			
			break;
        case "firefox":
		driver = new FirefoxDriver();
		System.out.println(browser);
			break;
        case "edge":
    		driver = new EdgeDriver();
    		System.out.println(browser);
    			break;
    			default:
    				System.out.println("Invalid browser info");
		}
		driver.manage().window().maximize();
	}
	@AfterClass
	public void classTearDown() {
		driver.quit();
	}

}
