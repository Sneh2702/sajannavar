package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {
	
	public static void main(String[] args) throws Exception {
		
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://money.rediff.com/gainers");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000); 
		
		//all rows in table
		
		List<WebElement> allrows=driver.findElements(By.xpath("//table[@class='datatype']/tbody/tr")); //1913
		
		System.out.println(allrows.size());
		
		//System.out.println(driver.findElements(By.xpath("//table[@class='datatype']/tbody/tr")).size());
		
		//all Columns in table
		
		System.out.println(driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size()); //5
		
		//click on shree balaji valve co
		driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[4]/td[1]/a")).click();
	}

}
