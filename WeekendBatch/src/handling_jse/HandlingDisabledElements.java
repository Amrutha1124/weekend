package handling_jse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElements {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/disabled.html");
		List<WebElement> allEle = driver.findElements(By.tagName("input"));
		for(int i=0;i<allEle.size();i++) {
			WebElement ele=allEle.get(i);
			boolean res = ele.isEnabled();
			if(res==true) {
				ele.sendKeys("Virat");
			}else {
				String id = ele.getAttribute("id");
				JavascriptExecutor jse=(JavascriptExecutor) driver;
				jse.executeScript("document.getElementById('"+id+"').value='Sachin'");
			}
		}
	}
}
