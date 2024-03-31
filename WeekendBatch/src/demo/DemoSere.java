package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSere {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/Demo.html");
		WebElement ele = driver.findElement(By.id("d1"));
		//In ele reference  @01 will be stored
		//If we refresh/reload the webpage the address will be changed to @03 but in ref we 
		//we will have @01 with that ref if we try to perform the action it will throw exception
		driver.navigate().refresh();
		ele.click();
//		driver.navigate().back();
//		ele.click();
	}
}
