package TestNG;


import org.testng.annotations.Test;

public class ProritizationTest {


		@Test(priority =-3)
		public void demo1()
		{
			System.out.println("demo1");
		}
	@Test(priority =-1)
	public void demo2() {
		System.out.println("demo2");
	}
	@Test
	public void demo3() {
		System.out.println("demo3");
}
	@Test(priority = 4)
	public void demo4() {
		System.out.println("dem4");
	}
	@Test(priority =-1)
	public void demo5() {
		System.out.println("demo5");
	}
	@Test(priority =1)
	public void demo6() {
		System.out.println("demo6");
	}
}
	
