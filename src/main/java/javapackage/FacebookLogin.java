package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//email Text
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("snehsajannavar@gmail.com");
		Thread.sleep(2000);
		
		//Password text filled
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		Thread.sleep(2000);
		
		//click on login button with the help of name as atName and login as attvalue
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

	
}
