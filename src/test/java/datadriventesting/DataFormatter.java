package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataFormatter {
	public static void main(String[] args) throws EncryptedDocumentException, IOException  {
		// step 1:convert physical file into readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/New Microsoft Excel Worksheet.xlsx");
		
		// step 2: open workbook
		Workbook wb = WorkbookFactory.create(fis);
		DataFormatter df=new DataFormatter();
		
		
	}
}
