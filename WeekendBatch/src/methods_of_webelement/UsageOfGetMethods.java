package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetMethods {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement link = driver.findElement(By.id("email"));
//getTagName() is used to get the tag name of the particular element
	String tag =link.getTagName();
//getText() is used to get the tag text of the particular element
//If tag text is not present it will return empty spaces
	String text = link.getText();
//getAttribute() is used to get the attribute value of a particular element. It is a parameterized
//method which takes string attName as parameter, bcoz one element will have multiple attributes
//If the attribute is not present it will return null
	String url = link.getAttribute("href");
	System.out.println("The tagname of the link is: "+tag);
	System.out.println("The tag text of the link is: "+text);
	System.out.println("The href attribute of the link is: "+url);
	driver.quit();
}
}
