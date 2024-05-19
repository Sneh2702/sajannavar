package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow1 {
	
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//Click on signin Button without entering username and password
		
		driver.findElement(By.xpath("//input[@name='proceed']")).click(); //it will click on sign in button
		
		Thread.sleep(2000);
		
		String expected="Please enter a valid user name";
		System.out.println(expected);
		
		String actual=driver.switchTo().alert().getText();
		System.out.println(actual);
		Thread.sleep(2000);
		
		if (actual.equals(expected))  {  //actual and except is equal then and then if block is execute
			System.out.println("Alert will get verified");
			
			driver.switchTo().alert().accept(); //accept the alert
			
		}
		
	}

}
