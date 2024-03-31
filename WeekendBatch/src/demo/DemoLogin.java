package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class DemoLogin {			//(Test Class or execution class)
	@Test
public  void demo() throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://localhost/login.do");
	LoginPage l=new LoginPage(driver);
	l.login("admin1","manager1");
//	Thread.sleep(2000);
	l.login("admin", "manager");
	}
}
