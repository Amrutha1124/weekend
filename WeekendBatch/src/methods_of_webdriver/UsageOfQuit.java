package methods_of_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfQuit {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-google-button")).click();
//	driver.findElement(By.id("apple-signin-button")).click();
	//quit() is used to close all the browser/tabs
	driver.quit();
}
}
