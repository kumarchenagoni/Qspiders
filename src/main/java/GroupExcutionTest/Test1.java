package GroupExcutionTest;

import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void demo1() {
		System.out.println("Test1-demo1");
	}
	@Test(groups = "smoke")
	public void demo2() {
		System.out.println("Test1-demo2-smoke");
	}
	@Test(groups = {"regression","functional"})
	public void demo3() {
		System.out.println("Test1-demo3-regressin-functional");
	}
	@Test(groups = {"snanity","funtional","regression"})
	public void demo4(){
		System.out.println("Test1-demo4-snanity-functional-regression");
		
	}

}
