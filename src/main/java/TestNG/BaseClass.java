package TestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
		@BeforeSuite
		public void SuiteConfig() {
			System.out.println("Befotesuite");
		
	}
		@BeforeTest
		public void testConfig() {
			System.out.println("Beforetest");
			
		}
		@BeforeClass
		public void ClassConfig() {
			System.out.println("BeforeClass");
		}
		@BeforeMethod
		public void MethodConfig() {
			System.out.println("BeforeMethod");
			
		}
		@AfterMethod
		public void methodTearDown() {
			System.out.println("Aftermethod"); 
			}
		@AfterClass
		public void classTeaeDown() {
			System.out.println("AfterClass");
			
		}
		@AfterTest
		public void TestTeaeDown() {
			System.out.println("AfterTest");
			
		}
		@AfterSuite
		public void suiteTearDown() {
			System.out.println("Aftersuite");
			
		}
		

}
