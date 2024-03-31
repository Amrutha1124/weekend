package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfSendKeys {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	Thread.sleep(2000);
	WebElement email = driver.findElement(By.name("username"));
	Thread.sleep(2000);
//sendKeys() is used to enter the value in the textbox, we can perform keyboard actions by using
//Keys class
	email.sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("admin123");
	Thread.sleep(2000);
//submit() is use to click on the elements which are present under <form> and having type='submit'
	driver.findElement(By.xpath("//button[@type='submit']")).submit();
}
}
