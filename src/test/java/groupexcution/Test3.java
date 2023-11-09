package groupexcution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test(groups = "regression")
	public void demo1() {
		Reporter.log("Test3 - demo1 - regression",true);
	}
	@Test(groups = "smoke")
	public void demo2() {
		Reporter.log("Test3 - demo2 - smoke",true);
	}
	@Test(groups = {"smoke","functional"})
	public void demo3() {
		Reporter.log("Test3 - demo3 - regression and smoke",true);
	}
	


}
