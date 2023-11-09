package groupexcution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
	@Test(groups = {"regression","smoke","functional"})
	public void demo1() {
		Reporter.log("Test2 - demo1 - regression",true);
	}
	@Test
	public void demo2() {
		Reporter.log("Test2 - demo2",true);
	}
	
	
	


}
