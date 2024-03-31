package handling_mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoRightClick {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions a=new Actions(driver);
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));Thread.sleep(2000);
		a.contextClick(link).perform();
		Robot r=new Robot();Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_W);
	}
}
