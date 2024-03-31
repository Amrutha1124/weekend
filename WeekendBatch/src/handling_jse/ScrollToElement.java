package handling_jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		WebElement ele = driver.findElement(By.xpath("//h2[text()='Latest Business News']"));
		Point p = ele.getLocation();
		int yAxis = p.getY();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		//It will scroll until the element is present on the top of the webpage
		jse.executeScript("window.scrollTo(0,"+yAxis+")");
		Actions a=new Actions(driver);
		//It will scroll until the element is displayed
		a.scrollToElement(ele).perform();
	}
}
