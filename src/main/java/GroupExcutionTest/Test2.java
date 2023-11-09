package GroupExcutionTest;

import org.testng.annotations.Test;

public class Test2 {
	@Test(groups ="sanity" )
	public void demo1() {
		System.out.println("Test2-demo1-sanity");
	}
	@Test(groups = { "smoke","regression"})
	public void demo2() {
		System.out.println("Test2-demo2-smoke-regression");
	}
	@Test(groups = {"regression","functional"})
	public void demo3() {
		System.out.println("Test2-demo3-regressin-functional");
	}
	@Test(groups = {"snanity","funtional"})
	public void demo4(){
		System.out.println("Test2-demo4-sanity-functional");
		
	}

}



