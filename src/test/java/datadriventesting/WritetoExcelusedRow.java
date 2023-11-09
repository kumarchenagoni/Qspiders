package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritetoExcelusedRow {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	// step 1:convert physical file into readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");
		
		// step 2: open workbook
		Workbook wb = WorkbookFactory.create(fis);
		// step 3: Get control over sheet
		Sheet sh =wb.getSheet("sheet1");
		// step 4: Get control over row
		Row r1 =sh.createRow(4);
		Row r2 =sh.createRow(5);
		//step 5: Get control over cell
		Cell c1 =r1.createCell(0);
		Cell c2 =r2.createCell(0);
		c1.setCellValue("traniee1");
		c2.setCellValue("traniee2");
		FileOutputStream fos=new FileOutputStream("./src\\test\\resources\\New Microsoft Excel Worksheet.xlsx");
		wb.write(fos);
		wb.close();
}
}