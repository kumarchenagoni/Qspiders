package TestNG;

import org.testng.annotations.Test;

public class DisabilityTest {
	
		@Test(enabled = true)
		public void demo1()
		{
			System.out.println("demo1");
		}
	@Test(enabled = false)
	public void demo2() {
		System.out.println("demo2");
	}
	@Test(enabled = true)
	public void demo3() {
		System.out.println("demo3");
	}
	@Test(enabled = true)
	public void demo4() {
		System.out.println("demo4");
	}
	@Test(enabled = false)
	public void demo5() {
		System.out.println("demo5");
	}
	@Test(enabled = true)
	public void demo6() {
		System.out.println("demo6");
	}
	}







