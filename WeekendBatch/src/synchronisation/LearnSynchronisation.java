package synchronisation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnSynchronisation {
	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://online.actitime.com/abc12/login.do");
		driver.findElement(By.id("username")).sendKeys("webpwa0@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("A42MS@h%");
		driver.findElement(By.xpath("//div[.='Login ']")).click();
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logoutLink")));
		wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
//		Thread.sleep(2000);//	It will wait for 20 seconds mandatorily
		driver.findElement(By.id("logoutLink")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}
}
