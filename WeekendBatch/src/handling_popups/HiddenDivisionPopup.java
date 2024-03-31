package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup{
public static void main(String[] args) throws InterruptedException {
	WebDriver d=new ChromeDriver();
	d.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
	d.findElement(By.xpath("//input[@type='text']")).sendKeys("Tom");
	d.findElement(By.xpath("//input[@type='email']")).sendKeys("Tom@gmail.com");
	WebElement ele = d.findElement(By.xpath("//select[@required]"));
	Select s=new Select(ele);
	s.selectByIndex(1);
	d.findElement(By.xpath("//textarea[@required]")).sendKeys("Hi this is hidden division popup");
	d.findElement(By.id("hiddendiv")).click();

}
}
