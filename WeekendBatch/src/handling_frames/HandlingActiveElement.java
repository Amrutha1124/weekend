package handling_frames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingActiveElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
//activeElement() will return address of the element where my current control is present
		WebElement ele = driver.switchTo().activeElement();
		ele.sendKeys("Qspiders");
	}
}
