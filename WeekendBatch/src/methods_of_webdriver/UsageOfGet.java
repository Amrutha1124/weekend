package methods_of_webdriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGet {
	public static void main(String[] args) {
		ChromeDriver d = new ChromeDriver();
		//get() is used to trigger the URL of an application
		//URL should consist of protocol, application name and domain name
		d.get("https://www.google.com");
		//getTitle() is used to get the title of current web page
		String title = d.getTitle();
		System.out.println(title);
		//getCurrentUrl() is used to get the URL of current web page
		String url = d.getCurrentUrl();
		System.out.println(url);
		//close() is used to close the current browser window
		d.close();
	}

}



