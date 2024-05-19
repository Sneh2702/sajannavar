package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG9 {
	
	  SoftAssert soft= new SoftAssert();// 1
	@Test
	public void Alert() throws Exception {
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
		
		soft.assertEquals(actual, expected,"Both should be equal");//failed >validation purpose// soft assertion//2
		
		System.out.println("Assertion will get verified");
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();//accept the alert that means click on Ok button
		
		soft.assertAll();//it will ignored assert command//3
		
		
		
	}

}
