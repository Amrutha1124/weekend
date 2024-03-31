package handling_dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UsageOfGetOptions {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/IPL.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
		Select s = new Select(mtr);
//getFirstSelectedOption() will return the first option which is selected in the dropdown
		WebElement ele = s.getFirstSelectedOption();
		System.out.println(ele.getText());
//getAllSelectedOptions will return all the selected options, 
//if there is no selected option it will return empty List
		List<WebElement> allEle = s.getAllSelectedOptions();
		for (WebElement e : allEle) {
			System.out.println(e.getText());
		}
		driver.quit();
	}
}
