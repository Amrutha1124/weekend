package handling_dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptionsUsage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/QSP/Desktop/IPL.html");
		WebElement ipl = driver.findElement(By.id("ipl"));
		Select s = new Select(ipl);
		List<WebElement> allEle = s.getOptions();
		for (int i = 0; i < allEle.size(); i++) {
			WebElement ele = allEle.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		for (int i = 0; i < allEle.size(); i++) {
			s.selectByIndex(i);					//Ascending order
		}
		for (int i = allEle.size() - 1; i >= 0; i--) {
			s.deselectByIndex(i);				//Descending order
		}
//getWrappedElement() is used to wrap all the options and it returns the options in the form of ele
		WebElement ele = s.getWrappedElement();
		System.out.println(ele.getText());
		driver.quit();
	}
}
