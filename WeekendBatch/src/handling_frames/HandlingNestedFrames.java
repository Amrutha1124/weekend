package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingNestedFrames {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/QSP/Desktop/T1.html");
		driver.findElement(By.id("t1")).sendKeys("1");
//frame(String id/name)will transfer the control to the frame with the specified id/name
//id or name value should be taken from iframe tag
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("2");
//frame(int ind)will transfer the control to the frame with the specified index,
//index starts from 0 for every html
		driver.switchTo().frame(0);
		driver.findElement(By.id("t3")).sendKeys("3");
//parentFrame() will transfer the control to the previous frame or previous html
		driver.switchTo().parentFrame();
		driver.findElement(By.id("t2")).sendKeys("4");
		WebElement ele = driver.findElement(By.id("f2"));
//frame(WebEle frameEle)will transfer the control for the specified webEle(iframe element address)
		driver.switchTo().frame(ele);
		driver.findElement(By.id("t3")).sendKeys("5");
//defaultContent() will transfer the control to the main web page
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("6");
	}
}
