package specialclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticdropdwon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.id("searchDropdownBox"));
		Select s= new Select(ele);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("s-suggestion-trending s-suggestion-ellipsis-direction");
		Thread.sleep(2000);
		s.selectByVisibleText("faucet covers for winter");
		List<WebElement> ddle=s.getOptions();
		for(WebElement elee:ddle) 
			 {
				System.out.println(elee.getText());
				if(s.isMultiple())
					System.out.println("Multiselect dropdwon");
				else
					System.out.println("single select dropdwon");
			}
		}

	}


