package javapackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait1 {
	
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); old method
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //updated one synstax
		
		//enter email
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abc@gmail..com");
		
		//enter passward
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abc@gmail.com");
		
		//login button
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click();  //17sec
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']"))); //30sec
	}

}
