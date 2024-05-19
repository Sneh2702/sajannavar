package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown1 {
	
	public static void main(String[] args) throws Exception {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		//Handling month dropdown with the help of findElements()  using get() int index
		List<WebElement>birthMonth= driver.findElements(By.xpath("//select[@id='month']/option"));
		Thread.sleep(2000);
		
		System.out.println(birthMonth.size()); //12  >index >0to11
		Thread.sleep(2000);
		
		birthMonth.get(0).click();//Jan
		
	}

}
