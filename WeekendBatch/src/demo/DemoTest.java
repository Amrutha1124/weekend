package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoTest {
	@Test                 
	public void demoC() {
		Reporter.log("Hello world");//It is used to print only in the reports
//		Reporter.log("Hello world",false);//It is used to print only in the reports
	}
	@Test
	public void demoA() {
		Reporter.log("Hi world", true);//It is used to print both in the reports and console
	}
	@Test
	public void demoB() {
		System.out.println("Bye world");//It is used to print only in the console
	}
}
