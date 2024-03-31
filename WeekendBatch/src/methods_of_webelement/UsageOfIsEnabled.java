package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfIsEnabled {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
//driver.get("https://www.facebook.com/");
driver.get("https://www.instagram.com/");
//isEnabled() is used to check whether the element is enabled or disabled
//boolean res = driver.findElement(By.name("login")).isEnabled();
boolean res = driver.findElement(By.xpath("//button[@type='submit']")).isEnabled();
if(res==true) {
	System.out.println("The login button is enabled");
}else {
	System.out.println("The login button is disabled");
}
}
}
