package handling_popups;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications","--start-maximized","-incognito");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.yatra.com");
	}
}
