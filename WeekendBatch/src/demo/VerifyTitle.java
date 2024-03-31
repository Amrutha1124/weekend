package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle {
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		String actualTitle = driver.getTitle();
		String expectedTitle="Googly";
		Assert.assertEquals(actualTitle, expectedTitle);//HardAssert
		SoftAssert s=new SoftAssert();
		s.assertEquals(actualTitle,expectedTitle);	//SoftAssert
		Reporter.log("Method is passed",true);
		driver.quit();
		s.assertAll();
		}
}
