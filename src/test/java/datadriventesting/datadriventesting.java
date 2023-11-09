package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class datadriventesting {
	public static void main(String[] args) throws IOException {
		// step 1: convert physical file into java readable object
		FileInputStream fis = new FileInputStream("./src/test/resources/data.properties");
		// step 2 : create an instance for properties class
		Properties property=new Properties();
	// step 3: Load all key_vale pairs into properties object
	property.load(fis);
	//step4: Write a data into properties
	property.put("user2", "trainee");
	property.put("pwd2", "trainee");
	//step 5: save the file
	FileOutputStream fos = new FileOutputStream("./src/test/resources/data.propertiess");
	property.store(fos,"Updated Successfully");
	
}	

}
