package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfKeysClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("MSD"+Keys.CONTROL+"AC");Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"V");Thread.sleep(2000);
	}
}
