package synchronisation;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://online.actitime.com/abc12/login.do");
	driver.findElement(By.id("username")).sendKeys("webpwa0@gmail.com");
	driver.findElement(By.name("pwd")).sendKeys("A42MS@h%");
	driver.findElement(By.xpath("//div[.='Login ']")).click();
	for(int i=0;i<1000;i++) {
	try {
	driver.findElement(By.id("logoutLink")).click();
	break;
	}catch(NoSuchElementException e) {
		System.out.println(i);
	}
	}
}
}
