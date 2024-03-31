package methods_of_webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.fb.com");
		d.manage().deleteAllCookies();
		d.manage().window().fullscreen();
		d.manage().window().setSize(new Dimension(400, 800));
		d.manage().window().setPosition(new Point(532, 500));
		d.manage().window().minimize();
		//getPageSource() is used to get the source code of current web page
		String pgSrc = d.getPageSource();
		System.out.println(pgSrc);
	}
}
