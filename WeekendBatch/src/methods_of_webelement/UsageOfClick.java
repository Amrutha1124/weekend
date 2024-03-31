package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfClick {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement link = driver.findElement(By.linkText("Sign Up"));
//click() is used to click on the web elements(button, links, check box, radio button etc)
//It will scroll the web page until particular element in static web page
	link.click();
}
}
