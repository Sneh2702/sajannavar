package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown3 {
	
public static void main(String[] args) throws Exception {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		//1. Get xpath (Relative xpath) of entire dropdown list (month dropdown list) >//select[@id='month']
		
	    WebElement bday=driver.findElement(By.xpath("//select[@id='day']"));
		
		WebElement bMonth= driver.findElement(By.xpath("//select[@id='month']")); //bMonth >xpath ref
		
		WebElement byear= driver.findElement(By.xpath("//select[@id='year']"));
		Thread.sleep(2000);
		
		//2. send xpath ref to constructor of select class
		
		Select day=new Select (bday);
		Select month=new Select (bMonth);
		Select year=new Select (byear);
		
		day.selectByVisibleText("25");
		Thread.sleep(2000);
		
		month.selectByVisibleText("Feb");
		Thread.sleep(2000);
		
		year.selectByVisibleText("2024");
		Thread.sleep(2000);
		
		//driver.close();
		
}
		

}

