package handling_popups;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/QSP/Desktop/static%20webpages/Naukri.html");
		File f=new File("./data/Resume.docx");
		String abspath = f.getAbsolutePath();
		System.out.println(abspath);
		driver.findElement(By.id("upload")).sendKeys(abspath);
	}
}
