package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetCssValue {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement link = driver.findElement(By.linkText("Forgotten password?"));
//getCssValue() is used to get the styles/ properties of an element, It is a parameterized method
//Bcoz one element will have multiple properties
	String fontSize = link.getCssValue("font-size");
	System.out.println(fontSize);
	String color = link.getCssValue("color");
	System.out.println(color);
}
}
