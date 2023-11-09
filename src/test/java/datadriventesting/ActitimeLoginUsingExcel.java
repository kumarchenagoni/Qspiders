package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeLoginUsingExcel {
	public static void main(String[] args) throws IOException {
		Map<String, String> Map = getData();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Map.get("url"));

		long time = Long.parseLong(Map.get("time"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		driver.findElement(By.id("username")).sendKeys(Map.get("username"));
		driver.findElement(By.name("pwd")).sendKeys("password");
		driver.findElement(By.id("loginButton")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
		try {
			wait.until(ExpectedConditions.titleContains("Enter Time Track"));
			System.out.println("test passed");
		} catch (Exception e) {
			System.out.println("Test Faild");
		}
		driver.quit();
	}

	public static Map<String, String> getData() throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/test/resources/TestData.xlsx");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Workbook wb = null;
		try {
			wb = WorkbookFactory.create(fis);

		} catch (EncryptedDocumentException e) {

			e.printStackTrace();
		}
		Sheet sh = wb.getSheet("Sheet1");
		DataFormatter df = new DataFormatter();
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i <= sh.getLastRowNum(); i++) {
			String key = df.formatCellValue(sh.getRow(i).getCell(0));
			String value = df.formatCellValue(sh.getRow(i).getCell(1));
			map.put(key, value);
		}
		System.out.println(map);
		try {
			wb.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
		return map;

	}
}