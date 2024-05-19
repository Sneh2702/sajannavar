package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookWebApp {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver(); //having 13 predefined method
		
		//WebDriver driver=new FirefoxDriver(); if you want to use another browser 
		
		//WebDriver =new webdriver();//not allowed we cannot create object of interface, and webdriver is predefine interface
		
		//lunch web application
		
		driver.get("https://www.flipkart.com/"); //get() >used to launch web application
		Thread.sleep(2000);
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		
		System.out.println(driver.getCurrentUrl());  //https://www.flipkart.com/ get current URL
		Thread.sleep(2000);
		
			System.out.println(driver.getTitle());// it will print the title of application in output
		Thread.sleep(2000);//stop for 2 sec
		
		System.out.println(driver.getPageSource());
		Thread.sleep(2000);
		
		driver.close(); //it will close application automatically
		
		driver.quit(); // it will close current as well as associated application
	}

}
