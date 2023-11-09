package TestNG;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount = 1)
	public void demo1()
	{
		System.out.println("demo1");
	}
@Test(invocationCount = 4)
public void demo2() {
	System.out.println("demo2");
}
@Test(invocationCount = 0)
public void demo3() {
	System.out.println("demo3");
}
@Test(invocationCount = 3)
public void demo4() {
	System.out.println("dem4");
}
@Test(invocationCount = -3)
public void demo5() {
	System.out.println("demo5");
}
@Test(invocationCount = 5)
public void demo6() {
	System.out.println("demo6");
}
}



