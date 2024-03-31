package basics;

import java.util.Scanner;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoCrossBrowser {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the browser");
		String browser = s.next();
		WebDriver driver;
		if(browser.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}else if(browser.equalsIgnoreCase("chrome")){
			driver=new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else {
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.switchTo().activeElement().sendKeys("Qspiders Basavangudi"+Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
