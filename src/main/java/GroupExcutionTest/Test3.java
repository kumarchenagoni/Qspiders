package GroupExcutionTest;

import org.testng.annotations.Test;

public class Test3 {
	public class Test2 {
		@Test(groups ={"sanity","regression"} )
		public void demo1() {
			System.out.println("Test2-demo1-sanity-regression");
		}
		@Test(groups = { "smoke"})
		public void demo2() {
			System.out.println("Test2-demo2-smoke");
		}
		@Test(groups = {"regression","functional-sanity"})
		public void demo3() {
			System.out.println("Test2-demo3-regressin-functional-sanity");
		}
		@Test(groups = {"snanity"})
		public void demo4(){
			System.out.println("Test2-demo4-sanity");
			
		}


	}}
