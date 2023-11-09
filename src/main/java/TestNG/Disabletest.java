package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Disabletest {
	@Test(enabled = false)
public void tesr1() {
		Reporter.log("test1",true);
		
	}
	@Test
	public void test2() {
		Reporter.log("test2",true);
	}
}
