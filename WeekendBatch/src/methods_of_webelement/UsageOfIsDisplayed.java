package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsDisplayed {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
//isDisplayed() is used to check whether the element is displayed or not
	boolean res = driver.findElement(By.linkText("Log in")).isDisplayed();
	if(res) {
		System.out.println("Login button is displayed");
	}else {
		System.out.println("Login button is not displayed");
	}
}
}
