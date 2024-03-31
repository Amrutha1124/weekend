package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClear {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.vtiger.com/vtigercrm/");
	Thread.sleep(2000);
//clear() is used to clear the values present in the textbox
	driver.findElement(By.id("username")).clear();
	Thread.sleep(2000);
	driver.findElement(By.id("password")).clear();
	}
}
