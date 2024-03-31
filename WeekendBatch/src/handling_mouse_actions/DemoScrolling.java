package handling_mouse_actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoScrolling {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement cookies = driver.findElement(By.linkText("Cookies"));
		Actions a=new Actions(driver);
		//scrollByAmount(x,y) will scroll the webpage until the mentioned pixels 
		a.scrollByAmount(0, 300).perform();
		//scrollToElement(ele) will scroll the webpage until the element is visible
		a.scrollToElement(cookies).perform();
	}
}
