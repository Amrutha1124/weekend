package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfGetSizeAndGetLoc {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
WebElement emailTbx = driver.findElement(By.id("email"));
WebElement pwdTbx = driver.findElement(By.id("passContainer"));
Dimension d1 = emailTbx.getSize();		int h1 = d1.getHeight();		int w1 = d1.getWidth();
Dimension d2 = pwdTbx.getSize();		int h2 = d2.getHeight();		int w2 = d2.getWidth();
if(h1==h2 && w1==w2) {
	System.out.println("Both height and width of email and pwd tbx are same");
}else 
	System.out.println("Both height and width of email and pwd tbx are not same");
Point p1 = emailTbx.getLocation();		int x1 = p1.getX(); 	int y1 = p1.getY();
Point p2 = pwdTbx.getLocation();		int x2 = p2.getX();		int y2 = p2.getY();
if(x1==x2) {
	System.out.println("Both the text boxes are alligned properly");
}else
	System.out.println("Both the text boxes are not alligned properly");
//getRect is a combination of getSize() and getLocation() the return type is Rectangle
}
}
