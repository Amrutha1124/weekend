package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoActiLogin {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://localhost/login.do");
	WebElement un = driver.findElement(By.id("username"));
	un.sendKeys("admin1");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.findElement(By.id("username")).sendKeys("admin");
}
}
