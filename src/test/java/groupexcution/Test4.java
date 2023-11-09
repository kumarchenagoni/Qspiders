package groupexcution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test4 {
	@Test(groups = "smoke")
	public void demo1() {
		Reporter.log("Test4 - demo1 - smoke",true);
	}
	@Test(groups = "functional")
	public void demo2() {
		Reporter.log("Test4 - demo2 - functional",true);
	}
	@Test(groups = {"smoke","functional"})
	public void demo3() {
		Reporter.log("Test4 - demo3 - smoke and functional",true);
	}
	


}
