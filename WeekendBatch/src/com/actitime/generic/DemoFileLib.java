package com.actitime.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFileLib {
	
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	FileLib f=new FileLib();
	String url = f.readDataFromProperty("url");
	driver.get(url);
	String un = f.readDataFromProperty("un");
	String pwd = f.readDataFromProperty("pwd");
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	String data = f.readDataFromExcel("CreateCustomer",1,2);
	String data1 = f.readDataFromExcel("InvalidLogin",1,1);
	String data2 = f.readDataFromExcel("Sheet2",4,0);
	System.out.println(data);
	System.out.println(data1);
	System.out.println(data2);
	f.writeDataIntoExcel("Sheet2", 4, 3,"SA Cricket");
	f.writeDataIntoExcel("InvalidLogin", 2, 2,"Pass");
	f.writeDataIntoExcel("CreateCustomer", 1, 2, "Dinga");
}
}
