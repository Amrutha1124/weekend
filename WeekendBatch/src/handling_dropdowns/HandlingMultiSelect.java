package handling_dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultiSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/QSP/Desktop/IPL.html");
	WebElement ipl = driver.findElement(By.id("ipl"));
	Select s=new Select(ipl);
	Thread.sleep(1000);
	s.selectByVisibleText("RCB");
	s.selectByValue("c");
	s.selectByIndex(2);
	s.deselectByIndex(0);
	s.deselectByVisibleText("CSK");
	s.deselectByValue("m");
	s.deselectAll();
	}
}
