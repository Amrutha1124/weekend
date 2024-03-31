package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMouseHover {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.vtiger.com/");
	WebElement resources = driver.findElement(By.linkText("Resources"));
	Actions a=new Actions(driver);Thread.sleep(2000);
	a.moveToElement(resources).perform();
	driver.findElement(By.linkText("Contact Us")).click();
	WebElement num = driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]/../p[2]"));
	System.out.println(num.getText());
}
}
