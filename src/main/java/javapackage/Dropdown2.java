package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2 {
	
public static void main(String[] args) throws Exception {
		
		
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		//1. Get xpath (Relative xpath) of entire dropdown list (month dropdown list) >//select[@id='month']
		
		WebElement bMonth= driver.findElement(By.xpath("//select[@id='month']")); //bMonth >xpath ref
		Thread.sleep(2000);
		
		//2. send xpath ref to constructor of select class
		
		Select month=new Select(bMonth);
		
		month.selectByVisibleText("Apr"); //Apr
		Thread.sleep(2000);
		 
				 
		month.selectByIndex(5); //June  >Index always start with 0 so 5 index=june
		Thread.sleep(2000);
		
		month.selectByValue("2"); //FEB
		Thread.sleep(2000);
		
		List<WebElement> dropdown=month.getOptions(); //12 >option12 >webelement 12
		
		System.out.println(dropdown.size());// could you please select this march month with the help of get option
		
		for(int i=0;i<dropdown.size();i++) {
			String dropdownvalue=dropdown.get(i).getText(); //i=0 >Jan  i=1feb , i=2>mar
			
			if(dropdownvalue.equals("Mar")) {
				
				dropdown.get(i).click(); //Mar
				break;
			}  //in case of dropdown is it possible to with the help of sendkeys we are perform operations
			
					}
		
		Thread.sleep(2000);
		bMonth.sendKeys("Dec");
		}
		

}

