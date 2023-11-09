package Listeners;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;

@Listeners(Listeners.ListenerImplementation.class)
public class Test1 extends Baseclass {
	@Test
	public void test1() {
		System.out.println("Test1");
	}
	

}
