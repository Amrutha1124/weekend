package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{			        	//Pom class
	@FindBy(id="username")
	private WebElement unTbx;				//Declaration
	@FindBy(name="pwd")
	private WebElement pwdTbx;
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement loginBtn;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);		//Initialization
	}
	public void login(String un,String pwd) {
		unTbx.sendKeys(un);	
		pwdTbx.sendKeys(pwd);						//Utilization
		loginBtn.click();
	}
}