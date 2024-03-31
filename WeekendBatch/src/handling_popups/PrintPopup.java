package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintPopup {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver d=new FirefoxDriver();
	d.get("https://www.selenium.dev/downloads/");
	Robot r=new Robot();
	Thread.sleep(5000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_P);	
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_TAB);	
	r.keyPress(KeyEvent.VK_TAB);	
	for(int i=0;i<4;i++) {
		r.keyPress(KeyEvent.VK_DOWN);	
	}
	r.keyPress(KeyEvent.VK_1);	
	r.keyPress(KeyEvent.VK_MINUS);	
	r.keyPress(KeyEvent.VK_2);	
	r.keyPress(KeyEvent.VK_ENTER);
}
}
