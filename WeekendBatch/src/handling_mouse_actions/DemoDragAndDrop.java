package handling_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDragAndDrop {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
	WebElement draggable = driver.findElement(By.xpath("//h1[.='Block 1']"));
	WebElement drop = driver.findElement(By.id("column-3"));
	Actions a=new Actions(driver);
//	a.dragAndDrop(draggable, drop).perform();
	a.clickAndHold(draggable).pause(2000).moveToElement(drop).release().build().perform();
}
}
