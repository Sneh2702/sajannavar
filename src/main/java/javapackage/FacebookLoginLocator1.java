package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginLocator1 {
	
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");  //lunching facebook web app
		Thread.sleep(2000);
		
		driver.manage().window().maximize(); //maximize
		Thread.sleep(2000);
		
		//click on Create new account button with the help of text()
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		System.out.println(driver.findElement(By.xpath("//a[text()='Create new account']")).getText()); // it will print on output
		Thread.sleep(2000);
		
		//click female radio button
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).click();
		Thread.sleep(2000);
		
		//click emale radio button
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='2']")).click();
		Thread.sleep(2000);
		
		//click Custom radio button
		
		driver.findElement(By.xpath("//input[@type='radio'][@value='-1']")).click();
		Thread.sleep(2000);
		
		//custome radio button is selected or not
		System.out.println(driver.findElement(By.xpath("//input[@type='radio'][@value='-1']")).isSelected()); //true
		
		//female radio button is selected or not
		
		System.out.println(driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).isSelected()); //false
		
		//female radio button is displayed or not
		System.out.println(driver.findElement(By.xpath("//input[@type='radio'][@value='1']")).isDisplayed()); // true
		
				}

}
