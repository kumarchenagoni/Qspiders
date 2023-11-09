package specialclass;

import java.io.File;
import java.io.IOException;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullwindowScreenshort {
	public static String DataAndTime()
	{
	Date dt= new Date();
		SimpleDateFormat df =new SimpleDateFormat("dd_MM_yy_hh_mm_sss");
		return df.format(dt);
	}
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("Webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.zomato.com/india");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String dt=DataAndTime();
		Screenshot sc=new AShot()
				.shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		ImageIO.write(sc.getImage(), "png", new File("./Screenshorth/kumarss"+dt+".png"));
		driver.quit();
	}

}
