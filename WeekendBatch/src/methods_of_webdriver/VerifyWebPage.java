package methods_of_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyWebPage {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.qspiders.com");
	String actualTitle = driver.getTitle();
	String actualUrl=driver.getCurrentUrl();
	String expectedTitle="QSpiders";
	String expectedUrl="https://www.QSPIDERS.com/";
	if(actualTitle.contains(expectedTitle)&&actualUrl.equalsIgnoreCase(expectedUrl)) {
		System.out.println("Pass: Both Title and URL are same");
	}else {
		System.out.println("Fail: Both Title and URL are not same");
	}
}
}
