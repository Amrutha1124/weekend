package handling_dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfIsMultiple {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/QSP/Desktop/IPL.html");
//	driver.get("https://www.facebook.com/");
//	driver.findElement(By.linkText("Create new account")).click();
//	WebElement ele = driver.findElement(By.id("month"));
	WebElement ele = driver.findElement(By.id("ipl"));
	Select s=new Select(ele);
//isMultiple() is used to check whether the drop down is multi-select or not
	boolean res = s.isMultiple();
	if(res==false) {
		System.out.println("The dropdown is single select");
	}else {
		System.out.println("The dropdown is multi select");
	}
	driver.quit();
}
}
